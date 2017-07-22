package edu.kit.ipd.sdq.kamp4aps4req.core.derivation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import options.Option;
import requirements.Requirement;

public class APSReqDifferenceCalculation extends AbstractDifferenceCalculation<APSReqArchitectureVersion> {

	private final APSReqInternalModificationDerivation reqInternalModificationDerivation = new APSReqInternalModificationDerivation();

	@Override
	public List<Activity> deriveWorkplan(APSReqArchitectureVersion baseVersion,
			APSReqArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();
		activityList.addAll(deriveAddAndRemoveActivities(calculateDiffModel(baseVersion.getRequirementsRepository(),
				targetVersion.getRequirementsRepository())));
		activityList.addAll(deriveAddAndRemoveActivities(
				calculateDiffModel(baseVersion.getDecisionRepository(), targetVersion.getDecisionRepository())));
		activityList.addAll(deriveAddAndRemoveActivities(
				calculateDiffModel(baseVersion.getOptionRepository(), targetVersion.getOptionRepository())));
		activityList.addAll(reqInternalModificationDerivation.deriveInternalModifications(targetVersion));
		return activityList;
	}

	@Override
	protected void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {

		if (detectionRuleAdded(diffElement, Requirement.class)) {
			Requirement requirement = (Requirement) (((ReferenceChange) diffElement).getValue());
			String elementName = "\"" + requirement.getSpecification() + "\"";
			workplan.add(createReqAddActivity(requirement, elementName));
		}
		else if (detectionRuleDeleted(diffElement, Requirement.class)) {
			Requirement requirement = (Requirement) (((ReferenceChange) diffElement).getValue());
			String elementName = "\"" + requirement.getSpecification() + "\"";
			workplan.add(createReqRemoveActivity(requirement, elementName));
		}
		else if (detectionRuleAdded(diffElement, Decision.class)) {
			Decision decision = (Decision) (((ReferenceChange) diffElement).getValue());
			String elementName = "\"" + decision.getDescription() + "\"";
			workplan.add(createReqAddActivity(decision, elementName));
		}
		else if (detectionRuleDeleted(diffElement, Decision.class)) {
			Decision decision = (Decision) (((ReferenceChange) diffElement).getValue());
			String elementName = "\"" + decision.getDescription() + "\"";
			workplan.add(createReqRemoveActivity(decision, elementName));
		}
		else if (detectionRuleAdded(diffElement, Option.class)) {
			Option option = (Option) (((ReferenceChange) diffElement).getValue());
			String elementName = "\"" + option.getDescription() + "\"";
			workplan.add(createReqAddActivity(option, elementName));
		}
		else if (detectionRuleDeleted(diffElement, Option.class)) {
			Option option = (Option) (((ReferenceChange) diffElement).getValue());
			String elementName = "\"" + option.getDescription() + "\"";
			workplan.add(createReqRemoveActivity(option, elementName));
		}
	}

	protected static Activity createReqAddActivity(EObject element, String elementName) {
		APSReqActivityElementType activityElementType = APSReqActivityElementType.getActivityTypeForObject(element);
		return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, element, elementName, null,
				BasicActivity.MODIFY, "Add " + element.eClass().getName() + " " + elementName + ".");
	}

	protected static Activity createReqRemoveActivity(EObject element, String elementName) {
		APSReqActivityElementType activityElementType = APSReqActivityElementType.getActivityTypeForObject(element);
		return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, element, elementName, null,
				BasicActivity.MODIFY, "Remove " + element.eClass().getName() + " " + elementName + ".");
	}
}

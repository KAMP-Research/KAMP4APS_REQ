package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.software.derivation.APSReqSoftwareDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECEnrichedWorkplanDerivation;

/**
 * @generated NOT
 */
public class APSReqSoftwareArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<APSReqSoftwareArchitectureVersion> {

	public APSReqSoftwareArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new APSReqSoftwareDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new IECEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSReqSoftwareArchitectureVersionPersistency());
		
	}
}

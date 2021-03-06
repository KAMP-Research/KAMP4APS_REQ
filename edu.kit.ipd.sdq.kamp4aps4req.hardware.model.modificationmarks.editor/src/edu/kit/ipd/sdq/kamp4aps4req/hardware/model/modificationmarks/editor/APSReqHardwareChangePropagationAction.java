package edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareChangePropagationAnalysis;

/**
 * 
 * @generated NOT
 */
public class APSReqHardwareChangePropagationAction extends AbstractChangePropagationAction<APSReqHardwareArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<APSReqHardwareArchitectureVersion> createChangePropagationAnalysis() {
		return new APSReqHardwareChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<APSReqHardwareArchitectureVersion> createArchitectureVersionPersistency() {
		return new APSReqHardwareArchitectureVersionPersistency();
	}
}

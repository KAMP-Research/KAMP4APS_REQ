/**
 */
package apshardwareoptions;

import apsoptions.APSReqReplaceOption;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqReplaceEntities#getOldEntities <em>Old Entities</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqReplaceEntities#getNewEntities <em>New Entities</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceEntities()
 * @model
 * @generated
 */
public interface APSReqReplaceEntities extends APSReqReplaceOption {
	/**
	 * Returns the value of the '<em><b>Old Entities</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.basic.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Entities</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceEntities_OldEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getOldEntities();

	/**
	 * Returns the value of the '<em><b>New Entities</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.basic.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Entities</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceEntities_NewEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getNewEntities();

} // APSReqReplaceEntities

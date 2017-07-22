/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Remove Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_RemoveComponent#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_RemoveComponent()
 * @model
 * @generated
 */
public interface xPPU_RemoveComponent extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_RemoveComponent_Components()
	 * @model required="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // xPPU_RemoveComponent
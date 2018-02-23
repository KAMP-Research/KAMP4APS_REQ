/**
 */
package apsoptions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see apsoptions.ApsoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ApsoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apsoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/apsoptions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apsoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApsoptionsPackage eINSTANCE = apsoptions.impl.ApsoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqOptionImpl <em>APS Req Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqOptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOption()
	 * @generated
	 */
	int APS_REQ_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>APS Req Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqIntrodueNewOptionImpl <em>APS Req Introdue New Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqIntrodueNewOptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqIntrodueNewOption()
	 * @generated
	 */
	int APS_REQ_INTRODUE_NEW_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUE_NEW_OPTION__OPTION = APS_REQ_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUE_NEW_OPTION__REPOSITORY = APS_REQ_OPTION__REPOSITORY;

	/**
	 * The number of structural features of the '<em>APS Req Introdue New Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUE_NEW_OPTION_FEATURE_COUNT = APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqRemoveOptionImpl <em>APS Req Remove Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqRemoveOptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqRemoveOption()
	 * @generated
	 */
	int APS_REQ_REMOVE_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_OPTION__OPTION = APS_REQ_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_OPTION__REPOSITORY = APS_REQ_OPTION__REPOSITORY;

	/**
	 * The number of structural features of the '<em>APS Req Remove Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_OPTION_FEATURE_COUNT = APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqReplaceOptionImpl <em>APS Req Replace Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqReplaceOptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqReplaceOption()
	 * @generated
	 */
	int APS_REQ_REPLACE_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_OPTION__OPTION = APS_REQ_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_OPTION__REPOSITORY = APS_REQ_OPTION__REPOSITORY;

	/**
	 * The number of structural features of the '<em>APS Req Replace Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_OPTION_FEATURE_COUNT = APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqChangeOptionImpl <em>APS Req Change Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqChangeOptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqChangeOption()
	 * @generated
	 */
	int APS_REQ_CHANGE_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_OPTION__OPTION = APS_REQ_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_OPTION__REPOSITORY = APS_REQ_OPTION__REPOSITORY;

	/**
	 * The number of structural features of the '<em>APS Req Change Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_OPTION_FEATURE_COUNT = APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqOptionContainerImpl <em>APS Req Option Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqOptionContainerImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOptionContainer()
	 * @generated
	 */
	int APS_REQ_OPTION_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Apsreqoption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION_CONTAINER__APSREQOPTION = 0;

	/**
	 * The number of structural features of the '<em>APS Req Option Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqIntrodueNewOption <em>APS Req Introdue New Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introdue New Option</em>'.
	 * @see apsoptions.APSReqIntrodueNewOption
	 * @generated
	 */
	EClass getAPSReqIntrodueNewOption();

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqRemoveOption <em>APS Req Remove Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Option</em>'.
	 * @see apsoptions.APSReqRemoveOption
	 * @generated
	 */
	EClass getAPSReqRemoveOption();

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqReplaceOption <em>APS Req Replace Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Option</em>'.
	 * @see apsoptions.APSReqReplaceOption
	 * @generated
	 */
	EClass getAPSReqReplaceOption();

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqChangeOption <em>APS Req Change Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Change Option</em>'.
	 * @see apsoptions.APSReqChangeOption
	 * @generated
	 */
	EClass getAPSReqChangeOption();

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqOption <em>APS Req Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Option</em>'.
	 * @see apsoptions.APSReqOption
	 * @generated
	 */
	EClass getAPSReqOption();

	/**
	 * Returns the meta object for the reference '{@link apsoptions.APSReqOption#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see apsoptions.APSReqOption#getOption()
	 * @see #getAPSReqOption()
	 * @generated
	 */
	EReference getAPSReqOption_Option();

	/**
	 * Returns the meta object for the container reference '{@link apsoptions.APSReqOption#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see apsoptions.APSReqOption#getRepository()
	 * @see #getAPSReqOption()
	 * @generated
	 */
	EReference getAPSReqOption_Repository();

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqOptionContainer <em>APS Req Option Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Option Container</em>'.
	 * @see apsoptions.APSReqOptionContainer
	 * @generated
	 */
	EClass getAPSReqOptionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link apsoptions.APSReqOptionContainer#getApsreqoption <em>Apsreqoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apsreqoption</em>'.
	 * @see apsoptions.APSReqOptionContainer#getApsreqoption()
	 * @see #getAPSReqOptionContainer()
	 * @generated
	 */
	EReference getAPSReqOptionContainer_Apsreqoption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApsoptionsFactory getApsoptionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqIntrodueNewOptionImpl <em>APS Req Introdue New Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqIntrodueNewOptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqIntrodueNewOption()
		 * @generated
		 */
		EClass APS_REQ_INTRODUE_NEW_OPTION = eINSTANCE.getAPSReqIntrodueNewOption();
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqRemoveOptionImpl <em>APS Req Remove Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqRemoveOptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqRemoveOption()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_OPTION = eINSTANCE.getAPSReqRemoveOption();
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqReplaceOptionImpl <em>APS Req Replace Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqReplaceOptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqReplaceOption()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_OPTION = eINSTANCE.getAPSReqReplaceOption();
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqChangeOptionImpl <em>APS Req Change Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqChangeOptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqChangeOption()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_OPTION = eINSTANCE.getAPSReqChangeOption();
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqOptionImpl <em>APS Req Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqOptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOption()
		 * @generated
		 */
		EClass APS_REQ_OPTION = eINSTANCE.getAPSReqOption();
		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_OPTION__OPTION = eINSTANCE.getAPSReqOption_Option();
		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_OPTION__REPOSITORY = eINSTANCE.getAPSReqOption_Repository();
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqOptionContainerImpl <em>APS Req Option Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqOptionContainerImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOptionContainer()
		 * @generated
		 */
		EClass APS_REQ_OPTION_CONTAINER = eINSTANCE.getAPSReqOptionContainer();
		/**
		 * The meta object literal for the '<em><b>Apsreqoption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_OPTION_CONTAINER__APSREQOPTION = eINSTANCE.getAPSReqOptionContainer_Apsreqoption();

	}

} //ApsoptionsPackage

/**
 */
package org.palladiosimulator.reliability.markov.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.reliability.markov.Entity;
import org.palladiosimulator.reliability.markov.Label;
import org.palladiosimulator.reliability.markov.MarkovChain;
import org.palladiosimulator.reliability.markov.MarkovFactory;
import org.palladiosimulator.reliability.markov.MarkovPackage;
import org.palladiosimulator.reliability.markov.State;
import org.palladiosimulator.reliability.markov.StateType;
import org.palladiosimulator.reliability.markov.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MarkovPackageImpl extends EPackageImpl implements MarkovPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stateEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass transitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass markovChainEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass entityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass labelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum stateTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.reliability.markov.MarkovPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MarkovPackageImpl() {
        super(eNS_URI, MarkovFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link MarkovPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MarkovPackage init() {
        if (isInited) {
            return (MarkovPackage) EPackage.Registry.INSTANCE.getEPackage(MarkovPackage.eNS_URI);
        }

        // Obtain or create and register package
        final MarkovPackageImpl theMarkovPackage = (MarkovPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MarkovPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new MarkovPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theMarkovPackage.createPackageContents();

        // Initialize created meta-data
        theMarkovPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMarkovPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MarkovPackage.eNS_URI, theMarkovPackage);
        return theMarkovPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getState() {
        return this.stateEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getState_Type() {
        return (EAttribute) this.stateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getState_Labels() {
        return (EReference) this.stateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getState_Traces() {
        return (EAttribute) this.stateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTransition() {
        return this.transitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTransition_Probability() {
        return (EAttribute) this.transitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTransition_FromState() {
        return (EReference) this.transitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTransition_ToState() {
        return (EReference) this.transitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMarkovChain() {
        return this.markovChainEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMarkovChain_States() {
        return (EReference) this.markovChainEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMarkovChain_Transitions() {
        return (EReference) this.markovChainEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEntity() {
        return this.entityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntity_Name() {
        return (EAttribute) this.entityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLabel() {
        return this.labelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLabel_Key() {
        return (EAttribute) this.labelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLabel_Value() {
        return (EAttribute) this.labelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getStateType() {
        return this.stateTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MarkovFactory getMarkovFactory() {
        return (MarkovFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.stateEClass = this.createEClass(STATE);
        this.createEAttribute(this.stateEClass, STATE__TYPE);
        this.createEReference(this.stateEClass, STATE__LABELS);
        this.createEAttribute(this.stateEClass, STATE__TRACES);

        this.transitionEClass = this.createEClass(TRANSITION);
        this.createEAttribute(this.transitionEClass, TRANSITION__PROBABILITY);
        this.createEReference(this.transitionEClass, TRANSITION__FROM_STATE);
        this.createEReference(this.transitionEClass, TRANSITION__TO_STATE);

        this.markovChainEClass = this.createEClass(MARKOV_CHAIN);
        this.createEReference(this.markovChainEClass, MARKOV_CHAIN__STATES);
        this.createEReference(this.markovChainEClass, MARKOV_CHAIN__TRANSITIONS);

        this.entityEClass = this.createEClass(ENTITY);
        this.createEAttribute(this.entityEClass, ENTITY__NAME);

        this.labelEClass = this.createEClass(LABEL);
        this.createEAttribute(this.labelEClass, LABEL__KEY);
        this.createEAttribute(this.labelEClass, LABEL__VALUE);

        // Create enums
        this.stateTypeEEnum = this.createEEnum(STATE_TYPE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.stateEClass.getESuperTypes().add(this.getEntity());
        this.transitionEClass.getESuperTypes().add(this.getEntity());
        this.markovChainEClass.getESuperTypes().add(this.getEntity());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getState_Type(), this.getStateType(), "type", null, 1, 1, State.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getState_Labels(), this.getLabel(), null, "labels", null, 0, -1, State.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.getState_Labels().getEKeys().add(this.getLabel_Key());
        this.initEAttribute(this.getState_Traces(), this.ecorePackage.getEString(), "traces", "", 0, -1, State.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getTransition_Probability(), this.ecorePackage.getEDouble(), "probability", null, 1, 1,
                Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getTransition_FromState(), this.getState(), null, "fromState", null, 1, 1,
                Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getTransition_ToState(), this.getState(), null, "toState", null, 1, 1,
                Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.markovChainEClass, MarkovChain.class, "MarkovChain", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMarkovChain_States(), this.getState(), null, "states", null, 0, -1,
                MarkovChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getMarkovChain_Transitions(), this.getTransition(), null, "transitions", null, 0, -1,
                MarkovChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEntity_Name(), this.ecorePackage.getEString(), "Name", null, 1, 1, Entity.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLabel_Key(), this.ecorePackage.getEString(), "key", null, 0, 1, Label.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLabel_Value(), this.ecorePackage.getEString(), "value", null, 0, 1, Label.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.stateTypeEEnum, StateType.class, "StateType");
        this.addEEnumLiteral(this.stateTypeEEnum, StateType.DEFAULT);
        this.addEEnumLiteral(this.stateTypeEEnum, StateType.START);
        this.addEEnumLiteral(this.stateTypeEEnum, StateType.SUCCESS);
        this.addEEnumLiteral(this.stateTypeEEnum, StateType.FAILURE);

        // Create resource
        this.createResource(eNS_URI);
    }

} // MarkovPackageImpl

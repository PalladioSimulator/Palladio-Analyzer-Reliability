/**
 */
package org.palladiosimulator.reliability.markov.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.reliability.markov.Entity;
import org.palladiosimulator.reliability.markov.Label;
import org.palladiosimulator.reliability.markov.MarkovChain;
import org.palladiosimulator.reliability.markov.MarkovFactory;
import org.palladiosimulator.reliability.markov.MarkovPackage;
import org.palladiosimulator.reliability.markov.State;
import org.palladiosimulator.reliability.markov.StateType;
import org.palladiosimulator.reliability.markov.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MarkovFactoryImpl extends EFactoryImpl implements MarkovFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static MarkovFactory init() {
        try {
            final MarkovFactory theMarkovFactory = (MarkovFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MarkovPackage.eNS_URI);
            if (theMarkovFactory != null) {
                return theMarkovFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MarkovFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MarkovFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MarkovPackage.STATE:
            return this.createState();
        case MarkovPackage.TRANSITION:
            return this.createTransition();
        case MarkovPackage.MARKOV_CHAIN:
            return this.createMarkovChain();
        case MarkovPackage.ENTITY:
            return this.createEntity();
        case MarkovPackage.LABEL:
            return this.createLabel();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case MarkovPackage.STATE_TYPE:
            return this.createStateTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case MarkovPackage.STATE_TYPE:
            return this.convertStateTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public State createState() {
        final StateImpl state = new StateImpl();
        return state;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Transition createTransition() {
        final TransitionImpl transition = new TransitionImpl();
        return transition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MarkovChain createMarkovChain() {
        final MarkovChainImpl markovChain = new MarkovChainImpl();
        return markovChain;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Entity createEntity() {
        final EntityImpl entity = new EntityImpl();
        return entity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Label createLabel() {
        final LabelImpl label = new LabelImpl();
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StateType createStateTypeFromString(final EDataType eDataType, final String initialValue) {
        final StateType result = StateType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertStateTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MarkovPackage getMarkovPackage() {
        return (MarkovPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MarkovPackage getPackage() {
        return MarkovPackage.eINSTANCE;
    }

} // MarkovFactoryImpl

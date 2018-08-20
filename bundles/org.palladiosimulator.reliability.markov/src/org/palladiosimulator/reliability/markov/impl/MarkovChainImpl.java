/**
 */
package org.palladiosimulator.reliability.markov.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.reliability.markov.MarkovChain;
import org.palladiosimulator.reliability.markov.MarkovPackage;
import org.palladiosimulator.reliability.markov.State;
import org.palladiosimulator.reliability.markov.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Chain</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.MarkovChainImpl#getStates
 * <em>States</em>}</li>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.MarkovChainImpl#getTransitions
 * <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkovChainImpl extends EntityImpl implements MarkovChain {

    /**
     * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStates()
     * @generated
     * @ordered
     */
    protected EList<State> states;

    /**
     * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTransitions()
     * @generated
     * @ordered
     */
    protected EList<Transition> transitions;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MarkovChainImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MarkovPackage.Literals.MARKOV_CHAIN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<State> getStates() {
        if (this.states == null) {
            this.states = new EObjectContainmentEList<State>(State.class, this, MarkovPackage.MARKOV_CHAIN__STATES);
        }
        return this.states;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Transition> getTransitions() {
        if (this.transitions == null) {
            this.transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
                    MarkovPackage.MARKOV_CHAIN__TRANSITIONS);
        }
        return this.transitions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MarkovPackage.MARKOV_CHAIN__STATES:
            return ((InternalEList<?>) this.getStates()).basicRemove(otherEnd, msgs);
        case MarkovPackage.MARKOV_CHAIN__TRANSITIONS:
            return ((InternalEList<?>) this.getTransitions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MarkovPackage.MARKOV_CHAIN__STATES:
            return this.getStates();
        case MarkovPackage.MARKOV_CHAIN__TRANSITIONS:
            return this.getTransitions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MarkovPackage.MARKOV_CHAIN__STATES:
            this.getStates().clear();
            this.getStates().addAll((Collection<? extends State>) newValue);
            return;
        case MarkovPackage.MARKOV_CHAIN__TRANSITIONS:
            this.getTransitions().clear();
            this.getTransitions().addAll((Collection<? extends Transition>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MarkovPackage.MARKOV_CHAIN__STATES:
            this.getStates().clear();
            return;
        case MarkovPackage.MARKOV_CHAIN__TRANSITIONS:
            this.getTransitions().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MarkovPackage.MARKOV_CHAIN__STATES:
            return this.states != null && !this.states.isEmpty();
        case MarkovPackage.MARKOV_CHAIN__TRANSITIONS:
            return this.transitions != null && !this.transitions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MarkovChainImpl

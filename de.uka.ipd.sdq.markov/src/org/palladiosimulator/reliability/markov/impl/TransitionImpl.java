/**
 */
package org.palladiosimulator.reliability.markov.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.reliability.markov.MarkovPackage;
import org.palladiosimulator.reliability.markov.State;
import org.palladiosimulator.reliability.markov.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Transition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.TransitionImpl#getProbability
 * <em>Probability</em>}</li>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.TransitionImpl#getFromState
 * <em>From State</em>}</li>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.TransitionImpl#getToState
 * <em>To State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends EntityImpl implements Transition {

    /**
     * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProbability()
     * @generated
     * @ordered
     */
    protected static final double PROBABILITY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProbability()
     * @generated
     * @ordered
     */
    protected double probability = PROBABILITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getFromState() <em>From State</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFromState()
     * @generated
     * @ordered
     */
    protected State fromState;

    /**
     * The cached value of the '{@link #getToState() <em>To State</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getToState()
     * @generated
     * @ordered
     */
    protected State toState;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MarkovPackage.Literals.TRANSITION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProbability() {
        return this.probability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProbability(final double newProbability) {
        final double oldProbability = this.probability;
        this.probability = newProbability;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, MarkovPackage.TRANSITION__PROBABILITY,
                    oldProbability, this.probability));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public State getFromState() {
        if (this.fromState != null && this.fromState.eIsProxy()) {
            final InternalEObject oldFromState = (InternalEObject) this.fromState;
            this.fromState = (State) this.eResolveProxy(oldFromState);
            if (this.fromState != oldFromState) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPackage.TRANSITION__FROM_STATE,
                            oldFromState, this.fromState));
                }
            }
        }
        return this.fromState;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public State basicGetFromState() {
        return this.fromState;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFromState(final State newFromState) {
        final State oldFromState = this.fromState;
        this.fromState = newFromState;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, MarkovPackage.TRANSITION__FROM_STATE,
                    oldFromState, this.fromState));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public State getToState() {
        if (this.toState != null && this.toState.eIsProxy()) {
            final InternalEObject oldToState = (InternalEObject) this.toState;
            this.toState = (State) this.eResolveProxy(oldToState);
            if (this.toState != oldToState) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPackage.TRANSITION__TO_STATE,
                            oldToState, this.toState));
                }
            }
        }
        return this.toState;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public State basicGetToState() {
        return this.toState;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setToState(final State newToState) {
        final State oldToState = this.toState;
        this.toState = newToState;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, MarkovPackage.TRANSITION__TO_STATE, oldToState,
                    this.toState));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MarkovPackage.TRANSITION__PROBABILITY:
            return this.getProbability();
        case MarkovPackage.TRANSITION__FROM_STATE:
            if (resolve) {
                return this.getFromState();
            }
            return this.basicGetFromState();
        case MarkovPackage.TRANSITION__TO_STATE:
            if (resolve) {
                return this.getToState();
            }
            return this.basicGetToState();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MarkovPackage.TRANSITION__PROBABILITY:
            this.setProbability((Double) newValue);
            return;
        case MarkovPackage.TRANSITION__FROM_STATE:
            this.setFromState((State) newValue);
            return;
        case MarkovPackage.TRANSITION__TO_STATE:
            this.setToState((State) newValue);
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
        case MarkovPackage.TRANSITION__PROBABILITY:
            this.setProbability(PROBABILITY_EDEFAULT);
            return;
        case MarkovPackage.TRANSITION__FROM_STATE:
            this.setFromState((State) null);
            return;
        case MarkovPackage.TRANSITION__TO_STATE:
            this.setToState((State) null);
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
        case MarkovPackage.TRANSITION__PROBABILITY:
            return this.probability != PROBABILITY_EDEFAULT;
        case MarkovPackage.TRANSITION__FROM_STATE:
            return this.fromState != null;
        case MarkovPackage.TRANSITION__TO_STATE:
            return this.toState != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (probability: ");
        result.append(this.probability);
        result.append(')');
        return result.toString();
    }

} // TransitionImpl

/**
 */
package org.palladiosimulator.reliability.markov.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.reliability.markov.Label;
import org.palladiosimulator.reliability.markov.MarkovPackage;
import org.palladiosimulator.reliability.markov.State;
import org.palladiosimulator.reliability.markov.StateType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>State</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.StateImpl#getType <em>Type</em>}</li>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.StateImpl#getLabels <em>Labels</em>}
 * </li>
 * <li>{@link org.palladiosimulator.reliability.markov.impl.StateImpl#getTraces <em>Traces</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends EntityImpl implements State {

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final StateType TYPE_EDEFAULT = StateType.DEFAULT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected StateType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected EList<Label> labels;

    /**
     * The cached value of the '{@link #getTraces() <em>Traces</em>}' attribute list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTraces()
     * @generated
     * @ordered
     */
    protected EList<String> traces;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected StateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MarkovPackage.Literals.STATE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StateType getType() {
        return this.type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setType(final StateType newType) {
        final StateType oldType = this.type;
        this.type = newType == null ? TYPE_EDEFAULT : newType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, MarkovPackage.STATE__TYPE, oldType, this.type));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Label> getLabels() {
        if (this.labels == null) {
            this.labels = new EObjectContainmentEList<Label>(Label.class, this, MarkovPackage.STATE__LABELS);
        }
        return this.labels;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<String> getTraces() {
        if (this.traces == null) {
            this.traces = new EDataTypeUniqueEList<String>(String.class, this, MarkovPackage.STATE__TRACES);
        }
        return this.traces;
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
        case MarkovPackage.STATE__LABELS:
            return ((InternalEList<?>) this.getLabels()).basicRemove(otherEnd, msgs);
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
        case MarkovPackage.STATE__TYPE:
            return this.getType();
        case MarkovPackage.STATE__LABELS:
            return this.getLabels();
        case MarkovPackage.STATE__TRACES:
            return this.getTraces();
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
        case MarkovPackage.STATE__TYPE:
            this.setType((StateType) newValue);
            return;
        case MarkovPackage.STATE__LABELS:
            this.getLabels().clear();
            this.getLabels().addAll((Collection<? extends Label>) newValue);
            return;
        case MarkovPackage.STATE__TRACES:
            this.getTraces().clear();
            this.getTraces().addAll((Collection<? extends String>) newValue);
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
        case MarkovPackage.STATE__TYPE:
            this.setType(TYPE_EDEFAULT);
            return;
        case MarkovPackage.STATE__LABELS:
            this.getLabels().clear();
            return;
        case MarkovPackage.STATE__TRACES:
            this.getTraces().clear();
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
        case MarkovPackage.STATE__TYPE:
            return this.type != TYPE_EDEFAULT;
        case MarkovPackage.STATE__LABELS:
            return this.labels != null && !this.labels.isEmpty();
        case MarkovPackage.STATE__TRACES:
            return this.traces != null && !this.traces.isEmpty();
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
        result.append(" (type: ");
        result.append(this.type);
        result.append(", traces: ");
        result.append(this.traces);
        result.append(')');
        return result.toString();
    }

} // StateImpl

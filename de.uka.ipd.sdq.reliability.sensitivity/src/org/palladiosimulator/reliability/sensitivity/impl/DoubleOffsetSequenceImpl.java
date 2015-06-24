/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetType;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Double Offset Sequence</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleOffsetSequenceImpl#getOffsetValues
 * <em>Offset Values</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleOffsetSequenceImpl#getDoubleOffsetType__DoubleOffsetSequence
 * <em>Double Offset Type Double Offset Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleOffsetSequenceImpl extends DoubleParameterVariationImpl implements DoubleOffsetSequence {

    /**
     * The cached value of the '{@link #getOffsetValues() <em>Offset Values</em>}' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOffsetValues()
     * @generated
     * @ordered
     */
    protected EList<Double> offsetValues;

    /**
     * The default value of the '{@link #getDoubleOffsetType__DoubleOffsetSequence()
     * <em>Double Offset Type Double Offset Sequence</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDoubleOffsetType__DoubleOffsetSequence()
     * @generated
     * @ordered
     */
    protected static final DoubleOffsetType DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE_EDEFAULT = DoubleOffsetType.ADD;

    /**
     * The cached value of the '{@link #getDoubleOffsetType__DoubleOffsetSequence()
     * <em>Double Offset Type Double Offset Sequence</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDoubleOffsetType__DoubleOffsetSequence()
     * @generated
     * @ordered
     */
    protected DoubleOffsetType doubleOffsetType__DoubleOffsetSequence = DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DoubleOffsetSequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.DOUBLE_OFFSET_SEQUENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Double> getOffsetValues() {
        if (this.offsetValues == null) {
            this.offsetValues = new EDataTypeEList<Double>(Double.class, this,
                    SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES);
        }
        return this.offsetValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DoubleOffsetType getDoubleOffsetType__DoubleOffsetSequence() {
        return this.doubleOffsetType__DoubleOffsetSequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDoubleOffsetType__DoubleOffsetSequence(
            final DoubleOffsetType newDoubleOffsetType__DoubleOffsetSequence) {
        final DoubleOffsetType oldDoubleOffsetType__DoubleOffsetSequence = this.doubleOffsetType__DoubleOffsetSequence;
        this.doubleOffsetType__DoubleOffsetSequence = newDoubleOffsetType__DoubleOffsetSequence == null
                ? DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE_EDEFAULT : newDoubleOffsetType__DoubleOffsetSequence;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE,
                    oldDoubleOffsetType__DoubleOffsetSequence, this.doubleOffsetType__DoubleOffsetSequence));
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
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES:
            return this.getOffsetValues();
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE:
            return this.getDoubleOffsetType__DoubleOffsetSequence();
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
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES:
            this.getOffsetValues().clear();
            this.getOffsetValues().addAll((Collection<? extends Double>) newValue);
            return;
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE:
            this.setDoubleOffsetType__DoubleOffsetSequence((DoubleOffsetType) newValue);
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
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES:
            this.getOffsetValues().clear();
            return;
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE:
            this.setDoubleOffsetType__DoubleOffsetSequence(DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE_EDEFAULT);
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
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES:
            return this.offsetValues != null && !this.offsetValues.isEmpty();
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE:
            return this.doubleOffsetType__DoubleOffsetSequence != DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE_EDEFAULT;
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
        result.append(" (offsetValues: ");
        result.append(this.offsetValues);
        result.append(", doubleOffsetType__DoubleOffsetSequence: ");
        result.append(this.doubleOffsetType__DoubleOffsetSequence);
        result.append(')');
        return result.toString();
    }

} // DoubleOffsetSequenceImpl

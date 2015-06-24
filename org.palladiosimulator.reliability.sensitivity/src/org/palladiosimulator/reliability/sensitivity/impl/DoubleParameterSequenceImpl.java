/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Double Parameter Sequence</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleParameterSequenceImpl#getDoubleValues
 * <em>Double Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleParameterSequenceImpl extends DoubleParameterVariationImpl implements DoubleParameterSequence {

    /**
     * The cached value of the '{@link #getDoubleValues() <em>Double Values</em>}' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDoubleValues()
     * @generated
     * @ordered
     */
    protected EList<Double> doubleValues;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DoubleParameterSequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.DOUBLE_PARAMETER_SEQUENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Double> getDoubleValues() {
        if (this.doubleValues == null) {
            this.doubleValues = new EDataTypeEList<Double>(Double.class, this,
                    SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE__DOUBLE_VALUES);
        }
        return this.doubleValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE__DOUBLE_VALUES:
            return this.getDoubleValues();
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
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE__DOUBLE_VALUES:
            this.getDoubleValues().clear();
            this.getDoubleValues().addAll((Collection<? extends Double>) newValue);
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
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE__DOUBLE_VALUES:
            this.getDoubleValues().clear();
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
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE__DOUBLE_VALUES:
            return this.doubleValues != null && !this.doubleValues.isEmpty();
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
        result.append(" (doubleValues: ");
        result.append(this.doubleValues);
        result.append(')');
        return result.toString();
    }

} // DoubleParameterSequenceImpl

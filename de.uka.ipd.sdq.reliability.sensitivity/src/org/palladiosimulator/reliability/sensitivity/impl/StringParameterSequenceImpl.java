/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.StringParameterSequence;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>String Parameter Sequence</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.StringParameterSequenceImpl#getStringValues
 * <em>String Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringParameterSequenceImpl extends SensitivityParameterVariationImpl implements StringParameterSequence {

    /**
     * The cached value of the '{@link #getStringValues() <em>String Values</em>}' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStringValues()
     * @generated
     * @ordered
     */
    protected EList<String> stringValues;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StringParameterSequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.STRING_PARAMETER_SEQUENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<String> getStringValues() {
        if (this.stringValues == null) {
            this.stringValues = new EDataTypeEList<String>(String.class, this,
                    SensitivityPackage.STRING_PARAMETER_SEQUENCE__STRING_VALUES);
        }
        return this.stringValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE__STRING_VALUES:
            return this.getStringValues();
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
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE__STRING_VALUES:
            this.getStringValues().clear();
            this.getStringValues().addAll((Collection<? extends String>) newValue);
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
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE__STRING_VALUES:
            this.getStringValues().clear();
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
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE__STRING_VALUES:
            return this.stringValues != null && !this.stringValues.isEmpty();
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
        result.append(" (stringValues: ");
        result.append(this.stringValues);
        result.append(')');
        return result.toString();
    }

} // StringParameterSequenceImpl

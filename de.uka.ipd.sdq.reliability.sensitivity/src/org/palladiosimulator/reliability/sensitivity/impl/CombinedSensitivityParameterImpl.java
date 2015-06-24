/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Combined Sensitivity Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.CombinedSensitivityParameterImpl#isCombinatory
 * <em>Is Combinatory</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.CombinedSensitivityParameterImpl#getChildParameters__CombinedSensitivityParameter
 * <em>Child Parameters Combined Sensitivity Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedSensitivityParameterImpl extends SensitivityParameterImpl implements CombinedSensitivityParameter {

    /**
     * The default value of the '{@link #isCombinatory() <em>Is Combinatory</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isCombinatory()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMBINATORY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCombinatory() <em>Is Combinatory</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isCombinatory()
     * @generated
     * @ordered
     */
    protected boolean isCombinatory = IS_COMBINATORY_EDEFAULT;

    /**
     * The cached value of the '{@link #getChildParameters__CombinedSensitivityParameter()
     * <em>Child Parameters Combined Sensitivity Parameter</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getChildParameters__CombinedSensitivityParameter()
     * @generated
     * @ordered
     */
    protected EList<SensitivityParameter> childParameters__CombinedSensitivityParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CombinedSensitivityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.COMBINED_SENSITIVITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isCombinatory() {
        return this.isCombinatory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIsCombinatory(final boolean newIsCombinatory) {
        final boolean oldIsCombinatory = this.isCombinatory;
        this.isCombinatory = newIsCombinatory;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__IS_COMBINATORY, oldIsCombinatory,
                    this.isCombinatory));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<SensitivityParameter> getChildParameters__CombinedSensitivityParameter() {
        if (this.childParameters__CombinedSensitivityParameter == null) {
            this.childParameters__CombinedSensitivityParameter = new EObjectContainmentWithInverseEList<SensitivityParameter>(
                    SensitivityParameter.class, this,
                    SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER,
                    SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER);
        }
        return this.childParameters__CombinedSensitivityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this
                    .getChildParameters__CombinedSensitivityParameter()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
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
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER:
            return ((InternalEList<?>) this.getChildParameters__CombinedSensitivityParameter()).basicRemove(otherEnd,
                    msgs);
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
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__IS_COMBINATORY:
            return this.isCombinatory();
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER:
            return this.getChildParameters__CombinedSensitivityParameter();
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
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__IS_COMBINATORY:
            this.setIsCombinatory((Boolean) newValue);
            return;
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER:
            this.getChildParameters__CombinedSensitivityParameter().clear();
            this.getChildParameters__CombinedSensitivityParameter()
                    .addAll((Collection<? extends SensitivityParameter>) newValue);
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
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__IS_COMBINATORY:
            this.setIsCombinatory(IS_COMBINATORY_EDEFAULT);
            return;
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER:
            this.getChildParameters__CombinedSensitivityParameter().clear();
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
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__IS_COMBINATORY:
            return this.isCombinatory != IS_COMBINATORY_EDEFAULT;
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER:
            return this.childParameters__CombinedSensitivityParameter != null
                    && !this.childParameters__CombinedSensitivityParameter.isEmpty();
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
        result.append(" (isCombinatory: ");
        result.append(this.isCombinatory);
        result.append(')');
        return result.toString();
    }

} // CombinedSensitivityParameterImpl

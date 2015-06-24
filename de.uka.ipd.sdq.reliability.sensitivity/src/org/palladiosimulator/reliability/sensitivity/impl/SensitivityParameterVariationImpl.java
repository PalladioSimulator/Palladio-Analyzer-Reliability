/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation;
import org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Parameter Variation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SensitivityParameterVariationImpl#getSingleSensitivityParameter__SensitivityParameterVariation
 * <em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SensitivityParameterVariationImpl extends EObjectImpl implements SensitivityParameterVariation {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SensitivityParameterVariationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.SENSITIVITY_PARAMETER_VARIATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SingleSensitivityParameter getSingleSensitivityParameter__SensitivityParameterVariation() {
        if (this.eContainerFeatureID() != SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION) {
            return null;
        }
        return (SingleSensitivityParameter) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSingleSensitivityParameter__SensitivityParameterVariation(
            final SingleSensitivityParameter newSingleSensitivityParameter__SensitivityParameterVariation,
            NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newSingleSensitivityParameter__SensitivityParameterVariation,
                SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSingleSensitivityParameter__SensitivityParameterVariation(
            final SingleSensitivityParameter newSingleSensitivityParameter__SensitivityParameterVariation) {
        if (newSingleSensitivityParameter__SensitivityParameterVariation != this.eInternalContainer()
                || (this.eContainerFeatureID() != SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION
                        && newSingleSensitivityParameter__SensitivityParameterVariation != null)) {
            if (EcoreUtil.isAncestor(this, newSingleSensitivityParameter__SensitivityParameterVariation)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newSingleSensitivityParameter__SensitivityParameterVariation != null) {
                msgs = ((InternalEObject) newSingleSensitivityParameter__SensitivityParameterVariation).eInverseAdd(
                        this,
                        SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                        SingleSensitivityParameter.class, msgs);
            }
            msgs = this.basicSetSingleSensitivityParameter__SensitivityParameterVariation(
                    newSingleSensitivityParameter__SensitivityParameterVariation, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION,
                    newSingleSensitivityParameter__SensitivityParameterVariation,
                    newSingleSensitivityParameter__SensitivityParameterVariation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetSingleSensitivityParameter__SensitivityParameterVariation(
                    (SingleSensitivityParameter) otherEnd, msgs);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            return this.basicSetSingleSensitivityParameter__SensitivityParameterVariation(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            return this.eInternalContainer().eInverseRemove(this,
                    SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                    SingleSensitivityParameter.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            return this.getSingleSensitivityParameter__SensitivityParameterVariation();
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
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            this.setSingleSensitivityParameter__SensitivityParameterVariation((SingleSensitivityParameter) newValue);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            this.setSingleSensitivityParameter__SensitivityParameterVariation((SingleSensitivityParameter) null);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION:
            return this.getSingleSensitivityParameter__SensitivityParameterVariation() != null;
        }
        return super.eIsSet(featureID);
    }

} // SensitivityParameterVariationImpl

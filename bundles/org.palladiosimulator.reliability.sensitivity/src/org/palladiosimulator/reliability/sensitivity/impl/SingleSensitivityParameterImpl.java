/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation;
import org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Single Sensitivity Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SingleSensitivityParameterImpl#getSensitivityParameterVariation__SingleSensitivityParameter
 * <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SingleSensitivityParameterImpl extends SensitivityParameterImpl
        implements SingleSensitivityParameter {

    /**
     * The cached value of the '
     * {@link #getSensitivityParameterVariation__SingleSensitivityParameter()
     * <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSensitivityParameterVariation__SingleSensitivityParameter()
     * @generated
     * @ordered
     */
    protected SensitivityParameterVariation sensitivityParameterVariation__SingleSensitivityParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SingleSensitivityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.SINGLE_SENSITIVITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SensitivityParameterVariation getSensitivityParameterVariation__SingleSensitivityParameter() {
        return this.sensitivityParameterVariation__SingleSensitivityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSensitivityParameterVariation__SingleSensitivityParameter(
            final SensitivityParameterVariation newSensitivityParameterVariation__SingleSensitivityParameter,
            NotificationChain msgs) {
        final SensitivityParameterVariation oldSensitivityParameterVariation__SingleSensitivityParameter = this.sensitivityParameterVariation__SingleSensitivityParameter;
        this.sensitivityParameterVariation__SingleSensitivityParameter = newSensitivityParameterVariation__SingleSensitivityParameter;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                    oldSensitivityParameterVariation__SingleSensitivityParameter,
                    newSensitivityParameterVariation__SingleSensitivityParameter);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSensitivityParameterVariation__SingleSensitivityParameter(
            final SensitivityParameterVariation newSensitivityParameterVariation__SingleSensitivityParameter) {
        if (newSensitivityParameterVariation__SingleSensitivityParameter != this.sensitivityParameterVariation__SingleSensitivityParameter) {
            NotificationChain msgs = null;
            if (this.sensitivityParameterVariation__SingleSensitivityParameter != null) {
                msgs = ((InternalEObject) this.sensitivityParameterVariation__SingleSensitivityParameter)
                        .eInverseRemove(this,
                                SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION,
                                SensitivityParameterVariation.class, msgs);
            }
            if (newSensitivityParameterVariation__SingleSensitivityParameter != null) {
                msgs = ((InternalEObject) newSensitivityParameterVariation__SingleSensitivityParameter).eInverseAdd(
                        this,
                        SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION,
                        SensitivityParameterVariation.class, msgs);
            }
            msgs = this.basicSetSensitivityParameterVariation__SingleSensitivityParameter(
                    newSensitivityParameterVariation__SingleSensitivityParameter, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                    newSensitivityParameterVariation__SingleSensitivityParameter,
                    newSensitivityParameterVariation__SingleSensitivityParameter));
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
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            if (this.sensitivityParameterVariation__SingleSensitivityParameter != null) {
                msgs = ((InternalEObject) this.sensitivityParameterVariation__SingleSensitivityParameter)
                        .eInverseRemove(this,
                                EOPPOSITE_FEATURE_BASE
                                        - SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                                null, msgs);
            }
            return this.basicSetSensitivityParameterVariation__SingleSensitivityParameter(
                    (SensitivityParameterVariation) otherEnd, msgs);
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
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            return this.basicSetSensitivityParameterVariation__SingleSensitivityParameter(null, msgs);
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
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            return this.getSensitivityParameterVariation__SingleSensitivityParameter();
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
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            this.setSensitivityParameterVariation__SingleSensitivityParameter((SensitivityParameterVariation) newValue);
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
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            this.setSensitivityParameterVariation__SingleSensitivityParameter((SensitivityParameterVariation) null);
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
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            return this.sensitivityParameterVariation__SingleSensitivityParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // SingleSensitivityParameterImpl

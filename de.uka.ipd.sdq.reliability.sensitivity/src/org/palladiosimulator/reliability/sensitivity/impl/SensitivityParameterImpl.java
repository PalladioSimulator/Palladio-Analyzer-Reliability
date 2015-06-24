/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SensitivityParameterImpl#getParentParameter__SensitivityParameter
 * <em>Parent Parameter Sensitivity Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SensitivityParameterImpl#getSensitivityConfiguration__SensitivityParameter
 * <em>Sensitivity Configuration Sensitivity Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SensitivityParameterImpl extends EntityImpl implements SensitivityParameter {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SensitivityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.SENSITIVITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CombinedSensitivityParameter getParentParameter__SensitivityParameter() {
        if (this.eContainerFeatureID() != SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER) {
            return null;
        }
        return (CombinedSensitivityParameter) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetParentParameter__SensitivityParameter(
            final CombinedSensitivityParameter newParentParameter__SensitivityParameter, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newParentParameter__SensitivityParameter,
                SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setParentParameter__SensitivityParameter(
            final CombinedSensitivityParameter newParentParameter__SensitivityParameter) {
        if (newParentParameter__SensitivityParameter != this.eInternalContainer()
                || (this.eContainerFeatureID() != SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER
                        && newParentParameter__SensitivityParameter != null)) {
            if (EcoreUtil.isAncestor(this, newParentParameter__SensitivityParameter)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newParentParameter__SensitivityParameter != null) {
                msgs = ((InternalEObject) newParentParameter__SensitivityParameter).eInverseAdd(this,
                        SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER,
                        CombinedSensitivityParameter.class, msgs);
            }
            msgs = this.basicSetParentParameter__SensitivityParameter(newParentParameter__SensitivityParameter, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER,
                    newParentParameter__SensitivityParameter, newParentParameter__SensitivityParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SensitivityConfiguration getSensitivityConfiguration__SensitivityParameter() {
        if (this.eContainerFeatureID() != SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER) {
            return null;
        }
        return (SensitivityConfiguration) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSensitivityConfiguration__SensitivityParameter(
            final SensitivityConfiguration newSensitivityConfiguration__SensitivityParameter, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newSensitivityConfiguration__SensitivityParameter,
                SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSensitivityConfiguration__SensitivityParameter(
            final SensitivityConfiguration newSensitivityConfiguration__SensitivityParameter) {
        if (newSensitivityConfiguration__SensitivityParameter != this.eInternalContainer()
                || (this.eContainerFeatureID() != SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER
                        && newSensitivityConfiguration__SensitivityParameter != null)) {
            if (EcoreUtil.isAncestor(this, newSensitivityConfiguration__SensitivityParameter)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newSensitivityConfiguration__SensitivityParameter != null) {
                msgs = ((InternalEObject) newSensitivityConfiguration__SensitivityParameter).eInverseAdd(this,
                        SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                        SensitivityConfiguration.class, msgs);
            }
            msgs = this.basicSetSensitivityConfiguration__SensitivityParameter(
                    newSensitivityConfiguration__SensitivityParameter, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER,
                    newSensitivityConfiguration__SensitivityParameter,
                    newSensitivityConfiguration__SensitivityParameter));
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetParentParameter__SensitivityParameter((CombinedSensitivityParameter) otherEnd, msgs);
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetSensitivityConfiguration__SensitivityParameter((SensitivityConfiguration) otherEnd,
                    msgs);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            return this.basicSetParentParameter__SensitivityParameter(null, msgs);
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            return this.basicSetSensitivityConfiguration__SensitivityParameter(null, msgs);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            return this.eInternalContainer().eInverseRemove(this,
                    SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER,
                    CombinedSensitivityParameter.class, msgs);
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            return this.eInternalContainer().eInverseRemove(this,
                    SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                    SensitivityConfiguration.class, msgs);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            return this.getParentParameter__SensitivityParameter();
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            return this.getSensitivityConfiguration__SensitivityParameter();
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            this.setParentParameter__SensitivityParameter((CombinedSensitivityParameter) newValue);
            return;
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            this.setSensitivityConfiguration__SensitivityParameter((SensitivityConfiguration) newValue);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            this.setParentParameter__SensitivityParameter((CombinedSensitivityParameter) null);
            return;
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            this.setSensitivityConfiguration__SensitivityParameter((SensitivityConfiguration) null);
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
        case SensitivityPackage.SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER:
            return this.getParentParameter__SensitivityParameter() != null;
        case SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER:
            return this.getSensitivityConfiguration__SensitivityParameter() != null;
        }
        return super.eIsSet(featureID);
    }

} // SensitivityParameterImpl

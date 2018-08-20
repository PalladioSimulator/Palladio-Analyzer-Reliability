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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityResultSpecification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SensitivityConfigurationImpl#getSensitivityParameters__SensitivityConfiguration
 * <em>Sensitivity Parameters Sensitivity Configuration</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SensitivityConfigurationImpl#getSensitivityResultSpecifications__SensitivityConfiguration
 * <em>Sensitivity Result Specifications Sensitivity Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensitivityConfigurationImpl extends EntityImpl implements SensitivityConfiguration {

    /**
     * The cached value of the '{@link #getSensitivityParameters__SensitivityConfiguration()
     * <em>Sensitivity Parameters Sensitivity Configuration</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSensitivityParameters__SensitivityConfiguration()
     * @generated
     * @ordered
     */
    protected SensitivityParameter sensitivityParameters__SensitivityConfiguration;

    /**
     * The cached value of the '
     * {@link #getSensitivityResultSpecifications__SensitivityConfiguration()
     * <em>Sensitivity Result Specifications Sensitivity Configuration</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSensitivityResultSpecifications__SensitivityConfiguration()
     * @generated
     * @ordered
     */
    protected EList<SensitivityResultSpecification> sensitivityResultSpecifications__SensitivityConfiguration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SensitivityConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SensitivityParameter getSensitivityParameters__SensitivityConfiguration() {
        return this.sensitivityParameters__SensitivityConfiguration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSensitivityParameters__SensitivityConfiguration(
            final SensitivityParameter newSensitivityParameters__SensitivityConfiguration, NotificationChain msgs) {
        final SensitivityParameter oldSensitivityParameters__SensitivityConfiguration = this.sensitivityParameters__SensitivityConfiguration;
        this.sensitivityParameters__SensitivityConfiguration = newSensitivityParameters__SensitivityConfiguration;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                    oldSensitivityParameters__SensitivityConfiguration,
                    newSensitivityParameters__SensitivityConfiguration);
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
    public void setSensitivityParameters__SensitivityConfiguration(
            final SensitivityParameter newSensitivityParameters__SensitivityConfiguration) {
        if (newSensitivityParameters__SensitivityConfiguration != this.sensitivityParameters__SensitivityConfiguration) {
            NotificationChain msgs = null;
            if (this.sensitivityParameters__SensitivityConfiguration != null) {
                msgs = ((InternalEObject) this.sensitivityParameters__SensitivityConfiguration).eInverseRemove(this,
                        SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER,
                        SensitivityParameter.class, msgs);
            }
            if (newSensitivityParameters__SensitivityConfiguration != null) {
                msgs = ((InternalEObject) newSensitivityParameters__SensitivityConfiguration).eInverseAdd(this,
                        SensitivityPackage.SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER,
                        SensitivityParameter.class, msgs);
            }
            msgs = this.basicSetSensitivityParameters__SensitivityConfiguration(
                    newSensitivityParameters__SensitivityConfiguration, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                    newSensitivityParameters__SensitivityConfiguration,
                    newSensitivityParameters__SensitivityConfiguration));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<SensitivityResultSpecification> getSensitivityResultSpecifications__SensitivityConfiguration() {
        if (this.sensitivityResultSpecifications__SensitivityConfiguration == null) {
            this.sensitivityResultSpecifications__SensitivityConfiguration = new EObjectContainmentEList<SensitivityResultSpecification>(
                    SensitivityResultSpecification.class, this,
                    SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION);
        }
        return this.sensitivityResultSpecifications__SensitivityConfiguration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
            if (this.sensitivityParameters__SensitivityConfiguration != null) {
                msgs = ((InternalEObject) this.sensitivityParameters__SensitivityConfiguration).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                        null, msgs);
            }
            return this.basicSetSensitivityParameters__SensitivityConfiguration((SensitivityParameter) otherEnd, msgs);
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
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
            return this.basicSetSensitivityParameters__SensitivityConfiguration(null, msgs);
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION:
            return ((InternalEList<?>) this.getSensitivityResultSpecifications__SensitivityConfiguration())
                    .basicRemove(otherEnd, msgs);
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
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
            return this.getSensitivityParameters__SensitivityConfiguration();
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION:
            return this.getSensitivityResultSpecifications__SensitivityConfiguration();
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
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
            this.setSensitivityParameters__SensitivityConfiguration((SensitivityParameter) newValue);
            return;
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION:
            this.getSensitivityResultSpecifications__SensitivityConfiguration().clear();
            this.getSensitivityResultSpecifications__SensitivityConfiguration()
                    .addAll((Collection<? extends SensitivityResultSpecification>) newValue);
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
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
            this.setSensitivityParameters__SensitivityConfiguration((SensitivityParameter) null);
            return;
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION:
            this.getSensitivityResultSpecifications__SensitivityConfiguration().clear();
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
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
            return this.sensitivityParameters__SensitivityConfiguration != null;
        case SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION:
            return this.sensitivityResultSpecifications__SensitivityConfiguration != null
                    && !this.sensitivityResultSpecifications__SensitivityConfiguration.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SensitivityConfigurationImpl

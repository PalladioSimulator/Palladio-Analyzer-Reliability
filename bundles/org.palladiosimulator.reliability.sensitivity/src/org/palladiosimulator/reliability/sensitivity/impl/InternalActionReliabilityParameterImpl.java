/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.pcm.reliability.SoftwareInducedFailureType;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Internal Action Reliability Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.InternalActionReliabilityParameterImpl#getSoftwareInducedFailureType__InternalActionReliabilityParameter
 * <em>Software Induced Failure Type Internal Action Reliability Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.InternalActionReliabilityParameterImpl#getInternalAction__InternalActionReliabilityParameter
 * <em>Internal Action Internal Action Reliability Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalActionReliabilityParameterImpl extends SingleSensitivityParameterImpl
        implements InternalActionReliabilityParameter {

    /**
     * The cached value of the '
     * {@link #getSoftwareInducedFailureType__InternalActionReliabilityParameter()
     * <em>Software Induced Failure Type Internal Action Reliability Parameter</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSoftwareInducedFailureType__InternalActionReliabilityParameter()
     * @generated
     * @ordered
     */
    protected SoftwareInducedFailureType softwareInducedFailureType__InternalActionReliabilityParameter;

    /**
     * The cached value of the '{@link #getInternalAction__InternalActionReliabilityParameter()
     * <em>Internal Action Internal Action Reliability Parameter</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInternalAction__InternalActionReliabilityParameter()
     * @generated
     * @ordered
     */
    protected InternalAction internalAction__InternalActionReliabilityParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected InternalActionReliabilityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.INTERNAL_ACTION_RELIABILITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SoftwareInducedFailureType getSoftwareInducedFailureType__InternalActionReliabilityParameter() {
        if (this.softwareInducedFailureType__InternalActionReliabilityParameter != null
                && ((EObject) this.softwareInducedFailureType__InternalActionReliabilityParameter).eIsProxy()) {
            final InternalEObject oldSoftwareInducedFailureType__InternalActionReliabilityParameter = (InternalEObject) this.softwareInducedFailureType__InternalActionReliabilityParameter;
            this.softwareInducedFailureType__InternalActionReliabilityParameter = (SoftwareInducedFailureType) this
                    .eResolveProxy(oldSoftwareInducedFailureType__InternalActionReliabilityParameter);
            if (this.softwareInducedFailureType__InternalActionReliabilityParameter != oldSoftwareInducedFailureType__InternalActionReliabilityParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER,
                            oldSoftwareInducedFailureType__InternalActionReliabilityParameter,
                            this.softwareInducedFailureType__InternalActionReliabilityParameter));
                }
            }
        }
        return this.softwareInducedFailureType__InternalActionReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SoftwareInducedFailureType basicGetSoftwareInducedFailureType__InternalActionReliabilityParameter() {
        return this.softwareInducedFailureType__InternalActionReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSoftwareInducedFailureType__InternalActionReliabilityParameter(
            final SoftwareInducedFailureType newSoftwareInducedFailureType__InternalActionReliabilityParameter) {
        final SoftwareInducedFailureType oldSoftwareInducedFailureType__InternalActionReliabilityParameter = this.softwareInducedFailureType__InternalActionReliabilityParameter;
        this.softwareInducedFailureType__InternalActionReliabilityParameter = newSoftwareInducedFailureType__InternalActionReliabilityParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER,
                    oldSoftwareInducedFailureType__InternalActionReliabilityParameter,
                    this.softwareInducedFailureType__InternalActionReliabilityParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public InternalAction getInternalAction__InternalActionReliabilityParameter() {
        if (this.internalAction__InternalActionReliabilityParameter != null
                && ((EObject) this.internalAction__InternalActionReliabilityParameter).eIsProxy()) {
            final InternalEObject oldInternalAction__InternalActionReliabilityParameter = (InternalEObject) this.internalAction__InternalActionReliabilityParameter;
            this.internalAction__InternalActionReliabilityParameter = (InternalAction) this
                    .eResolveProxy(oldInternalAction__InternalActionReliabilityParameter);
            if (this.internalAction__InternalActionReliabilityParameter != oldInternalAction__InternalActionReliabilityParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER,
                            oldInternalAction__InternalActionReliabilityParameter,
                            this.internalAction__InternalActionReliabilityParameter));
                }
            }
        }
        return this.internalAction__InternalActionReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public InternalAction basicGetInternalAction__InternalActionReliabilityParameter() {
        return this.internalAction__InternalActionReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInternalAction__InternalActionReliabilityParameter(
            final InternalAction newInternalAction__InternalActionReliabilityParameter) {
        final InternalAction oldInternalAction__InternalActionReliabilityParameter = this.internalAction__InternalActionReliabilityParameter;
        this.internalAction__InternalActionReliabilityParameter = newInternalAction__InternalActionReliabilityParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER,
                    oldInternalAction__InternalActionReliabilityParameter,
                    this.internalAction__InternalActionReliabilityParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean InternalActionReliabilityParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "InternalActionReliabilityParameterMustHaveDoubleVariation",
                                                EObjectValidator.getObjectLabel(this, context) }),
                        new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            if (resolve) {
                return this.getSoftwareInducedFailureType__InternalActionReliabilityParameter();
            }
            return this.basicGetSoftwareInducedFailureType__InternalActionReliabilityParameter();
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            if (resolve) {
                return this.getInternalAction__InternalActionReliabilityParameter();
            }
            return this.basicGetInternalAction__InternalActionReliabilityParameter();
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
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            this.setSoftwareInducedFailureType__InternalActionReliabilityParameter(
                    (SoftwareInducedFailureType) newValue);
            return;
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            this.setInternalAction__InternalActionReliabilityParameter((InternalAction) newValue);
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
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            this.setSoftwareInducedFailureType__InternalActionReliabilityParameter((SoftwareInducedFailureType) null);
            return;
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            this.setInternalAction__InternalActionReliabilityParameter((InternalAction) null);
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
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            return this.softwareInducedFailureType__InternalActionReliabilityParameter != null;
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER:
            return this.internalAction__InternalActionReliabilityParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // InternalActionReliabilityParameterImpl

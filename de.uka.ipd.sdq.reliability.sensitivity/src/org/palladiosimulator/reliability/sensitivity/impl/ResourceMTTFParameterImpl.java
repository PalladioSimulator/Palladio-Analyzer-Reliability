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
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource MTTF Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.ResourceMTTFParameterImpl#getProcessingResourceType__ResourceMTTFParameter
 * <em>Processing Resource Type Resource MTTF Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.ResourceMTTFParameterImpl#getResourceContainer__ResourceMTTFParameter
 * <em>Resource Container Resource MTTF Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceMTTFParameterImpl extends SingleSensitivityParameterImpl implements ResourceMTTFParameter {

    /**
     * The cached value of the '{@link #getProcessingResourceType__ResourceMTTFParameter()
     * <em>Processing Resource Type Resource MTTF Parameter</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getProcessingResourceType__ResourceMTTFParameter()
     * @generated
     * @ordered
     */
    protected ProcessingResourceType processingResourceType__ResourceMTTFParameter;

    /**
     * The cached value of the '{@link #getResourceContainer__ResourceMTTFParameter()
     * <em>Resource Container Resource MTTF Parameter</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getResourceContainer__ResourceMTTFParameter()
     * @generated
     * @ordered
     */
    protected ResourceContainer resourceContainer__ResourceMTTFParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ResourceMTTFParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.RESOURCE_MTTF_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProcessingResourceType getProcessingResourceType__ResourceMTTFParameter() {
        if (this.processingResourceType__ResourceMTTFParameter != null
                && ((EObject) this.processingResourceType__ResourceMTTFParameter).eIsProxy()) {
            final InternalEObject oldProcessingResourceType__ResourceMTTFParameter = (InternalEObject) this.processingResourceType__ResourceMTTFParameter;
            this.processingResourceType__ResourceMTTFParameter = (ProcessingResourceType) this
                    .eResolveProxy(oldProcessingResourceType__ResourceMTTFParameter);
            if (this.processingResourceType__ResourceMTTFParameter != oldProcessingResourceType__ResourceMTTFParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER,
                            oldProcessingResourceType__ResourceMTTFParameter,
                            this.processingResourceType__ResourceMTTFParameter));
                }
            }
        }
        return this.processingResourceType__ResourceMTTFParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProcessingResourceType basicGetProcessingResourceType__ResourceMTTFParameter() {
        return this.processingResourceType__ResourceMTTFParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setProcessingResourceType__ResourceMTTFParameter(
            final ProcessingResourceType newProcessingResourceType__ResourceMTTFParameter) {
        final ProcessingResourceType oldProcessingResourceType__ResourceMTTFParameter = this.processingResourceType__ResourceMTTFParameter;
        this.processingResourceType__ResourceMTTFParameter = newProcessingResourceType__ResourceMTTFParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER,
                    oldProcessingResourceType__ResourceMTTFParameter,
                    this.processingResourceType__ResourceMTTFParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceContainer getResourceContainer__ResourceMTTFParameter() {
        if (this.resourceContainer__ResourceMTTFParameter != null
                && ((EObject) this.resourceContainer__ResourceMTTFParameter).eIsProxy()) {
            final InternalEObject oldResourceContainer__ResourceMTTFParameter = (InternalEObject) this.resourceContainer__ResourceMTTFParameter;
            this.resourceContainer__ResourceMTTFParameter = (ResourceContainer) this
                    .eResolveProxy(oldResourceContainer__ResourceMTTFParameter);
            if (this.resourceContainer__ResourceMTTFParameter != oldResourceContainer__ResourceMTTFParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER,
                            oldResourceContainer__ResourceMTTFParameter,
                            this.resourceContainer__ResourceMTTFParameter));
                }
            }
        }
        return this.resourceContainer__ResourceMTTFParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceContainer basicGetResourceContainer__ResourceMTTFParameter() {
        return this.resourceContainer__ResourceMTTFParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setResourceContainer__ResourceMTTFParameter(
            final ResourceContainer newResourceContainer__ResourceMTTFParameter) {
        final ResourceContainer oldResourceContainer__ResourceMTTFParameter = this.resourceContainer__ResourceMTTFParameter;
        this.resourceContainer__ResourceMTTFParameter = newResourceContainer__ResourceMTTFParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER,
                    oldResourceContainer__ResourceMTTFParameter, this.resourceContainer__ResourceMTTFParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean ResourceMTTFParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.RESOURCE_MTTF_PARAMETER__RESOURCE_MTTF_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ResourceMTTFParameterMustHaveDoubleVariation",
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
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER:
            if (resolve) {
                return this.getProcessingResourceType__ResourceMTTFParameter();
            }
            return this.basicGetProcessingResourceType__ResourceMTTFParameter();
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER:
            if (resolve) {
                return this.getResourceContainer__ResourceMTTFParameter();
            }
            return this.basicGetResourceContainer__ResourceMTTFParameter();
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
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER:
            this.setProcessingResourceType__ResourceMTTFParameter((ProcessingResourceType) newValue);
            return;
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER:
            this.setResourceContainer__ResourceMTTFParameter((ResourceContainer) newValue);
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
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER:
            this.setProcessingResourceType__ResourceMTTFParameter((ProcessingResourceType) null);
            return;
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER:
            this.setResourceContainer__ResourceMTTFParameter((ResourceContainer) null);
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
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER:
            return this.processingResourceType__ResourceMTTFParameter != null;
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER:
            return this.resourceContainer__ResourceMTTFParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // ResourceMTTFParameterImpl

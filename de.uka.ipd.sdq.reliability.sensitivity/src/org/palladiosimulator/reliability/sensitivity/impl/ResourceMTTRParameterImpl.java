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
import org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource MTTR Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.ResourceMTTRParameterImpl#getResourceContainer__ResourceMTTRParameter
 * <em>Resource Container Resource MTTR Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.ResourceMTTRParameterImpl#getProcessingResourceType__ResourceMTTRParameter
 * <em>Processing Resource Type Resource MTTR Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceMTTRParameterImpl extends SingleSensitivityParameterImpl implements ResourceMTTRParameter {

    /**
     * The cached value of the '{@link #getResourceContainer__ResourceMTTRParameter()
     * <em>Resource Container Resource MTTR Parameter</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getResourceContainer__ResourceMTTRParameter()
     * @generated
     * @ordered
     */
    protected ResourceContainer resourceContainer__ResourceMTTRParameter;

    /**
     * The cached value of the '{@link #getProcessingResourceType__ResourceMTTRParameter()
     * <em>Processing Resource Type Resource MTTR Parameter</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getProcessingResourceType__ResourceMTTRParameter()
     * @generated
     * @ordered
     */
    protected ProcessingResourceType processingResourceType__ResourceMTTRParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ResourceMTTRParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.RESOURCE_MTTR_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceContainer getResourceContainer__ResourceMTTRParameter() {
        if (this.resourceContainer__ResourceMTTRParameter != null
                && ((EObject) this.resourceContainer__ResourceMTTRParameter).eIsProxy()) {
            final InternalEObject oldResourceContainer__ResourceMTTRParameter = (InternalEObject) this.resourceContainer__ResourceMTTRParameter;
            this.resourceContainer__ResourceMTTRParameter = (ResourceContainer) this
                    .eResolveProxy(oldResourceContainer__ResourceMTTRParameter);
            if (this.resourceContainer__ResourceMTTRParameter != oldResourceContainer__ResourceMTTRParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER,
                            oldResourceContainer__ResourceMTTRParameter,
                            this.resourceContainer__ResourceMTTRParameter));
                }
            }
        }
        return this.resourceContainer__ResourceMTTRParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceContainer basicGetResourceContainer__ResourceMTTRParameter() {
        return this.resourceContainer__ResourceMTTRParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setResourceContainer__ResourceMTTRParameter(
            final ResourceContainer newResourceContainer__ResourceMTTRParameter) {
        final ResourceContainer oldResourceContainer__ResourceMTTRParameter = this.resourceContainer__ResourceMTTRParameter;
        this.resourceContainer__ResourceMTTRParameter = newResourceContainer__ResourceMTTRParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER,
                    oldResourceContainer__ResourceMTTRParameter, this.resourceContainer__ResourceMTTRParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProcessingResourceType getProcessingResourceType__ResourceMTTRParameter() {
        if (this.processingResourceType__ResourceMTTRParameter != null
                && ((EObject) this.processingResourceType__ResourceMTTRParameter).eIsProxy()) {
            final InternalEObject oldProcessingResourceType__ResourceMTTRParameter = (InternalEObject) this.processingResourceType__ResourceMTTRParameter;
            this.processingResourceType__ResourceMTTRParameter = (ProcessingResourceType) this
                    .eResolveProxy(oldProcessingResourceType__ResourceMTTRParameter);
            if (this.processingResourceType__ResourceMTTRParameter != oldProcessingResourceType__ResourceMTTRParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER,
                            oldProcessingResourceType__ResourceMTTRParameter,
                            this.processingResourceType__ResourceMTTRParameter));
                }
            }
        }
        return this.processingResourceType__ResourceMTTRParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProcessingResourceType basicGetProcessingResourceType__ResourceMTTRParameter() {
        return this.processingResourceType__ResourceMTTRParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setProcessingResourceType__ResourceMTTRParameter(
            final ProcessingResourceType newProcessingResourceType__ResourceMTTRParameter) {
        final ProcessingResourceType oldProcessingResourceType__ResourceMTTRParameter = this.processingResourceType__ResourceMTTRParameter;
        this.processingResourceType__ResourceMTTRParameter = newProcessingResourceType__ResourceMTTRParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER,
                    oldProcessingResourceType__ResourceMTTRParameter,
                    this.processingResourceType__ResourceMTTRParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean ResourceMTTRParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.RESOURCE_MTTR_PARAMETER__RESOURCE_MTTR_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ResourceMTTRParameterMustHaveDoubleVariation",
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
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER:
            if (resolve) {
                return this.getResourceContainer__ResourceMTTRParameter();
            }
            return this.basicGetResourceContainer__ResourceMTTRParameter();
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER:
            if (resolve) {
                return this.getProcessingResourceType__ResourceMTTRParameter();
            }
            return this.basicGetProcessingResourceType__ResourceMTTRParameter();
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
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER:
            this.setResourceContainer__ResourceMTTRParameter((ResourceContainer) newValue);
            return;
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER:
            this.setProcessingResourceType__ResourceMTTRParameter((ProcessingResourceType) newValue);
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
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER:
            this.setResourceContainer__ResourceMTTRParameter((ResourceContainer) null);
            return;
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER:
            this.setProcessingResourceType__ResourceMTTRParameter((ProcessingResourceType) null);
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
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER:
            return this.resourceContainer__ResourceMTTRParameter != null;
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER:
            return this.processingResourceType__ResourceMTTRParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // ResourceMTTRParameterImpl

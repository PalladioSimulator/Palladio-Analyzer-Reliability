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
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.VariableUsageParameter;
import org.palladiosimulator.reliability.sensitivity.VariableUsageType;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Usage Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.VariableUsageParameterImpl#getVariableName
 * <em>Variable Name</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.VariableUsageParameterImpl#getEntryLevelSystemCall__VariableUsageParameter
 * <em>Entry Level System Call Variable Usage Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.VariableUsageParameterImpl#getVariableCharacterisationType__VariableUsageParameter
 * <em>Variable Characterisation Type Variable Usage Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.VariableUsageParameterImpl#getVariableUsageType__VariableUsageParameter
 * <em>Variable Usage Type Variable Usage Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.VariableUsageParameterImpl#getBasicComponent__VariableUsageParameter
 * <em>Basic Component Variable Usage Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableUsageParameterImpl extends SingleSensitivityParameterImpl implements VariableUsageParameter {

    /**
     * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVariableName()
     * @generated
     * @ordered
     */
    protected static final String VARIABLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVariableName()
     * @generated
     * @ordered
     */
    protected String variableName = VARIABLE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getEntryLevelSystemCall__VariableUsageParameter()
     * <em>Entry Level System Call Variable Usage Parameter</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getEntryLevelSystemCall__VariableUsageParameter()
     * @generated
     * @ordered
     */
    protected EntryLevelSystemCall entryLevelSystemCall__VariableUsageParameter;

    /**
     * The default value of the '{@link #getVariableCharacterisationType__VariableUsageParameter()
     * <em>Variable Characterisation Type Variable Usage Parameter</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVariableCharacterisationType__VariableUsageParameter()
     * @generated
     * @ordered
     */
    protected static final VariableCharacterisationType VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT = VariableCharacterisationType.STRUCTURE;

    /**
     * The cached value of the '{@link #getVariableCharacterisationType__VariableUsageParameter()
     * <em>Variable Characterisation Type Variable Usage Parameter</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVariableCharacterisationType__VariableUsageParameter()
     * @generated
     * @ordered
     */
    protected VariableCharacterisationType variableCharacterisationType__VariableUsageParameter = VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT;

    /**
     * The default value of the '{@link #getVariableUsageType__VariableUsageParameter()
     * <em>Variable Usage Type Variable Usage Parameter</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getVariableUsageType__VariableUsageParameter()
     * @generated
     * @ordered
     */
    protected static final VariableUsageType VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT = VariableUsageType.SYSTEM_CALL_INPUT;

    /**
     * The cached value of the '{@link #getVariableUsageType__VariableUsageParameter()
     * <em>Variable Usage Type Variable Usage Parameter</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getVariableUsageType__VariableUsageParameter()
     * @generated
     * @ordered
     */
    protected VariableUsageType variableUsageType__VariableUsageParameter = VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT;

    /**
     * The cached value of the '{@link #getBasicComponent__VariableUsageParameter()
     * <em>Basic Component Variable Usage Parameter</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getBasicComponent__VariableUsageParameter()
     * @generated
     * @ordered
     */
    protected BasicComponent basicComponent__VariableUsageParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected VariableUsageParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.VARIABLE_USAGE_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getVariableName() {
        return this.variableName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setVariableName(final String newVariableName) {
        final String oldVariableName = this.variableName;
        this.variableName = newVariableName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME, oldVariableName, this.variableName));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EntryLevelSystemCall getEntryLevelSystemCall__VariableUsageParameter() {
        if (this.entryLevelSystemCall__VariableUsageParameter != null
                && ((EObject) this.entryLevelSystemCall__VariableUsageParameter).eIsProxy()) {
            final InternalEObject oldEntryLevelSystemCall__VariableUsageParameter = (InternalEObject) this.entryLevelSystemCall__VariableUsageParameter;
            this.entryLevelSystemCall__VariableUsageParameter = (EntryLevelSystemCall) this
                    .eResolveProxy(oldEntryLevelSystemCall__VariableUsageParameter);
            if (this.entryLevelSystemCall__VariableUsageParameter != oldEntryLevelSystemCall__VariableUsageParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER,
                            oldEntryLevelSystemCall__VariableUsageParameter,
                            this.entryLevelSystemCall__VariableUsageParameter));
                }
            }
        }
        return this.entryLevelSystemCall__VariableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EntryLevelSystemCall basicGetEntryLevelSystemCall__VariableUsageParameter() {
        return this.entryLevelSystemCall__VariableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setEntryLevelSystemCall__VariableUsageParameter(
            final EntryLevelSystemCall newEntryLevelSystemCall__VariableUsageParameter) {
        final EntryLevelSystemCall oldEntryLevelSystemCall__VariableUsageParameter = this.entryLevelSystemCall__VariableUsageParameter;
        this.entryLevelSystemCall__VariableUsageParameter = newEntryLevelSystemCall__VariableUsageParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER,
                    oldEntryLevelSystemCall__VariableUsageParameter,
                    this.entryLevelSystemCall__VariableUsageParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableCharacterisationType getVariableCharacterisationType__VariableUsageParameter() {
        return this.variableCharacterisationType__VariableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setVariableCharacterisationType__VariableUsageParameter(
            final VariableCharacterisationType newVariableCharacterisationType__VariableUsageParameter) {
        final VariableCharacterisationType oldVariableCharacterisationType__VariableUsageParameter = this.variableCharacterisationType__VariableUsageParameter;
        this.variableCharacterisationType__VariableUsageParameter = newVariableCharacterisationType__VariableUsageParameter == null
                ? VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT
                : newVariableCharacterisationType__VariableUsageParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER,
                    oldVariableCharacterisationType__VariableUsageParameter,
                    this.variableCharacterisationType__VariableUsageParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableUsageType getVariableUsageType__VariableUsageParameter() {
        return this.variableUsageType__VariableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setVariableUsageType__VariableUsageParameter(
            final VariableUsageType newVariableUsageType__VariableUsageParameter) {
        final VariableUsageType oldVariableUsageType__VariableUsageParameter = this.variableUsageType__VariableUsageParameter;
        this.variableUsageType__VariableUsageParameter = newVariableUsageType__VariableUsageParameter == null
                ? VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT : newVariableUsageType__VariableUsageParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER,
                    oldVariableUsageType__VariableUsageParameter, this.variableUsageType__VariableUsageParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BasicComponent getBasicComponent__VariableUsageParameter() {
        if (this.basicComponent__VariableUsageParameter != null
                && ((EObject) this.basicComponent__VariableUsageParameter).eIsProxy()) {
            final InternalEObject oldBasicComponent__VariableUsageParameter = (InternalEObject) this.basicComponent__VariableUsageParameter;
            this.basicComponent__VariableUsageParameter = (BasicComponent) this
                    .eResolveProxy(oldBasicComponent__VariableUsageParameter);
            if (this.basicComponent__VariableUsageParameter != oldBasicComponent__VariableUsageParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER,
                            oldBasicComponent__VariableUsageParameter, this.basicComponent__VariableUsageParameter));
                }
            }
        }
        return this.basicComponent__VariableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BasicComponent basicGetBasicComponent__VariableUsageParameter() {
        return this.basicComponent__VariableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBasicComponent__VariableUsageParameter(
            final BasicComponent newBasicComponent__VariableUsageParameter) {
        final BasicComponent oldBasicComponent__VariableUsageParameter = this.basicComponent__VariableUsageParameter;
        this.basicComponent__VariableUsageParameter = newBasicComponent__VariableUsageParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER,
                    oldBasicComponent__VariableUsageParameter, this.basicComponent__VariableUsageParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean SystemCallParameterMustHaveStringSequence(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.VARIABLE_USAGE_PARAMETER__SYSTEM_CALL_PARAMETER_MUST_HAVE_STRING_SEQUENCE,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "SystemCallParameterMustHaveStringSequence",
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
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME:
            return this.getVariableName();
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER:
            if (resolve) {
                return this.getEntryLevelSystemCall__VariableUsageParameter();
            }
            return this.basicGetEntryLevelSystemCall__VariableUsageParameter();
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER:
            return this.getVariableCharacterisationType__VariableUsageParameter();
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER:
            return this.getVariableUsageType__VariableUsageParameter();
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER:
            if (resolve) {
                return this.getBasicComponent__VariableUsageParameter();
            }
            return this.basicGetBasicComponent__VariableUsageParameter();
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
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME:
            this.setVariableName((String) newValue);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER:
            this.setEntryLevelSystemCall__VariableUsageParameter((EntryLevelSystemCall) newValue);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER:
            this.setVariableCharacterisationType__VariableUsageParameter((VariableCharacterisationType) newValue);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER:
            this.setVariableUsageType__VariableUsageParameter((VariableUsageType) newValue);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER:
            this.setBasicComponent__VariableUsageParameter((BasicComponent) newValue);
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
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME:
            this.setVariableName(VARIABLE_NAME_EDEFAULT);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER:
            this.setEntryLevelSystemCall__VariableUsageParameter((EntryLevelSystemCall) null);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER:
            this.setVariableCharacterisationType__VariableUsageParameter(
                    VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER:
            this.setVariableUsageType__VariableUsageParameter(VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT);
            return;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER:
            this.setBasicComponent__VariableUsageParameter((BasicComponent) null);
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
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME:
            return VARIABLE_NAME_EDEFAULT == null ? this.variableName != null
                    : !VARIABLE_NAME_EDEFAULT.equals(this.variableName);
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER:
            return this.entryLevelSystemCall__VariableUsageParameter != null;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER:
            return this.variableCharacterisationType__VariableUsageParameter != VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER:
            return this.variableUsageType__VariableUsageParameter != VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER_EDEFAULT;
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER:
            return this.basicComponent__VariableUsageParameter != null;
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
        result.append(" (VariableName: ");
        result.append(this.variableName);
        result.append(", variableCharacterisationType__VariableUsageParameter: ");
        result.append(this.variableCharacterisationType__VariableUsageParameter);
        result.append(", variableUsageType__VariableUsageParameter: ");
        result.append(this.variableUsageType__VariableUsageParameter);
        result.append(')');
        return result.toString();
    }

} // VariableUsageParameterImpl

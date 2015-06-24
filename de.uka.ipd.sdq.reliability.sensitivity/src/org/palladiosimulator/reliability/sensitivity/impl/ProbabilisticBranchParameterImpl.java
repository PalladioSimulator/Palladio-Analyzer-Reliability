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
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition;
import org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Probabilistic Branch Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.ProbabilisticBranchParameterImpl#getProbabilisticBranchTransition__ProbabilisticBranchParameter
 * <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticBranchParameterImpl extends SingleSensitivityParameterImpl
        implements ProbabilisticBranchParameter {

    /**
     * The cached value of the '
     * {@link #getProbabilisticBranchTransition__ProbabilisticBranchParameter()
     * <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getProbabilisticBranchTransition__ProbabilisticBranchParameter()
     * @generated
     * @ordered
     */
    protected ProbabilisticBranchTransition probabilisticBranchTransition__ProbabilisticBranchParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProbabilisticBranchParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.PROBABILISTIC_BRANCH_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbabilisticBranchTransition getProbabilisticBranchTransition__ProbabilisticBranchParameter() {
        if (this.probabilisticBranchTransition__ProbabilisticBranchParameter != null
                && ((EObject) this.probabilisticBranchTransition__ProbabilisticBranchParameter).eIsProxy()) {
            final InternalEObject oldProbabilisticBranchTransition__ProbabilisticBranchParameter = (InternalEObject) this.probabilisticBranchTransition__ProbabilisticBranchParameter;
            this.probabilisticBranchTransition__ProbabilisticBranchParameter = (ProbabilisticBranchTransition) this
                    .eResolveProxy(oldProbabilisticBranchTransition__ProbabilisticBranchParameter);
            if (this.probabilisticBranchTransition__ProbabilisticBranchParameter != oldProbabilisticBranchTransition__ProbabilisticBranchParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER,
                            oldProbabilisticBranchTransition__ProbabilisticBranchParameter,
                            this.probabilisticBranchTransition__ProbabilisticBranchParameter));
                }
            }
        }
        return this.probabilisticBranchTransition__ProbabilisticBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProbabilisticBranchTransition basicGetProbabilisticBranchTransition__ProbabilisticBranchParameter() {
        return this.probabilisticBranchTransition__ProbabilisticBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setProbabilisticBranchTransition__ProbabilisticBranchParameter(
            final ProbabilisticBranchTransition newProbabilisticBranchTransition__ProbabilisticBranchParameter) {
        final ProbabilisticBranchTransition oldProbabilisticBranchTransition__ProbabilisticBranchParameter = this.probabilisticBranchTransition__ProbabilisticBranchParameter;
        this.probabilisticBranchTransition__ProbabilisticBranchParameter = newProbabilisticBranchTransition__ProbabilisticBranchParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER,
                    oldProbabilisticBranchTransition__ProbabilisticBranchParameter,
                    this.probabilisticBranchTransition__ProbabilisticBranchParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean ProbabilisticBranchParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ProbabilisticBranchParameterMustHaveDoubleVariation",
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
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER:
            if (resolve) {
                return this.getProbabilisticBranchTransition__ProbabilisticBranchParameter();
            }
            return this.basicGetProbabilisticBranchTransition__ProbabilisticBranchParameter();
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
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER:
            this.setProbabilisticBranchTransition__ProbabilisticBranchParameter(
                    (ProbabilisticBranchTransition) newValue);
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
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER:
            this.setProbabilisticBranchTransition__ProbabilisticBranchParameter((ProbabilisticBranchTransition) null);
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
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER:
            return this.probabilisticBranchTransition__ProbabilisticBranchParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // ProbabilisticBranchParameterImpl

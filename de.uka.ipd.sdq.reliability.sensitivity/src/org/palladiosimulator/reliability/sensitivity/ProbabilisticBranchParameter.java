/**
 */
package org.palladiosimulator.reliability.sensitivity;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Probabilistic Branch Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> This&nbsp;parameter&nbsp;refers&nbsp;to&nbsp;a&nbsp;branch
 * transition&nbsp;probability&nbsp;specified&nbsp;in&nbsp;the&nbsp;context&nbsp;of&nbsp;the&nbsp;
 * given ProbabilisticBranchTransition. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter#getProbabilisticBranchTransition__ProbabilisticBranchParameter
 * <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getProbabilisticBranchParameter()
 * @model
 * @generated
 */
public interface ProbabilisticBranchParameter extends SingleSensitivityParameter {

    /**
     * Returns the value of the '
     * <em><b>Probabilistic Branch Transition Probabilistic Branch Parameter</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '
     * <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>' reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '
     *         <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>' reference.
     * @see #setProbabilisticBranchTransition__ProbabilisticBranchParameter(ProbabilisticBranchTransition)
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getProbabilisticBranchParameter_ProbabilisticBranchTransition__ProbabilisticBranchParameter()
     * @model required="true" ordered="false"
     * @generated
     */
    ProbabilisticBranchTransition getProbabilisticBranchTransition__ProbabilisticBranchParameter();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter#getProbabilisticBranchTransition__ProbabilisticBranchParameter
     * <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '
     *            <em>Probabilistic Branch Transition Probabilistic Branch Parameter</em>'
     *            reference.
     * @see #getProbabilisticBranchTransition__ProbabilisticBranchParameter()
     * @generated
     */
    void setProbabilisticBranchTransition__ProbabilisticBranchParameter(ProbabilisticBranchTransition value);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * self.sensitivityParameterVariation__SingleSensitivityParameter.oclIsTypeOf(
     * DoubleParameterVariation)
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean ProbabilisticBranchParameterMustHaveDoubleVariation(DiagnosticChain diagnostics,
            Map<Object, Object> context);

} // ProbabilisticBranchParameter

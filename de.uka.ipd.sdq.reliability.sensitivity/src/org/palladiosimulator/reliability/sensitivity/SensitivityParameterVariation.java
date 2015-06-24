/**
 */
package org.palladiosimulator.reliability.sensitivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Variation</b></em>
 * '. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Specifies how a given sensitivity parameter shall be varied. From this
 * specification, a sequence of parameter values can be determined that constitutes the variation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation#getSingleSensitivityParameter__SensitivityParameterVariation
 * <em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSensitivityParameterVariation()
 * @model abstract="true"
 * @generated
 */
public interface SensitivityParameterVariation extends EObject {

    /**
     * Returns the value of the '
     * <em><b>Single Sensitivity Parameter Sensitivity Parameter Variation</b></em>' container
     * reference. It is bidirectional and its opposite is '
     * {@link org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter#getSensitivityParameterVariation__SingleSensitivityParameter
     * <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>}'. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>'
     * container reference isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '
     *         <em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>' container
     *         reference.
     * @see #setSingleSensitivityParameter__SensitivityParameterVariation(SingleSensitivityParameter)
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSensitivityParameterVariation_SingleSensitivityParameter__SensitivityParameterVariation()
     * @see org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter#getSensitivityParameterVariation__SingleSensitivityParameter
     * @model opposite="sensitivityParameterVariation__SingleSensitivityParameter" required="true"
     *        transient="false" ordered="false"
     * @generated
     */
    SingleSensitivityParameter getSingleSensitivityParameter__SensitivityParameterVariation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation#getSingleSensitivityParameter__SensitivityParameterVariation
     * <em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '
     *            <em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>' container
     *            reference.
     * @see #getSingleSensitivityParameter__SensitivityParameterVariation()
     * @generated
     */
    void setSingleSensitivityParameter__SensitivityParameterVariation(SingleSensitivityParameter value);

} // SensitivityParameterVariation

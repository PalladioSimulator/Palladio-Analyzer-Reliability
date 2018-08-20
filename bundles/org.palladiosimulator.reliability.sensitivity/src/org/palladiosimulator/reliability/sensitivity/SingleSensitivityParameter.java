/**
 */
package org.palladiosimulator.reliability.sensitivity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Single Sensitivity Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Abstract base class for all single (i.e. not combined) sensitivity
 * parameters. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter#getSensitivityParameterVariation__SingleSensitivityParameter
 * <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSingleSensitivityParameter()
 * @model abstract="true"
 * @generated
 */
public interface SingleSensitivityParameter extends SensitivityParameter {

    /**
     * Returns the value of the '
     * <em><b>Sensitivity Parameter Variation Single Sensitivity Parameter</b></em>' containment
     * reference. It is bidirectional and its opposite is '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation#getSingleSensitivityParameter__SensitivityParameterVariation
     * <em>Single Sensitivity Parameter Sensitivity Parameter Variation</em>}'. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>'
     * containment reference isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '
     *         <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>' containment
     *         reference.
     * @see #setSensitivityParameterVariation__SingleSensitivityParameter(SensitivityParameterVariation)
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSingleSensitivityParameter_SensitivityParameterVariation__SingleSensitivityParameter()
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation#getSingleSensitivityParameter__SensitivityParameterVariation
     * @model opposite="singleSensitivityParameter__SensitivityParameterVariation"
     *        containment="true" required="true" ordered="false"
     * @generated
     */
    SensitivityParameterVariation getSensitivityParameterVariation__SingleSensitivityParameter();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter#getSensitivityParameterVariation__SingleSensitivityParameter
     * <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '
     *            <em>Sensitivity Parameter Variation Single Sensitivity Parameter</em>' containment
     *            reference.
     * @see #getSensitivityParameterVariation__SingleSensitivityParameter()
     * @generated
     */
    void setSensitivityParameterVariation__SingleSensitivityParameter(SensitivityParameterVariation value);

} // SingleSensitivityParameter

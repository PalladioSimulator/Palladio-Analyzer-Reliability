/**
 */
package org.palladiosimulator.reliability.sensitivity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Failure Dimension Result Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Describes the overall failure potential associated with one dimension of
 * failure types (software-induced, hardware-induced, network-induced). <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification#getFailureDimension__FailureDimensionResultSpecification
 * <em>Failure Dimension Failure Dimension Result Specification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getFailureDimensionResultSpecification()
 * @model
 * @generated
 */
public interface FailureDimensionResultSpecification extends SensitivityResultSpecification {

    /**
     * Returns the value of the '
     * <em><b>Failure Dimension Failure Dimension Result Specification</b></em>' attribute. The
     * literals are from the enumeration
     * {@link org.palladiosimulator.reliability.sensitivity.FailureDimension}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Failure Dimension Failure Dimension Result Specification</em>'
     * attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Failure Dimension Failure Dimension Result Specification</em>'
     *         attribute.
     * @see org.palladiosimulator.reliability.sensitivity.FailureDimension
     * @see #setFailureDimension__FailureDimensionResultSpecification(FailureDimension)
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getFailureDimensionResultSpecification_FailureDimension__FailureDimensionResultSpecification()
     * @model required="true" ordered="false"
     * @generated
     */
    FailureDimension getFailureDimension__FailureDimensionResultSpecification();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification#getFailureDimension__FailureDimensionResultSpecification
     * <em>Failure Dimension Failure Dimension Result Specification</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '
     *            <em>Failure Dimension Failure Dimension Result Specification</em>' attribute.
     * @see org.palladiosimulator.reliability.sensitivity.FailureDimension
     * @see #getFailureDimension__FailureDimensionResultSpecification()
     * @generated
     */
    void setFailureDimension__FailureDimensionResultSpecification(FailureDimension value);

} // FailureDimensionResultSpecification

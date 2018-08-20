/**
 */
package org.palladiosimulator.reliability.sensitivity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root&nbsp;class&nbsp;of&nbsp;a&nbsp;sensitivity&nbsp;analysis&nbsp;configuration.&nbsp;The&nbsp;
 * configuration&nbsp;specifies&nbsp;one&nbsp;or&nbsp;multiple&nbsp;parameter&nbsp;variations&nbsp;
 * in&nbsp;a<br />
 * PCM&nbsp;model.&nbsp;Together,&nbsp;the&nbsp;parameter&nbsp;variations&nbsp;constitute&nbsp;a&
 * nbsp;variation&nbsp;of&nbsp;the&nbsp;PCM&nbsp;model,&nbsp;i.e.&nbsp;a&nbsp;sequence&nbsp;of&nbsp;
 * related&nbsp;PCM&nbsp;models.<br />
 * This&nbsp;information&nbsp;can&nbsp;be&nbsp;used&nbsp;to&nbsp;perform&nbsp;a&nbsp;sensitivity&
 * nbsp;analysis,&nbsp;i.e.&nbsp;a&nbsp;repeated&nbsp;analysis&nbsp;for&nbsp;each&nbsp;of&nbsp;the&
 * nbsp;defined&nbsp;PCM<br />
 * models. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration#getSensitivityParameters__SensitivityConfiguration
 * <em>Sensitivity Parameters Sensitivity Configuration</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration#getSensitivityResultSpecifications__SensitivityConfiguration
 * <em>Sensitivity Result Specifications Sensitivity Configuration</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSensitivityConfiguration()
 * @model
 * @generated
 */
public interface SensitivityConfiguration extends EObject, Entity {

    /**
     * Returns the value of the '<em><b>Sensitivity Parameters Sensitivity Configuration</b></em>'
     * containment reference. It is bidirectional and its opposite is '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityParameter#getSensitivityConfiguration__SensitivityParameter
     * <em>Sensitivity Configuration Sensitivity Parameter</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensitivity Parameters Sensitivity Configuration</em>' containment
     * reference isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Sensitivity Parameters Sensitivity Configuration</em>'
     *         containment reference.
     * @see #setSensitivityParameters__SensitivityConfiguration(SensitivityParameter)
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSensitivityConfiguration_SensitivityParameters__SensitivityConfiguration()
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityParameter#getSensitivityConfiguration__SensitivityParameter
     * @model opposite="sensitivityConfiguration__SensitivityParameter" containment="true"
     *        required="true" ordered="false"
     * @generated
     */
    SensitivityParameter getSensitivityParameters__SensitivityConfiguration();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration#getSensitivityParameters__SensitivityConfiguration
     * <em>Sensitivity Parameters Sensitivity Configuration</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Sensitivity Parameters Sensitivity Configuration</em>'
     *            containment reference.
     * @see #getSensitivityParameters__SensitivityConfiguration()
     * @generated
     */
    void setSensitivityParameters__SensitivityConfiguration(SensitivityParameter value);

    /**
     * Returns the value of the '
     * <em><b>Sensitivity Result Specifications Sensitivity Configuration</b></em>' containment
     * reference list. The list contents are of type
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityResultSpecification}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensitivity Result Specifications Sensitivity Configuration</em>'
     * containment reference list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '
     *         <em>Sensitivity Result Specifications Sensitivity Configuration</em>' containment
     *         reference list.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getSensitivityConfiguration_SensitivityResultSpecifications__SensitivityConfiguration()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<SensitivityResultSpecification> getSensitivityResultSpecifications__SensitivityConfiguration();

} // SensitivityConfiguration

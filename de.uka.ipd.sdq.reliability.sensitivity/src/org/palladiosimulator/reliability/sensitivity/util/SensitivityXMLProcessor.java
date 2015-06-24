/**
 */
package org.palladiosimulator.reliability.sensitivity.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SensitivityXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SensitivityXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        SensitivityPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the SensitivityResourceFactoryImpl factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null) {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new SensitivityResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new SensitivityResourceFactoryImpl());
        }
        return this.registrations;
    }

} // SensitivityXMLProcessor

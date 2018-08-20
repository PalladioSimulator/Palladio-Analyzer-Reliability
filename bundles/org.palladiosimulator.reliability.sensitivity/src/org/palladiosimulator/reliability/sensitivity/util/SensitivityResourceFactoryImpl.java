/**
 */
package org.palladiosimulator.reliability.sensitivity.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!--
 * end-user-doc -->
 * 
 * @see org.palladiosimulator.reliability.sensitivity.util.SensitivityResourceImpl
 * @generated
 */
public class SensitivityResourceFactoryImpl extends ResourceFactoryImpl {

    /**
     * Creates an instance of the resource factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SensitivityResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Resource createResource(final URI uri) {
        final XMLResource result = new SensitivityResourceImpl(uri);
        return result;
    }

} // SensitivityResourceFactoryImpl

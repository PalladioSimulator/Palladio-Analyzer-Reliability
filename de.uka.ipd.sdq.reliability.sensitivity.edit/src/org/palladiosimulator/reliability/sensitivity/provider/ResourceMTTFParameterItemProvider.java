/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.reliability.sensitivity.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceMTTFParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public ResourceMTTFParameterItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addProcessingResourceType__ResourceMTTFParameterPropertyDescriptor(object);
            this.addResourceContainer__ResourceMTTFParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Processing Resource Type Resource MTTF Parameter
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProcessingResourceType__ResourceMTTFParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResourceMTTFParameter_processingResourceType__ResourceMTTFParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResourceMTTFParameter_processingResourceType__ResourceMTTFParameter_feature",
                        "_UI_ResourceMTTFParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Resource Container Resource MTTF Parameter feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addResourceContainer__ResourceMTTFParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResourceMTTFParameter_resourceContainer__ResourceMTTFParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResourceMTTFParameter_resourceContainer__ResourceMTTFParameter_feature",
                        "_UI_ResourceMTTFParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns ResourceMTTFParameter.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ResourceMTTFParameter"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String resourceContainerName = "UNSPECIFIED";
        try {
            resourceContainerName = ((ResourceMTTFParameter) object).getResourceContainer__ResourceMTTFParameter()
                    .getEntityName();
        } catch (final Exception e) {
        }
        String resourceTypeName = "UNSPECIFIED";
        try {
            resourceTypeName = ((ResourceMTTFParameter) object).getProcessingResourceType__ResourceMTTFParameter()
                    .getEntityName();
        } catch (final Exception e) {
        }
        return ((ResourceMTTFParameter) object).getEntityName() + " (" + resourceContainerName + "/" + resourceTypeName
                + ")" + " [ID: " + ((ResourceMTTFParameter) object).getId() + "]" + " <"
                + this.getString("_UI_ResourceMTTFParameter_type") + ">";
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}

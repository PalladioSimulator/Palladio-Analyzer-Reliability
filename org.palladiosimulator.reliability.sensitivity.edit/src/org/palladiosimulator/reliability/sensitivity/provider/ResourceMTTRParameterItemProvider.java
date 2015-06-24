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
import org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceMTTRParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public ResourceMTTRParameterItemProvider(final AdapterFactory adapterFactory) {
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

            this.addResourceContainer__ResourceMTTRParameterPropertyDescriptor(object);
            this.addProcessingResourceType__ResourceMTTRParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Resource Container Resource MTTR Parameter feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addResourceContainer__ResourceMTTRParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResourceMTTRParameter_resourceContainer__ResourceMTTRParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResourceMTTRParameter_resourceContainer__ResourceMTTRParameter_feature",
                        "_UI_ResourceMTTRParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Processing Resource Type Resource MTTR Parameter
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProcessingResourceType__ResourceMTTRParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResourceMTTRParameter_processingResourceType__ResourceMTTRParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResourceMTTRParameter_processingResourceType__ResourceMTTRParameter_feature",
                        "_UI_ResourceMTTRParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns ResourceMTTRParameter.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ResourceMTTRParameter"));
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
            resourceContainerName = ((ResourceMTTRParameter) object).getResourceContainer__ResourceMTTRParameter()
                    .getEntityName();
        } catch (final Exception e) {
        }
        String resourceTypeName = "UNSPECIFIED";
        try {
            resourceTypeName = ((ResourceMTTRParameter) object).getProcessingResourceType__ResourceMTTRParameter()
                    .getEntityName();
        } catch (final Exception e) {
        }
        return ((ResourceMTTRParameter) object).getEntityName() + " (" + resourceContainerName + "/" + resourceTypeName
                + ")" + " [ID: " + ((ResourceMTTRParameter) object).getId() + "]" + " <"
                + this.getString("_UI_ResourceMTTRParameter_type") + ">";
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

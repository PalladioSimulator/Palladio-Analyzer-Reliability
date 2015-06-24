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
import org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ComponentReliabilityParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public ComponentReliabilityParameterItemProvider(final AdapterFactory adapterFactory) {
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

            this.addBasicComponent__ComponentReliabilityParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Basic Component Component Reliability Parameter
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addBasicComponent__ComponentReliabilityParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_ComponentReliabilityParameter_basicComponent__ComponentReliabilityParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ComponentReliabilityParameter_basicComponent__ComponentReliabilityParameter_feature",
                        "_UI_ComponentReliabilityParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns ComponentReliabilityParameter.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/ComponentReliabilityParameter"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String componentName = "UNSPECIFIED";
        try {
            componentName = ((ComponentReliabilityParameter) object).getBasicComponent__ComponentReliabilityParameter()
                    .getEntityName();
        } catch (final Exception e) {
        }
        return ((ComponentReliabilityParameter) object).getEntityName() + " (" + componentName + ")" + " [ID: "
                + ((ComponentReliabilityParameter) object).getId() + "]" + " <"
                + this.getString("_UI_ComponentReliabilityParameter_type") + ">";
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

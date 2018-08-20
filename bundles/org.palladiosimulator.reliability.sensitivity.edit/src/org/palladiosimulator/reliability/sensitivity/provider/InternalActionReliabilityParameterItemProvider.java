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
import org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InternalActionReliabilityParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public InternalActionReliabilityParameterItemProvider(final AdapterFactory adapterFactory) {
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

            this.addSoftwareInducedFailureType__InternalActionReliabilityParameterPropertyDescriptor(object);
            this.addInternalAction__InternalActionReliabilityParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Software Induced Failure Type Internal Action
     * Reliability Parameter feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSoftwareInducedFailureType__InternalActionReliabilityParameterPropertyDescriptor(
            final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_InternalActionReliabilityParameter_softwareInducedFailureType__InternalActionReliabilityParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_InternalActionReliabilityParameter_softwareInducedFailureType__InternalActionReliabilityParameter_feature",
                        "_UI_InternalActionReliabilityParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Internal Action Internal Action Reliability Parameter
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addInternalAction__InternalActionReliabilityParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_InternalActionReliabilityParameter_internalAction__InternalActionReliabilityParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_InternalActionReliabilityParameter_internalAction__InternalActionReliabilityParameter_feature",
                        "_UI_InternalActionReliabilityParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns InternalActionReliabilityParameter.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/InternalActionReliabilityParameter"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String internalActionName = "UNSPECIFIED";
        try {
            internalActionName = ((InternalActionReliabilityParameter) object)
                    .getInternalAction__InternalActionReliabilityParameter().getEntityName();
        } catch (final Exception e) {
        }
        String failureTypeName = "UNSPECIFIED";
        try {
            failureTypeName = ((InternalActionReliabilityParameter) object)
                    .getSoftwareInducedFailureType__InternalActionReliabilityParameter().getEntityName();
        } catch (final Exception e) {
        }
        return ((InternalActionReliabilityParameter) object).getEntityName() + " (" + internalActionName + "/"
                + failureTypeName + ")" + " [ID: " + ((InternalActionReliabilityParameter) object).getId() + "]" + " <"
                + this.getString("_UI_InternalActionReliabilityParameter_type") + ">";
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

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification;

/**
 * This is the item provider adapter for a
 * {@link de.uka.ipd.sdq.sensitivity.FailureDimensionResultSpecification} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class FailureDimensionResultSpecificationItemProvider extends SensitivityResultSpecificationItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public FailureDimensionResultSpecificationItemProvider(final AdapterFactory adapterFactory) {
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

            this.addFailureDimension__FailureDimensionResultSpecificationPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Failure Dimension Failure Dimension Result
     * Specification feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addFailureDimension__FailureDimensionResultSpecificationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_FailureDimensionResultSpecification_failureDimension__FailureDimensionResultSpecification_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_FailureDimensionResultSpecification_failureDimension__FailureDimensionResultSpecification_feature",
                        "_UI_FailureDimensionResultSpecification_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns FailureDimensionResultSpecification.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/FailureDimensionResultSpecification"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String failureDimensionName = "UNSPECIFIED";
        try {
            failureDimensionName = ((FailureDimensionResultSpecification) object)
                    .getFailureDimension__FailureDimensionResultSpecification().getName();
        } catch (final Exception e) {
        }
        return ((FailureDimensionResultSpecification) object).getEntityName() + " (" + failureDimensionName + ")"
                + " [ID: " + ((FailureDimensionResultSpecification) object).getId() + "]" + " <"
                + this.getString("_UI_FailureDimensionResultSpecification_type") + ">";
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

        switch (notification.getFeatureID(
                org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification.class)) {
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
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

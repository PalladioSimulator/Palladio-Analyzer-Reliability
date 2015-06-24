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
import org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class FailureTypeResultSpecificationItemProvider extends SensitivityResultSpecificationItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public FailureTypeResultSpecificationItemProvider(final AdapterFactory adapterFactory) {
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

            this.addFailureTypes__FailureTypeResultSpecificationPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Failure Types Failure Type Result Specification
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addFailureTypes__FailureTypeResultSpecificationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_FailureTypeResultSpecification_failureTypes__FailureTypeResultSpecification_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_FailureTypeResultSpecification_failureTypes__FailureTypeResultSpecification_feature",
                        "_UI_FailureTypeResultSpecification_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION,
                true, false, true, null, null, null));
    }

    /**
     * This returns FailureTypeResultSpecification.gif. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/FailureTypeResultSpecification"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String numberOfFailureTypes = "UNSPECIFIED";
        try {
            numberOfFailureTypes = ((Integer) ((FailureTypeResultSpecification) object)
                    .getFailureTypes__FailureTypeResultSpecification().size()).toString();
        } catch (final Exception e) {
        }
        return ((FailureTypeResultSpecification) object).getEntityName() + " (" + numberOfFailureTypes + ")" + " [ID: "
                + ((FailureTypeResultSpecification) object).getId() + "]" + " <"
                + this.getString("_UI_FailureTypeResultSpecification_type") + ">";
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

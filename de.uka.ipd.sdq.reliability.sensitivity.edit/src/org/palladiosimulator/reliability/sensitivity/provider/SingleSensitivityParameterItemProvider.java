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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SingleSensitivityParameterItemProvider extends SensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public SingleSensitivityParameterItemProvider(final AdapterFactory adapterFactory) {
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

        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(
                    org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter) object)
                .getId();
        return label == null || label.length() == 0 ? this.getString("_UI_SingleSensitivityParameter_type")
                : this.getString("_UI_SingleSensitivityParameter_type") + " " + label;
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

        switch (notification
                .getFeatureID(org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter.class)) {
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createStringParameterSequence()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createDoubleParameterRange()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createDoubleParameterSequence()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createDoubleOffsetSequence()));
    }

}

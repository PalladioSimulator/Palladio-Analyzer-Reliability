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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;
import org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SensitivityConfigurationItemProvider extends EntityItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public SensitivityConfigurationItemProvider(final AdapterFactory adapterFactory) {
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
                    org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION);
            this.childrenFeatures.add(
                    org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION);
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
     * This returns SensitivityConfiguration.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/SensitivityConfiguration"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        return ((SensitivityConfiguration) object).getEntityName() + " [ID: "
                + ((SensitivityConfiguration) object).getId() + "]" + " <"
                + this.getString("_UI_SensitivityConfiguration_type") + ">";
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
                .getFeatureID(org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration.class)) {
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION:
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
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createCombinedSensitivityParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createComponentReliabilityParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createInternalActionReliabilityParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createProbabilisticBranchParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createHardwareMTTFParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createHardwareMTTRParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createResourceMTTFParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createResourceMTTRParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createNetworkReliabilityParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createCommunicationLinkReliabilityParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createSoftwareReliabilityParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createVariableUsageParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createUsageBranchParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createSoftwareFailureTypesParameter()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createFailureTypeResultSpecification()));

        newChildDescriptors.add(this.createChildParameter(
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION,
                org.palladiosimulator.reliability.sensitivity.SensitivityFactory.eINSTANCE
                        .createFailureDimensionResultSpecification()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return SensitivityEditPlugin.INSTANCE;
    }

}

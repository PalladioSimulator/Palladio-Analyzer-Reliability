package org.palladiosimulator.reliability.solver.test;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * This class provides additional functionality for the Markov Test Cases. To use this
 * functionality, the Test Case has to be run as a JUnit Plug-in Test (not only a JUnit Test).
 * 
 * @author brosch
 * 
 */
public class MarkovTestHelper {

    /**
     * Searches a tree of PCM model elements for an element with a certain GUID. Returns a reference
     * to this element.
     * 
     * @param root
     *            the root element of the tree to search
     * @param guid
     *            the guid of the element to find
     * @return the reference to the element
     */
    public Identifier getModelElement(final Identifier root, final String guid) {

        // Walk the root and its whole containment tree and return the first identifier
        // whose ID equals the given GUID:
        if (guid.equals(root.getId())) {
            return root;
        }
        for (TreeIterator<EObject> contents = root.eAllContents(); contents.hasNext();) {
            EObject candidate = contents.next();
            if (candidate instanceof Identifier identifier && guid.equals(identifier.getId())) {
                return identifier;
            }
        }

        // Nothing found:
        return null;
    }
}

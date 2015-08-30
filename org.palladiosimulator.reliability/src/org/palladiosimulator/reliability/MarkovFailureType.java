package org.palladiosimulator.reliability;

/**
 * Represents a type identification for failure-on-demand occurrences during the reliability
 * analysis / simulation.
 * 
 * @author brosch
 * 
 */
public abstract class MarkovFailureType implements Comparable<MarkovFailureType> {

    /**
     * The degree of differentiation between failure types.
     */
    protected MarkovEvaluationType evaluationType = MarkovEvaluationType.POINTSOFFAILURE;

    /**
     * A default id for new failure types.
     */
    protected static String DEFAULT_ID = "Failure";

    /**
     * A default name for new failure types.
     */
    protected static String DEFAULT_NAME = "Failure";

    /**
     * The ID of this failure type.
     * 
     * The ID is unique across all failure types within an analysis or simulation run.
     */
    protected String id = null;

    /**
     * The id of the (system-required) interface which exhibits the failure.
     */
    protected String interfaceId = "";

    /**
     * The name of the (system-required) interface which exhibits the failure.
     */
    protected String interfaceName = "";

    /**
     * The human-readable name of this failure type.
     */
    protected String name = null;

    /**
     * The id of the (system-required) role which exhibits the failure.
     */
    protected String roleId = "";

    /**
     * The name of the (system-required) role which exhibits the failure.
     */
    protected String roleName = "";

    /**
     * The id of the (system-required) signature which exhibits the failure.
     */
    protected String signatureId = "";

    /**
     * The name of the (system-required) signature which exhibits the failure.
     */
    protected String signatureName = "";

    /**
     * Indicates if this failure type is system-external, i.e. originated outside the system.
     * 
     * By default, failure types are instantiated as being internal.
     */
    protected boolean systemExternal = false;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(MarkovFailureType o) {
        // The comparison is done by name:
        int nameComparisonResult = getName().compareTo(o.getName());
		/*
		 * MarkovFailureTypes are not uniquely identified by their name. The
		 * name refers to the failure type in the respoitory. In detailed
		 * evaluation modes, two MarkovFailureTypes can have the same name if
		 * they relate to the same failure type in the repository, but are
		 * raised by different PCM elements (e.g. different InternalActions).
		 */  
        if (nameComparisonResult != 0){
        	// names are different, so return that comparison result
        	return nameComparisonResult;
        } else {
        	// names are the same, so also compare based on id. 
        	int idComparison = getId().compareTo(o.getId());
        	if (idComparison != 0){
        		return idComparison;
        	} else {
        		// just to make sure that compareTo and equals are always returning the same
        		boolean equalsResult = this.equals(o);
        		if (equalsResult){
        			return 0;
        		} else {
        			// probably can never happen, but just to make sure
        			// use something to get an order. This order may change from run to run. 
        			return System.identityHashCode(this) - System.identityHashCode(o);
        		}
        		
        	}
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {

        // The equality test is based on (the failure type class and) the ID
        // attribute:
        if (evaluationType == MarkovEvaluationType.SINGLE) {
            return (obj instanceof MarkovFailureType) && (this.getId().equals(((MarkovFailureType) obj).getId()));
        } else {
            return (this.getClass().equals(obj.getClass())) && (this.getId().equals(((MarkovFailureType) obj).getId()));
        }
    }

    /**
     * Retrieves the ID of this failure type.
     * 
     * @return the ID of this failure type
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the id of the (system-required) interface which exhibits the failure.
     * 
     * @return the interface id
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * Retrieves the name of the (system-required) interface which exhibits the failure.
     * 
     * @return the interface name
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Retrieves a name of this failure type.
     * 
     * The name is used for describing the failure type in the simulation result data.
     * 
     * @return the name of this failure type.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the id of the (system-required) role which exhibits the failure.
     * 
     * @return the role id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Retrieves the name of the (system-required) role which exhibits the failure.
     * 
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Retrieves the id of the (system-required) signature which exhibits the failure.
     * 
     * @return the signature id
     */
    public String getSignatureId() {
        return signatureId;
    }

    /**
     * Retrieves the name of the (system-required) signature which exhibits the failure.
     * 
     * @return the signature name
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Indicates if this failure type is system-external, i.e. originated outside the system.
     * 
     * @return
     */
    public boolean isSystemExternal() {
        return systemExternal;
    }
}

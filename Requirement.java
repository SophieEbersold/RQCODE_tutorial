

import rqcode.concepts.Enforceable.EnforcementStatus;

/**
 * The RQCODE requirement class.
 */
public abstract class Requirement implements Checkable{

    /**
     * Requirement statement in textual format
     */
    private String statement;

    private CheckStatus lastCheckStatus=CheckStatus.INCOMPLETE;

    public CheckStatus getLastCheckStatus() {
        return lastCheckStatus;
    }

    public void setLastCheckStatus(CheckStatus lastCheckStatus) {
        this.lastCheckStatus = lastCheckStatus;
    }

    public Requirement() {
    }

    public Requirement(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "Requirement [statement=" + statement + "]";
    }

    

    
}

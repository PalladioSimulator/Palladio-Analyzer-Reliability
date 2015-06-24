package org.palladiosimulator.reliability;

public interface IFailureStatisticsListener {

    public abstract void executionResultRecorder(MarkovFailureType failureType);

}

interface IReception {
    int getQueueSize();

    int getInProgressSize();

    int getTotalJobDone();

    void registerJob(Job job);

    Job takeJob();

    void finishJob(Job job);
}
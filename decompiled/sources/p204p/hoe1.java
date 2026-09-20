package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum hoe1 implements od50 {
    NAME(0),
    RECENTLY_ADDED(1),
    CREATOR(2),
    CUSTOM(4),
    RECENTLY_UPDATED(5),
    RECENTLY_PLAYED_OR_ADDED(6),
    RELEVANCE(7),
    EVENT_START_TIME(8),
    RELEASE_DATE(9),
    RECENTS(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f93528a;

    hoe1(int i) {
        this.f93528a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f93528a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

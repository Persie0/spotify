package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum scj implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_TYPE_UNDEFINED(0),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_TYPE_IS_FOLLOWING(1),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_TYPE_IS_FOLLOWED_BY(2),
    RELATION_TYPE_IS_BLOCKING(3),
    /* JADX INFO: Fake field, exist only in values array */
    RELATION_TYPE_IS_BLOCKED_BY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f207754a;

    scj(int i) {
        this.f207754a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f207754a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

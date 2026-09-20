package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum vpq implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    DELETION_POLICY_UNSPECIFIED(0),
    DELETION_POLICY_ALL(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELETION_POLICY_SELF(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f243751a;

    vpq(int i) {
        this.f243751a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f243751a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

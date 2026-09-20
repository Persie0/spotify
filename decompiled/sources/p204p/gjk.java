package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum gjk implements od50 {
    CONTRIBUTION_TYPE_UNSPECIFIED(0),
    CONTRIBUTION_TYPE_NOTE(1),
    CONTRIBUTION_TYPE_COMMENT(2),
    CONTRIBUTION_TYPE_REACTION(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f80498a;

    gjk(int i) {
        this.f80498a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f80498a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

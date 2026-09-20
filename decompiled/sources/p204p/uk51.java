package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum uk51 implements od50 {
    STREAMING_RULE_NONE(0),
    STREAMING_RULE_DMCA_RADIO(1),
    STREAMING_RULE_PREVIEW(2),
    STREAMING_RULE_WIFI(3),
    STREAMING_RULE_SHUFFLE_MODE(4),
    STREAMING_RULE_TABLET_FREE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f231234a;

    uk51(int i) {
        this.f231234a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f231234a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

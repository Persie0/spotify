package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum vm11 implements od50 {
    SHOW_GATED_VALUE_PROP_UNKNOWN(0),
    SHOW_GATED_VALUE_PROP_UNSPECIFIED(1),
    SHOW_GATED_VALUE_PROP_AD_FREE(2),
    SHOW_GATED_VALUE_PROP_EXTENDED(3),
    SHOW_GATED_VALUE_PROP_EARLY_ACCESS(4),
    SHOW_GATED_VALUE_PROP_VIDEO(5),
    SHOW_GATED_VALUE_PROP_FULL_LENGTH_EPISODES(6),
    SHOW_GATED_VALUE_PROP_BONUS(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f242677a;

    vm11(int i) {
        this.f242677a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f242677a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum o2w implements od50 {
    EPISODE_GATED_VALUE_PROP_UNKNOWN(0),
    EPISODE_GATED_VALUE_PROP_UNSPECIFIED(1),
    EPISODE_GATED_VALUE_PROP_AD_FREE(2),
    EPISODE_GATED_VALUE_PROP_EXTENDED(3),
    EPISODE_GATED_VALUE_PROP_EARLY_ACCESS(4),
    EPISODE_GATED_VALUE_PROP_VIDEO(5),
    EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES(6),
    EPISODE_GATED_VALUE_PROP_NONE(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f161167a;

    o2w(int i) {
        this.f161167a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f161167a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum cjr0 implements od50 {
    DEFAULT_TIER(0),
    PREMIUM_TIER(1),
    BASIC_TIER(3),
    PREMIUM_LITE_TIER(4),
    PREMIUM_MINI_TIER(5),
    PREMIUM_BASIC_TIER(6),
    AUDIOBOOK_ACCESS_TIER(8),
    NO_FREE_TIER(9),
    UNKNOWN_TIER(10),
    MFT_TIER(11),
    MFT_PLUS_TIER(12),
    FREE_TIER_DISABLED_TIER(13),
    ON_DEMAND_TRIAL_TIER(14),
    PLATINUM_TIER(15),
    LITE_TIER(18),
    STANDARD_TIER(19),
    BASIC_PLATINUM_TIER(20),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f38676a;

    cjr0(int i) {
        this.f38676a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38676a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

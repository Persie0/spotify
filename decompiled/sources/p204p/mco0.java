package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum mco0 implements od50 {
    PLAN_TIER_UNSPECIFIED(0),
    PLAN_TIER_FREE(1),
    PLAN_TIER_PREMIUM(2),
    PLAN_TIER_NEMO(3),
    PLAN_TIER_YOPLAIT(4),
    PLAN_TIER_ASTRO(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f142219a;

    mco0(int i) {
        this.f142219a = i;
    }

    /* JADX INFO: renamed from: a */
    public static mco0 m61468a(int i) {
        if (i == 0) {
            return PLAN_TIER_UNSPECIFIED;
        }
        if (i == 1) {
            return PLAN_TIER_FREE;
        }
        if (i == 2) {
            return PLAN_TIER_PREMIUM;
        }
        if (i == 3) {
            return PLAN_TIER_NEMO;
        }
        if (i == 4) {
            return PLAN_TIER_YOPLAIT;
        }
        if (i != 5) {
            return null;
        }
        return PLAN_TIER_ASTRO;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f142219a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

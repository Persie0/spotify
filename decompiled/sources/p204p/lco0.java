package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum lco0 implements od50 {
    PLAN_TIER_UNSPECIFIED(0),
    PLAN_TIER_FREE(1),
    PLAN_TIER_PREMIUM(2),
    PLAN_TIER_NEMO(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f131968a;

    lco0(int i) {
        this.f131968a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f131968a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

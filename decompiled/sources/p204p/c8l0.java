package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum c8l0 implements od50 {
    UNKNOWN(0),
    NOT_ON_DEMAND(1),
    ON_DEMAND(2),
    ON_DEMAND_EPISODES_ONLY(3),
    ON_DEMAND_NON_MUSIC_ONLY(4);


    /* JADX INFO: renamed from: a */
    public final int f35269a;

    c8l0(int i) {
        this.f35269a = i;
    }

    /* JADX INFO: renamed from: a */
    public static c8l0 m31795a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_ON_DEMAND;
        }
        if (i == 2) {
            return ON_DEMAND;
        }
        if (i == 3) {
            return ON_DEMAND_EPISODES_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return ON_DEMAND_NON_MUSIC_ONLY;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f35269a;
    }
}

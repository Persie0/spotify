package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum tso0 implements od50 {
    PLAYABILITY_VERDICT_UNSPECIFIED(0),
    PLAYABILITY_VERDICT_PLAYABLE(1),
    PLAYABILITY_VERDICT_COUNTRY_RESTRICTED(2),
    PLAYABILITY_VERDICT_CATALOGUE_RESTRICTED(3),
    PLAYABILITY_VERDICT_UNAVAILABLE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f223396a;

    tso0(int i) {
        this.f223396a = i;
    }

    /* JADX INFO: renamed from: a */
    public static tso0 m81479a(int i) {
        if (i == 0) {
            return PLAYABILITY_VERDICT_UNSPECIFIED;
        }
        if (i == 1) {
            return PLAYABILITY_VERDICT_PLAYABLE;
        }
        if (i == 2) {
            return PLAYABILITY_VERDICT_COUNTRY_RESTRICTED;
        }
        if (i == 3) {
            return PLAYABILITY_VERDICT_CATALOGUE_RESTRICTED;
        }
        if (i != 4) {
            return null;
        }
        return PLAYABILITY_VERDICT_UNAVAILABLE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f223396a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

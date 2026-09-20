package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum by40 implements od50 {
    INSIGHT_TASTE_MATCH_TIER_UNSPECIFIED(0),
    INSIGHT_TASTE_MATCH_TIER_VERY_LOW(1),
    INSIGHT_TASTE_MATCH_TIER_LOW(2),
    INSIGHT_TASTE_MATCH_TIER_MEDIUM(3),
    INSIGHT_TASTE_MATCH_TIER_HIGH(4),
    INSIGHT_TASTE_MATCH_TIER_VERY_HIGH(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f32069a;

    by40(int i) {
        this.f32069a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f32069a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum y8v implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    ENGAGEMENT_TYPE_UNSPECIFIED(0),
    ENGAGEMENT_TYPE_INTERACTION_DISMISSAL(1),
    ENGAGEMENT_TYPE_IMPRESSION(2),
    ENGAGEMENT_TYPE_INTERACTION_CTA_TAP(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f270390a;

    y8v(int i) {
        this.f270390a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f270390a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

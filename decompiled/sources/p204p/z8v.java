package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum z8v implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    ENGAGEMENT_TYPE_UNSPECIFIED(0),
    IMPRESSION(1),
    INTERACTION_CTA_TAP(2),
    INTERACTION_DISMISSAL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f280575a;

    z8v(int i) {
        this.f280575a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f280575a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

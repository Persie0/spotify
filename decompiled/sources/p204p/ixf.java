package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum ixf implements od50 {
    UNKNOWN(0),
    HEADER(1),
    HEADER_CTA(2),
    LEGAL_TEXT(3),
    BENEFITS(4),
    SECTION_HEADER(5),
    OFFER_CARD(6),
    GROUPED_OFFER_CARDS(7),
    FEATURE_CARD(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f106682a;

    ixf(int i) {
        this.f106682a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f106682a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

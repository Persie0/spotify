package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum zt51 implements od50 {
    SUBSCRIPTION_CARD_LAYOUT_UNSPECIFIED(0),
    SUBSCRIPTION_CARD_LAYOUT_STANDARD(1),
    SUBSCRIPTION_CARD_LAYOUT_ICON_HEADING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f286073a;

    zt51(int i) {
        this.f286073a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f286073a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

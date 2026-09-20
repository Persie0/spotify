package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum czv implements od50 {
    ENTRY_POINT_LAYOUT_UNSPECIFIED(0),
    ENTRY_POINT_LAYOUT_BUTTON_PRIMARY(1),
    ENTRY_POINT_LAYOUT_BUTTON_SECONDARY(2),
    ENTRY_POINT_LAYOUT_BUTTON_TERTIARY(3),
    ENTRY_POINT_LAYOUT_CARD_STANDARD(4),
    ENTRY_POINT_LAYOUT_CARD_PROGRESS(5),
    ENTRY_POINT_LAYOUT_CARD_EDIT(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f43644a;

    czv(int i) {
        this.f43644a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43644a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

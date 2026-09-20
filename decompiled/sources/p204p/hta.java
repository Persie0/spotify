package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum hta implements od50 {
    BUTTON_ICON_ALIGNMENT_UNKNOWN(0),
    BUTTON_ICON_ALIGNMENT_LEADING(1),
    BUTTON_ICON_ALIGNMENT_TRAILING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f94965a;

    hta(int i) {
        this.f94965a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f94965a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

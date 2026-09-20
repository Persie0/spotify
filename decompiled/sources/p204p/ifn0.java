package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum ifn0 implements od50 {
    ENCORE_ICON_UNKNOWN(0),
    ENCORE_ICON_CHECK_ALT(1),
    ENCORE_ICON_UNDO(2),
    ENCORE_ICON_EXTERNAL_LINK(3),
    ENCORE_ICON_CAMERA(4),
    ENCORE_ICON_MESSAGES(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f101797a;

    ifn0(int i) {
        this.f101797a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f101797a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

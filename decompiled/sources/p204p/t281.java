package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum t281 implements od50 {
    TOOLTIP_ANCHOR_VIEW_TYPE_UNKNOWN(0),
    TOOLTIP_ANCHOR_VIEW_TYPE_CONNECT_BUTTON(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f216458a;

    t281(int i) {
        this.f216458a = i;
    }

    /* JADX INFO: renamed from: a */
    public static t281 m79893a(int i) {
        if (i == 0) {
            return TOOLTIP_ANCHOR_VIEW_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return TOOLTIP_ANCHOR_VIEW_TYPE_CONNECT_BUTTON;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f216458a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

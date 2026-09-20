package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum u281 implements od50 {
    TOOLTIP_ARROW_DIRECTION_UNKNOWN(0),
    TOOLTIP_ARROW_DIRECTION_TOP(1),
    TOOLTIP_ARROW_DIRECTION_BOTTOM(2),
    TOOLTIP_ARROW_DIRECTION_LEADING(3),
    TOOLTIP_ARROW_DIRECTION_TRAILING(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f226016a;

    u281(int i) {
        this.f226016a = i;
    }

    /* JADX INFO: renamed from: a */
    public static u281 m82244a(int i) {
        if (i == 0) {
            return TOOLTIP_ARROW_DIRECTION_UNKNOWN;
        }
        if (i == 1) {
            return TOOLTIP_ARROW_DIRECTION_TOP;
        }
        if (i == 2) {
            return TOOLTIP_ARROW_DIRECTION_BOTTOM;
        }
        if (i == 3) {
            return TOOLTIP_ARROW_DIRECTION_LEADING;
        }
        if (i != 4) {
            return null;
        }
        return TOOLTIP_ARROW_DIRECTION_TRAILING;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f226016a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

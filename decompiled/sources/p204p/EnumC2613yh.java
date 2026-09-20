package p204p;

/* JADX INFO: renamed from: p.yh */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC2613yh implements od50 {
    ACCESSORY_CONTENT_SIZE_UNKNOWN(0),
    ACCESSORY_CONTENT_SIZE_LARGE(1),
    ACCESSORY_CONTENT_SIZE_MEDIUM(2),
    ACCESSORY_CONTENT_SIZE_SMALL(3),
    ACCESSORY_CONTENT_SIZE_XSMALL(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f272706a;

    EnumC2613yh(int i) {
        this.f272706a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2613yh m93614a(int i) {
        if (i == 0) {
            return ACCESSORY_CONTENT_SIZE_UNKNOWN;
        }
        if (i == 1) {
            return ACCESSORY_CONTENT_SIZE_LARGE;
        }
        if (i == 2) {
            return ACCESSORY_CONTENT_SIZE_MEDIUM;
        }
        if (i == 3) {
            return ACCESSORY_CONTENT_SIZE_SMALL;
        }
        if (i != 4) {
            return null;
        }
        return ACCESSORY_CONTENT_SIZE_XSMALL;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f272706a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

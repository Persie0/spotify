package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum w5r implements od50 {
    DEVICE_CAPABILITY_UNSPECIFIED(0),
    DEVICE_CAPABILITY_INLINE_UPSELL(1),
    DEVICE_CAPABILITY_BOTTOMSHEET_UPSELL(2),
    DEVICE_CAPABILITY_GENERIC_CONSIDERATION_PAGE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f248179a;

    w5r(int i) {
        this.f248179a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f248179a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

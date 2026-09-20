package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum gti implements od50 {
    OUTPUT_PERIPHERAL_CATEGORY_UNKNOWN(0),
    OUTPUT_PERIPHERAL_CATEGORY_CAR(1),
    OUTPUT_PERIPHERAL_CATEGORY_HEADPHONES(2),
    OUTPUT_PERIPHERAL_CATEGORY_SPEAKER(3),
    OUTPUT_PERIPHERAL_CATEGORY_WEARABLE(4),
    OUTPUT_PERIPHERAL_CATEGORY_GLASSES(5),
    OUTPUT_PERIPHERAL_CATEGORY_APP(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f84208a;

    gti(int i) {
        this.f84208a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f84208a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

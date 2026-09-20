package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum hti implements od50 {
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_UNKNOWN(0),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_WIRED(1),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_CAR_PROJECTED(2),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_BLUETOOTH(3),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_AIRPLAY(4),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_BUILT_IN_SPEAKER(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f95042a;

    hti(int i) {
        this.f95042a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f95042a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

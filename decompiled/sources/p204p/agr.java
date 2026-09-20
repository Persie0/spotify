package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum agr implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DEVICE_TYPE(0),
    COMPUTER(1),
    SMARTPHONE(2),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_TABLET(3),
    TABLET(4),
    SPEAKER(5),
    SMART_DISPLAY(6),
    WEARABLE(7),
    AUTOMOBILE(8),
    TV(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f15481a;

    agr(int i) {
        this.f15481a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f15481a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

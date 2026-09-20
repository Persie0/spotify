package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ati implements od50 {
    UNKNOWN_ERROR(0),
    TIMEOUT(1),
    INTERNAL(2),
    GROUP_DEVICE_NOT_FOUND(3),
    MAX_NUMBER_OF_DEVICES_REACHED(4),
    TARGET_NOT_FOUND(5),
    NOT_IMPLEMENTED(6),
    BUSY(13),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f19696a;

    ati(int i) {
        this.f19696a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19696a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum bmw implements od50 {
    SUCCESS(0),
    GENERIC(1),
    DISK_FULL(8),
    EXPIRED(14),
    TOO_MANY_TRACKS(19),
    NOT_ALLOWED(23),
    CONNECTION_DISABLED(36),
    DEVICE_LIMIT_REACHED(7028),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f28639a;

    bmw(int i) {
        this.f28639a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f28639a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

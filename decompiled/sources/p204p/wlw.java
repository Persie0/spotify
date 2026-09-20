package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum wlw implements od50 {
    NOT_DOWNLOADED(0),
    ERROR(1),
    REQUESTED(2),
    DOWNLOADED(3),
    DOWNLOADING(4),
    WAITING(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f252630a;

    wlw(int i) {
        this.f252630a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f252630a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum pmw implements od50 {
    OK(0),
    TEMPORARY_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    PERMANENT_ERROR(2),
    /* JADX INFO: Fake field, exist only in values array */
    DISK_FULL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f179243a;

    pmw(int i) {
        this.f179243a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f179243a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

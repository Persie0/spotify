package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum r0l0 implements od50 {
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    TEMPORARY_ERROR(1),
    PERMANENT_ERROR(2),
    DISK_FULL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f194522a;

    r0l0(int i) {
        this.f194522a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f194522a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

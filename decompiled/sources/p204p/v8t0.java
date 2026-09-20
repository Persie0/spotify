package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum v8t0 implements od50 {
    UNKNOWN_FAILURE(0),
    GENERAL_ERROR(2),
    INVALID_FILE(3),
    NOT_COMPATIBLE_WITH_RUNTIME(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f238702a;

    v8t0(int i) {
        this.f238702a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f238702a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

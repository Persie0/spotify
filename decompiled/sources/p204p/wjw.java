package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum wjw implements od50 {
    UNKNOWN_FILE_ORIGIN(0),
    INTERNAL(1),
    EXTERNAL(2),
    LOCAL(3),
    GENERATED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f252065a;

    wjw(int i) {
        this.f252065a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f252065a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum vv20 implements od50 {
    NONE(0),
    WRAPPED(1),
    NEW_RELEASES(2),
    AUDIOBOOKS(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f245128a;

    vv20(int i) {
        this.f245128a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f245128a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

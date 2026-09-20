package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ds20 implements od50 {
    UNSPECIFIED__OVERLAP_STYLE(0),
    LINEAR(1),
    DIAGONAL(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f52472a;

    ds20(int i) {
        this.f52472a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52472a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

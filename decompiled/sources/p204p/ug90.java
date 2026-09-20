package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ug90 implements od50 {
    UNSPECIFIED(0),
    ALL(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f230051a;

    ug90(int i) {
        this.f230051a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f230051a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

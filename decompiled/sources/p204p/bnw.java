package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum bnw implements od50 {
    REPLACE(0),
    ENQUEUE(1),
    PUSH(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f28930a;

    bnw(int i) {
        this.f28930a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f28930a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

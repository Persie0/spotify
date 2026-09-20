package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum jit0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABILITY_NONE(0),
    AVAILABILITY_AVAILABLE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f112822a;

    jit0(int i) {
        this.f112822a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f112822a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

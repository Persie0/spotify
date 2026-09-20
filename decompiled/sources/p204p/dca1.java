package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum dca1 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE(0),
    DELETED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f47484a;

    dca1(int i) {
        this.f47484a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47484a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

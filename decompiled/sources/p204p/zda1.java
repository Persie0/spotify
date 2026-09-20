package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum zda1 implements od50 {
    OK(0),
    INVALID_SLOT(1),
    BAD_REQUEST(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f281663a;

    zda1(int i) {
        this.f281663a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f281663a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

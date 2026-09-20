package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum alw implements od50 {
    unknownContext(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f17001a;

    alw(int i) {
        this.f17001a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f17001a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

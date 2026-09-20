package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum x0m implements od50 {
    HUMAN(0),
    ML(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f256904a;

    x0m(int i) {
        this.f256904a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f256904a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum fiw implements od50 {
    unknownContext(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f70002a;

    fiw(int i) {
        this.f70002a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f70002a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

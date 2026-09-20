package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum viw implements od50 {
    unknownContext(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f241801a;

    viw(int i) {
        this.f241801a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f241801a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

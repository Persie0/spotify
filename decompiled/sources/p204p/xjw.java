package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum xjw implements od50 {
    NONE(0),
    OFF(1),
    ON(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f262239a;

    xjw(int i) {
        this.f262239a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f262239a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

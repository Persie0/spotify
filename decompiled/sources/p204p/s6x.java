package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum s6x implements od50 {
    ACCEPTED(0),
    AD_NOT_FOUND(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f206217a;

    s6x(int i) {
        this.f206217a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f206217a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

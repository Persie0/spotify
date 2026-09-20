package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum q3p0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    BOOMBOX(0),
    BETAMAX(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f184918a;

    q3p0(int i) {
        this.f184918a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f184918a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

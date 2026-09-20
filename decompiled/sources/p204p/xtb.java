package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum xtb implements od50 {
    CAPABILITY_UNKNOWN(0),
    CAPABILITY_WEB_INTERACTION_V1(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f265819a;

    xtb(int i) {
        this.f265819a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f265819a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

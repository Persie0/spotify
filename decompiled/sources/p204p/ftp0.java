package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum ftp0 implements od50 {
    NO_RESTRICTION(0),
    RESTRICT_SOURCE_TO_50(1),
    RESTRICT_SOURCE_TO_500(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f73264a;

    ftp0(int i) {
        this.f73264a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f73264a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

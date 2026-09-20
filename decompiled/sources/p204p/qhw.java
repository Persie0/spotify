package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum qhw implements od50 {
    success(0),
    userNotFound(1),
    userAlreadyExists(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f188873a;

    qhw(int i) {
        this.f188873a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f188873a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

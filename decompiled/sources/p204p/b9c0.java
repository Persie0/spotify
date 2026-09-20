package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum b9c0 implements od50 {
    MANAGED_ACCOUNT_TYPE_UNSPECIFIED(0),
    MANAGED_ACCOUNT_TYPE_CHILD(1),
    MANAGED_ACCOUNT_TYPE_TEEN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f24830a;

    b9c0(int i) {
        this.f24830a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f24830a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

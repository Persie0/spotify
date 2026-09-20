package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum l70 implements od50 {
    UNSPECIFIED(0),
    NAVIGATE(1),
    DOWNLOAD(2),
    EXPAND_NPV(3),
    QUEUE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f130518a;

    l70(int i) {
        this.f130518a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f130518a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

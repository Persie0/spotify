package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum av30 implements od50 {
    JPG(0),
    PNG(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f20089a;

    av30(int i) {
        this.f20089a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f20089a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

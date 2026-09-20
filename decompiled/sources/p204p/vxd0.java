package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum vxd0 implements od50 {
    NONE(0),
    IMAGE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f245721a;

    vxd0(int i) {
        this.f245721a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f245721a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum voe1 implements od50 {
    YES(0),
    NO_IN_FOLDER(1),
    NOT_VALID_TYPE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f243469a;

    voe1(int i) {
        this.f243469a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f243469a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum z6z0 implements od50 {
    UNDEFINED(0),
    VALIDATION_ERROR(1),
    GENERATION_ERROR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f280036a;

    z6z0(int i) {
        this.f280036a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f280036a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

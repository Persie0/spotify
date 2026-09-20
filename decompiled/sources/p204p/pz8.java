package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum pz8 implements od50 {
    BASE_LAYER_TYPE_UNSPECIFIED(0),
    BASE_LAYER_TYPE_TALK(1),
    BASE_LAYER_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f183633a;

    pz8(int i) {
        this.f183633a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f183633a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

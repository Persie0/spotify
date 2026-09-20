package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum zr6 implements od50 {
    AUDIENCE_SOURCE_UNSPECIFIED(0),
    AUDIENCE_SOURCE_DM(1),
    AUDIENCE_SOURCE_GROUP(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f285550a;

    zr6(int i) {
        this.f285550a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f285550a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ini0 implements od50 {
    MV_RELATED_ASSOCIATION_RELATION_TYPE_UNKNOWN(0),
    MV_RELATED_ASSOCIATION_RELATION_TYPE_UNSPECIFIED(1),
    MV_RELATED_ASSOCIATION_RELATION_TYPE_OFFICIAL_MIX(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f104011a;

    ini0(int i) {
        this.f104011a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f104011a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

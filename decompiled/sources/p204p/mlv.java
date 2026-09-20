package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum mlv implements od50 {
    ENTITY_MATCH_TYPE_UNSPECIFIED(0),
    ENTITY_MATCH_TYPE_ARTIST(1),
    ENTITY_MATCH_TYPE_SONG(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f144933a;

    mlv(int i) {
        this.f144933a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f144933a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

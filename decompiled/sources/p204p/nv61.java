package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum nv61 implements od50 {
    TASTE_MATCH_TYPE_UNSPECIFIED(0),
    TASTE_MATCH_TYPE_TASTE_MATCH(1),
    TASTE_MATCH_TYPE_LEAST_TASTE_MATCH(2),
    TASTE_MATCH_TYPE_MOST_TASTE_MATCH(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f158818a;

    nv61(int i) {
        this.f158818a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f158818a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

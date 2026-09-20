package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum nky implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    CATEGORY_UNSPECIFIED(0),
    CATEGORY_SONG_CREDITS(1),
    CATEGORY_SAMPLES_OR_COVERS(2),
    CATEGORY_SOMETHING_ELSE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f154969a;

    nky(int i) {
        this.f154969a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f154969a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

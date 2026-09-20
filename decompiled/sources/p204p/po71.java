package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum po71 implements od50 {
    UNKNOWN(0),
    STATIC(1),
    SYLLABLE_SYNCED(2),
    SENTENCE_SYNCED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f179636a;

    po71(int i) {
        this.f179636a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f179636a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

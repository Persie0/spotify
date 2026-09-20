package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum bsz0 implements od50 {
    RATING_UNSPECIFIED(0),
    RATING_LIKE(1),
    RATING_DISLIKE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f30448a;

    bsz0(int i) {
        this.f30448a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f30448a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

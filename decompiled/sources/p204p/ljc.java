package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum ljc implements od50 {
    OUTCOME_UNSPECIFIED(0),
    DRAW(1),
    WIN(2),
    LOSS(3),
    PERFECT_TIE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f134054a;

    ljc(int i) {
        this.f134054a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f134054a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

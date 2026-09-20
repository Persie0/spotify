package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum sz71 implements od50 {
    TONE_UNSPECIFIED(0),
    TONE_NEUTRAL(1),
    TONE_ON_SALE(2),
    TONE_WARNING(3),
    TONE_CRITICAL(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f215418a;

    sz71(int i) {
        this.f215418a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f215418a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

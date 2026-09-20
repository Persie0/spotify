package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum jyq0 implements od50 {
    UNSPECIFIED(0),
    PERSONALIZED(1),
    TOP_PRESAVED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f117458a;

    jyq0(int i) {
        this.f117458a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f117458a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

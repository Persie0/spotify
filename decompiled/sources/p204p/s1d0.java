package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum s1d0 implements od50 {
    MATCH_BOUNDARIES_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_BOUNDARIES_TRIMMED(1),
    MATCH_BOUNDARIES_EXPANDED(2),
    MATCH_BOUNDARIES_DYNAMIC(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f204690a;

    s1d0(int i) {
        this.f204690a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f204690a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

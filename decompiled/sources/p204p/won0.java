package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum won0 implements od50 {
    RESTRICTION_REASON_UNSPECIFIED(0),
    RESTRICTION_REASON_AGE_ASSURANCE(1),
    RESTRICTION_REASON_EXPLICIT_CONTENT(2),
    RESTRICTION_REASON_AGE_ASSURANCE_19_PLUS(3),
    RESTRICTION_REASON_UNAVAILABLE_CONTENT(4),
    RESTRICTION_REASON_OFFLINE_UNAVAILABLE_CONTENT(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f253520a;

    won0(int i) {
        this.f253520a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f253520a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

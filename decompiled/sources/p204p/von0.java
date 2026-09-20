package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum von0 implements od50 {
    AGE_ASSURANCE_REASON_UNKNOWN(0),
    AGE_ASSURANCE_REASON_UNAVAILABLE(1),
    AGE_ASSURANCE_REASON_REQUIRES_AGE_ASSURANCE(2),
    AGE_ASSURANCE_REASON_ALLOW(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f243513a;

    von0(int i) {
        this.f243513a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f243513a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum a5q0 implements od50 {
    BADGE_UNSPECIFIED(0),
    BADGE_EXTRAS(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f12588a;

    a5q0(int i) {
        this.f12588a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12588a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

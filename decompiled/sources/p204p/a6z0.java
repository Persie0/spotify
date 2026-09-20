package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum a6z0 implements od50 {
    SECTION_UNSPECIFIED(0),
    SECTION_ACTIVE(1),
    SECTION_SUGGESTED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f12905a;

    a6z0(int i) {
        this.f12905a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12905a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum kt8 implements od50 {
    BANNER_BODY_ICON_UNSPECIFIED(0),
    SUCCESS(1),
    NO_MATCH(2),
    FAIL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f126181a;

    kt8(int i) {
        this.f126181a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f126181a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

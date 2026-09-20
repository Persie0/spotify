package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum uu21 implements od50 {
    SLOT_UNKNOWN(0),
    SHORTCUT(1),
    HERO(2),
    FEED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f234094a;

    uu21(int i) {
        this.f234094a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f234094a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

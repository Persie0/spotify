package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum wta implements od50 {
    PRIMARY(0),
    SECONDARY(1),
    TERTIARY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f254900a;

    wta(int i) {
        this.f254900a = i;
    }

    /* JADX INFO: renamed from: a */
    public static wta m88915a(int i) {
        if (i == 0) {
            return PRIMARY;
        }
        if (i == 1) {
            return SECONDARY;
        }
        if (i != 2) {
            return null;
        }
        return TERTIARY;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f254900a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

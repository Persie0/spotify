package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum wna implements od50 {
    PAGE_TYPE_DEFAULT(0),
    PAGE_TYPE_ALL_CATEGORIES(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f253129a;

    wna(int i) {
        this.f253129a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f253129a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

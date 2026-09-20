package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum oqb0 implements od50 {
    UNSYNCED(0),
    LINE_SYNCED(1),
    RICH_SYNCED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f168153a;

    oqb0(int i) {
        this.f168153a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f168153a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

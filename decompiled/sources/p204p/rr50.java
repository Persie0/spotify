package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum rr50 implements od50 {
    ITEM_COUNT_UNIT_UNKNOWN(0),
    ITEM_COUNT_UNIT_SONGS(1),
    ITEM_COUNT_UNIT_BOOKS(2),
    ITEM_COUNT_UNIT_EPISODES(3),
    ITEM_COUNT_UNIT_ITEMS(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f201961a;

    rr50(int i) {
        this.f201961a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f201961a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

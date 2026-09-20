package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum lit0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_STATUS_NONE(0),
    COLLECTION_STATUS_IN_YOUR_EPISODES(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f133892a;

    lit0(int i) {
        this.f133892a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f133892a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

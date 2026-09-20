package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum o2k0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFICATION_TYPE_UNSPECIFIED(0),
    SEARCH_RESCUE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f161065a;

    o2k0(int i) {
        this.f161065a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f161065a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

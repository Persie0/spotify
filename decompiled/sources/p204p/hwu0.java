package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum hwu0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_REASON_START(0),
    REASON_START_OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_START_PAGE_TURN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f96055a;

    hwu0(int i) {
        this.f96055a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f96055a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

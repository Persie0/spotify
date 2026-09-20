package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum x8z0 implements od50 {
    SECTION_STATE_UNDEFINED(0),
    SECTION_STATE_EMPTY(1),
    SECTION_STATE_IN_PROGRESS(2),
    SECTION_STATE_POPULATED(3),
    SECTION_STATE_DELETED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f259252a;

    x8z0(int i) {
        this.f259252a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f259252a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

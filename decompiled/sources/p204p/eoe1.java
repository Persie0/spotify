package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum eoe1 implements od50 {
    EXCLUDE(0),
    INCLUDE_IF_NOT_EMPTY(1),
    INCLUDE_ALWAYS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f61414a;

    eoe1(int i) {
        this.f61414a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f61414a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum uyw0 implements od50 {
    BLOCKING(0),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_SYNC(1),
    /* JADX INFO: Fake field, exist only in values array */
    ASYNC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f235377a;

    uyw0(int i) {
        this.f235377a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f235377a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

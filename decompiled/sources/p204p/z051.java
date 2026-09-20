package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum z051 implements od50 {
    OK(0),
    IN_PROGRESS(1),
    INVALID_URL(2),
    INTERNAL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f277970a;

    z051(int i) {
        this.f277970a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f277970a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

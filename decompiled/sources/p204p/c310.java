package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum c310 implements od50 {
    GENERATION_STATUS_UNSPECIFIED(0),
    GENERATION_STATUS_GENERATING(1),
    GENERATION_STATUS_GENERATED(2),
    GENERATION_STATUS_READY(3),
    GENERATION_STATUS_FAILED(4),
    GENERATION_STATUS_NO_CREDITS(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f33523a;

    c310(int i) {
        this.f33523a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f33523a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

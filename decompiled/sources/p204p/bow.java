package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum bow implements od50 {
    OK(0),
    FORBIDDEN(1),
    NOT_FOUND(2),
    CONFLICT(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f29270a;

    bow(int i) {
        this.f29270a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29270a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum kgy implements od50 {
    FEATURE_REQUEST_ACTION_UNSPECIFIED(0),
    FEATURE_REQUEST_ACTION_REQUEST_FEATURE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f122486a;

    kgy(int i) {
        this.f122486a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f122486a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

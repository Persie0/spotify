package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum h70 implements od50 {
    ACTION_TYPE_UNSPECIFIED(0),
    NAVIGATE(1),
    NAVIGATE_WEBVIEW(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f88314a;

    h70(int i) {
        this.f88314a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f88314a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum su60 implements nd50 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f214022a;

    su60(int i) {
        this.f214022a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m79385a() {
        if (this != UNRECOGNIZED) {
            return this.f214022a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

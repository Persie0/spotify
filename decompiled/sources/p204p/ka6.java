package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ka6 implements od50 {
    MANUAL_SUBMISSION(0),
    DISMISS(1),
    /* JADX INFO: Fake field, exist only in values array */
    NO_MIC_PERMISSIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f120807a;

    ka6(int i) {
        this.f120807a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f120807a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

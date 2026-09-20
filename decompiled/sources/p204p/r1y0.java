package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum r1y0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    SAMPLES_OR_COVERS_ISSUE_UNSPECIFIED(0),
    SAMPLES_OR_COVERS_ISSUE_MISSING_SAMPLE_OR_INTERPOLATION(1),
    SAMPLES_OR_COVERS_ISSUE_INCORRECT_SAMPLE_OR_INTERPOLATION(2),
    SAMPLES_OR_COVERS_ISSUE_MISSING_ORIGINAL_SONG(3),
    SAMPLES_OR_COVERS_ISSUE_INCORRECT_ORIGINAL_SONG(4),
    SAMPLES_OR_COVERS_ISSUE_OTHER(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f194976a;

    r1y0(int i) {
        this.f194976a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f194976a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

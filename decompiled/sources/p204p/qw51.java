package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum qw51 implements od50 {
    SUBTITLE_SOURCE_UNKNOWN(0),
    SUBTITLE_SOURCE_GENERATED_METADATA(1),
    SUBTITLE_SOURCE_OPERATOR_AUTHORED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f193182a;

    qw51(int i) {
        this.f193182a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f193182a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

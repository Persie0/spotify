package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum xl0 implements od50 {
    DETECT_STATUS_UNKNOWN(0),
    DETECT_STATUS_ERROR(1),
    DETECT_STATUS_IN_PROGRESS(2),
    DETECT_STATUS_FINISHED(3),
    DETECT_STATUS_AUDIO_UNAVAILABLE(4),
    DETECT_STATUS_FINISHED_BASED_ON_METADATA_ONLY(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f262990a;

    xl0(int i) {
        this.f262990a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f262990a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

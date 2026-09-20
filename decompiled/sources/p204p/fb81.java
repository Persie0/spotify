package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum fb81 implements od50 {
    TRACK_CLASSIFICATION_UNKNOWN(0),
    TRACK_CLASSIFICATION_PERFORMANCE(1),
    TRACK_CLASSIFICATION_MTV(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f67761a;

    fb81(int i) {
        this.f67761a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f67761a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

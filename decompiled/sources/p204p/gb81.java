package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum gb81 implements od50 {
    UNKNOWN(0),
    AUDIO_ONLY(1),
    AUDIO_WITH_VIDEO(2),
    VIDEO_MAPPED(3),
    VIDEO_UNMAPPED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f78235a;

    gb81(int i) {
        this.f78235a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f78235a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

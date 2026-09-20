package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum rlw implements od50 {
    VIDEO_CODEC_FAMILY_UNKNOWN(0),
    VIDEO_CODEC_FAMILY_H264(1),
    VIDEO_CODEC_FAMILY_HEVC(2),
    VIDEO_CODEC_FAMILY_AV1(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f200380a;

    rlw(int i) {
        this.f200380a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f200380a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

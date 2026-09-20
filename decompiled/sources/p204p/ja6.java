package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum ja6 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    WAV(1),
    /* JADX INFO: Fake field, exist only in values array */
    PCM(2),
    /* JADX INFO: Fake field, exist only in values array */
    OPUS(3),
    /* JADX INFO: Fake field, exist only in values array */
    VORBIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    MP3(5),
    /* JADX INFO: Fake field, exist only in values array */
    WEBM(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f110330a;

    ja6(int i) {
        this.f110330a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f110330a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

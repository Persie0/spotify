package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum pw6 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_ENCODING_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_ENCODING_F32LE(1),
    AUDIO_ENCODING_S16LE(2),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_ENCODING_S32LE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f181921a;

    pw6(int i) {
        this.f181921a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f181921a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

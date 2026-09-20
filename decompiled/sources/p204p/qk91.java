package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum qk91 implements od50 {
    TRIGGER_TYPE_UNKNOWN(0),
    URI(1),
    CLIENT_EVENT(2),
    PLAYBACK_STARTED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f189505a;

    qk91(int i) {
        this.f189505a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f189505a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

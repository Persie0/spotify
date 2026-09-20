package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum f4p0 implements od50 {
    ACTIVE(0),
    PAUSED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SUSPENDED(2),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_PLAYBACK_STATE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f65831a;

    f4p0(int i) {
        this.f65831a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f65831a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

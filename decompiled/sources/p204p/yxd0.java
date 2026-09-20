package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum yxd0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_TYPE_UNSPECIFIED(0),
    EPISODE_AUDIO(1),
    EPISODE_VIDEO(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f277235a;

    yxd0(int i) {
        this.f277235a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f277235a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

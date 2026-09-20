package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum qw6 implements od50 {
    AUDIO_EPISODE_TYPE_UNSPECIFIED(0),
    AUDIO_EPISODE_TYPE_TALK(1),
    AUDIO_EPISODE_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f193188a;

    qw6(int i) {
        this.f193188a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f193188a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

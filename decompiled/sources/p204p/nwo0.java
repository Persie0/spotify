package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum nwo0 implements od50 {
    PLAYBACK_CONTROL_UNSPECIFIED(0),
    PLAYBACK_CONTROL_CHAPTER_SKIP(1),
    PLAYBACK_CONTROL_DEFAULT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f159253a;

    nwo0(int i) {
        this.f159253a = i;
    }

    /* JADX INFO: renamed from: a */
    public static nwo0 m65801a(int i) {
        if (i == 0) {
            return PLAYBACK_CONTROL_UNSPECIFIED;
        }
        if (i == 1) {
            return PLAYBACK_CONTROL_CHAPTER_SKIP;
        }
        if (i != 2) {
            return null;
        }
        return PLAYBACK_CONTROL_DEFAULT;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f159253a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

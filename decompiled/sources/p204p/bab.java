package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum bab implements od50 {
    UNDEFINED_CTA(0),
    AUDIOBOOK_ONBOARDING(1),
    PODCAST_ONBOARDING(2),
    MUSIC_ONBOARDING(3),
    COURSE_ONBOARDING(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f25134a;

    bab(int i) {
        this.f25134a = i;
    }

    /* JADX INFO: renamed from: a */
    public static bab m28579a(int i) {
        if (i == 0) {
            return UNDEFINED_CTA;
        }
        if (i == 1) {
            return AUDIOBOOK_ONBOARDING;
        }
        if (i == 2) {
            return PODCAST_ONBOARDING;
        }
        if (i == 3) {
            return MUSIC_ONBOARDING;
        }
        if (i != 4) {
            return null;
        }
        return COURSE_ONBOARDING;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f25134a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

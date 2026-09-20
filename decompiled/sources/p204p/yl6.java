package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum yl6 implements od50 {
    ASTRO_ON_TYPE_UNSUPPORTED(0),
    ASTRO_ON_TYPE_AUDIOBOOKS_EXTRA_HOURS(1),
    ASTRO_ON_TYPE_AUDIOBOOKS_FAMILY_ACCESS(2),
    ASTRO_ON_TYPE_ASTRO(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f273919a;

    yl6(int i) {
        this.f273919a = i;
    }

    /* JADX INFO: renamed from: a */
    public static yl6 m94152a(int i) {
        if (i == 0) {
            return ASTRO_ON_TYPE_UNSUPPORTED;
        }
        if (i == 1) {
            return ASTRO_ON_TYPE_AUDIOBOOKS_EXTRA_HOURS;
        }
        if (i == 2) {
            return ASTRO_ON_TYPE_AUDIOBOOKS_FAMILY_ACCESS;
        }
        if (i != 3) {
            return null;
        }
        return ASTRO_ON_TYPE_ASTRO;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f273919a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

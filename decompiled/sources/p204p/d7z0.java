package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d7z0 implements vqt0 {

    /* JADX INFO: renamed from: a */
    public final int f46305a;

    /* JADX INFO: renamed from: b */
    public final String f46306b;

    public d7z0(int i) {
        String str;
        this.f46305a = i;
        if (i == 1) {
            str = "AUTOPLAY_MUSIC_TRACKS";
        } else if (i == 2) {
            str = "AUTOPLAY_PODCAST_EPISODES";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "SHUFFLING_FROM";
        }
        this.f46306b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7z0) && this.f46305a == ((d7z0) obj).f46305a;
    }

    @Override // p204p.vqt0
    public final String getId() {
        return this.f46306b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f46305a);
    }
}

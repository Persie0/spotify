package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h0y {

    /* JADX INFO: renamed from: a */
    public static final h0y f86381a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ h0y[] f86382b;

    static {
        h0y h0yVar = new h0y("TRACKS", 0);
        f86381a = h0yVar;
        f86382b = new h0y[]{h0yVar, new h0y("ALBUMS", 1), new h0y("ARTISTS", 2), new h0y("PLAYLISTS", 3), new h0y("EPISODES", 4), new h0y("PODCASTS", 5), new h0y("AUDIOBOOKS", 6)};
    }

    public static h0y valueOf(String str) {
        return (h0y) Enum.valueOf(h0y.class, str);
    }

    public static h0y[] values() {
        return (h0y[]) f86382b.clone();
    }
}

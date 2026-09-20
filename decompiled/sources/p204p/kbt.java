package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kbt implements mbt {

    /* JADX INFO: renamed from: a */
    public static final kbt f121277a = new kbt();

    @Override // p204p.mbt
    /* JADX INFO: renamed from: a */
    public final String mo52914a() {
        return "editor_curated_playlists";
    }

    @Override // p204p.mbt
    /* JADX INFO: renamed from: b */
    public final String mo52915b(String str) {
        return s571.m77251j("spotify:playlist-format:curated-playlists:", str, "");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kbt);
    }

    public final int hashCode() {
        return 673065202;
    }

    public final String toString() {
        return "CuratedPlaylists";
    }
}

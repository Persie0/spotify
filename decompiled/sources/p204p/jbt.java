package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jbt implements mbt {

    /* JADX INFO: renamed from: a */
    public static final jbt f110876a = new jbt();

    @Override // p204p.mbt
    /* JADX INFO: renamed from: a */
    public final String mo52914a() {
        return "editor_albums";
    }

    @Override // p204p.mbt
    /* JADX INFO: renamed from: b */
    public final String mo52915b(String str) {
        return s571.m77251j("spotify:playlist-format:recommended-albums:", str, "");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jbt);
    }

    public final int hashCode() {
        return -386742809;
    }

    public final String toString() {
        return "Albums";
    }
}

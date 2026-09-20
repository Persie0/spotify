package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class naw {

    /* JADX INFO: renamed from: a */
    public final String f152126a;

    public /* synthetic */ naw(String str) {
        this.f152126a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof naw) {
            return wj50.m88271j(this.f152126a, ((naw) obj).f152126a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f152126a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("EpisodeUri(uri=", this.f152126a, ")");
    }
}

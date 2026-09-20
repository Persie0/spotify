package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class i66 {

    /* JADX INFO: renamed from: a */
    public final String f99105a;

    public i66(String str) {
        this.f99105a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i66) && wj50.m88271j(this.f99105a, ((i66) obj).f99105a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.id.cover_art_tag) + (this.f99105a.hashCode() * 31);
    }
}

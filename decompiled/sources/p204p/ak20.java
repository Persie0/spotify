package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ak20 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f16407a;

    /* JADX INFO: renamed from: b */
    public final x76 f16408b;

    public ak20(ebf0 ebf0Var, x76 x76Var) {
        this.f16407a = ebf0Var;
        this.f16408b = x76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak20)) {
            return false;
        }
        ak20 ak20Var = (ak20) obj;
        return wj50.m88271j(this.f16407a, ak20Var.f16407a) && wj50.m88271j(this.f16408b, ak20Var.f16408b);
    }

    public final int hashCode() {
        return (this.f16407a.f57921a.hashCode() * 31) + (this.f16408b == null ? 0 : Integer.hashCode(R.string.artist_badges_artwork_content_description));
    }
}

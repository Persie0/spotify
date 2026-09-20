package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class gk20 {

    /* JADX INFO: renamed from: a */
    public final String f80684a;

    /* JADX INFO: renamed from: b */
    public final String f80685b;

    /* JADX INFO: renamed from: c */
    public final lj20 f80686c;

    /* JADX INFO: renamed from: d */
    public final x76 f80687d;

    public gk20(String str, String str2, lj20 lj20Var, x76 x76Var) {
        this.f80684a = str;
        this.f80685b = str2;
        this.f80686c = lj20Var;
        this.f80687d = x76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk20)) {
            return false;
        }
        gk20 gk20Var = (gk20) obj;
        return wj50.m88271j(this.f80684a, gk20Var.f80684a) && wj50.m88271j(this.f80685b, gk20Var.f80685b) && wj50.m88271j(this.f80686c, gk20Var.f80686c) && wj50.m88271j(this.f80687d, gk20Var.f80687d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f80684a.hashCode() * 31, 31, this.f80685b);
        lj20 lj20Var = this.f80686c;
        return ((iM77243b + (lj20Var == null ? 0 : lj20Var.hashCode())) * 31) + (this.f80687d != null ? Integer.hashCode(R.string.artist_badges_artwork_content_description) : 0);
    }
}

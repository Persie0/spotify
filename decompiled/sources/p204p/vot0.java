package p204p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes9.dex */
public final class vot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f243533a;

    /* JADX INFO: renamed from: b */
    public final boolean f243534b;

    /* JADX INFO: renamed from: c */
    public final String f243535c;

    /* JADX INFO: renamed from: d */
    public final String f243536d;

    /* JADX INFO: renamed from: e */
    public final Restrictions f243537e;

    /* JADX INFO: renamed from: f */
    public final boolean f243538f;

    /* JADX INFO: renamed from: g */
    public final int f243539g;

    /* JADX INFO: renamed from: h */
    public final boolean f243540h;

    public vot0(boolean z, boolean z2, String str, String str2, Restrictions restrictions, boolean z3, int i, boolean z4) {
        this.f243533a = z;
        this.f243534b = z2;
        this.f243535c = str;
        this.f243536d = str2;
        this.f243537e = restrictions;
        this.f243538f = z3;
        this.f243539g = i;
        this.f243540h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vot0)) {
            return false;
        }
        vot0 vot0Var = (vot0) obj;
        return this.f243533a == vot0Var.f243533a && this.f243534b == vot0Var.f243534b && this.f243535c.equals(vot0Var.f243535c) && wj50.m88271j(this.f243536d, vot0Var.f243536d) && wj50.m88271j(this.f243537e, vot0Var.f243537e) && this.f243538f == vot0Var.f243538f && this.f243539g == vot0Var.f243539g && this.f243540h == vot0Var.f243540h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243540h) + f710.m40938f(this.f243539g, s571.m77245d((this.f243537e.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(Boolean.hashCode(this.f243533a) * 31, 31, this.f243534b), 31, this.f243535c), 31, this.f243536d)) * 31, 31, this.f243538f), 31);
    }
}

package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class kb81 {

    /* JADX INFO: renamed from: a */
    public final String f121133a;

    /* JADX INFO: renamed from: b */
    public final String f121134b;

    /* JADX INFO: renamed from: c */
    public final String f121135c;

    /* JADX INFO: renamed from: d */
    public final String f121136d;

    /* JADX INFO: renamed from: e */
    public final String f121137e;

    /* JADX INFO: renamed from: f */
    public final int f121138f;

    /* JADX INFO: renamed from: g */
    public final boolean f121139g;

    /* JADX INFO: renamed from: h */
    public final ContextTrack f121140h;

    /* JADX INFO: renamed from: i */
    public final zp81 f121141i;

    /* JADX INFO: renamed from: j */
    public final boolean f121142j;

    /* JADX INFO: renamed from: k */
    public final boolean f121143k;

    /* JADX INFO: renamed from: l */
    public final boolean f121144l;

    /* JADX INFO: renamed from: m */
    public final boolean f121145m;

    /* JADX INFO: renamed from: n */
    public final boolean f121146n;

    /* JADX INFO: renamed from: o */
    public final qsj f121147o;

    /* JADX INFO: renamed from: p */
    public final List f121148p;

    /* JADX INFO: renamed from: q */
    public final boolean f121149q;

    /* JADX INFO: renamed from: r */
    public final boolean f121150r;

    /* JADX INFO: renamed from: s */
    public final boolean f121151s;

    /* JADX INFO: renamed from: t */
    public final boolean f121152t;

    /* JADX INFO: renamed from: u */
    public final boolean f121153u;

    public kb81(String str, String str2, String str3, String str4, String str5, int i, boolean z, ContextTrack contextTrack, zp81 zp81Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, qsj qsjVar, List list, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f121133a = str;
        this.f121134b = str2;
        this.f121135c = str3;
        this.f121136d = str4;
        this.f121137e = str5;
        this.f121138f = i;
        this.f121139g = z;
        this.f121140h = contextTrack;
        this.f121141i = zp81Var;
        this.f121142j = z2;
        this.f121143k = z3;
        this.f121144l = z4;
        this.f121145m = z5;
        this.f121146n = z6;
        this.f121147o = qsjVar;
        this.f121148p = list;
        this.f121149q = z7;
        this.f121150r = z8;
        this.f121151s = z9;
        this.f121152t = z10;
        this.f121153u = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb81)) {
            return false;
        }
        kb81 kb81Var = (kb81) obj;
        return wj50.m88271j(this.f121133a, kb81Var.f121133a) && wj50.m88271j(this.f121134b, kb81Var.f121134b) && wj50.m88271j(this.f121135c, kb81Var.f121135c) && wj50.m88271j(this.f121136d, kb81Var.f121136d) && wj50.m88271j(this.f121137e, kb81Var.f121137e) && this.f121138f == kb81Var.f121138f && this.f121139g == kb81Var.f121139g && wj50.m88271j(this.f121140h, kb81Var.f121140h) && this.f121141i == kb81Var.f121141i && this.f121142j == kb81Var.f121142j && this.f121143k == kb81Var.f121143k && this.f121144l == kb81Var.f121144l && this.f121145m == kb81Var.f121145m && this.f121146n == kb81Var.f121146n && this.f121147o == kb81Var.f121147o && wj50.m88271j(this.f121148p, kb81Var.f121148p) && this.f121149q == kb81Var.f121149q && this.f121150r == kb81Var.f121150r && this.f121151s == kb81Var.f121151s && this.f121152t == kb81Var.f121152t && this.f121153u == kb81Var.f121153u;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f121133a.hashCode() * 31, 31, this.f121134b), 31, this.f121135c), 31, this.f121136d);
        String str = this.f121137e;
        return Boolean.hashCode(this.f121153u) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(xl81.m91401j(this.f121147o, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f121141i.hashCode() + ((this.f121140h.hashCode() + s571.m77245d(mt60.m62800g(this.f121138f, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f121139g)) * 31)) * 31, 31, this.f121142j), 31, this.f121143k), 31, this.f121144l), 31, this.f121145m), 31, this.f121146n), 31), 31, this.f121148p), 31, this.f121149q), 31, this.f121150r), 31, this.f121151s), 31, this.f121152t);
    }
}

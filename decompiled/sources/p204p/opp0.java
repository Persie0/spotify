package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class opp0 {

    /* JADX INFO: renamed from: a */
    public final String f167980a;

    /* JADX INFO: renamed from: b */
    public final String f167981b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f167982c;

    /* JADX INFO: renamed from: d */
    public final String f167983d;

    /* JADX INFO: renamed from: e */
    public final String f167984e;

    /* JADX INFO: renamed from: f */
    public final String f167985f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f167986g;

    /* JADX INFO: renamed from: h */
    public final List f167987h;

    /* JADX INFO: renamed from: i */
    public final boolean f167988i;

    /* JADX INFO: renamed from: j */
    public final boolean f167989j;

    public opp0(String str, String str2, CharSequence charSequence, String str3, String str4, String str5, rcm0 rcm0Var, List list, boolean z, boolean z2) {
        this.f167980a = str;
        this.f167981b = str2;
        this.f167982c = charSequence;
        this.f167983d = str3;
        this.f167984e = str4;
        this.f167985f = str5;
        this.f167986g = rcm0Var;
        this.f167987h = list;
        this.f167988i = z;
        this.f167989j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opp0)) {
            return false;
        }
        opp0 opp0Var = (opp0) obj;
        return wj50.m88271j(this.f167980a, opp0Var.f167980a) && wj50.m88271j(this.f167981b, opp0Var.f167981b) && wj50.m88271j(this.f167982c, opp0Var.f167982c) && wj50.m88271j(this.f167983d, opp0Var.f167983d) && wj50.m88271j(this.f167984e, opp0Var.f167984e) && wj50.m88271j(this.f167985f, opp0Var.f167985f) && wj50.m88271j(this.f167986g, opp0Var.f167986g) && wj50.m88271j(this.f167987h, opp0Var.f167987h) && this.f167988i == opp0Var.f167988i && this.f167989j == opp0Var.f167989j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167989j) + s571.m77245d(s571.m77244c(yds.m93483m(this.f167986g, s571.m77243b(s571.m77243b(s571.m77243b((this.f167982c.hashCode() + s571.m77243b(this.f167980a.hashCode() * 31, 31, this.f167981b)) * 31, 31, this.f167983d), 31, this.f167984e), 31, this.f167985f), 31), 31, this.f167987h), 31, this.f167988i);
    }
}

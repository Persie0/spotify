package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a36 {

    /* JADX INFO: renamed from: a */
    public final String f11873a;

    /* JADX INFO: renamed from: b */
    public final String f11874b;

    /* JADX INFO: renamed from: c */
    public final String f11875c;

    /* JADX INFO: renamed from: d */
    public final String f11876d;

    /* JADX INFO: renamed from: e */
    public final boolean f11877e;

    /* JADX INFO: renamed from: f */
    public final boolean f11878f;

    /* JADX INFO: renamed from: g */
    public final boolean f11879g;

    /* JADX INFO: renamed from: h */
    public final String f11880h;

    /* JADX INFO: renamed from: i */
    public final is9 f11881i;

    /* JADX INFO: renamed from: j */
    public final rcm0 f11882j;

    /* JADX INFO: renamed from: k */
    public final List f11883k;

    public a36(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, is9 is9Var, rcm0 rcm0Var, List list) {
        this.f11873a = str;
        this.f11874b = str2;
        this.f11875c = str3;
        this.f11876d = str4;
        this.f11877e = z;
        this.f11878f = z2;
        this.f11879g = z3;
        this.f11880h = str5;
        this.f11881i = is9Var;
        this.f11882j = rcm0Var;
        this.f11883k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a36)) {
            return false;
        }
        a36 a36Var = (a36) obj;
        return wj50.m88271j(this.f11873a, a36Var.f11873a) && wj50.m88271j(this.f11874b, a36Var.f11874b) && wj50.m88271j(this.f11875c, a36Var.f11875c) && wj50.m88271j(this.f11876d, a36Var.f11876d) && this.f11877e == a36Var.f11877e && this.f11878f == a36Var.f11878f && this.f11879g == a36Var.f11879g && wj50.m88271j(this.f11880h, a36Var.f11880h) && wj50.m88271j(this.f11881i, a36Var.f11881i) && wj50.m88271j(this.f11882j, a36Var.f11882j) && wj50.m88271j(this.f11883k, a36Var.f11883k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f11873a.hashCode() * 31, 31, this.f11874b);
        String str = this.f11875c;
        return this.f11883k.hashCode() + yds.m93483m(this.f11882j, (this.f11881i.hashCode() + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f11876d), 31, this.f11877e), 31, this.f11878f), 31, this.f11879g), 31, this.f11880h)) * 31, 31);
    }
}

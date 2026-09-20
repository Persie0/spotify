package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class m1r {

    /* JADX INFO: renamed from: a */
    public final String f139050a;

    /* JADX INFO: renamed from: b */
    public final String f139051b;

    /* JADX INFO: renamed from: c */
    public final String f139052c;

    /* JADX INFO: renamed from: d */
    public final String f139053d;

    /* JADX INFO: renamed from: e */
    public final String f139054e;

    /* JADX INFO: renamed from: f */
    public final xv41 f139055f;

    /* JADX INFO: renamed from: g */
    public final s1r f139056g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f139057h;

    public m1r(String str, String str2, String str3, String str4, String str5, xv41 xv41Var, s1r s1rVar, ArrayList arrayList) {
        this.f139050a = str;
        this.f139051b = str2;
        this.f139052c = str3;
        this.f139053d = str4;
        this.f139054e = str5;
        this.f139055f = xv41Var;
        this.f139056g = s1rVar;
        this.f139057h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1r)) {
            return false;
        }
        m1r m1rVar = (m1r) obj;
        return wj50.m88271j(this.f139050a, m1rVar.f139050a) && wj50.m88271j(this.f139051b, m1rVar.f139051b) && wj50.m88271j(this.f139052c, m1rVar.f139052c) && wj50.m88271j(this.f139053d, m1rVar.f139053d) && wj50.m88271j(this.f139054e, m1rVar.f139054e) && wj50.m88271j(this.f139055f, m1rVar.f139055f) && this.f139056g.equals(m1rVar.f139056g) && this.f139057h.equals(m1rVar.f139057h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f139050a.hashCode() * 31, 31, this.f139051b), 31, this.f139052c);
        String str = this.f139053d;
        return this.f139057h.hashCode() + s571.m77245d((this.f139056g.hashCode() + ((this.f139055f.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f139054e)) * 31)) * 31, 31, false);
    }
}

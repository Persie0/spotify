package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ilb1 implements ro0 {

    /* JADX INFO: renamed from: a */
    public final ro0 f103342a;

    /* JADX INFO: renamed from: b */
    public final String f103343b;

    /* JADX INFO: renamed from: c */
    public final glb1 f103344c;

    /* JADX INFO: renamed from: d */
    public final hlb1 f103345d;

    /* JADX INFO: renamed from: e */
    public final List f103346e;

    /* JADX INFO: renamed from: f */
    public final String f103347f;

    /* JADX INFO: renamed from: g */
    public final String f103348g;

    /* JADX INFO: renamed from: h */
    public final String f103349h;

    /* JADX INFO: renamed from: i */
    public final String f103350i;

    public ilb1(ro0 ro0Var, String str, glb1 glb1Var, hlb1 hlb1Var, List list, String str2, String str3, String str4, String str5) {
        this.f103342a = ro0Var;
        this.f103343b = str;
        this.f103344c = glb1Var;
        this.f103345d = hlb1Var;
        this.f103346e = list;
        this.f103347f = str2;
        this.f103348g = str3;
        this.f103349h = str4;
        this.f103350i = str5;
    }

    /* JADX INFO: renamed from: a */
    public final hlb1 m51008a() {
        return this.f103345d;
    }

    /* JADX INFO: renamed from: b */
    public final String m51009b() {
        return this.f103343b;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f103342a.mo29280c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilb1)) {
            return false;
        }
        ilb1 ilb1Var = (ilb1) obj;
        return wj50.m88271j(this.f103342a, ilb1Var.f103342a) && wj50.m88271j(this.f103343b, ilb1Var.f103343b) && wj50.m88271j(this.f103344c, ilb1Var.f103344c) && wj50.m88271j(this.f103345d, ilb1Var.f103345d) && wj50.m88271j(this.f103346e, ilb1Var.f103346e) && wj50.m88271j(this.f103347f, ilb1Var.f103347f) && wj50.m88271j(this.f103348g, ilb1Var.f103348g) && wj50.m88271j(this.f103349h, ilb1Var.f103349h) && wj50.m88271j(this.f103350i, ilb1Var.f103350i);
    }

    public final int hashCode() {
        return this.f103350i.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77244c((this.f103345d.hashCode() + ((this.f103344c.hashCode() + s571.m77243b(this.f103342a.hashCode() * 31, 31, this.f103343b)) * 31)) * 31, 31, this.f103346e), 31, this.f103347f), 31, this.f103348g), 31, this.f103349h);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f103342a.mo29283j();
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f103342a.mo29285l();
    }
}

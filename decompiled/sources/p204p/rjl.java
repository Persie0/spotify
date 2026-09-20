package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class rjl {

    /* JADX INFO: renamed from: a */
    public final String f199846a;

    /* JADX INFO: renamed from: b */
    public final String f199847b;

    /* JADX INFO: renamed from: c */
    public final String f199848c;

    /* JADX INFO: renamed from: d */
    public final String f199849d;

    /* JADX INFO: renamed from: e */
    public final String f199850e;

    /* JADX INFO: renamed from: f */
    public final int f199851f;

    /* JADX INFO: renamed from: g */
    public final ed00 f199852g;

    /* JADX INFO: renamed from: h */
    public final String f199853h;

    /* JADX INFO: renamed from: i */
    public final String f199854i;

    /* JADX INFO: renamed from: j */
    public final tjl f199855j;

    /* JADX INFO: renamed from: k */
    public final Set f199856k;

    /* JADX INFO: renamed from: l */
    public final boolean f199857l;

    /* JADX INFO: renamed from: m */
    public final ejl f199858m;

    /* JADX INFO: renamed from: n */
    public final ejl f199859n;

    public rjl(String str, String str2, String str3, String str4, String str5, int i, ed00 ed00Var, String str6, String str7, tjl tjlVar, Set set, boolean z, ejl ejlVar, ejl ejlVar2) {
        this.f199846a = str;
        this.f199847b = str2;
        this.f199848c = str3;
        this.f199849d = str4;
        this.f199850e = str5;
        this.f199851f = i;
        this.f199852g = ed00Var;
        this.f199853h = str6;
        this.f199854i = str7;
        this.f199855j = tjlVar;
        this.f199856k = set;
        this.f199857l = z;
        this.f199858m = ejlVar;
        this.f199859n = ejlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjl)) {
            return false;
        }
        rjl rjlVar = (rjl) obj;
        return wj50.m88271j(this.f199846a, rjlVar.f199846a) && this.f199847b.equals(rjlVar.f199847b) && this.f199848c.equals(rjlVar.f199848c) && wj50.m88271j(this.f199849d, rjlVar.f199849d) && this.f199850e.equals(rjlVar.f199850e) && this.f199851f == rjlVar.f199851f && wj50.m88271j(this.f199852g, rjlVar.f199852g) && wj50.m88271j(this.f199853h, rjlVar.f199853h) && wj50.m88271j(this.f199854i, rjlVar.f199854i) && this.f199855j.equals(rjlVar.f199855j) && this.f199856k.equals(rjlVar.f199856k) && this.f199857l == rjlVar.f199857l && wj50.m88271j(this.f199858m, rjlVar.f199858m) && wj50.m88271j(this.f199859n, rjlVar.f199859n);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f199846a.hashCode() * 31, 31, this.f199847b), 31, this.f199848c), 31, this.f199849d), 31, this.f199850e);
        int i = this.f199851f;
        int iM38547C = (iM77243b + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        ed00 ed00Var = this.f199852g;
        int iHashCode = (iM38547C + (ed00Var == null ? 0 : ed00Var.hashCode())) * 31;
        String str = this.f199853h;
        int iM77245d = s571.m77245d(klh.m56830b((this.f199855j.hashCode() + s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 29791, 31, this.f199854i), 31, false)) * 31, 31, this.f199856k), 31, this.f199857l);
        ejl ejlVar = this.f199858m;
        int iHashCode2 = (iM77245d + (ejlVar == null ? 0 : ejlVar.hashCode())) * 31;
        ejl ejlVar2 = this.f199859n;
        return iHashCode2 + (ejlVar2 != null ? ejlVar2.hashCode() : 0);
    }
}

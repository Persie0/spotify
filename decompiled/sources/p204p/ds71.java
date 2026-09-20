package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ds71 {

    /* JADX INFO: renamed from: a */
    public final String f52509a;

    /* JADX INFO: renamed from: b */
    public final sp71 f52510b;

    /* JADX INFO: renamed from: c */
    public final bs71 f52511c;

    /* JADX INFO: renamed from: d */
    public final cs71 f52512d;

    /* JADX INFO: renamed from: e */
    public final boolean f52513e;

    /* JADX INFO: renamed from: f */
    public final boolean f52514f;

    /* JADX INFO: renamed from: g */
    public final boolean f52515g;

    public ds71(String str, sp71 sp71Var, bs71 bs71Var, cs71 cs71Var, boolean z, boolean z2, boolean z3) {
        this.f52509a = str;
        this.f52510b = sp71Var;
        this.f52511c = bs71Var;
        this.f52512d = cs71Var;
        this.f52513e = z;
        this.f52514f = z2;
        this.f52515g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds71)) {
            return false;
        }
        ds71 ds71Var = (ds71) obj;
        return wj50.m88271j(this.f52509a, ds71Var.f52509a) && wj50.m88271j(this.f52510b, ds71Var.f52510b) && wj50.m88271j(this.f52511c, ds71Var.f52511c) && wj50.m88271j(this.f52512d, ds71Var.f52512d) && this.f52513e == ds71Var.f52513e && this.f52514f == ds71Var.f52514f && this.f52515g == ds71Var.f52515g;
    }

    public final int hashCode() {
        int iHashCode = this.f52509a.hashCode() * 31;
        sp71 sp71Var = this.f52510b;
        int iHashCode2 = (iHashCode + (sp71Var == null ? 0 : sp71Var.hashCode())) * 31;
        bs71 bs71Var = this.f52511c;
        int iHashCode3 = (iHashCode2 + (bs71Var == null ? 0 : bs71Var.f30260a.hashCode())) * 31;
        cs71 cs71Var = this.f52512d;
        return s571.m77245d(s571.m77245d(s571.m77245d((iHashCode3 + (cs71Var != null ? cs71Var.hashCode() : 0)) * 31, 31, this.f52513e), 31, this.f52514f), 31, this.f52515g);
    }
}

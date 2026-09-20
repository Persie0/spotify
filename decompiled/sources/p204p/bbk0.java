package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bbk0 extends cbk0 {

    /* JADX INFO: renamed from: a */
    public final String f25609a;

    /* JADX INFO: renamed from: b */
    public final String f25610b;

    /* JADX INFO: renamed from: c */
    public final boolean f25611c;

    /* JADX INFO: renamed from: d */
    public final zaf0 f25612d;

    /* JADX INFO: renamed from: e */
    public final String f25613e;

    /* JADX INFO: renamed from: f */
    public final syj f25614f;

    /* JADX INFO: renamed from: g */
    public final uwi f25615g;

    /* JADX INFO: renamed from: h */
    public final k4s0 f25616h;

    /* JADX INFO: renamed from: i */
    public final oak0 f25617i;

    /* JADX INFO: renamed from: j */
    public final boolean f25618j;

    /* JADX INFO: renamed from: k */
    public final boolean f25619k;

    public bbk0(String str, String str2, boolean z, zaf0 zaf0Var, String str3, syj syjVar, uwi uwiVar, k4s0 k4s0Var, oak0 oak0Var, boolean z2, boolean z3) {
        this.f25609a = str;
        this.f25610b = str2;
        this.f25611c = z;
        this.f25612d = zaf0Var;
        this.f25613e = str3;
        this.f25614f = syjVar;
        this.f25615g = uwiVar;
        this.f25616h = k4s0Var;
        this.f25617i = oak0Var;
        this.f25618j = z2;
        this.f25619k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbk0)) {
            return false;
        }
        bbk0 bbk0Var = (bbk0) obj;
        return wj50.m88271j(this.f25609a, bbk0Var.f25609a) && wj50.m88271j(this.f25610b, bbk0Var.f25610b) && this.f25611c == bbk0Var.f25611c && this.f25612d == bbk0Var.f25612d && wj50.m88271j(this.f25613e, bbk0Var.f25613e) && wj50.m88271j(this.f25614f, bbk0Var.f25614f) && wj50.m88271j(this.f25615g, bbk0Var.f25615g) && wj50.m88271j(this.f25616h, bbk0Var.f25616h) && wj50.m88271j(this.f25617i, bbk0Var.f25617i) && this.f25618j == bbk0Var.f25618j && this.f25619k == bbk0Var.f25619k;
    }

    public final int hashCode() {
        int iHashCode = this.f25609a.hashCode() * 31;
        String str = this.f25610b;
        return Boolean.hashCode(this.f25619k) + s571.m77245d((this.f25617i.hashCode() + ((this.f25616h.hashCode() + ((this.f25615g.hashCode() + ((this.f25614f.hashCode() + s571.m77243b((this.f25612d.hashCode() + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f25611c)) * 31, 31, this.f25613e)) * 31)) * 31)) * 31)) * 31, 31, this.f25618j);
    }
}

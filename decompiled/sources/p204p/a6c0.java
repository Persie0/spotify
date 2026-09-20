package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class a6c0 {

    /* JADX INFO: renamed from: a */
    public final int f12758a;

    /* JADX INFO: renamed from: b */
    public final String f12759b;

    /* JADX INFO: renamed from: c */
    public final emr0 f12760c;

    /* JADX INFO: renamed from: d */
    public final fmo f12761d;

    /* JADX INFO: renamed from: e */
    public final boolean f12762e;

    /* JADX INFO: renamed from: f */
    public final l3c0 f12763f;

    /* JADX INFO: renamed from: g */
    public final boolean f12764g;

    /* JADX INFO: renamed from: h */
    public final C1940hk f12765h;

    /* JADX INFO: renamed from: i */
    public final r9o0 f12766i;

    /* JADX INFO: renamed from: j */
    public final xmq f12767j;

    /* JADX INFO: renamed from: k */
    public final boolean f12768k;

    /* JADX INFO: renamed from: l */
    public final cs10 f12769l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f12770m;

    /* JADX INFO: renamed from: n */
    public final boolean f12771n;

    public a6c0(int i, String str, emr0 emr0Var, fmo fmoVar, boolean z, l3c0 l3c0Var, boolean z2, C1940hk c1940hk, r9o0 r9o0Var, xmq xmqVar, boolean z3, cs10 cs10Var, ArrayList arrayList, boolean z4) {
        this.f12758a = i;
        this.f12759b = str;
        this.f12760c = emr0Var;
        this.f12761d = fmoVar;
        this.f12762e = z;
        this.f12763f = l3c0Var;
        this.f12764g = z2;
        this.f12765h = c1940hk;
        this.f12766i = r9o0Var;
        this.f12767j = xmqVar;
        this.f12768k = z3;
        this.f12769l = cs10Var;
        this.f12770m = arrayList;
        this.f12771n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6c0)) {
            return false;
        }
        a6c0 a6c0Var = (a6c0) obj;
        return this.f12758a == a6c0Var.f12758a && wj50.m88271j(this.f12759b, a6c0Var.f12759b) && this.f12760c.equals(a6c0Var.f12760c) && wj50.m88271j(this.f12761d, a6c0Var.f12761d) && this.f12762e == a6c0Var.f12762e && wj50.m88271j(this.f12763f, a6c0Var.f12763f) && this.f12764g == a6c0Var.f12764g && wj50.m88271j(this.f12765h, a6c0Var.f12765h) && wj50.m88271j(this.f12766i, a6c0Var.f12766i) && wj50.m88271j(this.f12767j, a6c0Var.f12767j) && this.f12768k == a6c0Var.f12768k && wj50.m88271j(this.f12769l, a6c0Var.f12769l) && this.f12770m.equals(a6c0Var.f12770m) && this.f12771n == a6c0Var.f12771n;
    }

    public final int hashCode() {
        int iHashCode = (this.f12760c.hashCode() + s571.m77243b(edb.m38547C(this.f12758a) * 31, 31, this.f12759b)) * 31;
        fmo fmoVar = this.f12761d;
        int iM77245d = s571.m77245d((iHashCode + (fmoVar == null ? 0 : fmoVar.hashCode())) * 31, 31, this.f12762e);
        l3c0 l3c0Var = this.f12763f;
        int iM77245d2 = s571.m77245d((iM77245d + (l3c0Var == null ? 0 : Boolean.hashCode(l3c0Var.f129290a))) * 31, 31, this.f12764g);
        C1940hk c1940hk = this.f12765h;
        int iHashCode2 = (iM77245d2 + (c1940hk == null ? 0 : c1940hk.hashCode())) * 31;
        r9o0 r9o0Var = this.f12766i;
        int iHashCode3 = (iHashCode2 + (r9o0Var == null ? 0 : r9o0Var.hashCode())) * 31;
        xmq xmqVar = this.f12767j;
        int iM77245d3 = s571.m77245d((iHashCode3 + (xmqVar == null ? 0 : edb.m38547C(xmqVar.f263426a))) * 31, 31, this.f12768k);
        cs10 cs10Var = this.f12769l;
        return Boolean.hashCode(this.f12771n) + lq51.m59700f(this.f12770m, (iM77245d3 + (cs10Var != null ? Integer.hashCode(cs10Var.f41439a) : 0)) * 31, 31);
    }
}

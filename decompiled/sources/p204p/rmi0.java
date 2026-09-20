package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class rmi0 implements smi0 {

    /* JADX INFO: renamed from: X */
    public final Object f200555X;

    /* JADX INFO: renamed from: Y */
    public final boolean f200556Y;

    /* JADX INFO: renamed from: a */
    public final String f200557a;

    /* JADX INFO: renamed from: b */
    public final String f200558b;

    /* JADX INFO: renamed from: c */
    public final h66 f200559c;

    /* JADX INFO: renamed from: d */
    public final boolean f200560d;

    /* JADX INFO: renamed from: e */
    public final boolean f200561e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f200562f;

    /* JADX INFO: renamed from: g */
    public final int f200563g;

    /* JADX INFO: renamed from: h */
    public final w9s f200564h;

    /* JADX INFO: renamed from: i */
    public final qsj f200565i;

    /* JADX INFO: renamed from: t */
    public final int f200566t;

    public rmi0(String str, String str2, h66 h66Var, boolean z, boolean z2, ArrayList arrayList, int i, w9s w9sVar, qsj qsjVar, int i2, nw80 nw80Var, boolean z3) {
        this.f200557a = str;
        this.f200558b = str2;
        this.f200559c = h66Var;
        this.f200560d = z;
        this.f200561e = z2;
        this.f200562f = arrayList;
        this.f200563g = i;
        this.f200564h = w9sVar;
        this.f200565i = qsjVar;
        this.f200566t = i2;
        this.f200555X = nw80Var;
        this.f200556Y = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmi0)) {
            return false;
        }
        rmi0 rmi0Var = (rmi0) obj;
        return wj50.m88271j(this.f200557a, rmi0Var.f200557a) && wj50.m88271j(this.f200558b, rmi0Var.f200558b) && this.f200559c.equals(rmi0Var.f200559c) && this.f200560d == rmi0Var.f200560d && this.f200561e == rmi0Var.f200561e && this.f200562f.equals(rmi0Var.f200562f) && this.f200563g == rmi0Var.f200563g && this.f200564h == rmi0Var.f200564h && this.f200565i == rmi0Var.f200565i && this.f200566t == rmi0Var.f200566t && wj50.m88271j(this.f200555X, rmi0Var.f200555X) && this.f200556Y == rmi0Var.f200556Y;
    }

    public final int hashCode() {
        int iHashCode = this.f200557a.hashCode() * 31;
        String str = this.f200558b;
        int iM62800g = mt60.m62800g(this.f200566t, xl81.m91401j(this.f200565i, (this.f200564h.hashCode() + f710.m40938f(this.f200563g, lq51.m59700f(this.f200562f, s571.m77245d(s571.m77245d((this.f200559c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f200560d), 31, this.f200561e), 31), 31)) * 31, 31), 31);
        Object obj = this.f200555X;
        return Boolean.hashCode(this.f200556Y) + ((iM62800g + (obj != null ? obj.hashCode() : 0)) * 31);
    }
}

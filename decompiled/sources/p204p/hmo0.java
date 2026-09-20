package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hmo0 implements moa, uno0 {

    /* JADX INFO: renamed from: a */
    public final String f93008a;

    /* JADX INFO: renamed from: b */
    public final rq91 f93009b;

    /* JADX INFO: renamed from: c */
    public final nno0 f93010c;

    /* JADX INFO: renamed from: d */
    public final String f93011d;

    /* JADX INFO: renamed from: e */
    public final un20 f93012e;

    public hmo0(String str, rq91 rq91Var, nno0 nno0Var, String str2, un20 un20Var) {
        this.f93008a = str;
        this.f93009b = rq91Var;
        this.f93010c = nno0Var;
        this.f93011d = str2;
        this.f93012e = un20Var;
    }

    @Override // p204p.uno0
    /* JADX INFO: renamed from: a */
    public final nno0 mo45278a() {
        return this.f93010c;
    }

    @Override // p204p.uno0
    /* JADX INFO: renamed from: b */
    public final String mo45279b() {
        return this.f93011d;
    }

    @Override // p204p.uno0
    /* JADX INFO: renamed from: c */
    public final b250 mo45280c() {
        return this.f93009b;
    }

    @Override // p204p.uno0
    /* JADX INFO: renamed from: d */
    public final un20 mo45281d() {
        return this.f93012e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmo0)) {
            return false;
        }
        hmo0 hmo0Var = (hmo0) obj;
        return wj50.m88271j(this.f93008a, hmo0Var.f93008a) && this.f93009b.equals(hmo0Var.f93009b) && this.f93010c.equals(hmo0Var.f93010c) && this.f93011d.equals(hmo0Var.f93011d) && wj50.m88271j(this.f93012e, hmo0Var.f93012e);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f93008a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f93010c.hashCode() + mt60.m62800g(this.f93009b.f201781b, this.f93008a.hashCode() * 31, 31)) * 31, 31, this.f93011d);
        un20 un20Var = this.f93012e;
        return iM77243b + (un20Var == null ? 0 : un20Var.hashCode());
    }
}

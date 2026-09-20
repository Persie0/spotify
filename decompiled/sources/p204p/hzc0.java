package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hzc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f96889a;

    /* JADX INFO: renamed from: b */
    public final String f96890b;

    /* JADX INFO: renamed from: c */
    public final String f96891c;

    /* JADX INFO: renamed from: d */
    public final qyc0 f96892d;

    public hzc0(String str, String str2, String str3, qyc0 qyc0Var) {
        this.f96889a = str;
        this.f96890b = str2;
        this.f96891c = str3;
        this.f96892d = qyc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzc0)) {
            return false;
        }
        hzc0 hzc0Var = (hzc0) obj;
        return wj50.m88271j(this.f96889a, hzc0Var.f96889a) && this.f96890b.equals(hzc0Var.f96890b) && wj50.m88271j(this.f96891c, hzc0Var.f96891c) && this.f96892d.equals(hzc0Var.f96892d);
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f96889a;
    }

    public final int hashCode() {
        return this.f96892d.hashCode() + s571.m77243b(s571.m77243b(this.f96889a.hashCode() * 961, 31, this.f96890b), 31, this.f96891c);
    }
}

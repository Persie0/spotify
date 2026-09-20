package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cz91 {

    /* JADX INFO: renamed from: a */
    public final c1x0 f43499a;

    /* JADX INFO: renamed from: b */
    public final c1x0 f43500b;

    /* JADX INFO: renamed from: c */
    public final c1x0 f43501c;

    /* JADX INFO: renamed from: d */
    public final c1x0 f43502d;

    /* JADX INFO: renamed from: e */
    public final c1x0 f43503e;

    public cz91(c1x0 c1x0Var, c1x0 c1x0Var2, c1x0 c1x0Var3, c1x0 c1x0Var4, c1x0 c1x0Var5) {
        this.f43499a = c1x0Var;
        this.f43500b = c1x0Var2;
        this.f43501c = c1x0Var3;
        this.f43502d = c1x0Var4;
        this.f43503e = c1x0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz91)) {
            return false;
        }
        cz91 cz91Var = (cz91) obj;
        return this.f43499a.equals(cz91Var.f43499a) && this.f43500b.equals(cz91Var.f43500b) && this.f43501c.equals(cz91Var.f43501c) && this.f43502d.equals(cz91Var.f43502d) && this.f43503e.equals(cz91Var.f43503e);
    }

    public final int hashCode() {
        return this.f43503e.hashCode() + tfe.m80648f(this.f43502d, tfe.m80648f(this.f43501c, tfe.m80648f(this.f43500b, this.f43499a.hashCode() * 31, 31), 31), 31);
    }
}

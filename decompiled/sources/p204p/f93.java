package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f93 {

    /* JADX INFO: renamed from: a */
    public final boolean f67160a;

    /* JADX INFO: renamed from: b */
    public final boolean f67161b;

    /* JADX INFO: renamed from: c */
    public final d850 f67162c;

    /* JADX INFO: renamed from: d */
    public final boolean f67163d;

    public f93(int i, d850 d850Var) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) != 0;
        d850Var = (i & 4) != 0 ? null : d850Var;
        boolean z3 = (i & 8) == 0;
        this.f67160a = z;
        this.f67161b = z2;
        this.f67162c = d850Var;
        this.f67163d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93)) {
            return false;
        }
        f93 f93Var = (f93) obj;
        return this.f67160a == f93Var.f67160a && this.f67161b == f93Var.f67161b && wj50.m88271j(this.f67162c, f93Var.f67162c) && this.f67163d == f93Var.f67163d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f67160a) * 31, 31, this.f67161b);
        d850 d850Var = this.f67162c;
        return s571.m77245d((iM77245d + (d850Var == null ? 0 : d850Var.hashCode())) * 31, 31, this.f67163d);
    }
}

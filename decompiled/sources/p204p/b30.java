package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b30 {

    /* JADX INFO: renamed from: a */
    public final String f22751a;

    /* JADX INFO: renamed from: b */
    public final un20 f22752b;

    /* JADX INFO: renamed from: c */
    public final qf40 f22753c;

    public b30(String str, un20 un20Var, qf40 qf40Var) {
        this.f22751a = str;
        this.f22752b = un20Var;
        this.f22753c = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final un20 m27978a() {
        return this.f22752b;
    }

    /* JADX INFO: renamed from: b */
    public final String m27979b() {
        return this.f22751a;
    }

    /* JADX INFO: renamed from: c */
    public final qf40 m27980c() {
        return this.f22753c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) obj;
        return wj50.m88271j(this.f22751a, b30Var.f22751a) && wj50.m88271j(this.f22752b, b30Var.f22752b) && wj50.m88271j(this.f22753c, b30Var.f22753c);
    }

    public final int hashCode() {
        int iHashCode = this.f22751a.hashCode() * 31;
        un20 un20Var = this.f22752b;
        return this.f22753c.hashCode() + ((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}

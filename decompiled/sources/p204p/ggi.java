package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ggi {

    /* JADX INFO: renamed from: a */
    public final String f79677a;

    /* JADX INFO: renamed from: b */
    public final un20 f79678b;

    /* JADX INFO: renamed from: c */
    public final qf40 f79679c;

    public ggi(String str, un20 un20Var, qf40 qf40Var) {
        this.f79677a = str;
        this.f79678b = un20Var;
        this.f79679c = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final qf40 m44699a() {
        return this.f79679c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggi)) {
            return false;
        }
        ggi ggiVar = (ggi) obj;
        return wj50.m88271j(this.f79677a, ggiVar.f79677a) && wj50.m88271j(this.f79678b, ggiVar.f79678b) && wj50.m88271j(this.f79679c, ggiVar.f79679c);
    }

    public final int hashCode() {
        int iHashCode = this.f79677a.hashCode() * 31;
        un20 un20Var = this.f79678b;
        return this.f79679c.hashCode() + ((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}

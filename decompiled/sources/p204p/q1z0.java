package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q1z0 {

    /* JADX INFO: renamed from: a */
    public final String f184432a;

    /* JADX INFO: renamed from: b */
    public final qf40 f184433b;

    public q1z0(String str, qf40 qf40Var) {
        this.f184432a = str;
        this.f184433b = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final qf40 m71965a() {
        return this.f184433b;
    }

    /* JADX INFO: renamed from: b */
    public final String m71966b() {
        return this.f184432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1z0)) {
            return false;
        }
        q1z0 q1z0Var = (q1z0) obj;
        return wj50.m88271j(this.f184432a, q1z0Var.f184432a) && wj50.m88271j(this.f184433b, q1z0Var.f184433b);
    }

    public final int hashCode() {
        return fr0.m42461e(this.f184433b, this.f184432a.hashCode() * 31, 31);
    }
}

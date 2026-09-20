package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d881 {

    /* JADX INFO: renamed from: a */
    public final b881 f46405a;

    /* JADX INFO: renamed from: b */
    public final qro0 f46406b;

    /* JADX INFO: renamed from: c */
    public final boolean f46407c;

    public d881(b881 b881Var, qro0 qro0Var, boolean z) {
        this.f46405a = b881Var;
        this.f46406b = qro0Var;
        this.f46407c = z;
    }

    /* JADX INFO: renamed from: a */
    public static d881 m35259a(d881 d881Var, qro0 qro0Var, boolean z, int i) {
        b881 b881Var = d881Var.f46405a;
        if ((i & 2) != 0) {
            qro0Var = d881Var.f46406b;
        }
        if ((i & 4) != 0) {
            z = d881Var.f46407c;
        }
        d881Var.getClass();
        return new d881(b881Var, qro0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d881)) {
            return false;
        }
        d881 d881Var = (d881) obj;
        return wj50.m88271j(this.f46405a, d881Var.f46405a) && wj50.m88271j(this.f46406b, d881Var.f46406b) && this.f46407c == d881Var.f46407c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46407c) + ((this.f46406b.hashCode() + (this.f46405a.hashCode() * 31)) * 31);
    }
}

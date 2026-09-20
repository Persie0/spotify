package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v96 {

    /* JADX INFO: renamed from: a */
    public final q76 f238858a;

    /* JADX INFO: renamed from: b */
    public final x96 f238859b;

    public v96(q76 q76Var, x96 x96Var) {
        this.f238858a = q76Var;
        this.f238859b = x96Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v96)) {
            return false;
        }
        v96 v96Var = (v96) obj;
        return wj50.m88271j(this.f238858a, v96Var.f238858a) && wj50.m88271j(this.f238859b, v96Var.f238859b);
    }

    public final int hashCode() {
        int iHashCode = this.f238858a.hashCode() * 31;
        this.f238859b.getClass();
        return iHashCode - 1076158992;
    }

    public /* synthetic */ v96(q76 q76Var) {
        this(q76Var, x96.f259282a);
    }
}

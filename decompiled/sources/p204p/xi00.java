package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xi00 {

    /* JADX INFO: renamed from: a */
    public final wi00 f261739a;

    /* JADX INFO: renamed from: b */
    public final int f261740b;

    public xi00(wi00 wi00Var, int i) {
        this.f261739a = wi00Var;
        this.f261740b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi00)) {
            return false;
        }
        xi00 xi00Var = (xi00) obj;
        return wj50.m88271j(this.f261739a, xi00Var.f261739a) && this.f261740b == xi00Var.f261740b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f261740b) + (this.f261739a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f261739a);
        sb.append(", arity=");
        return edb.m38567p(sb, this.f261740b, ')');
    }
}

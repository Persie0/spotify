package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qi71 {

    /* JADX INFO: renamed from: a */
    public final th71 f188954a;

    /* JADX INFO: renamed from: b */
    public final sh71 f188955b;

    public qi71(th71 th71Var, sh71 sh71Var) {
        this.f188954a = th71Var;
        this.f188955b = sh71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi71)) {
            return false;
        }
        qi71 qi71Var = (qi71) obj;
        return this.f188954a == qi71Var.f188954a && this.f188955b == qi71Var.f188955b;
    }

    public final int hashCode() {
        return this.f188955b.hashCode() + (this.f188954a.hashCode() * 31);
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b8j0 implements e8j0 {

    /* JADX INFO: renamed from: a */
    public final boolean f24597a;

    /* JADX INFO: renamed from: b */
    public final mb61 f24598b;

    /* JADX INFO: renamed from: c */
    public final mb61 f24599c;

    /* JADX WARN: Multi-variable type inference failed */
    public b8j0(boolean z, gh00 gh00Var, xh00 xh00Var) {
        this.f24597a = z;
        this.f24598b = (mb61) gh00Var;
        this.f24599c = (mb61) xh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8j0)) {
            return false;
        }
        b8j0 b8j0Var = (b8j0) obj;
        return this.f24597a == b8j0Var.f24597a && this.f24598b.equals(b8j0Var.f24598b) && this.f24599c.equals(b8j0Var.f24599c);
    }

    public final int hashCode() {
        return this.f24599c.hashCode() + ((this.f24598b.hashCode() + (Boolean.hashCode(this.f24597a) * 31)) * 31);
    }
}

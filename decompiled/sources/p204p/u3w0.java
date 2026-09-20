package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u3w0 {

    /* JADX INFO: renamed from: a */
    public final wwu f226478a;

    /* JADX INFO: renamed from: b */
    public final mb61 f226479b;

    /* JADX WARN: Multi-variable type inference failed */
    public u3w0(wwu wwuVar, vh00 vh00Var) {
        this.f226478a = wwuVar;
        this.f226479b = (mb61) vh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.mb61, p.vh00] */
    /* JADX INFO: renamed from: a */
    public final vh00 m82307a() {
        return this.f226479b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3w0)) {
            return false;
        }
        u3w0 u3w0Var = (u3w0) obj;
        return wj50.m88271j(this.f226478a, u3w0Var.f226478a) && this.f226479b.equals(u3w0Var.f226479b);
    }

    public final int hashCode() {
        return this.f226479b.hashCode() + ((this.f226478a.hashCode() + (edb.m38547C(1) * 31)) * 31);
    }
}

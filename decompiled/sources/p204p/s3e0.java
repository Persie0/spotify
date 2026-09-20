package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s3e0 {

    /* JADX INFO: renamed from: a */
    public final r1y f205274a;

    /* JADX INFO: renamed from: b */
    public final n3e0 f205275b;

    public s3e0(r1y r1yVar, n3e0 n3e0Var) {
        this.f205274a = r1yVar;
        this.f205275b = n3e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3e0)) {
            return false;
        }
        s3e0 s3e0Var = (s3e0) obj;
        return wj50.m88271j(this.f205274a, s3e0Var.f205274a) && wj50.m88271j(this.f205275b, s3e0Var.f205275b);
    }

    public final int hashCode() {
        return this.f205275b.hashCode() + (this.f205274a.hashCode() * 31);
    }
}

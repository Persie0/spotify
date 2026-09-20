package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dde0 implements fde0 {

    /* JADX INFO: renamed from: a */
    public final String f47815a;

    /* JADX INFO: renamed from: b */
    public final xiw0 f47816b;

    public dde0(String str, xiw0 xiw0Var) {
        this.f47815a = str;
        this.f47816b = xiw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde0)) {
            return false;
        }
        dde0 dde0Var = (dde0) obj;
        return wj50.m88271j(this.f47815a, dde0Var.f47815a) && wj50.m88271j(this.f47816b, dde0Var.f47816b);
    }

    public final int hashCode() {
        return this.f47816b.hashCode() + (this.f47815a.hashCode() * 31);
    }
}

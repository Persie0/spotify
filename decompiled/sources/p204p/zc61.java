package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zc61 implements ad61 {

    /* JADX INFO: renamed from: a */
    public final u3w0 f281467a;

    /* JADX INFO: renamed from: b */
    public final u3w0 f281468b;

    public zc61(u3w0 u3w0Var, u3w0 u3w0Var2) {
        this.f281467a = u3w0Var;
        this.f281468b = u3w0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final u3w0 m95901a() {
        return this.f281467a;
    }

    /* JADX INFO: renamed from: b */
    public final u3w0 m95902b() {
        return this.f281468b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc61)) {
            return false;
        }
        zc61 zc61Var = (zc61) obj;
        return wj50.m88271j(this.f281467a, zc61Var.f281467a) && wj50.m88271j(this.f281468b, zc61Var.f281468b);
    }

    public final int hashCode() {
        u3w0 u3w0Var = this.f281467a;
        int iHashCode = (u3w0Var == null ? 0 : u3w0Var.hashCode()) * 31;
        u3w0 u3w0Var2 = this.f281468b;
        return iHashCode + (u3w0Var2 != null ? u3w0Var2.hashCode() : 0);
    }
}

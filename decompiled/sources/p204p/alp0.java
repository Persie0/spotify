package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class alp0 implements clp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16912a;

    /* JADX INFO: renamed from: b */
    public final String f16913b;

    public alp0(boolean z, String str) {
        this.f16912a = z;
        this.f16913b = str;
    }

    @Override // p204p.clp0
    /* JADX INFO: renamed from: a */
    public final boolean mo26353a() {
        return this.f16912a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alp0)) {
            return false;
        }
        alp0 alp0Var = (alp0) obj;
        return this.f16912a == alp0Var.f16912a && wj50.m88271j(this.f16913b, alp0Var.f16913b);
    }

    public final int hashCode() {
        return this.f16913b.hashCode() + (Boolean.hashCode(this.f16912a) * 31);
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k8r0 implements s8r0 {

    /* JADX INFO: renamed from: a */
    public final int f120414a;

    /* JADX INFO: renamed from: b */
    public final String f120415b;

    public k8r0(int i, String str) {
        this.f120414a = i;
        this.f120415b = str;
    }

    @Override // p204p.s8r0
    /* JADX INFO: renamed from: a */
    public final int mo55753a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8r0)) {
            return false;
        }
        k8r0 k8r0Var = (k8r0) obj;
        return this.f120414a == k8r0Var.f120414a && wj50.m88271j(this.f120415b, k8r0Var.f120415b);
    }

    public final int hashCode() {
        return this.f120415b.hashCode() + (Integer.hashCode(this.f120414a) * 31);
    }
}

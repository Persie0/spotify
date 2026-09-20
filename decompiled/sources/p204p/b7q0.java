package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b7q0 implements h7q0 {

    /* JADX INFO: renamed from: a */
    public final int f24371a;

    /* JADX INFO: renamed from: b */
    public final boolean f24372b;

    public b7q0(int i, boolean z) {
        this.f24371a = i;
        this.f24372b = z;
    }

    @Override // p204p.h7q0
    /* JADX INFO: renamed from: a */
    public final boolean mo24993a() {
        return this.f24372b;
    }

    @Override // p204p.h7q0
    /* JADX INFO: renamed from: b */
    public final int mo24994b() {
        return this.f24371a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7q0)) {
            return false;
        }
        b7q0 b7q0Var = (b7q0) obj;
        return this.f24371a == b7q0Var.f24371a && this.f24372b == b7q0Var.f24372b;
    }

    public final int hashCode() {
        int i = this.f24371a;
        return Boolean.hashCode(this.f24372b) + ((i == 0 ? 0 : edb.m38547C(i)) * 31);
    }
}

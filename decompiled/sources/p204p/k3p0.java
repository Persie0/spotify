package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k3p0 {

    /* JADX INFO: renamed from: a */
    public final j3p0 f118949a;

    /* JADX INFO: renamed from: b */
    public final l190 f118950b;

    /* JADX INFO: renamed from: c */
    public final Set f118951c;

    /* JADX INFO: renamed from: d */
    public final l3p0 f118952d;

    /* JADX INFO: renamed from: e */
    public final rt80 f118953e;

    public k3p0(j3p0 j3p0Var, l190 l190Var, Set set, l3p0 l3p0Var, rt80 rt80Var) {
        this.f118949a = j3p0Var;
        this.f118950b = l190Var;
        this.f118951c = set;
        this.f118952d = l3p0Var;
        this.f118953e = rt80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3p0)) {
            return false;
        }
        k3p0 k3p0Var = (k3p0) obj;
        return wj50.m88271j(this.f118949a, k3p0Var.f118949a) && this.f118950b == k3p0Var.f118950b && wj50.m88271j(this.f118951c, k3p0Var.f118951c) && wj50.m88271j(this.f118952d, k3p0Var.f118952d) && wj50.m88271j(this.f118953e, k3p0Var.f118953e);
    }

    public final int hashCode() {
        return this.f118953e.hashCode() + ((this.f118952d.hashCode() + klh.m56830b((this.f118950b.hashCode() + (this.f118949a.hashCode() * 31)) * 31, 31, this.f118951c)) * 31);
    }
}

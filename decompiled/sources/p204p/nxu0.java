package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nxu0 {

    /* JADX INFO: renamed from: a */
    public final mxu0 f159619a;

    /* JADX INFO: renamed from: b */
    public final String f159620b;

    public nxu0(mxu0 mxu0Var, String str) {
        this.f159619a = mxu0Var;
        this.f159620b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxu0)) {
            return false;
        }
        nxu0 nxu0Var = (nxu0) obj;
        return wj50.m88271j(this.f159619a, nxu0Var.f159619a) && wj50.m88271j(this.f159620b, nxu0Var.f159620b);
    }

    public final int hashCode() {
        return this.f159620b.hashCode() + (this.f159619a.hashCode() * 31);
    }
}

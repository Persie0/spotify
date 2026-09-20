package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dcd1 {

    /* JADX INFO: renamed from: a */
    public final vwf f47504a;

    /* JADX INFO: renamed from: b */
    public final boolean f47505b;

    public dcd1(vwf vwfVar, boolean z) {
        this.f47504a = vwfVar;
        this.f47505b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcd1)) {
            return false;
        }
        dcd1 dcd1Var = (dcd1) obj;
        return wj50.m88271j(this.f47504a, dcd1Var.f47504a) && this.f47505b == dcd1Var.f47505b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f47505b) + (this.f47504a.hashCode() * 31);
    }
}

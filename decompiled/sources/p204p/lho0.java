package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lho0 {

    /* JADX INFO: renamed from: a */
    public final String f133610a;

    /* JADX INFO: renamed from: b */
    public final int f133611b;

    public lho0(String str, int i) {
        this.f133610a = str;
        this.f133611b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lho0)) {
            return false;
        }
        lho0 lho0Var = (lho0) obj;
        return wj50.m88271j(this.f133610a, lho0Var.f133610a) && this.f133611b == lho0Var.f133611b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133611b) + (this.f133610a.hashCode() * 31);
    }
}

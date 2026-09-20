package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xhv {

    /* JADX INFO: renamed from: a */
    public final whv f261712a;

    /* JADX INFO: renamed from: b */
    public final boolean f261713b;

    public xhv(whv whvVar, boolean z) {
        this.f261712a = whvVar;
        this.f261713b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhv)) {
            return false;
        }
        xhv xhvVar = (xhv) obj;
        return wj50.m88271j(this.f261712a, xhvVar.f261712a) && this.f261713b == xhvVar.f261713b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261713b) + (this.f261712a.hashCode() * 31);
    }
}

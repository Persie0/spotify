package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tse0 {

    /* JADX INFO: renamed from: a */
    public final rse0 f223291a;

    /* JADX INFO: renamed from: b */
    public final boolean f223292b;

    public tse0(rse0 rse0Var, boolean z) {
        this.f223291a = rse0Var;
        this.f223292b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81413a() {
        return this.f223292b;
    }

    /* JADX INFO: renamed from: b */
    public final rse0 m81414b() {
        return this.f223291a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tse0)) {
            return false;
        }
        tse0 tse0Var = (tse0) obj;
        return wj50.m88271j(this.f223291a, tse0Var.f223291a) && this.f223292b == tse0Var.f223292b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223292b) + (this.f223291a.hashCode() * 31);
    }
}

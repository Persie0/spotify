package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zbl0 {

    /* JADX INFO: renamed from: a */
    public final nbl0 f281345a;

    /* JADX INFO: renamed from: b */
    public final boolean f281346b;

    public zbl0(nbl0 nbl0Var, boolean z) {
        this.f281345a = nbl0Var;
        this.f281346b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbl0)) {
            return false;
        }
        zbl0 zbl0Var = (zbl0) obj;
        return wj50.m88271j(this.f281345a, zbl0Var.f281345a) && this.f281346b == zbl0Var.f281346b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281346b) + (this.f281345a.hashCode() * 31);
    }
}

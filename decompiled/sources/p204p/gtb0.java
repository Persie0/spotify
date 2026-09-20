package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gtb0 implements itb0 {

    /* JADX INFO: renamed from: a */
    public final String f84123a;

    /* JADX INFO: renamed from: b */
    public final boolean f84124b;

    public gtb0(String str, boolean z) {
        this.f84123a = str;
        this.f84124b = z;
    }

    @Override // p204p.itb0
    /* JADX INFO: renamed from: a */
    public final boolean mo45686a() {
        return this.f84124b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtb0)) {
            return false;
        }
        gtb0 gtb0Var = (gtb0) obj;
        return wj50.m88271j(this.f84123a, gtb0Var.f84123a) && this.f84124b == gtb0Var.f84124b;
    }

    @Override // p204p.itb0
    public final String getEntityUri() {
        return this.f84123a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84124b) + (this.f84123a.hashCode() * 31);
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kfl0 extends mfl0 {

    /* JADX INFO: renamed from: a */
    public final String f122182a;

    /* JADX INFO: renamed from: b */
    public final boolean f122183b;

    public kfl0(String str, boolean z) {
        this.f122182a = str;
        this.f122183b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfl0)) {
            return false;
        }
        kfl0 kfl0Var = (kfl0) obj;
        return wj50.m88271j(this.f122182a, kfl0Var.f122182a) && this.f122183b == kfl0Var.f122183b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122183b) + (this.f122182a.hashCode() * 31);
    }
}

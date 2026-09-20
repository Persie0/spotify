package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p6n0 {

    /* JADX INFO: renamed from: a */
    public final String f174442a;

    /* JADX INFO: renamed from: b */
    public final knd f174443b;

    public p6n0(String str, knd kndVar) {
        this.f174442a = str;
        this.f174443b = kndVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6n0)) {
            return false;
        }
        p6n0 p6n0Var = (p6n0) obj;
        return wj50.m88271j(this.f174442a, p6n0Var.f174442a) && this.f174443b == p6n0Var.f174443b;
    }

    public final int hashCode() {
        String str = this.f174442a;
        return this.f174443b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

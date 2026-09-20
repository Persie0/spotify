package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xsb1 {

    /* JADX INFO: renamed from: a */
    public final String f265557a;

    /* JADX INFO: renamed from: b */
    public final boolean f265558b;

    public xsb1(String str, boolean z) {
        this.f265557a = str;
        this.f265558b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsb1)) {
            return false;
        }
        xsb1 xsb1Var = (xsb1) obj;
        return wj50.m88271j(this.f265557a, xsb1Var.f265557a) && this.f265558b == xsb1Var.f265558b;
    }

    public final int hashCode() {
        String str = this.f265557a;
        return Boolean.hashCode(this.f265558b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

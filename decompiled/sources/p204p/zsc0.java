package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zsc0 {

    /* JADX INFO: renamed from: a */
    public final String f285917a;

    /* JADX INFO: renamed from: b */
    public final boolean f285918b;

    public zsc0(String str, boolean z) {
        this.f285917a = str;
        this.f285918b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsc0)) {
            return false;
        }
        zsc0 zsc0Var = (zsc0) obj;
        return wj50.m88271j(this.f285917a, zsc0Var.f285917a) && this.f285918b == zsc0Var.f285918b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285918b) + (this.f285917a.hashCode() * 31);
    }
}

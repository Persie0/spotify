package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ain0 {

    /* JADX INFO: renamed from: a */
    public final String f16061a;

    /* JADX INFO: renamed from: b */
    public final int f16062b;

    public ain0(String str, int i) {
        this.f16061a = str;
        this.f16062b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ain0)) {
            return false;
        }
        ain0 ain0Var = (ain0) obj;
        return wj50.m88271j(this.f16061a, ain0Var.f16061a) && this.f16062b == ain0Var.f16062b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16062b) + (this.f16061a.hashCode() * 31);
    }
}

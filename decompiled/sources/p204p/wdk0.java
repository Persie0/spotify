package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wdk0 {

    /* JADX INFO: renamed from: a */
    public final String f250301a;

    /* JADX INFO: renamed from: b */
    public final er70 f250302b;

    /* JADX INFO: renamed from: c */
    public final boolean f250303c;

    public wdk0(String str, er70 er70Var, boolean z) {
        this.f250301a = str;
        this.f250302b = er70Var;
        this.f250303c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdk0)) {
            return false;
        }
        wdk0 wdk0Var = (wdk0) obj;
        return wj50.m88271j(this.f250301a, wdk0Var.f250301a) && wj50.m88271j(this.f250302b, wdk0Var.f250302b) && this.f250303c == wdk0Var.f250303c;
    }

    public final int hashCode() {
        int iHashCode = this.f250301a.hashCode() * 31;
        er70 er70Var = this.f250302b;
        return Boolean.hashCode(this.f250303c) + ((iHashCode + (er70Var == null ? 0 : er70Var.hashCode())) * 31);
    }
}

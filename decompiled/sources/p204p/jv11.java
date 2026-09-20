package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jv11 {

    /* JADX INFO: renamed from: a */
    public final iv11 f116224a;

    /* JADX INFO: renamed from: b */
    public final boolean f116225b;

    /* JADX INFO: renamed from: c */
    public final boolean f116226c;

    public jv11(iv11 iv11Var, boolean z, boolean z2) {
        this.f116224a = iv11Var;
        this.f116225b = z;
        this.f116226c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv11)) {
            return false;
        }
        jv11 jv11Var = (jv11) obj;
        return this.f116224a == jv11Var.f116224a && this.f116225b == jv11Var.f116225b && this.f116226c == jv11Var.f116226c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116226c) + s571.m77245d(this.f116224a.hashCode() * 31, 31, this.f116225b);
    }
}

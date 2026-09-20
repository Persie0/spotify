package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jmo0 implements lmo0 {

    /* JADX INFO: renamed from: a */
    public final String f113918a;

    /* JADX INFO: renamed from: b */
    public final boolean f113919b;

    public jmo0(String str, boolean z) {
        this.f113918a = str;
        this.f113919b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmo0)) {
            return false;
        }
        jmo0 jmo0Var = (jmo0) obj;
        return wj50.m88271j(this.f113918a, jmo0Var.f113918a) && this.f113919b == jmo0Var.f113919b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113919b) + (this.f113918a.hashCode() * 961);
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gv11 {

    /* JADX INFO: renamed from: a */
    public final qli0 f84591a;

    /* JADX INFO: renamed from: b */
    public final boolean f84592b;

    /* JADX INFO: renamed from: c */
    public final boolean f84593c;

    public gv11(qli0 qli0Var, boolean z, boolean z2) {
        this.f84591a = qli0Var;
        this.f84592b = z;
        this.f84593c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv11)) {
            return false;
        }
        gv11 gv11Var = (gv11) obj;
        return this.f84591a == gv11Var.f84591a && this.f84592b == gv11Var.f84592b && this.f84593c == gv11Var.f84593c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84593c) + s571.m77245d(this.f84591a.hashCode() * 31, 31, this.f84592b);
    }
}

package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final boolean f106365a;

    /* JADX INFO: renamed from: b */
    public final String f106366b;

    /* JADX INFO: renamed from: c */
    public final d850 f106367c;

    public iw90(String str, d850 d850Var, boolean z) {
        this.f106365a = z;
        this.f106366b = str;
        this.f106367c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw90)) {
            return false;
        }
        iw90 iw90Var = (iw90) obj;
        return this.f106365a == iw90Var.f106365a && wj50.m88271j(this.f106366b, iw90Var.f106366b) && wj50.m88271j(this.f106367c, iw90Var.f106367c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f106365a) * 31, 31, this.f106366b);
        d850 d850Var = this.f106367c;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}

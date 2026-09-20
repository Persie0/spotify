package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rf91 {

    /* JADX INFO: renamed from: a */
    public final boolean f198554a;

    /* JADX INFO: renamed from: b */
    public final ov50 f198555b;

    /* JADX INFO: renamed from: c */
    public final nst0 f198556c;

    public rf91(boolean z, ov50 ov50Var, nst0 nst0Var) {
        this.f198554a = z;
        this.f198555b = ov50Var;
        this.f198556c = nst0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf91)) {
            return false;
        }
        rf91 rf91Var = (rf91) obj;
        return this.f198554a == rf91Var.f198554a && this.f198555b.equals(rf91Var.f198555b) && this.f198556c.equals(rf91Var.f198556c);
    }

    public final int hashCode() {
        return this.f198556c.hashCode() + ((this.f198555b.hashCode() + s571.m77245d(Boolean.hashCode(this.f198554a) * 31, 31, true)) * 31);
    }
}

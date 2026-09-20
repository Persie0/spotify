package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sow0 {

    /* JADX INFO: renamed from: a */
    public final boolean f212661a;

    /* JADX INFO: renamed from: b */
    public final boolean f212662b;

    /* JADX INFO: renamed from: c */
    public final row0 f212663c;

    public sow0(boolean z, boolean z2, row0 row0Var) {
        this.f212661a = z;
        this.f212662b = z2;
        this.f212663c = row0Var;
    }

    /* JADX INFO: renamed from: a */
    public static sow0 m78842a(sow0 sow0Var, boolean z, boolean z2, row0 row0Var, int i) {
        if ((i & 1) != 0) {
            z = sow0Var.f212661a;
        }
        if ((i & 2) != 0) {
            z2 = sow0Var.f212662b;
        }
        if ((i & 4) != 0) {
            row0Var = sow0Var.f212663c;
        }
        sow0Var.getClass();
        return new sow0(z, z2, row0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sow0)) {
            return false;
        }
        sow0 sow0Var = (sow0) obj;
        return this.f212661a == sow0Var.f212661a && this.f212662b == sow0Var.f212662b && wj50.m88271j(this.f212663c, sow0Var.f212663c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f212661a) * 31, 31, this.f212662b);
        row0 row0Var = this.f212663c;
        return iM77245d + (row0Var == null ? 0 : row0Var.hashCode());
    }
}

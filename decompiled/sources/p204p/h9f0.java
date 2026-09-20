package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h9f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f88929a;

    /* JADX INFO: renamed from: b */
    public final ci20 f88930b;

    /* JADX INFO: renamed from: c */
    public final boolean f88931c;

    /* JADX INFO: renamed from: d */
    public final daq0 f88932d;

    /* JADX INFO: renamed from: e */
    public final boolean f88933e;

    /* JADX INFO: renamed from: f */
    public final boolean f88934f;

    public h9f0(boolean z, ci20 ci20Var, boolean z2, daq0 daq0Var, boolean z3, boolean z4) {
        this.f88929a = z;
        this.f88930b = ci20Var;
        this.f88931c = z2;
        this.f88932d = daq0Var;
        this.f88933e = z3;
        this.f88934f = z4;
    }

    /* JADX INFO: renamed from: a */
    public static h9f0 m46868a(h9f0 h9f0Var, boolean z, ci20 ci20Var, boolean z2, daq0 daq0Var, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = h9f0Var.f88929a;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            ci20Var = h9f0Var.f88930b;
        }
        ci20 ci20Var2 = ci20Var;
        if ((i & 8) != 0) {
            z2 = h9f0Var.f88931c;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            daq0Var = h9f0Var.f88932d;
        }
        daq0 daq0Var2 = daq0Var;
        if ((i & 32) != 0) {
            z3 = h9f0Var.f88933e;
        }
        boolean z7 = z3;
        if ((i & 64) != 0) {
            z4 = h9f0Var.f88934f;
        }
        return new h9f0(z5, ci20Var2, z6, daq0Var2, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9f0)) {
            return false;
        }
        h9f0 h9f0Var = (h9f0) obj;
        return this.f88929a == h9f0Var.f88929a && wj50.m88271j(this.f88930b, h9f0Var.f88930b) && this.f88931c == h9f0Var.f88931c && wj50.m88271j(this.f88932d, h9f0Var.f88932d) && this.f88933e == h9f0Var.f88933e && this.f88934f == h9f0Var.f88934f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f88930b.hashCode() + (Boolean.hashCode(this.f88929a) * 961)) * 31, 31, this.f88931c);
        daq0 daq0Var = this.f88932d;
        return Boolean.hashCode(this.f88934f) + s571.m77245d((iM77245d + (daq0Var == null ? 0 : daq0Var.hashCode())) * 31, 31, this.f88933e);
    }
}

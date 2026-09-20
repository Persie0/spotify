package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eg5 {

    /* JADX INFO: renamed from: a */
    public final String f59218a;

    /* JADX INFO: renamed from: b */
    public final boolean f59219b;

    /* JADX INFO: renamed from: c */
    public final rf5 f59220c;

    /* JADX INFO: renamed from: d */
    public final boolean f59221d;

    /* JADX INFO: renamed from: e */
    public final boolean f59222e;

    public eg5(String str, boolean z, rf5 rf5Var, boolean z2, boolean z3) {
        this.f59218a = str;
        this.f59219b = z;
        this.f59220c = rf5Var;
        this.f59221d = z2;
        this.f59222e = z3;
    }

    /* JADX INFO: renamed from: a */
    public static eg5 m38772a(eg5 eg5Var, String str, boolean z, rf5 rf5Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = eg5Var.f59218a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = eg5Var.f59219b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            rf5Var = eg5Var.f59220c;
        }
        rf5 rf5Var2 = rf5Var;
        boolean z4 = (i & 8) != 0 ? eg5Var.f59221d : true;
        if ((i & 16) != 0) {
            z2 = eg5Var.f59222e;
        }
        eg5Var.getClass();
        return new eg5(str2, z3, rf5Var2, z4, z2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38773b() {
        return this.f59218a.length() == 4 && !this.f59219b && this.f59222e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg5)) {
            return false;
        }
        eg5 eg5Var = (eg5) obj;
        return wj50.m88271j(this.f59218a, eg5Var.f59218a) && this.f59219b == eg5Var.f59219b && this.f59220c == eg5Var.f59220c && this.f59221d == eg5Var.f59221d && this.f59222e == eg5Var.f59222e;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f59218a.hashCode() * 31, 31, this.f59219b);
        rf5 rf5Var = this.f59220c;
        return Boolean.hashCode(this.f59222e) + s571.m77245d((iM77245d + (rf5Var == null ? 0 : rf5Var.hashCode())) * 31, 31, this.f59221d);
    }
}

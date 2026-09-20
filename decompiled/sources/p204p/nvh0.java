package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nvh0 {

    /* JADX INFO: renamed from: a */
    public final xhf1 f158907a;

    /* JADX INFO: renamed from: b */
    public final boolean f158908b;

    /* JADX INFO: renamed from: c */
    public final String f158909c;

    public nvh0(xhf1 xhf1Var, boolean z, String str) {
        this.f158907a = xhf1Var;
        this.f158908b = z;
        this.f158909c = str;
    }

    /* JADX INFO: renamed from: a */
    public static nvh0 m65744a(nvh0 nvh0Var, xhf1 xhf1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            xhf1Var = nvh0Var.f158907a;
        }
        if ((i & 2) != 0) {
            z = nvh0Var.f158908b;
        }
        String str = nvh0Var.f158909c;
        nvh0Var.getClass();
        return new nvh0(xhf1Var, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvh0)) {
            return false;
        }
        nvh0 nvh0Var = (nvh0) obj;
        return wj50.m88271j(this.f158907a, nvh0Var.f158907a) && this.f158908b == nvh0Var.f158908b && wj50.m88271j(this.f158909c, nvh0Var.f158909c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f158907a.hashCode() * 31, 31, this.f158908b);
        String str = this.f158909c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}

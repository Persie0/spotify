package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t0x0 {

    /* JADX INFO: renamed from: a */
    public final String f216020a;

    /* JADX INFO: renamed from: b */
    public final boolean f216021b;

    /* JADX INFO: renamed from: c */
    public final String f216022c;

    /* JADX INFO: renamed from: d */
    public final boolean f216023d;

    public t0x0(String str, boolean z, String str2, boolean z2) {
        this.f216020a = str;
        this.f216021b = z;
        this.f216022c = str2;
        this.f216023d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static t0x0 m79851a(t0x0 t0x0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = t0x0Var.f216020a;
        }
        boolean z = (i & 2) != 0 ? t0x0Var.f216021b : true;
        if ((i & 4) != 0) {
            str2 = t0x0Var.f216022c;
        }
        boolean z2 = (i & 8) != 0 ? t0x0Var.f216023d : true;
        t0x0Var.getClass();
        return new t0x0(str, z, str2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0x0)) {
            return false;
        }
        t0x0 t0x0Var = (t0x0) obj;
        return wj50.m88271j(this.f216020a, t0x0Var.f216020a) && this.f216021b == t0x0Var.f216021b && wj50.m88271j(this.f216022c, t0x0Var.f216022c) && this.f216023d == t0x0Var.f216023d;
    }

    public final int hashCode() {
        String str = this.f216020a;
        int iM77245d = s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f216021b);
        String str2 = this.f216022c;
        return Boolean.hashCode(this.f216023d) + ((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

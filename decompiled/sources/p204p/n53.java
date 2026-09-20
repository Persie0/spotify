package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n53 {

    /* JADX INFO: renamed from: a */
    public final String f150463a;

    /* JADX INFO: renamed from: b */
    public final String f150464b;

    /* JADX INFO: renamed from: c */
    public final h66 f150465c;

    /* JADX INFO: renamed from: d */
    public final String f150466d;

    /* JADX INFO: renamed from: e */
    public final boolean f150467e;

    public n53(String str, String str2, h66 h66Var, String str3, boolean z) {
        this.f150463a = str;
        this.f150464b = str2;
        this.f150465c = h66Var;
        this.f150466d = str3;
        this.f150467e = z;
    }

    /* JADX INFO: renamed from: a */
    public static n53 m63701a(n53 n53Var, boolean z) {
        String str = n53Var.f150463a;
        String str2 = n53Var.f150464b;
        h66 h66Var = n53Var.f150465c;
        String str3 = n53Var.f150466d;
        n53Var.getClass();
        n53Var.getClass();
        n53Var.getClass();
        return new n53(str, str2, h66Var, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n53)) {
            return false;
        }
        n53 n53Var = (n53) obj;
        return this.f150463a.equals(n53Var.f150463a) && this.f150464b.equals(n53Var.f150464b) && this.f150465c.equals(n53Var.f150465c) && this.f150466d.equals(n53Var.f150466d) && this.f150467e == n53Var.f150467e;
    }

    public final int hashCode() {
        return s571.m77245d(s571.m77245d(s571.m77243b((this.f150465c.hashCode() + s571.m77243b(this.f150463a.hashCode() * 31, 31, this.f150464b)) * 31, 31, this.f150466d), 31, true), 31, this.f150467e);
    }
}

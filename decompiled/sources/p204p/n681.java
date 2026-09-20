package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n681 {

    /* JADX INFO: renamed from: a */
    public final String f150749a;

    /* JADX INFO: renamed from: b */
    public final String f150750b;

    /* JADX INFO: renamed from: c */
    public final xuo0 f150751c;

    /* JADX INFO: renamed from: d */
    public final String f150752d;

    /* JADX INFO: renamed from: e */
    public final n6f f150753e;

    /* JADX INFO: renamed from: f */
    public final String f150754f;

    public /* synthetic */ n681(String str, String str2, String str3, String str4) {
        this(str, str2, null, str3, null, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n681)) {
            return false;
        }
        n681 n681Var = (n681) obj;
        return wj50.m88271j(this.f150749a, n681Var.f150749a) && wj50.m88271j(this.f150750b, n681Var.f150750b) && wj50.m88271j(this.f150751c, n681Var.f150751c) && wj50.m88271j(this.f150752d, n681Var.f150752d) && wj50.m88271j(this.f150753e, n681Var.f150753e) && wj50.m88271j(this.f150754f, n681Var.f150754f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f150749a.hashCode() * 31, 31, this.f150750b);
        xuo0 xuo0Var = this.f150751c;
        int iM77243b2 = s571.m77243b((iM77243b + (xuo0Var == null ? 0 : xuo0Var.hashCode())) * 31, 31, this.f150752d);
        n6f n6fVar = this.f150753e;
        int iHashCode = (iM77243b2 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        String str = this.f150754f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public n681(String str, String str2, xuo0 xuo0Var, String str3, n6f n6fVar, String str4) {
        this.f150749a = str;
        this.f150750b = str2;
        this.f150751c = xuo0Var;
        this.f150752d = str3;
        this.f150753e = n6fVar;
        this.f150754f = str4;
    }
}

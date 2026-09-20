package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z3q implements b4q {

    /* JADX INFO: renamed from: a */
    public final String f279005a;

    /* JADX INFO: renamed from: b */
    public final boolean f279006b;

    /* JADX INFO: renamed from: c */
    public final String f279007c;

    /* JADX INFO: renamed from: d */
    public final String f279008d;

    /* JADX INFO: renamed from: e */
    public final w3q f279009e;

    public z3q(String str, boolean z, String str2, String str3, w3q w3qVar) {
        this.f279005a = str;
        this.f279006b = z;
        this.f279007c = str2;
        this.f279008d = str3;
        this.f279009e = w3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3q)) {
            return false;
        }
        z3q z3qVar = (z3q) obj;
        return wj50.m88271j(this.f279005a, z3qVar.f279005a) && this.f279006b == z3qVar.f279006b && wj50.m88271j(this.f279007c, z3qVar.f279007c) && wj50.m88271j(this.f279008d, z3qVar.f279008d) && wj50.m88271j(this.f279009e, z3qVar.f279009e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(this.f279005a.hashCode() * 31, 31, this.f279006b), 31, this.f279007c);
        String str = this.f279008d;
        return this.f279009e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}

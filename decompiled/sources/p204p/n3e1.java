package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n3e1 {

    /* JADX INFO: renamed from: a */
    public final int f150042a;

    /* JADX INFO: renamed from: b */
    public final String f150043b;

    /* JADX INFO: renamed from: c */
    public final String f150044c;

    public n3e1(int i, String str, String str2) {
        this.f150042a = i;
        this.f150043b = str;
        this.f150044c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3e1)) {
            return false;
        }
        n3e1 n3e1Var = (n3e1) obj;
        return this.f150042a == n3e1Var.f150042a && this.f150043b.equals(n3e1Var.f150043b) && this.f150044c.equals(n3e1Var.f150044c);
    }

    public final int hashCode() {
        return this.f150044c.hashCode() + s571.m77243b(edb.m38547C(this.f150042a) * 31, 31, this.f150043b);
    }
}

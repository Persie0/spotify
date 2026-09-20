package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final String f150329a;

    /* JADX INFO: renamed from: b */
    public final String f150330b;

    public n4e1(String str, String str2) {
        this.f150329a = str;
        this.f150330b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4e1)) {
            return false;
        }
        n4e1 n4e1Var = (n4e1) obj;
        return wj50.m88271j(this.f150329a, n4e1Var.f150329a) && wj50.m88271j(this.f150330b, n4e1Var.f150330b);
    }

    public final int hashCode() {
        return this.f150330b.hashCode() + (this.f150329a.hashCode() * 31);
    }
}

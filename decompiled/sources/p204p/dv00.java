package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dv00 implements mv00 {

    /* JADX INFO: renamed from: a */
    public final String f53329a;

    /* JADX INFO: renamed from: b */
    public final String f53330b;

    public dv00(String str, String str2) {
        this.f53329a = str;
        this.f53330b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv00)) {
            return false;
        }
        dv00 dv00Var = (dv00) obj;
        return wj50.m88271j(this.f53329a, dv00Var.f53329a) && wj50.m88271j(this.f53330b, dv00Var.f53330b);
    }

    public final int hashCode() {
        return this.f53330b.hashCode() + (this.f53329a.hashCode() * 31);
    }
}

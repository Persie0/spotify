package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class j3c1 extends l3c1 {

    /* JADX INFO: renamed from: a */
    public final int f108356a;

    /* JADX INFO: renamed from: b */
    public final String f108357b;

    /* JADX INFO: renamed from: c */
    public final String f108358c;

    public j3c1(int i, String str, String str2) {
        this.f108356a = i;
        this.f108357b = str;
        this.f108358c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3c1)) {
            return false;
        }
        j3c1 j3c1Var = (j3c1) obj;
        return this.f108356a == j3c1Var.f108356a && wj50.m88271j(this.f108357b, j3c1Var.f108357b) && wj50.m88271j(this.f108358c, j3c1Var.f108358c);
    }

    public final int hashCode() {
        return this.f108358c.hashCode() + s571.m77243b(Integer.hashCode(this.f108356a) * 31, 31, this.f108357b);
    }
}

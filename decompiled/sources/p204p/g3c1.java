package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class g3c1 extends l3c1 {

    /* JADX INFO: renamed from: a */
    public final int f76175a;

    /* JADX INFO: renamed from: b */
    public final String f76176b;

    /* JADX INFO: renamed from: c */
    public final String f76177c;

    /* JADX INFO: renamed from: d */
    public final psj f76178d;

    public g3c1(int i, String str, String str2, psj psjVar) {
        this.f76175a = i;
        this.f76176b = str;
        this.f76177c = str2;
        this.f76178d = psjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3c1)) {
            return false;
        }
        g3c1 g3c1Var = (g3c1) obj;
        return this.f76175a == g3c1Var.f76175a && wj50.m88271j(this.f76176b, g3c1Var.f76176b) && wj50.m88271j(this.f76177c, g3c1Var.f76177c) && this.f76178d == g3c1Var.f76178d;
    }

    public final int hashCode() {
        return this.f76178d.hashCode() + s571.m77243b(s571.m77243b(Integer.hashCode(this.f76175a) * 31, 31, this.f76176b), 31, this.f76177c);
    }
}

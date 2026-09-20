package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a070 {

    /* JADX INFO: renamed from: a */
    public final Float f11003a;

    /* JADX INFO: renamed from: b */
    public bqs f11004b;

    public a070(Float f, bqs bqsVar) {
        this.f11003a = f;
        this.f11004b = bqsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a070)) {
            return false;
        }
        a070 a070Var = (a070) obj;
        return a070Var.f11003a.equals(this.f11003a) && wj50.m88271j(a070Var.f11004b, this.f11004b);
    }

    public final int hashCode() {
        return this.f11004b.hashCode() + mt60.m62800g(0, this.f11003a.hashCode() * 31, 31);
    }
}

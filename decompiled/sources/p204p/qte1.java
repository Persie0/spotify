package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qte1 implements vte1 {

    /* JADX INFO: renamed from: a */
    public final int f192370a;

    /* JADX INFO: renamed from: b */
    public final String f192371b;

    public qte1(int i, String str) {
        this.f192370a = i;
        this.f192371b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qte1)) {
            return false;
        }
        qte1 qte1Var = (qte1) obj;
        return this.f192370a == qte1Var.f192370a && wj50.m88271j(this.f192371b, qte1Var.f192371b);
    }

    public final int hashCode() {
        return this.f192371b.hashCode() + (Integer.hashCode(this.f192370a) * 31);
    }
}

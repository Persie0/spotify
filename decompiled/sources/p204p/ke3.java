package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ke3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final d850 f121782a;

    /* JADX INFO: renamed from: b */
    public final String f121783b;

    public ke3(String str, d850 d850Var) {
        this.f121782a = d850Var;
        this.f121783b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke3)) {
            return false;
        }
        ke3 ke3Var = (ke3) obj;
        return wj50.m88271j(this.f121782a, ke3Var.f121782a) && wj50.m88271j(this.f121783b, ke3Var.f121783b);
    }

    public final int hashCode() {
        return this.f121783b.hashCode() + (this.f121782a.hashCode() * 31);
    }
}

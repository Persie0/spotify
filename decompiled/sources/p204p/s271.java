package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s271 implements u271 {

    /* JADX INFO: renamed from: a */
    public final z271 f204922a;

    /* JADX INFO: renamed from: b */
    public final ume f204923b;

    public s271(z271 z271Var, ume umeVar) {
        this.f204922a = z271Var;
        this.f204923b = umeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s271)) {
            return false;
        }
        s271 s271Var = (s271) obj;
        return wj50.m88271j(this.f204922a, s271Var.f204922a) && wj50.m88271j(this.f204923b, s271Var.f204923b);
    }

    public final int hashCode() {
        int iHashCode = this.f204922a.hashCode() * 31;
        ume umeVar = this.f204923b;
        return iHashCode + (umeVar == null ? 0 : umeVar.hashCode());
    }
}

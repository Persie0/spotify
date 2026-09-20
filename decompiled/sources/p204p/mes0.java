package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f142835a;

    /* JADX INFO: renamed from: b */
    public final d850 f142836b;

    public mes0(String str, d850 d850Var) {
        this.f142835a = str;
        this.f142836b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mes0)) {
            return false;
        }
        mes0 mes0Var = (mes0) obj;
        return wj50.m88271j(this.f142835a, mes0Var.f142835a) && wj50.m88271j(this.f142836b, mes0Var.f142836b);
    }

    public final int hashCode() {
        int iHashCode = this.f142835a.hashCode() * 31;
        d850 d850Var = this.f142836b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}

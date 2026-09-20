package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class amf implements bmf {

    /* JADX INFO: renamed from: a */
    public final qdz0 f17129a;

    /* JADX INFO: renamed from: b */
    public final d850 f17130b;

    public amf(qdz0 qdz0Var, d850 d850Var) {
        this.f17129a = qdz0Var;
        this.f17130b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amf)) {
            return false;
        }
        amf amfVar = (amf) obj;
        return wj50.m88271j(this.f17129a, amfVar.f17129a) && wj50.m88271j(this.f17130b, amfVar.f17130b);
    }

    public final int hashCode() {
        int iHashCode = this.f17129a.hashCode() * 31;
        d850 d850Var = this.f17130b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}

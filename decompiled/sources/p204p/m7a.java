package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m7a {

    /* JADX INFO: renamed from: a */
    public final ee7 f140748a;

    /* JADX INFO: renamed from: b */
    public final v140 f140749b;

    public m7a(ee7 ee7Var, v140 v140Var) {
        this.f140748a = ee7Var;
        this.f140749b = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7a)) {
            return false;
        }
        m7a m7aVar = (m7a) obj;
        return wj50.m88271j(this.f140748a, m7aVar.f140748a) && wj50.m88271j(this.f140749b, m7aVar.f140749b);
    }

    public final int hashCode() {
        ee7 ee7Var = this.f140748a;
        int iHashCode = (ee7Var == null ? 0 : ee7Var.hashCode()) * 31;
        v140 v140Var = this.f140749b;
        return iHashCode + (v140Var != null ? v140Var.hashCode() : 0);
    }
}

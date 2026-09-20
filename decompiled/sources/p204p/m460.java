package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m460 {

    /* JADX INFO: renamed from: a */
    public final hx50 f139850a;

    /* JADX INFO: renamed from: b */
    public final g0j f139851b;

    /* JADX INFO: renamed from: c */
    public final q5d0 f139852c;

    /* JADX INFO: renamed from: d */
    public final int f139853d;

    public m460(hx50 hx50Var, g0j g0jVar, q5d0 q5d0Var, int i) {
        this.f139850a = hx50Var;
        this.f139851b = g0jVar;
        this.f139852c = q5d0Var;
        this.f139853d = i;
    }

    /* JADX INFO: renamed from: a */
    public static m460 m60763a(m460 m460Var, hx50 hx50Var, g0j g0jVar, q5d0 q5d0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            hx50Var = m460Var.f139850a;
        }
        if ((i2 & 2) != 0) {
            g0jVar = m460Var.f139851b;
        }
        if ((i2 & 4) != 0) {
            q5d0Var = m460Var.f139852c;
        }
        if ((i2 & 8) != 0) {
            i = m460Var.f139853d;
        }
        m460Var.getClass();
        return new m460(hx50Var, g0jVar, q5d0Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m460)) {
            return false;
        }
        m460 m460Var = (m460) obj;
        return wj50.m88271j(this.f139850a, m460Var.f139850a) && this.f139851b == m460Var.f139851b && wj50.m88271j(this.f139852c, m460Var.f139852c) && this.f139853d == m460Var.f139853d;
    }

    public final int hashCode() {
        hx50 hx50Var = this.f139850a;
        int iHashCode = (this.f139851b.hashCode() + ((hx50Var == null ? 0 : hx50Var.hashCode()) * 31)) * 31;
        q5d0 q5d0Var = this.f139852c;
        int iHashCode2 = (iHashCode + (q5d0Var == null ? 0 : q5d0Var.f185506a.hashCode())) * 31;
        int i = this.f139853d;
        return iHashCode2 + (i != 0 ? edb.m38547C(i) : 0);
    }
}

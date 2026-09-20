package p204p;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class kwt0 {
    public static final jwt0 Companion = new jwt0();

    /* JADX INFO: renamed from: a */
    public final juw0 f127237a;

    /* JADX INFO: renamed from: b */
    public final zbv0 f127238b;

    public /* synthetic */ kwt0(int i, juw0 juw0Var, zbv0 zbv0Var) {
        if ((i & 1) == 0) {
            this.f127237a = null;
        } else {
            this.f127237a = juw0Var;
        }
        if ((i & 2) == 0) {
            this.f127238b = null;
        } else {
            this.f127238b = zbv0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwt0)) {
            return false;
        }
        kwt0 kwt0Var = (kwt0) obj;
        return wj50.m88271j(this.f127237a, kwt0Var.f127237a) && wj50.m88271j(this.f127238b, kwt0Var.f127238b);
    }

    public final int hashCode() {
        juw0 juw0Var = this.f127237a;
        int iHashCode = (juw0Var == null ? 0 : juw0Var.hashCode()) * 31;
        zbv0 zbv0Var = this.f127238b;
        return iHashCode + (zbv0Var != null ? zbv0Var.hashCode() : 0);
    }

    public kwt0(juw0 juw0Var, zbv0 zbv0Var) {
        this.f127237a = juw0Var;
        this.f127238b = zbv0Var;
    }
}

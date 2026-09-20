package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hfo implements ifo {

    /* JADX INFO: renamed from: a */
    public final k35 f90763a;

    /* JADX INFO: renamed from: b */
    public final Object f90764b;

    public hfo(k35 k35Var, Object obj) {
        this.f90763a = k35Var;
        this.f90764b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfo)) {
            return false;
        }
        hfo hfoVar = (hfo) obj;
        return wj50.m88271j(this.f90763a, hfoVar.f90763a) && wj50.m88271j(this.f90764b, hfoVar.f90764b);
    }

    @Override // p204p.ifo
    public final String getMessage() {
        return "Unexpected value for " + this.f90763a + ": " + this.f90764b;
    }

    public final int hashCode() {
        int i = this.f90763a.f118764c * 31;
        Object obj = this.f90764b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        k35 k35Var = this.f90763a;
        tn61 tn61Var = k35Var.f118762a;
        Object obj = k35Var.f118763b;
        StringBuilder sb = new StringBuilder("UnexpectedValue(table=");
        sb.append(tn61Var);
        sb.append(", key=");
        sb.append(obj);
        sb.append(", value=");
        return edb.m38568q(sb, this.f90764b, ")");
    }
}

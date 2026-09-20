package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qxi0 {

    /* JADX INFO: renamed from: a */
    public final ozi0 f193681a;

    /* JADX INFO: renamed from: b */
    public final boolean f193682b;

    /* JADX INFO: renamed from: c */
    public final boolean f193683c;

    /* JADX INFO: renamed from: d */
    public final boolean f193684d;

    /* JADX INFO: renamed from: e */
    public final Object f193685e;

    public qxi0(ozi0 ozi0Var, boolean z, Object obj, boolean z2, boolean z3) {
        if (!ozi0Var.f172305a && z) {
            throw new IllegalArgumentException(ozi0Var.mo38908b().concat(" does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + ozi0Var.mo38908b() + " has null value but is not nullable.").toString());
        }
        this.f193681a = ozi0Var;
        this.f193682b = z;
        this.f193685e = obj;
        this.f193683c = z2 || z3;
        this.f193684d = z3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74143a() {
        return this.f193683c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74144b() {
        return this.f193682b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qxi0.class.equals(obj.getClass())) {
            qxi0 qxi0Var = (qxi0) obj;
            Object obj2 = qxi0Var.f193685e;
            if (this.f193682b != qxi0Var.f193682b || this.f193683c != qxi0Var.f193683c || !wj50.m88271j(this.f193681a, qxi0Var.f193681a)) {
                return false;
            }
            Object obj3 = this.f193685e;
            if (obj3 != null) {
                return wj50.m88271j(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f193681a.hashCode() * 31) + (this.f193682b ? 1 : 0)) * 31) + (this.f193683c ? 1 : 0)) * 31;
        Object obj = this.f193685e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qxi0.class.getSimpleName());
        sb.append(" Type: " + this.f193681a);
        sb.append(" Nullable: " + this.f193682b);
        if (this.f193683c) {
            sb.append(" DefaultValue: " + this.f193685e);
        }
        return sb.toString();
    }
}

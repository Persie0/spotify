package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pu60 {

    /* JADX INFO: renamed from: a */
    public final String f181373a;

    /* JADX INFO: renamed from: b */
    public final tn61 f181374b;

    /* JADX INFO: renamed from: c */
    public final qe70 f181375c;

    /* JADX WARN: Multi-variable type inference failed */
    public pu60(String str, tn61 tn61Var, gh00 gh00Var) {
        this.f181373a = str;
        this.f181374b = tn61Var;
        this.f181375c = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public final gh00 m71066a() {
        return this.f181375c;
    }

    /* JADX INFO: renamed from: b */
    public final tn61 m71067b() {
        return this.f181374b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu60)) {
            return false;
        }
        pu60 pu60Var = (pu60) obj;
        return wj50.m88271j(this.f181373a, pu60Var.f181373a) && wj50.m88271j(this.f181374b, pu60Var.f181374b);
    }

    public final int hashCode() {
        return this.f181374b.hashCode() + (this.f181373a.hashCode() * 31);
    }

    public final String toString() {
        return "Step(" + this.f181373a + ", " + this.f181374b + ")";
    }
}

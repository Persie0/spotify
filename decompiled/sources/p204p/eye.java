package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eye {

    /* JADX INFO: renamed from: a */
    public final v140 f64059a;

    /* JADX INFO: renamed from: b */
    public final qho f64060b;

    public eye(v140 v140Var, qho qhoVar) {
        this.f64059a = v140Var;
        this.f64060b = qhoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eye)) {
            return false;
        }
        eye eyeVar = (eye) obj;
        return wj50.m88271j(this.f64059a, eyeVar.f64059a) && wj50.m88271j(this.f64060b, eyeVar.f64060b);
    }

    public final int hashCode() {
        v140 v140Var = this.f64059a;
        return this.f64060b.hashCode() + ((v140Var == null ? 0 : v140Var.hashCode()) * 31);
    }
}

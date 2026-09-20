package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fgw implements ec40 {

    /* JADX INFO: renamed from: a */
    public final p340 f69410a;

    /* JADX INFO: renamed from: b */
    public final vb40 f69411b;

    /* JADX INFO: renamed from: c */
    public final Throwable f69412c;

    public fgw(p340 p340Var, vb40 vb40Var, Throwable th) {
        this.f69410a = p340Var;
        this.f69411b = vb40Var;
        this.f69412c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgw)) {
            return false;
        }
        fgw fgwVar = (fgw) obj;
        return wj50.m88271j(this.f69410a, fgwVar.f69410a) && wj50.m88271j(this.f69411b, fgwVar.f69411b) && wj50.m88271j(this.f69412c, fgwVar.f69412c);
    }

    @Override // p204p.ec40
    public final vb40 getRequest() {
        return this.f69411b;
    }

    public final int hashCode() {
        p340 p340Var = this.f69410a;
        return this.f69412c.hashCode() + ((this.f69411b.hashCode() + ((p340Var == null ? 0 : p340Var.hashCode()) * 31)) * 31);
    }

    @Override // p204p.ec40
    /* JADX INFO: renamed from: j */
    public final p340 mo38473j() {
        return this.f69410a;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f69410a + ", request=" + this.f69411b + ", throwable=" + this.f69412c + ')';
    }
}

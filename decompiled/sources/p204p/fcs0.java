package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fcs0 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f68253a;

    /* JADX INFO: renamed from: b */
    public final rq91 f68254b;

    /* JADX INFO: renamed from: c */
    public final jcs0 f68255c;

    public fcs0(String str, rq91 rq91Var, jcs0 jcs0Var) {
        this.f68253a = str;
        this.f68254b = rq91Var;
        this.f68255c = jcs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcs0)) {
            return false;
        }
        fcs0 fcs0Var = (fcs0) obj;
        return wj50.m88271j(this.f68253a, fcs0Var.f68253a) && this.f68254b.equals(fcs0Var.f68254b) && this.f68255c.equals(fcs0Var.f68255c);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f68253a;
    }

    public final int hashCode() {
        return this.f68255c.hashCode() + mt60.m62800g(this.f68254b.f201781b, this.f68253a.hashCode() * 31, 31);
    }
}

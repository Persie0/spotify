package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ccd1 {

    /* JADX INFO: renamed from: a */
    public final hb11 f36387a;

    /* JADX INFO: renamed from: b */
    public final hb11 f36388b;

    /* JADX INFO: renamed from: c */
    public final hb11 f36389c;

    /* JADX INFO: renamed from: d */
    public final hb11 f36390d;

    /* JADX INFO: renamed from: e */
    public final hb11 f36391e;

    public ccd1(hb11 hb11Var, hb11 hb11Var2, hb11 hb11Var3, hb11 hb11Var4, hb11 hb11Var5) {
        this.f36387a = hb11Var;
        this.f36388b = hb11Var2;
        this.f36389c = hb11Var3;
        this.f36390d = hb11Var4;
        this.f36391e = hb11Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccd1)) {
            return false;
        }
        ccd1 ccd1Var = (ccd1) obj;
        return this.f36387a.equals(ccd1Var.f36387a) && this.f36388b.equals(ccd1Var.f36388b) && this.f36389c.equals(ccd1Var.f36389c) && this.f36390d.equals(ccd1Var.f36390d) && this.f36391e.equals(ccd1Var.f36391e);
    }

    public final int hashCode() {
        return this.f36391e.hashCode() + ((this.f36390d.hashCode() + ((this.f36389c.hashCode() + ((this.f36388b.hashCode() + (this.f36387a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}

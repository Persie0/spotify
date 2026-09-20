package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vb20 extends xb20 {

    /* JADX INFO: renamed from: a */
    public final kqj0 f239378a;

    /* JADX INFO: renamed from: b */
    public final wdt0 f239379b;

    /* JADX INFO: renamed from: c */
    public final String f239380c;

    public vb20(kqj0 kqj0Var, wdt0 wdt0Var, String str) {
        this.f239378a = kqj0Var;
        this.f239379b = wdt0Var;
        this.f239380c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb20)) {
            return false;
        }
        vb20 vb20Var = (vb20) obj;
        return wj50.m88271j(this.f239378a, vb20Var.f239378a) && wj50.m88271j(this.f239379b, vb20Var.f239379b) && wj50.m88271j(this.f239380c, vb20Var.f239380c);
    }

    public final int hashCode() {
        return this.f239380c.hashCode() + ((this.f239379b.hashCode() + (this.f239378a.hashCode() * 31)) * 31);
    }
}

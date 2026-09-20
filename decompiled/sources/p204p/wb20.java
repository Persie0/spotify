package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wb20 extends xb20 {

    /* JADX INFO: renamed from: a */
    public final rzq0 f249677a;

    /* JADX INFO: renamed from: b */
    public final wdt0 f249678b;

    /* JADX INFO: renamed from: c */
    public final String f249679c;

    public wb20(rzq0 rzq0Var, wdt0 wdt0Var, String str) {
        this.f249677a = rzq0Var;
        this.f249678b = wdt0Var;
        this.f249679c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb20)) {
            return false;
        }
        wb20 wb20Var = (wb20) obj;
        return this.f249677a.equals(wb20Var.f249677a) && wj50.m88271j(this.f249678b, wb20Var.f249678b) && wj50.m88271j(this.f249679c, wb20Var.f249679c);
    }

    public final int hashCode() {
        return this.f249679c.hashCode() + ((this.f249678b.hashCode() + (this.f249677a.hashCode() * 31)) * 31);
    }
}

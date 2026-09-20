package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class luw implements b3x {

    /* JADX INFO: renamed from: a */
    public final String f137161a;

    /* JADX INFO: renamed from: b */
    public final String f137162b;

    /* JADX INFO: renamed from: c */
    public final d850 f137163c;

    public luw(String str, String str2, d850 d850Var) {
        this.f137161a = str;
        this.f137162b = str2;
        this.f137163c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luw)) {
            return false;
        }
        luw luwVar = (luw) obj;
        return wj50.m88271j(this.f137161a, luwVar.f137161a) && wj50.m88271j(this.f137162b, luwVar.f137162b) && wj50.m88271j(this.f137163c, luwVar.f137163c);
    }

    public final int hashCode() {
        return this.f137163c.hashCode() + s571.m77243b(this.f137161a.hashCode() * 31, 31, this.f137162b);
    }
}

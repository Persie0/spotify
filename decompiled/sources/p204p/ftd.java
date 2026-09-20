package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ftd {

    /* JADX INFO: renamed from: a */
    public final String f73186a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f73187b;

    /* JADX INFO: renamed from: c */
    public final p151 f73188c;

    public ftd(String str, xcl0 xcl0Var, p151 p151Var) {
        this.f73186a = str;
        this.f73187b = xcl0Var;
        this.f73188c = p151Var;
    }

    /* JADX INFO: renamed from: a */
    public static ftd m42597a(ftd ftdVar, p151 p151Var) {
        String str = ftdVar.f73186a;
        xcl0 xcl0Var = ftdVar.f73187b;
        ftdVar.getClass();
        return new ftd(str, xcl0Var, p151Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftd)) {
            return false;
        }
        ftd ftdVar = (ftd) obj;
        return wj50.m88271j(this.f73186a, ftdVar.f73186a) && wj50.m88271j(this.f73187b, ftdVar.f73187b) && wj50.m88271j(this.f73188c, ftdVar.f73188c);
    }

    public final int hashCode() {
        return this.f73188c.hashCode() + ((this.f73187b.hashCode() + (this.f73186a.hashCode() * 31)) * 31);
    }
}

package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gk3 {

    /* JADX INFO: renamed from: a */
    public final qe70 f80689a;

    /* JADX INFO: renamed from: b */
    public final eh00 f80690b;

    /* JADX INFO: renamed from: c */
    public final eh00 f80691c;

    /* JADX INFO: renamed from: d */
    public final gh00 f80692d;

    /* JADX INFO: renamed from: e */
    public final gh00 f80693e;

    /* JADX WARN: Multi-variable type inference failed */
    public gk3(th00 th00Var, eh00 eh00Var, eh00 eh00Var2, gh00 gh00Var, gh00 gh00Var2) {
        this.f80689a = (qe70) th00Var;
        this.f80690b = eh00Var;
        this.f80691c = eh00Var2;
        this.f80692d = gh00Var;
        this.f80693e = gh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk3)) {
            return false;
        }
        gk3 gk3Var = (gk3) obj;
        return this.f80689a.equals(gk3Var.f80689a) && wj50.m88271j(this.f80690b, gk3Var.f80690b) && wj50.m88271j(this.f80691c, gk3Var.f80691c) && wj50.m88271j(this.f80692d, gk3Var.f80692d) && wj50.m88271j(this.f80693e, gk3Var.f80693e);
    }

    public final int hashCode() {
        return this.f80693e.hashCode() + m6b.m60989d(this.f80692d, p1v.m68853j(p1v.m68853j(this.f80689a.hashCode() * 31, this.f80690b, 31), this.f80691c, 31), 31);
    }
}

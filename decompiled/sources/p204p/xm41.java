package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xm41 {

    /* JADX INFO: renamed from: a */
    public final ym41 f263289a;

    /* JADX INFO: renamed from: b */
    public final pv00 f263290b;

    /* JADX INFO: renamed from: c */
    public final ctj f263291c;

    public xm41(ym41 ym41Var, pv00 pv00Var, ctj ctjVar) {
        this.f263289a = ym41Var;
        this.f263290b = pv00Var;
        this.f263291c = ctjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm41)) {
            return false;
        }
        xm41 xm41Var = (xm41) obj;
        return wj50.m88271j(this.f263289a, xm41Var.f263289a) && wj50.m88271j(this.f263290b, xm41Var.f263290b) && wj50.m88271j(this.f263291c, xm41Var.f263291c);
    }

    public final int hashCode() {
        return this.f263291c.hashCode() + ((this.f263290b.hashCode() + (this.f263289a.hashCode() * 31)) * 31);
    }
}

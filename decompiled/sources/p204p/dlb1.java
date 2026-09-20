package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dlb1 {

    /* JADX INFO: renamed from: a */
    public final us4 f50177a;

    /* JADX INFO: renamed from: b */
    public final th00 f50178b;

    /* JADX INFO: renamed from: c */
    public final th00 f50179c;

    public dlb1(th00 th00Var, rat ratVar, int i) {
        int i2 = 2;
        fbk fbkVar = null;
        us4 us4Var = new us4(i2, 26, fbkVar);
        th00Var = (i & 2) != 0 ? new us4(i2, 27, fbkVar) : th00Var;
        th00 th00Var2 = (i & 4) != 0 ? koa1.f124716M0 : ratVar;
        this.f50177a = us4Var;
        this.f50178b = th00Var;
        this.f50179c = th00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlb1)) {
            return false;
        }
        dlb1 dlb1Var = (dlb1) obj;
        return wj50.m88271j(this.f50177a, dlb1Var.f50177a) && wj50.m88271j(this.f50178b, dlb1Var.f50178b) && wj50.m88271j(this.f50179c, dlb1Var.f50179c);
    }

    public final int hashCode() {
        return this.f50179c.hashCode() + ((this.f50178b.hashCode() + (this.f50177a.hashCode() * 31)) * 31);
    }
}

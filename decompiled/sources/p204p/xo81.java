package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xo81 {

    /* JADX INFO: renamed from: a */
    public final String f263796a;

    /* JADX INFO: renamed from: b */
    public final boolean f263797b;

    /* JADX INFO: renamed from: c */
    public final qf40 f263798c;

    public xo81(String str, qf40 qf40Var, boolean z) {
        this.f263796a = str;
        this.f263797b = z;
        this.f263798c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo81)) {
            return false;
        }
        xo81 xo81Var = (xo81) obj;
        return wj50.m88271j(this.f263796a, xo81Var.f263796a) && this.f263797b == xo81Var.f263797b && wj50.m88271j(this.f263798c, xo81Var.f263798c);
    }

    public final int hashCode() {
        return this.f263798c.hashCode() + s571.m77245d(this.f263796a.hashCode() * 31, 31, this.f263797b);
    }
}

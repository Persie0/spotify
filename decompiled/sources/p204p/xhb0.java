package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xhb0 {

    /* JADX INFO: renamed from: a */
    public final String f261515a;

    /* JADX INFO: renamed from: b */
    public final String f261516b;

    /* JADX INFO: renamed from: c */
    public final whb0 f261517c;

    public /* synthetic */ xhb0() {
        this("", "", uhb0.f230407a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhb0)) {
            return false;
        }
        xhb0 xhb0Var = (xhb0) obj;
        return wj50.m88271j(this.f261515a, xhb0Var.f261515a) && wj50.m88271j(this.f261516b, xhb0Var.f261516b) && wj50.m88271j(this.f261517c, xhb0Var.f261517c);
    }

    public final int hashCode() {
        return this.f261517c.hashCode() + s571.m77243b(this.f261515a.hashCode() * 31, 31, this.f261516b);
    }

    public xhb0(String str, String str2, whb0 whb0Var) {
        this.f261515a = str;
        this.f261516b = str2;
        this.f261517c = whb0Var;
    }
}

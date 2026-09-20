package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xf5 implements zf5 {

    /* JADX INFO: renamed from: a */
    public final rf5 f260835a;

    /* JADX INFO: renamed from: b */
    public final String f260836b;

    /* JADX INFO: renamed from: c */
    public final Throwable f260837c;

    public /* synthetic */ xf5(rf5 rf5Var, String str, int i) {
        this(rf5Var, (i & 2) != 0 ? null : str, (Exception) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf5)) {
            return false;
        }
        xf5 xf5Var = (xf5) obj;
        return this.f260835a == xf5Var.f260835a && wj50.m88271j(this.f260836b, xf5Var.f260836b) && wj50.m88271j(this.f260837c, xf5Var.f260837c);
    }

    public final int hashCode() {
        int iHashCode = this.f260835a.hashCode() * 31;
        String str = this.f260836b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.f260837c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public xf5(rf5 rf5Var, String str, Exception exc) {
        this.f260835a = rf5Var;
        this.f260836b = str;
        this.f260837c = exc;
    }
}

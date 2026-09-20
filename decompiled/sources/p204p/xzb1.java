package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xzb1 {

    /* JADX INFO: renamed from: a */
    public final vsb1 f267573a;

    /* JADX INFO: renamed from: b */
    public final boolean f267574b;

    /* JADX INFO: renamed from: c */
    public final String f267575c;

    /* JADX INFO: renamed from: d */
    public final wzb1 f267576d;

    /* JADX INFO: renamed from: e */
    public final String f267577e;

    public /* synthetic */ xzb1(vsb1 vsb1Var, String str, wzb1 wzb1Var) {
        this(vsb1Var, true, str, wzb1Var, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92446a() {
        return this.f267574b;
    }

    /* JADX INFO: renamed from: b */
    public final String m92447b() {
        return this.f267575c;
    }

    /* JADX INFO: renamed from: c */
    public final vsb1 m92448c() {
        return this.f267573a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzb1)) {
            return false;
        }
        xzb1 xzb1Var = (xzb1) obj;
        return wj50.m88271j(this.f267573a, xzb1Var.f267573a) && this.f267574b == xzb1Var.f267574b && wj50.m88271j(this.f267575c, xzb1Var.f267575c) && wj50.m88271j(this.f267576d, xzb1Var.f267576d) && wj50.m88271j(this.f267577e, xzb1Var.f267577e);
    }

    public final int hashCode() {
        vsb1 vsb1Var = this.f267573a;
        int iHashCode = (this.f267576d.hashCode() + s571.m77243b(s571.m77245d((vsb1Var == null ? 0 : vsb1Var.hashCode()) * 31, 31, this.f267574b), 31, this.f267575c)) * 31;
        String str = this.f267577e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public xzb1(vsb1 vsb1Var, boolean z, String str, wzb1 wzb1Var, String str2) {
        this.f267573a = vsb1Var;
        this.f267574b = z;
        this.f267575c = str;
        this.f267576d = wzb1Var;
        this.f267577e = str2;
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class whf {

    /* JADX INFO: renamed from: a */
    public final qf40 f251342a;

    /* JADX INFO: renamed from: b */
    public final boolean f251343b;

    /* JADX INFO: renamed from: c */
    public final boolean f251344c;

    /* JADX INFO: renamed from: d */
    public final boolean f251345d;

    /* JADX INFO: renamed from: e */
    public final int f251346e;

    public whf(qf40 qf40Var, boolean z, boolean z2, boolean z3, int i) {
        this.f251342a = qf40Var;
        this.f251343b = z;
        this.f251344c = z2;
        this.f251345d = z3;
        this.f251346e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whf)) {
            return false;
        }
        whf whfVar = (whf) obj;
        return wj50.m88271j(this.f251342a, whfVar.f251342a) && this.f251343b == whfVar.f251343b && this.f251344c == whfVar.f251344c && this.f251345d == whfVar.f251345d && this.f251346e == whfVar.f251346e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251346e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f251342a.hashCode() * 31, 31, this.f251343b), 31, this.f251344c), 31, this.f251345d);
    }
}

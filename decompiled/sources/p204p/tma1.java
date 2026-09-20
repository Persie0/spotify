package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tma1 {

    /* JADX INFO: renamed from: a */
    public final String f221640a;

    /* JADX INFO: renamed from: b */
    public final sma1 f221641b;

    /* JADX INFO: renamed from: c */
    public final long f221642c;

    /* JADX INFO: renamed from: d */
    public final boolean f221643d;

    public tma1(String str, sma1 sma1Var, long j, boolean z) {
        this.f221640a = str;
        this.f221641b = sma1Var;
        this.f221642c = j;
        this.f221643d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tma1)) {
            return false;
        }
        tma1 tma1Var = (tma1) obj;
        return wj50.m88271j(this.f221640a, tma1Var.f221640a) && wj50.m88271j(this.f221641b, tma1Var.f221641b) && this.f221642c == tma1Var.f221642c && this.f221643d == tma1Var.f221643d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221643d) + dq60.m36605e((this.f221641b.hashCode() + (this.f221640a.hashCode() * 31)) * 31, this.f221642c, 31);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rce1 {

    /* JADX INFO: renamed from: a */
    public final int f197858a;

    /* JADX INFO: renamed from: b */
    public final String f197859b;

    /* JADX INFO: renamed from: c */
    public final boolean f197860c;

    public rce1(String str, int i, boolean z) {
        this.f197858a = i;
        this.f197859b = str;
        this.f197860c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce1)) {
            return false;
        }
        rce1 rce1Var = (rce1) obj;
        return this.f197858a == rce1Var.f197858a && wj50.m88271j(this.f197859b, rce1Var.f197859b) && this.f197860c == rce1Var.f197860c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197860c) + s571.m77243b(Integer.hashCode(this.f197858a) * 31, 31, this.f197859b);
    }
}

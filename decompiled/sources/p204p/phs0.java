package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class phs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f177718a;

    /* JADX INFO: renamed from: b */
    public final long f177719b;

    /* JADX INFO: renamed from: c */
    public final String f177720c;

    public phs0(long j, String str, String str2) {
        this.f177718a = str;
        this.f177719b = j;
        this.f177720c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phs0)) {
            return false;
        }
        phs0 phs0Var = (phs0) obj;
        return wj50.m88271j(this.f177718a, phs0Var.f177718a) && this.f177719b == phs0Var.f177719b && wj50.m88271j(this.f177720c, phs0Var.f177720c);
    }

    public final int hashCode() {
        return this.f177720c.hashCode() + dq60.m36605e(this.f177718a.hashCode() * 31, this.f177719b, 31);
    }
}

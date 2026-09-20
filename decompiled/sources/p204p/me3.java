package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class me3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f142589a;

    /* JADX INFO: renamed from: b */
    public final String f142590b;

    /* JADX INFO: renamed from: c */
    public final jev f142591c;

    /* JADX INFO: renamed from: d */
    public final d850 f142592d;

    /* JADX INFO: renamed from: e */
    public final boolean f142593e;

    public me3(String str, String str2, jev jevVar, d850 d850Var, boolean z) {
        this.f142589a = str;
        this.f142590b = str2;
        this.f142591c = jevVar;
        this.f142592d = d850Var;
        this.f142593e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me3)) {
            return false;
        }
        me3 me3Var = (me3) obj;
        return wj50.m88271j(this.f142589a, me3Var.f142589a) && wj50.m88271j(this.f142590b, me3Var.f142590b) && this.f142591c == me3Var.f142591c && wj50.m88271j(this.f142592d, me3Var.f142592d) && this.f142593e == me3Var.f142593e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142593e) + ((this.f142592d.hashCode() + ((this.f142591c.hashCode() + s571.m77243b(this.f142589a.hashCode() * 31, 31, this.f142590b)) * 31)) * 31);
    }
}

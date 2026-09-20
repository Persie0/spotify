package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bv81 implements cv81 {

    /* JADX INFO: renamed from: a */
    public final ov81 f31305a;

    /* JADX INFO: renamed from: b */
    public final yv81 f31306b;

    /* JADX INFO: renamed from: c */
    public final String f31307c;

    public bv81(ov81 ov81Var, yv81 yv81Var, String str) {
        this.f31305a = ov81Var;
        this.f31306b = yv81Var;
        this.f31307c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv81)) {
            return false;
        }
        bv81 bv81Var = (bv81) obj;
        return this.f31305a.equals(bv81Var.f31305a) && this.f31306b.equals(bv81Var.f31306b) && wj50.m88271j(this.f31307c, bv81Var.f31307c);
    }

    public final int hashCode() {
        return edb.m38547C(2) + s571.m77243b((this.f31306b.hashCode() + (this.f31305a.hashCode() * 31)) * 31, 31, this.f31307c);
    }
}

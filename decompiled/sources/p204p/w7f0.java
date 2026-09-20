package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w7f0 {

    /* JADX INFO: renamed from: a */
    public final int f248667a;

    /* JADX INFO: renamed from: b */
    public final f5a0 f248668b;

    /* JADX INFO: renamed from: c */
    public final f5a0 f248669c;

    /* JADX INFO: renamed from: d */
    public final f5a0 f248670d;

    /* JADX INFO: renamed from: e */
    public final f5a0 f248671e;

    /* JADX INFO: renamed from: f */
    public final f5a0 f248672f;

    /* JADX INFO: renamed from: g */
    public final g8f0 f248673g;

    /* JADX INFO: renamed from: h */
    public final f5a0 f248674h;

    /* JADX INFO: renamed from: i */
    public final f5a0 f248675i;

    public w7f0(int i, f5a0 f5a0Var, f5a0 f5a0Var2, f5a0 f5a0Var3, f5a0 f5a0Var4, f5a0 f5a0Var5, g8f0 g8f0Var, f5a0 f5a0Var6, f5a0 f5a0Var7, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        f5a0Var2 = (i2 & 4) != 0 ? null : f5a0Var2;
        f5a0Var3 = (i2 & 8) != 0 ? null : f5a0Var3;
        f5a0Var4 = (i2 & 16) != 0 ? null : f5a0Var4;
        f5a0Var5 = (i2 & 32) != 0 ? null : f5a0Var5;
        g8f0Var = (i2 & 64) != 0 ? null : g8f0Var;
        f5a0Var6 = (i2 & 128) != 0 ? null : f5a0Var6;
        f5a0Var7 = (i2 & 256) != 0 ? null : f5a0Var7;
        this.f248667a = i;
        this.f248668b = f5a0Var;
        this.f248669c = f5a0Var2;
        this.f248670d = f5a0Var3;
        this.f248671e = f5a0Var4;
        this.f248672f = f5a0Var5;
        this.f248673g = g8f0Var;
        this.f248674h = f5a0Var6;
        this.f248675i = f5a0Var7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7f0)) {
            return false;
        }
        w7f0 w7f0Var = (w7f0) obj;
        return this.f248667a == w7f0Var.f248667a && wj50.m88271j(this.f248668b, w7f0Var.f248668b) && wj50.m88271j(this.f248669c, w7f0Var.f248669c) && wj50.m88271j(this.f248670d, w7f0Var.f248670d) && wj50.m88271j(this.f248671e, w7f0Var.f248671e) && wj50.m88271j(this.f248672f, w7f0Var.f248672f) && wj50.m88271j(this.f248673g, w7f0Var.f248673g) && wj50.m88271j(this.f248674h, w7f0Var.f248674h) && wj50.m88271j(this.f248675i, w7f0Var.f248675i);
    }

    public final int hashCode() {
        int iHashCode = (this.f248668b.hashCode() + (Integer.hashCode(this.f248667a) * 31)) * 31;
        f5a0 f5a0Var = this.f248669c;
        int iHashCode2 = (iHashCode + (f5a0Var == null ? 0 : f5a0Var.hashCode())) * 31;
        f5a0 f5a0Var2 = this.f248670d;
        int iHashCode3 = (iHashCode2 + (f5a0Var2 == null ? 0 : f5a0Var2.hashCode())) * 31;
        f5a0 f5a0Var3 = this.f248671e;
        int iHashCode4 = (iHashCode3 + (f5a0Var3 == null ? 0 : f5a0Var3.hashCode())) * 31;
        f5a0 f5a0Var4 = this.f248672f;
        int iHashCode5 = (iHashCode4 + (f5a0Var4 == null ? 0 : f5a0Var4.hashCode())) * 31;
        g8f0 g8f0Var = this.f248673g;
        int iHashCode6 = (iHashCode5 + (g8f0Var == null ? 0 : g8f0Var.hashCode())) * 31;
        f5a0 f5a0Var5 = this.f248674h;
        int iHashCode7 = (iHashCode6 + (f5a0Var5 == null ? 0 : f5a0Var5.hashCode())) * 31;
        f5a0 f5a0Var6 = this.f248675i;
        return iHashCode7 + (f5a0Var6 != null ? f5a0Var6.hashCode() : 0);
    }
}

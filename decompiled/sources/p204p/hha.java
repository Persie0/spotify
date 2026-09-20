package p204p;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class hha {

    /* JADX INFO: renamed from: a */
    public final int f91310a;

    /* JADX INFO: renamed from: b */
    public int f91311b;

    /* JADX INFO: renamed from: c */
    public int f91312c;

    /* JADX INFO: renamed from: d */
    public long f91313d;

    /* JADX INFO: renamed from: e */
    public final boolean f91314e;

    /* JADX INFO: renamed from: f */
    public final l2n0 f91315f;

    /* JADX INFO: renamed from: g */
    public final l2n0 f91316g;

    /* JADX INFO: renamed from: h */
    public int f91317h;

    /* JADX INFO: renamed from: i */
    public int f91318i;

    public hha(l2n0 l2n0Var, l2n0 l2n0Var2, boolean z) throws ParserException {
        this.f91316g = l2n0Var;
        this.f91315f = l2n0Var2;
        this.f91314e = z;
        l2n0Var2.m57930R(12);
        this.f91310a = l2n0Var2.m57921I();
        l2n0Var.m57930R(12);
        this.f91318i = l2n0Var.m57921I();
        ysj0.m94492g("first_chunk must be 1", l2n0Var.m57945q() == 1);
        this.f91311b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47502a() {
        int i = this.f91311b + 1;
        this.f91311b = i;
        if (i == this.f91310a) {
            return false;
        }
        boolean z = this.f91314e;
        l2n0 l2n0Var = this.f91315f;
        this.f91313d = z ? l2n0Var.m57923K() : l2n0Var.m57919G();
        if (this.f91311b == this.f91317h) {
            l2n0 l2n0Var2 = this.f91316g;
            this.f91312c = l2n0Var2.m57921I();
            l2n0Var2.m57931S(4);
            int i2 = this.f91318i - 1;
            this.f91318i = i2;
            this.f91317h = i2 > 0 ? l2n0Var2.m57921I() - 1 : -1;
        }
        return true;
    }
}

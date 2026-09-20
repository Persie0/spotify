package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class sd40 {

    /* JADX INFO: renamed from: k */
    public static int f207876k;

    /* JADX INFO: renamed from: l */
    public static final so3 f207877l = new so3(14);

    /* JADX INFO: renamed from: a */
    public final String f207878a;

    /* JADX INFO: renamed from: b */
    public final float f207879b;

    /* JADX INFO: renamed from: c */
    public final float f207880c;

    /* JADX INFO: renamed from: d */
    public final float f207881d;

    /* JADX INFO: renamed from: e */
    public final float f207882e;

    /* JADX INFO: renamed from: f */
    public final b5b1 f207883f;

    /* JADX INFO: renamed from: g */
    public final long f207884g;

    /* JADX INFO: renamed from: h */
    public final int f207885h;

    /* JADX INFO: renamed from: i */
    public final boolean f207886i;

    /* JADX INFO: renamed from: j */
    public final int f207887j;

    public sd40(String str, float f, float f2, float f3, float f4, b5b1 b5b1Var, long j, int i, boolean z) {
        int iM78611o = so3.m78611o();
        this.f207878a = str;
        this.f207879b = f;
        this.f207880c = f2;
        this.f207881d = f3;
        this.f207882e = f4;
        this.f207883f = b5b1Var;
        this.f207884g = j;
        this.f207885h = i;
        this.f207886i = z;
        this.f207887j = iM78611o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd40)) {
            return false;
        }
        sd40 sd40Var = (sd40) obj;
        if (!wj50.m88271j(this.f207878a, sd40Var.f207878a) || !ybs.m93301b(this.f207879b, sd40Var.f207879b) || !ybs.m93301b(this.f207880c, sd40Var.f207880c) || this.f207881d != sd40Var.f207881d || this.f207882e != sd40Var.f207882e || !wj50.m88271j(this.f207883f, sd40Var.f207883f)) {
            return false;
        }
        long j = sd40Var.f207884g;
        int i = n6f.f150872l;
        return as91.m27074b(this.f207884g, j) && ftg1.m42662v(this.f207885h, sd40Var.f207885h) && this.f207886i == sd40Var.f207886i;
    }

    public final int hashCode() {
        int iHashCode = (this.f207883f.hashCode() + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(this.f207878a.hashCode() * 31, 31, this.f207879b), 31, this.f207880c), 31, this.f207881d), 31, this.f207882e)) * 31;
        int i = n6f.f150872l;
        return Boolean.hashCode(this.f207886i) + ((ftg1.m42666z(this.f207885h) + ms2.m62682g(iHashCode, this.f207884g, 31)) * 31);
    }
}

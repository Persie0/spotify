package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class ifs {

    /* JADX INFO: renamed from: a */
    public final boolean f101814a;

    /* JADX INFO: renamed from: b */
    public final boolean f101815b;

    /* JADX INFO: renamed from: c */
    public final float f101816c;

    /* JADX INFO: renamed from: d */
    public final float f101817d;

    /* JADX INFO: renamed from: e */
    public final int f101818e;

    /* JADX INFO: renamed from: f */
    public final int f101819f;

    /* JADX INFO: renamed from: g */
    public final float f101820g;

    /* JADX INFO: renamed from: h */
    public final Integer f101821h;

    /* JADX INFO: renamed from: i */
    public final int f101822i;

    /* JADX INFO: renamed from: j */
    public final float f101823j;

    /* JADX INFO: renamed from: k */
    public final boolean f101824k;

    public ifs(boolean z, boolean z2, float f, float f2, int i, int i2, float f3, Integer num, int i3, float f4, boolean z3) {
        this.f101814a = z;
        this.f101815b = z2;
        this.f101816c = f;
        this.f101817d = f2;
        this.f101818e = i;
        this.f101819f = i2;
        this.f101820g = f3;
        this.f101821h = num;
        this.f101822i = i3;
        this.f101823j = f4;
        this.f101824k = z3;
    }

    /* JADX INFO: renamed from: a */
    public static ifs m50446a(ifs ifsVar, boolean z, boolean z2, float f, float f2, int i, int i2, float f3, Integer num, int i3, float f4, boolean z3, int i4) {
        if ((i4 & 1) != 0) {
            z = ifsVar.f101814a;
        }
        boolean z4 = z;
        if ((i4 & 2) != 0) {
            z2 = ifsVar.f101815b;
        }
        boolean z5 = z2;
        if ((i4 & 4) != 0) {
            f = ifsVar.f101816c;
        }
        return new ifs(z4, z5, f, (i4 & 8) != 0 ? ifsVar.f101817d : f2, (i4 & 16) != 0 ? ifsVar.f101818e : i, (i4 & 32) != 0 ? ifsVar.f101819f : i2, (i4 & 64) != 0 ? ifsVar.f101820g : f3, (i4 & 128) != 0 ? ifsVar.f101821h : num, (i4 & 256) != 0 ? ifsVar.f101822i : i3, (i4 & 512) != 0 ? ifsVar.f101823j : f4, (i4 & 1024) != 0 ? ifsVar.f101824k : z3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50447b() {
        return this.f101814a || this.f101815b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifs)) {
            return false;
        }
        ifs ifsVar = (ifs) obj;
        return this.f101814a == ifsVar.f101814a && this.f101815b == ifsVar.f101815b && Float.compare(this.f101816c, ifsVar.f101816c) == 0 && Float.compare(this.f101817d, ifsVar.f101817d) == 0 && this.f101818e == ifsVar.f101818e && this.f101819f == ifsVar.f101819f && Float.compare(this.f101820g, ifsVar.f101820g) == 0 && wj50.m88271j(this.f101821h, ifsVar.f101821h) && this.f101822i == ifsVar.f101822i && Float.compare(this.f101823j, ifsVar.f101823j) == 0 && this.f101824k == ifsVar.f101824k;
    }

    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(mt60.m62800g(this.f101819f, mt60.m62800g(this.f101818e, AbstractC0000a.m8g(AbstractC0000a.m8g(s571.m77245d(Boolean.hashCode(this.f101814a) * 31, 31, this.f101815b), 31, this.f101816c), 31, this.f101817d), 31), 31), 31, this.f101820g);
        Integer num = this.f101821h;
        return Boolean.hashCode(this.f101824k) + AbstractC0000a.m8g(mt60.m62800g(this.f101822i, (iM8g + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f101823j);
    }
}

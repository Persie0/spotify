package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class mxb1 {

    /* JADX INFO: renamed from: a */
    public final int f148013a;

    /* JADX INFO: renamed from: b */
    public final int f148014b;

    /* JADX INFO: renamed from: c */
    public final int f148015c;

    /* JADX INFO: renamed from: d */
    public final int f148016d;

    /* JADX INFO: renamed from: e */
    public final float f148017e;

    /* JADX INFO: renamed from: f */
    public final String f148018f;

    public mxb1(int i, int i2, int i3, int i4, float f, String str) {
        this.f148013a = i;
        this.f148014b = i2;
        this.f148015c = i3;
        this.f148016d = i4;
        this.f148017e = f;
        this.f148018f = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m63088a() {
        return this.f148016d;
    }

    /* JADX INFO: renamed from: b */
    public final int m63089b() {
        return this.f148015c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxb1)) {
            return false;
        }
        mxb1 mxb1Var = (mxb1) obj;
        return this.f148013a == mxb1Var.f148013a && this.f148014b == mxb1Var.f148014b && this.f148015c == mxb1Var.f148015c && this.f148016d == mxb1Var.f148016d && Float.compare(this.f148017e, mxb1Var.f148017e) == 0 && wj50.m88271j(this.f148018f, mxb1Var.f148018f);
    }

    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(mt60.m62800g(this.f148016d, mt60.m62800g(this.f148015c, mt60.m62800g(this.f148014b, Integer.hashCode(this.f148013a) * 31, 31), 31), 31), 31, this.f148017e);
        String str = this.f148018f;
        return iM8g + (str == null ? 0 : str.hashCode());
    }
}

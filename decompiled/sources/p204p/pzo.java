package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class pzo {

    /* JADX INFO: renamed from: a */
    public final Date f183746a;

    /* JADX INFO: renamed from: b */
    public final int f183747b;

    /* JADX INFO: renamed from: c */
    public final int f183748c;

    /* JADX INFO: renamed from: d */
    public final int f183749d;

    /* JADX INFO: renamed from: e */
    public final int f183750e;

    /* JADX INFO: renamed from: f */
    public final int f183751f;

    /* JADX INFO: renamed from: g */
    public final int f183752g;

    public pzo(Date date, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f183746a = date;
        this.f183747b = i;
        this.f183748c = i2;
        this.f183749d = i3;
        this.f183750e = i4;
        this.f183751f = i5;
        this.f183752g = i6;
    }

    /* JADX INFO: renamed from: a */
    public static pzo m71758a(pzo pzoVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i;
        Date date = pzoVar.f183746a;
        if ((i7 & 2) != 0) {
            i8 = pzoVar.f183747b;
        }
        if ((i7 & 4) != 0) {
            i2 = pzoVar.f183748c;
        }
        if ((i7 & 8) != 0) {
            i3 = pzoVar.f183749d;
        }
        if ((i7 & 16) != 0) {
            i4 = pzoVar.f183750e;
        }
        pzoVar.getClass();
        pzoVar.getClass();
        if ((i7 & 128) != 0) {
            i5 = pzoVar.f183751f;
        }
        if ((i7 & 256) != 0) {
            i6 = pzoVar.f183752g;
        }
        int i9 = i6;
        pzoVar.getClass();
        int i10 = i5;
        int i11 = i4;
        int i12 = i3;
        return new pzo(date, i8, i2, i12, i11, i10, i9);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m71759b() {
        return this.f183747b > 0 || this.f183748c > 0 || this.f183749d > 0 || this.f183750e > 0 || this.f183751f > 0 || this.f183752g > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzo)) {
            return false;
        }
        pzo pzoVar = (pzo) obj;
        return wj50.m88271j(this.f183746a, pzoVar.f183746a) && this.f183747b == pzoVar.f183747b && this.f183748c == pzoVar.f183748c && this.f183749d == pzoVar.f183749d && this.f183750e == pzoVar.f183750e && this.f183751f == pzoVar.f183751f && this.f183752g == pzoVar.f183752g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f183752g) + mt60.m62800g(this.f183751f, mt60.m62800g(0, mt60.m62800g(0, mt60.m62800g(this.f183750e, mt60.m62800g(this.f183749d, mt60.m62800g(this.f183748c, mt60.m62800g(this.f183747b, this.f183746a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public pzo(Date date) {
        this(date, 0, 0, 0, 0, 0, 0);
    }
}

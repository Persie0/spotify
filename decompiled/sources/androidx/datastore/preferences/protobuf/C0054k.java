package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import p204p.dul;
import p204p.dva;
import p204p.rc9;
import p204p.twe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0054k {

    /* JADX INFO: renamed from: f */
    public static final C0054k f873f = new C0054k(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f874a;

    /* JADX INFO: renamed from: b */
    public int[] f875b;

    /* JADX INFO: renamed from: c */
    public Object[] f876c;

    /* JADX INFO: renamed from: d */
    public int f877d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f878e;

    public C0054k(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f874a = i;
        this.f875b = iArr;
        this.f876c = objArr;
        this.f878e = z;
    }

    /* JADX INFO: renamed from: b */
    public static C0054k m589b() {
        return new C0054k(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m590a() {
        int iM81680M0;
        int i = this.f877d;
        if (i != -1) {
            return i;
        }
        int iM590a = 0;
        for (int i2 = 0; i2 < this.f874a; i2++) {
            int i3 = this.f875b[i2];
            int iM37011n = dul.m37011n(i3);
            int iM37012o = dul.m37012o(i3);
            if (iM37012o == 0) {
                iM81680M0 = twe.m81680M0(iM37011n, ((Long) this.f876c[i2]).longValue());
            } else if (iM37012o == 1) {
                ((Long) this.f876c[i2]).getClass();
                iM81680M0 = twe.m81691p0(iM37011n);
            } else if (iM37012o != 2) {
                if (iM37012o == 3) {
                    iM590a = ((C0054k) this.f876c[i2]).m590a() + (twe.m81677J0(iM37011n) * 2) + iM590a;
                } else {
                    if (iM37012o != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m420b());
                    }
                    ((Integer) this.f876c[i2]).getClass();
                    iM81680M0 = twe.m81690o0(iM37011n);
                }
            } else {
                iM81680M0 = twe.m81685j0(iM37011n, (dva) this.f876c[i2]);
            }
            iM590a = iM81680M0 + iM590a;
        }
        this.f877d = iM590a;
        return iM590a;
    }

    /* JADX INFO: renamed from: c */
    public final void m591c(int i, Object obj) {
        if (!this.f878e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f874a;
        int[] iArr = this.f875b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f875b = Arrays.copyOf(iArr, i3);
            this.f876c = Arrays.copyOf(this.f876c, i3);
        }
        int[] iArr2 = this.f875b;
        int i4 = this.f874a;
        iArr2[i4] = i;
        this.f876c[i4] = obj;
        this.f874a = i4 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m592d(rc9 rc9Var) {
        if (this.f874a == 0) {
            return;
        }
        rc9Var.getClass();
        for (int i = 0; i < this.f874a; i++) {
            int i2 = this.f875b[i];
            Object obj = this.f876c[i];
            int iM37011n = dul.m37011n(i2);
            int iM37012o = dul.m37012o(i2);
            if (iM37012o == 0) {
                rc9Var.m75222G(iM37011n, ((Long) obj).longValue());
            } else if (iM37012o == 1) {
                rc9Var.m75260y(iM37011n, ((Long) obj).longValue());
            } else if (iM37012o == 2) {
                rc9Var.m75251o(iM37011n, (dva) obj);
            } else if (iM37012o == 3) {
                rc9Var.m75235T(iM37011n);
                ((C0054k) obj).m592d(rc9Var);
                rc9Var.m75255s(iM37011n);
            } else {
                if (iM37012o != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m420b());
                }
                rc9Var.m75258w(iM37011n, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0054k)) {
            return false;
        }
        C0054k c0054k = (C0054k) obj;
        int i = this.f874a;
        if (i == c0054k.f874a) {
            int[] iArr = this.f875b;
            int[] iArr2 = c0054k.f875b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f876c;
            Object[] objArr2 = c0054k.f876c;
            int i3 = this.f874a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f874a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f875b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f876c;
        int i6 = this.f874a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

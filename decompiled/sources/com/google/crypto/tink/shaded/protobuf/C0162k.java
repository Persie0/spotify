package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import p204p.fva;
import p204p.w9h1;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0162k {

    /* JADX INFO: renamed from: f */
    public static final C0162k f2382f = new C0162k(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f2383a;

    /* JADX INFO: renamed from: b */
    public int[] f2384b;

    /* JADX INFO: renamed from: c */
    public Object[] f2385c;

    /* JADX INFO: renamed from: d */
    public int f2386d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f2387e;

    public C0162k(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f2383a = i;
        this.f2384b = iArr;
        this.f2385c = objArr;
        this.f2387e = z;
    }

    /* JADX INFO: renamed from: b */
    public static C0162k m1877b() {
        return new C0162k(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m1878a() {
        int iM1742m0;
        int iM1744o0;
        int iM1738i0;
        int i = this.f2386d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2383a; i3++) {
            int i4 = this.f2384b[i3];
            int iM87510q = w9h1.m87510q(i4);
            int iM87511r = w9h1.m87511r(i4);
            if (iM87511r != 0) {
                if (iM87511r == 1) {
                    ((Long) this.f2385c[i3]).getClass();
                    iM1738i0 = C0154c.m1738i0(iM87510q);
                } else if (iM87511r == 2) {
                    iM1738i0 = C0154c.m1735f0(iM87510q, (fva) this.f2385c[i3]);
                } else if (iM87511r == 3) {
                    iM1742m0 = C0154c.m1742m0(iM87510q) * 2;
                    iM1744o0 = ((C0162k) this.f2385c[i3]).m1878a();
                } else {
                    if (iM87511r != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m1674b());
                    }
                    ((Integer) this.f2385c[i3]).getClass();
                    iM1738i0 = C0154c.m1737h0(iM87510q);
                }
                i2 = iM1738i0 + i2;
            } else {
                long jLongValue = ((Long) this.f2385c[i3]).longValue();
                iM1742m0 = C0154c.m1742m0(iM87510q);
                iM1744o0 = C0154c.m1744o0(jLongValue);
            }
            i2 = iM1744o0 + iM1742m0 + i2;
        }
        this.f2386d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1879c(int i, Object obj) {
        if (!this.f2387e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f2383a;
        int[] iArr = this.f2384b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f2384b = Arrays.copyOf(iArr, i3);
            this.f2385c = Arrays.copyOf(this.f2385c, i3);
        }
        int[] iArr2 = this.f2384b;
        int i4 = this.f2383a;
        iArr2[i4] = i;
        this.f2385c[i4] = obj;
        this.f2383a = i4 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m1880d(C0155d c0155d) {
        if (this.f2383a == 0) {
            return;
        }
        c0155d.getClass();
        for (int i = 0; i < this.f2383a; i++) {
            int i2 = this.f2384b[i];
            Object obj = this.f2385c[i];
            int iM87510q = w9h1.m87510q(i2);
            int iM87511r = w9h1.m87511r(i2);
            if (iM87511r == 0) {
                c0155d.m1789u(iM87510q, ((Long) obj).longValue());
            } else if (iM87511r == 1) {
                c0155d.m1781m(iM87510q, ((Long) obj).longValue());
            } else if (iM87511r == 2) {
                c0155d.m1772d(iM87510q, (fva) obj);
            } else if (iM87511r == 3) {
                c0155d.m1763G(iM87510q);
                ((C0162k) obj).m1880d(c0155d);
                c0155d.m1776h(iM87510q);
            } else {
                if (iM87511r != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m1674b());
                }
                c0155d.m1779k(iM87510q, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0162k)) {
            return false;
        }
        C0162k c0162k = (C0162k) obj;
        int i = this.f2383a;
        if (i == c0162k.f2383a) {
            int[] iArr = this.f2384b;
            int[] iArr2 = c0162k.f2384b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f2385c;
            Object[] objArr2 = c0162k.f2385c;
            int i3 = this.f2383a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2383a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f2384b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f2385c;
        int i6 = this.f2383a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

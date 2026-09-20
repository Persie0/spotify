package com.google.protobuf;

import java.util.Arrays;
import p204p.exb;
import p204p.gd8;
import p204p.gva;
import p204p.owe;
import p204p.uwe;

/* JADX INFO: renamed from: com.google.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0275n {

    /* JADX INFO: renamed from: f */
    public static final C0275n f2481f = new C0275n(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f2482a;

    /* JADX INFO: renamed from: b */
    public int[] f2483b;

    /* JADX INFO: renamed from: c */
    public Object[] f2484c;

    /* JADX INFO: renamed from: d */
    public int f2485d;

    /* JADX INFO: renamed from: e */
    public boolean f2486e;

    public C0275n() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: e */
    public static C0275n m2191e(C0275n c0275n, C0275n c0275n2) {
        int i = c0275n.f2482a + c0275n2.f2482a;
        int[] iArrCopyOf = Arrays.copyOf(c0275n.f2483b, i);
        System.arraycopy(c0275n2.f2483b, 0, iArrCopyOf, c0275n.f2482a, c0275n2.f2482a);
        Object[] objArrCopyOf = Arrays.copyOf(c0275n.f2484c, i);
        System.arraycopy(c0275n2.f2484c, 0, objArrCopyOf, c0275n.f2482a, c0275n2.f2482a);
        return new C0275n(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m2192a() {
        if (!this.f2486e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2193b(int i) {
        int[] iArr = this.f2483b;
        if (i > iArr.length) {
            int i2 = this.f2482a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f2483b = Arrays.copyOf(iArr, i);
            this.f2484c = Arrays.copyOf(this.f2484c, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2194c() {
        int iM84098M;
        int iM84100O;
        int iM84098M2;
        int i = this.f2485d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2482a; i3++) {
            int i4 = this.f2483b[i3];
            int iM40217o = exb.m40217o(i4);
            int iM40218p = exb.m40218p(i4);
            if (iM40218p != 0) {
                if (iM40218p == 1) {
                    ((Long) this.f2484c[i3]).getClass();
                    iM84098M2 = uwe.m84098M(iM40217o) + 8;
                } else if (iM40218p == 2) {
                    iM84098M2 = uwe.m84094I(iM40217o, (gva) this.f2484c[i3]);
                } else if (iM40218p == 3) {
                    iM84098M = uwe.m84098M(iM40217o) * 2;
                    iM84100O = ((C0275n) this.f2484c[i3]).m2194c();
                } else {
                    if (iM40218p != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m1952d());
                    }
                    ((Integer) this.f2484c[i3]).getClass();
                    iM84098M2 = uwe.m84098M(iM40217o) + 4;
                }
                i2 = iM84098M2 + i2;
            } else {
                long jLongValue = ((Long) this.f2484c[i3]).longValue();
                iM84098M = uwe.m84098M(iM40217o);
                iM84100O = uwe.m84100O(jLongValue);
            }
            i2 = iM84100O + iM84098M + i2;
        }
        this.f2485d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2195d(int i, owe oweVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo2040z;
        m2192a();
        int iM40217o = exb.m40217o(i);
        int iM40218p = exb.m40218p(i);
        if (iM40218p == 0) {
            m2196f(i, Long.valueOf(oweVar.mo2033r()));
            return true;
        }
        if (iM40218p == 1) {
            m2196f(i, Long.valueOf(oweVar.mo2030o()));
            return true;
        }
        if (iM40218p == 2) {
            m2196f(i, oweVar.mo2026k());
            return true;
        }
        if (iM40218p != 3) {
            if (iM40218p == 4) {
                if (oweVar.f170701b == 0) {
                    oweVar.mo2020a(0);
                }
                return false;
            }
            if (iM40218p != 5) {
                throw InvalidProtocolBufferException.m1952d();
            }
            m2196f(i, Integer.valueOf(oweVar.mo2029n()));
            return true;
        }
        C0275n c0275n = new C0275n();
        do {
            iMo2040z = oweVar.mo2040z();
            if (iMo2040z == 0) {
                break;
            }
        } while (c0275n.m2195d(iMo2040z, oweVar));
        oweVar.mo2020a(exb.m40221s(iM40217o, 4));
        m2196f(i, c0275n);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0275n)) {
            return false;
        }
        C0275n c0275n = (C0275n) obj;
        int i = this.f2482a;
        if (i == c0275n.f2482a) {
            int[] iArr = this.f2483b;
            int[] iArr2 = c0275n.f2483b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f2484c;
            Object[] objArr2 = c0275n.f2484c;
            int i3 = this.f2482a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2196f(int i, Object obj) {
        m2192a();
        m2193b(this.f2482a + 1);
        int[] iArr = this.f2483b;
        int i2 = this.f2482a;
        iArr[i2] = i;
        this.f2484c[i2] = obj;
        this.f2482a = i2 + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m2197g(gd8 gd8Var) {
        if (this.f2482a == 0) {
            return;
        }
        gd8Var.getClass();
        for (int i = 0; i < this.f2482a; i++) {
            int i2 = this.f2483b[i];
            Object obj = this.f2484c[i];
            int iM40217o = exb.m40217o(i2);
            int iM40218p = exb.m40218p(i2);
            if (iM40218p == 0) {
                gd8Var.m44389R(iM40217o, ((Long) obj).longValue());
            } else if (iM40218p == 1) {
                gd8Var.m44381J(iM40217o, ((Long) obj).longValue());
            } else if (iM40218p == 2) {
                gd8Var.m44372A(iM40217o, (gva) obj);
            } else if (iM40218p == 3) {
                gd8Var.m44403f0(iM40217o);
                ((C0275n) obj).m2197g(gd8Var);
                gd8Var.m44376E(iM40217o);
            } else {
                if (iM40218p != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m1952d());
                }
                gd8Var.m44379H(iM40217o, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.f2482a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f2483b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f2484c;
        int i6 = this.f2482a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public C0275n(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f2485d = -1;
        this.f2482a = i;
        this.f2483b = iArr;
        this.f2484c = objArr;
        this.f2486e = z;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.AbstractC2205o8;
import p204p.bva;
import p204p.de50;
import p204p.fva;
import p204p.kgy0;
import p204p.qza1;
import p204p.xy70;
import p204p.xza1;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C0155d {

    /* JADX INFO: renamed from: a */
    public final C0154c f2358a;

    public C0155d(C0154c c0154c) {
        de50.m35764a(c0154c, "output");
        this.f2358a = c0154c;
        c0154c.f2354e = this;
    }

    /* JADX INFO: renamed from: a */
    public static C0155d m1756a(C0154c c0154c) {
        C0155d c0155d = c0154c.f2354e;
        return c0155d != null ? c0155d : new C0155d(c0154c);
    }

    /* JADX INFO: renamed from: A */
    public final void m1757A(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f2358a.m1749t0(i, j);
    }

    /* JADX INFO: renamed from: B */
    public final void m1758B(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                c0154c.m1749t0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3 += 8;
        }
        c0154c.m1753x0(i3);
        while (i2 < list.size()) {
            c0154c.m1750u0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1759C(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 0);
        c0154c.m1753x0((i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: D */
    public final void m1760D(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0154c.m1752w0(i, 0);
                c0154c.m1753x0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1743n0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM1743n0 += C0154c.m1743n0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0154c.m1753x0(iM1743n0);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c0154c.m1753x0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1761E(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f2358a.m1754y0(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: F */
    public final void m1762F(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c0154c.m1754y0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1744o0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM1744o0 += C0154c.m1744o0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0154c.m1753x0(iM1744o0);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c0154c.m1755z0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1763G(int i) {
        this.f2358a.m1752w0(i, 3);
    }

    /* JADX INFO: renamed from: H */
    public final void m1764H(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 2);
        int i2 = c0154c.f2356g;
        byte[] bArr = c0154c.f2355f;
        int i3 = c0154c.f2357h;
        try {
            int iM1743n0 = C0154c.m1743n0(str.length() * 3);
            int iM1743n1 = C0154c.m1743n0(str.length());
            if (iM1743n1 != iM1743n0) {
                c0154c.m1753x0(xza1.m92443b(str));
                int i4 = c0154c.f2357h;
                c0154c.f2357h = xza1.f267569a.mo63241i(str, bArr, i4, i2 - i4);
                return;
            }
            int i5 = i3 + iM1743n1;
            c0154c.f2357h = i5;
            int iMo63241i = xza1.f267569a.mo63241i(str, bArr, i5, i2 - i5);
            c0154c.f2357h = i3;
            c0154c.m1753x0((iMo63241i - i3) - iM1743n1);
            c0154c.f2357h = iMo63241i;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        } catch (qza1 e2) {
            c0154c.f2357h = i3;
            C0154c.f2352i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(de50.f47970a);
            try {
                c0154c.m1753x0(bytes.length);
                c0154c.m1746q0(bytes, 0, bytes.length);
            } catch (CodedOutputStream$OutOfSpaceException e3) {
                throw e3;
            } catch (IndexOutOfBoundsException e4) {
                throw new CodedOutputStream$OutOfSpaceException(e4);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1765I(int i, List list) throws CodedOutputStream$OutOfSpaceException {
        boolean z = list instanceof xy70;
        C0154c c0154c = this.f2358a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c0154c.m1752w0(i, 2);
                int i3 = c0154c.f2356g;
                byte[] bArr = c0154c.f2355f;
                int i4 = c0154c.f2357h;
                try {
                    int iM1743n0 = C0154c.m1743n0(str.length() * 3);
                    int iM1743n1 = C0154c.m1743n0(str.length());
                    if (iM1743n1 == iM1743n0) {
                        int i5 = i4 + iM1743n1;
                        c0154c.f2357h = i5;
                        int iMo63241i = xza1.f267569a.mo63241i(str, bArr, i5, i3 - i5);
                        c0154c.f2357h = i4;
                        c0154c.m1753x0((iMo63241i - i4) - iM1743n1);
                        c0154c.f2357h = iMo63241i;
                    } else {
                        c0154c.m1753x0(xza1.m92443b(str));
                        int i6 = c0154c.f2357h;
                        c0154c.f2357h = xza1.f267569a.mo63241i(str, bArr, i6, i3 - i6);
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(e);
                } catch (qza1 e2) {
                    c0154c.f2357h = i4;
                    C0154c.f2352i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(de50.f47970a);
                    try {
                        c0154c.m1753x0(bytes.length);
                        c0154c.m1746q0(bytes, 0, bytes.length);
                    } catch (CodedOutputStream$OutOfSpaceException e3) {
                        throw e3;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new CodedOutputStream$OutOfSpaceException(e4);
                    }
                }
            }
            return;
        }
        xy70 xy70Var = (xy70) list;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object objMo72068k = xy70Var.mo72068k(i7);
            if (objMo72068k instanceof String) {
                String str2 = (String) objMo72068k;
                c0154c.m1752w0(i, 2);
                int i8 = c0154c.f2356g;
                byte[] bArr2 = c0154c.f2355f;
                int i9 = c0154c.f2357h;
                try {
                    int iM1743n2 = C0154c.m1743n0(str2.length() * 3);
                    int iM1743n3 = C0154c.m1743n0(str2.length());
                    if (iM1743n3 == iM1743n2) {
                        int i10 = i9 + iM1743n3;
                        c0154c.f2357h = i10;
                        int iMo63241i2 = xza1.f267569a.mo63241i(str2, bArr2, i10, i8 - i10);
                        c0154c.f2357h = i9;
                        c0154c.m1753x0((iMo63241i2 - i9) - iM1743n3);
                        c0154c.f2357h = iMo63241i2;
                    } else {
                        c0154c.m1753x0(xza1.m92443b(str2));
                        int i11 = c0154c.f2357h;
                        c0154c.f2357h = xza1.f267569a.mo63241i(str2, bArr2, i11, i8 - i11);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    throw new CodedOutputStream$OutOfSpaceException(e5);
                } catch (qza1 e6) {
                    c0154c.f2357h = i9;
                    C0154c.f2352i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
                    byte[] bytes2 = str2.getBytes(de50.f47970a);
                    try {
                        c0154c.m1753x0(bytes2.length);
                        c0154c.m1746q0(bytes2, 0, bytes2.length);
                    } catch (CodedOutputStream$OutOfSpaceException e7) {
                        throw e7;
                    } catch (IndexOutOfBoundsException e8) {
                        throw new CodedOutputStream$OutOfSpaceException(e8);
                    }
                }
            } else {
                fva fvaVar = (fva) objMo72068k;
                c0154c.m1752w0(i, 2);
                c0154c.m1753x0(fvaVar.size());
                bva bvaVar = (bva) fvaVar;
                c0154c.m1746q0(bvaVar.f31316d, bvaVar.mo30597j(), bvaVar.size());
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1766J(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 0);
        c0154c.m1753x0(i2);
    }

    /* JADX INFO: renamed from: K */
    public final void m1767K(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0154c.m1752w0(i, 0);
                c0154c.m1753x0(iIntValue);
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1743n0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1743n0 += C0154c.m1743n0(((Integer) list.get(i3)).intValue());
        }
        c0154c.m1753x0(iM1743n0);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c0154c.m1753x0(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1768L(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f2358a.m1754y0(i, j);
    }

    /* JADX INFO: renamed from: M */
    public final void m1769M(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                c0154c.m1754y0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1744o0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1744o0 += C0154c.m1744o0(((Long) list.get(i3)).longValue());
        }
        c0154c.m1753x0(iM1744o0);
        while (i2 < list.size()) {
            c0154c.m1755z0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1770b(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 0);
        c0154c.m1745p0(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m1771c(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c0154c.m1752w0(i, 0);
                c0154c.m1745p0(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3++;
        }
        c0154c.m1753x0(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c0154c.m1745p0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1772d(int i, fva fvaVar) {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 2);
        c0154c.m1753x0(fvaVar.size());
        bva bvaVar = (bva) fvaVar;
        c0154c.m1746q0(bvaVar.f31316d, bvaVar.mo30597j(), bvaVar.size());
    }

    /* JADX INFO: renamed from: e */
    public final void m1773e(int i, List list) throws CodedOutputStream$OutOfSpaceException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            fva fvaVar = (fva) list.get(i2);
            C0154c c0154c = this.f2358a;
            c0154c.m1752w0(i, 2);
            c0154c.m1753x0(fvaVar.size());
            bva bvaVar = (bva) fvaVar;
            c0154c.m1746q0(bvaVar.f31316d, bvaVar.mo30597j(), bvaVar.size());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1774f(double d, int i) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.getClass();
        c0154c.m1749t0(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: g */
    public final void m1775g(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c0154c.getClass();
                c0154c.m1749t0(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3 += 8;
        }
        c0154c.m1753x0(i3);
        while (i2 < list.size()) {
            c0154c.m1750u0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1776h(int i) {
        this.f2358a.m1752w0(i, 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m1777i(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 0);
        c0154c.m1751v0(i2);
    }

    /* JADX INFO: renamed from: j */
    public final void m1778j(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0154c.m1752w0(i, 0);
                c0154c.m1751v0(iIntValue);
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1740k0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1740k0 += C0154c.m1740k0(((Integer) list.get(i3)).intValue());
        }
        c0154c.m1753x0(iM1740k0);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c0154c.m1751v0(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1779k(int i, int i2) {
        this.f2358a.m1747r0(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m1780l(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                c0154c.m1747r0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3 += 4;
        }
        c0154c.m1753x0(i3);
        while (i2 < list.size()) {
            c0154c.m1748s0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1781m(int i, long j) {
        this.f2358a.m1749t0(i, j);
    }

    /* JADX INFO: renamed from: n */
    public final void m1782n(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                c0154c.m1749t0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3 += 8;
        }
        c0154c.m1753x0(i3);
        while (i2 < list.size()) {
            c0154c.m1750u0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1783o(float f, int i) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.getClass();
        c0154c.m1747r0(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: p */
    public final void m1784p(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c0154c.getClass();
                c0154c.m1747r0(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3 += 4;
        }
        c0154c.m1753x0(i3);
        while (i2 < list.size()) {
            c0154c.m1748s0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1785q(int i, Object obj, kgy0 kgy0Var) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 3);
        kgy0Var.mo1832d((AbstractC2205o8) obj, c0154c.f2354e);
        c0154c.m1752w0(i, 4);
    }

    /* JADX INFO: renamed from: r */
    public final void m1786r(int i, List list, kgy0 kgy0Var) throws CodedOutputStream$OutOfSpaceException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m1785q(i, list.get(i2), kgy0Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1787s(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 0);
        c0154c.m1751v0(i2);
    }

    /* JADX INFO: renamed from: t */
    public final void m1788t(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C0154c c0154c = this.f2358a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0154c.m1752w0(i, 0);
                c0154c.m1751v0(iIntValue);
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1740k0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1740k0 += C0154c.m1740k0(((Integer) list.get(i3)).intValue());
        }
        c0154c.m1753x0(iM1740k0);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c0154c.m1751v0(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1789u(int i, long j) {
        this.f2358a.m1754y0(i, j);
    }

    /* JADX INFO: renamed from: v */
    public final void m1790v(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                c0154c.m1754y0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int iM1744o0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1744o0 += C0154c.m1744o0(((Long) list.get(i3)).longValue());
        }
        c0154c.m1753x0(iM1744o0);
        while (i2 < list.size()) {
            c0154c.m1755z0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1791w(int i, Object obj, kgy0 kgy0Var) throws CodedOutputStream$OutOfSpaceException {
        AbstractC2205o8 abstractC2205o8 = (AbstractC2205o8) obj;
        C0154c c0154c = this.f2358a;
        c0154c.m1752w0(i, 2);
        abstractC2205o8.getClass();
        AbstractC0156e abstractC0156e = (AbstractC0156e) abstractC2205o8;
        int iMo1835g = abstractC0156e.memoizedSerializedSize;
        if (iMo1835g == -1) {
            iMo1835g = kgy0Var.mo1835g(abstractC2205o8);
            abstractC0156e.memoizedSerializedSize = iMo1835g;
        }
        c0154c.m1753x0(iMo1835g);
        kgy0Var.mo1832d(abstractC2205o8, c0154c.f2354e);
    }

    /* JADX INFO: renamed from: x */
    public final void m1792x(int i, List list, kgy0 kgy0Var) throws CodedOutputStream$OutOfSpaceException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m1791w(i, list.get(i2), kgy0Var);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1793y(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        this.f2358a.m1747r0(i, i2);
    }

    /* JADX INFO: renamed from: z */
    public final void m1794z(int i, List list, boolean z) throws CodedOutputStream$OutOfSpaceException {
        int i2 = 0;
        C0154c c0154c = this.f2358a;
        if (!z) {
            while (i2 < list.size()) {
                c0154c.m1747r0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0154c.m1752w0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0154c.f2352i;
            i3 += 4;
        }
        c0154c.m1753x0(i3);
        while (i2 < list.size()) {
            c0154c.m1748s0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}

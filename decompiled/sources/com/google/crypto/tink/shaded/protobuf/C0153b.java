package com.google.crypto.tink.shaded.protobuf;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p204p.bva;
import p204p.de50;
import p204p.f8a;
import p204p.fva;
import p204p.hru0;
import p204p.kgy0;
import p204p.nwe;
import p204p.o350;
import p204p.thz;
import p204p.w9h1;
import p204p.xy70;
import p204p.xza1;
import p204p.z1b0;
import p204p.z1s;
import p204p.ztx;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0153b implements hru0 {

    /* JADX INFO: renamed from: a */
    public final C0152a f2348a;

    /* JADX INFO: renamed from: b */
    public int f2349b;

    /* JADX INFO: renamed from: c */
    public int f2350c;

    /* JADX INFO: renamed from: d */
    public int f2351d = 0;

    public C0153b(C0152a c0152a) {
        Charset charset = de50.f47970a;
        this.f2348a = c0152a;
        c0152a.f159105c = this;
    }

    /* JADX INFO: renamed from: Q */
    public static void m1691Q(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m1677e();
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m1692R(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m1677e();
        }
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: A */
    public final void mo1693A(List list) throws InvalidProtocolBufferException {
        m1706N(list, false);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: B */
    public final void mo1694B(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof thz;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 2) {
                int iM1686i = c0152a.m1686i();
                m1691Q(iM1686i);
                int iM1680c = c0152a.m1680c() + iM1686i;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(c0152a.m1684g())));
                } while (c0152a.m1680c() < iM1680c);
                return;
            }
            if (iM87511r != 5) {
                throw InvalidProtocolBufferException.m1674b();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(c0152a.m1684g())));
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l = c0152a.m1689l();
                }
            } while (iM1689l == this.f2349b);
            this.f2351d = iM1689l;
            return;
        }
        thz thzVar = (thz) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 2) {
            int iM1686i2 = c0152a.m1686i();
            m1691Q(iM1686i2);
            int iM1680c2 = c0152a.m1680c() + iM1686i2;
            do {
                thzVar.m80867b(Float.intBitsToFloat(c0152a.m1684g()));
            } while (c0152a.m1680c() < iM1680c2);
            return;
        }
        if (iM87511r2 != 5) {
            throw InvalidProtocolBufferException.m1674b();
        }
        do {
            thzVar.m80867b(Float.intBitsToFloat(c0152a.m1684g()));
            if (c0152a.m1681d()) {
                return;
            } else {
                iM1689l2 = c0152a.m1689l();
            }
        } while (iM1689l2 == this.f2349b);
        this.f2351d = iM1689l2;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: C */
    public final int mo1695C() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(5);
        return this.f2348a.m1684g();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: D */
    public final void mo1696D(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        if (w9h1.m87511r(this.f2349b) != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        do {
            list.add(mo1722n());
            C0152a c0152a = this.f2348a;
            if (c0152a.m1681d()) {
                return;
            } else {
                iM1689l = c0152a.m1689l();
            }
        } while (iM1689l == this.f2349b);
        this.f2351d = iM1689l;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: E */
    public final void mo1697E(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof z1s;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(c0152a.m1685h())));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1686i = c0152a.m1686i();
            m1692R(iM1686i);
            int iM1680c = c0152a.m1680c() + iM1686i;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(c0152a.m1685h())));
            } while (c0152a.m1680c() < iM1680c);
            return;
        }
        z1s z1sVar = (z1s) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 1) {
            do {
                z1sVar.m95159b(Double.longBitsToDouble(c0152a.m1685h()));
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1686i2 = c0152a.m1686i();
        m1692R(iM1686i2);
        int iM1680c2 = c0152a.m1680c() + iM1686i2;
        do {
            z1sVar.m95159b(Double.longBitsToDouble(c0152a.m1685h()));
        } while (c0152a.m1680c() < iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: F */
    public final long mo1698F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return this.f2348a.m1687j();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: G */
    public final String mo1699G() throws InvalidProtocolBufferException {
        m1708P(2);
        C0152a c0152a = this.f2348a;
        int iM1686i = c0152a.m1686i();
        if (iM1686i > 0) {
            int i = c0152a.f2342e;
            int i2 = c0152a.f2344g;
            if (iM1686i <= i - i2) {
                String strMo63240g = xza1.f267569a.mo63240g(i2, c0152a.f2341d, iM1686i);
                c0152a.f2344g += iM1686i;
                return strMo63240g;
            }
        }
        if (iM1686i == 0) {
            return "";
        }
        if (iM1686i <= 0) {
            throw InvalidProtocolBufferException.m1676d();
        }
        throw InvalidProtocolBufferException.m1678f();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: H */
    public final void mo1700H(List list, kgy0 kgy0Var, ztx ztxVar) throws InvalidProtocolBufferException {
        int iM1689l;
        if (w9h1.m87511r(this.f2349b) != 3) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int i = this.f2349b;
        do {
            list.add(m1704L(kgy0Var, ztxVar));
            C0152a c0152a = this.f2348a;
            if (c0152a.m1681d() || this.f2351d != 0) {
                return;
            } else {
                iM1689l = c0152a.m1689l();
            }
        } while (iM1689l == i);
        this.f2351d = iM1689l;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: I */
    public final Object mo1701I(kgy0 kgy0Var, ztx ztxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(3);
        return m1704L(kgy0Var, ztxVar);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: J */
    public final void mo1702J(List list, kgy0 kgy0Var, ztx ztxVar) throws InvalidProtocolBufferException {
        int iM1689l;
        if (w9h1.m87511r(this.f2349b) != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int i = this.f2349b;
        do {
            list.add(m1705M(kgy0Var, ztxVar));
            C0152a c0152a = this.f2348a;
            if (c0152a.m1681d() || this.f2351d != 0) {
                return;
            } else {
                iM1689l = c0152a.m1689l();
            }
        } while (iM1689l == i);
        this.f2351d = iM1689l;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: K */
    public final Object mo1703K(kgy0 kgy0Var, ztx ztxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(2);
        return m1705M(kgy0Var, ztxVar);
    }

    /* JADX INFO: renamed from: L */
    public final Object m1704L(kgy0 kgy0Var, ztx ztxVar) {
        int i = this.f2350c;
        this.f2350c = w9h1.m87514v(w9h1.m87510q(this.f2349b), 4);
        try {
            Object objMo1831c = kgy0Var.mo1831c();
            kgy0Var.mo1838j(objMo1831c, this, ztxVar);
            kgy0Var.mo1829a(objMo1831c);
            if (this.f2349b != this.f2350c) {
                throw InvalidProtocolBufferException.m1677e();
            }
            this.f2350c = i;
            return objMo1831c;
        } catch (Throwable th) {
            this.f2350c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: M */
    public final Object m1705M(kgy0 kgy0Var, ztx ztxVar) throws InvalidProtocolBufferException {
        C0152a c0152a = this.f2348a;
        int iM1686i = c0152a.m1686i();
        if (c0152a.f159103a >= c0152a.f159104b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM1682e = c0152a.m1682e(iM1686i);
        Object objMo1831c = kgy0Var.mo1831c();
        c0152a.f159103a++;
        kgy0Var.mo1838j(objMo1831c, this, ztxVar);
        kgy0Var.mo1829a(objMo1831c);
        if (c0152a.f2346i != 0) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c0152a.f159103a--;
        c0152a.f2347j = iM1682e;
        c0152a.m1690m();
        return objMo1831c;
    }

    /* JADX INFO: renamed from: N */
    public final void m1706N(List list, boolean z) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        if (w9h1.m87511r(this.f2349b) != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        boolean z2 = list instanceof xy70;
        C0152a c0152a = this.f2348a;
        if (!z2 || z) {
            do {
                list.add(z ? mo1699G() : mo1733y());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l = c0152a.m1689l();
                }
            } while (iM1689l == this.f2349b);
            this.f2351d = iM1689l;
            return;
        }
        xy70 xy70Var = (xy70) list;
        do {
            xy70Var.mo72069n0(mo1722n());
            if (c0152a.m1681d()) {
                return;
            } else {
                iM1689l2 = c0152a.m1689l();
            }
        } while (iM1689l2 == this.f2349b);
        this.f2351d = iM1689l2;
    }

    /* JADX INFO: renamed from: O */
    public final void m1707O(int i) throws InvalidProtocolBufferException {
        if (this.f2348a.m1680c() != i) {
            throw InvalidProtocolBufferException.m1678f();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1708P(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (w9h1.m87511r(this.f2349b) != i) {
            throw InvalidProtocolBufferException.m1674b();
        }
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: a */
    public final long mo1709a() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(1);
        return this.f2348a.m1685h();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: b */
    public final void mo1710b(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof o350;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 2) {
                int iM1686i = c0152a.m1686i();
                m1691Q(iM1686i);
                int iM1680c = c0152a.m1680c() + iM1686i;
                do {
                    list.add(Integer.valueOf(c0152a.m1684g()));
                } while (c0152a.m1680c() < iM1680c);
                return;
            }
            if (iM87511r != 5) {
                throw InvalidProtocolBufferException.m1674b();
            }
            do {
                list.add(Integer.valueOf(c0152a.m1684g()));
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l = c0152a.m1689l();
                }
            } while (iM1689l == this.f2349b);
            this.f2351d = iM1689l;
            return;
        }
        o350 o350Var = (o350) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 2) {
            int iM1686i2 = c0152a.m1686i();
            m1691Q(iM1686i2);
            int iM1680c2 = c0152a.m1680c() + iM1686i2;
            do {
                o350Var.m66184b(c0152a.m1684g());
            } while (c0152a.m1680c() < iM1680c2);
            return;
        }
        if (iM87511r2 != 5) {
            throw InvalidProtocolBufferException.m1674b();
        }
        do {
            o350Var.m66184b(c0152a.m1684g());
            if (c0152a.m1681d()) {
                return;
            } else {
                iM1689l2 = c0152a.m1689l();
            }
        } while (iM1689l2 == this.f2349b);
        this.f2351d = iM1689l2;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: c */
    public final void mo1711c(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof z1b0;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Long.valueOf(nwe.m65762b(c0152a.m1687j())));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Long.valueOf(nwe.m65762b(c0152a.m1687j())));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                z1b0Var.m95101b(nwe.m65762b(c0152a.m1687j()));
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            z1b0Var.m95101b(nwe.m65762b(c0152a.m1687j()));
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: d */
    public final boolean mo1712d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return this.f2348a.m1683f();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: e */
    public final long mo1713e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(1);
        return this.f2348a.m1685h();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: f */
    public final void mo1714f(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof z1b0;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Long.valueOf(c0152a.m1687j()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Long.valueOf(c0152a.m1687j()));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                z1b0Var.m95101b(c0152a.m1687j());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            z1b0Var.m95101b(c0152a.m1687j());
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: g */
    public final int mo1715g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return this.f2348a.m1686i();
    }

    @Override // p204p.hru0
    public final int getTag() {
        return this.f2349b;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: h */
    public final void mo1716h(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof z1b0;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Long.valueOf(c0152a.m1687j()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Long.valueOf(c0152a.m1687j()));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                z1b0Var.m95101b(c0152a.m1687j());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            z1b0Var.m95101b(c0152a.m1687j());
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: i */
    public final void mo1717i(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof o350;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Integer.valueOf(c0152a.m1686i()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Integer.valueOf(c0152a.m1686i()));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        o350 o350Var = (o350) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                o350Var.m66184b(c0152a.m1686i());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            o350Var.m66184b(c0152a.m1686i());
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: j */
    public final int mo1718j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return this.f2348a.m1686i();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: k */
    public final int mo1719k() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return nwe.m65761a(this.f2348a.m1686i());
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: l */
    public final void mo1720l(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof f8a;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Boolean.valueOf(c0152a.m1683f()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Boolean.valueOf(c0152a.m1683f()));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        f8a f8aVar = (f8a) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                f8aVar.m41021b(c0152a.m1683f());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            f8aVar.m41021b(c0152a.m1683f());
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: m */
    public final void mo1721m(List list) throws InvalidProtocolBufferException {
        m1706N(list, true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    @Override // p204p.hru0
    /* JADX INFO: renamed from: n */
    public final bva mo1722n() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        m1708P(2);
        C0152a c0152a = this.f2348a;
        byte[] bArr = c0152a.f2341d;
        int iM1686i = c0152a.m1686i();
        if (iM1686i > 0) {
            int i = c0152a.f2342e;
            int i2 = c0152a.f2344g;
            if (iM1686i <= i - i2) {
                bva bvaVarM42776d = fva.m42776d(i2, bArr, iM1686i);
                c0152a.f2344g += iM1686i;
                return bvaVarM42776d;
            }
        }
        if (iM1686i == 0) {
            return fva.f73739b;
        }
        if (iM1686i > 0) {
            int i3 = c0152a.f2342e;
            int i4 = c0152a.f2344g;
            if (iM1686i <= i3 - i4) {
                int i5 = iM1686i + i4;
                c0152a.f2344g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM1686i <= 0) {
                    throw InvalidProtocolBufferException.m1678f();
                }
                if (iM1686i == 0) {
                    throw InvalidProtocolBufferException.m1676d();
                }
                bArrCopyOfRange = de50.f47971b;
            }
        } else {
            if (iM1686i <= 0) {
                throw InvalidProtocolBufferException.m1678f();
            }
            if (iM1686i == 0) {
                throw InvalidProtocolBufferException.m1676d();
            }
            bArrCopyOfRange = de50.f47971b;
        }
        bva bvaVar = fva.f73739b;
        return new bva(bArrCopyOfRange);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: o */
    public final int mo1723o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return this.f2348a.m1686i();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: p */
    public final void mo1724p(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof z1b0;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 1) {
                do {
                    list.add(Long.valueOf(c0152a.m1685h()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1686i = c0152a.m1686i();
            m1692R(iM1686i);
            int iM1680c = c0152a.m1680c() + iM1686i;
            do {
                list.add(Long.valueOf(c0152a.m1685h()));
            } while (c0152a.m1680c() < iM1680c);
            return;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 1) {
            do {
                z1b0Var.m95101b(c0152a.m1685h());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1686i2 = c0152a.m1686i();
        m1692R(iM1686i2);
        int iM1680c2 = c0152a.m1680c() + iM1686i2;
        do {
            z1b0Var.m95101b(c0152a.m1685h());
        } while (c0152a.m1680c() < iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: q */
    public final void mo1725q(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof o350;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Integer.valueOf(nwe.m65761a(c0152a.m1686i())));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Integer.valueOf(nwe.m65761a(c0152a.m1686i())));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        o350 o350Var = (o350) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                o350Var.m66184b(nwe.m65761a(c0152a.m1686i()));
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            o350Var.m66184b(nwe.m65761a(c0152a.m1686i()));
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: r */
    public final long mo1726r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return this.f2348a.m1687j();
    }

    @Override // p204p.hru0
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(1);
        return Double.longBitsToDouble(this.f2348a.m1685h());
    }

    @Override // p204p.hru0
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(5);
        return Float.intBitsToFloat(this.f2348a.m1684g());
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: s */
    public final void mo1727s(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof o350;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Integer.valueOf(c0152a.m1686i()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Integer.valueOf(c0152a.m1686i()));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        o350 o350Var = (o350) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                o350Var.m66184b(c0152a.m1686i());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            o350Var.m66184b(c0152a.m1686i());
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: t */
    public final int mo1728t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(5);
        return this.f2348a.m1684g();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: u */
    public final void mo1729u(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof z1b0;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 1) {
                do {
                    list.add(Long.valueOf(c0152a.m1685h()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1686i = c0152a.m1686i();
            m1692R(iM1686i);
            int iM1680c = c0152a.m1680c() + iM1686i;
            do {
                list.add(Long.valueOf(c0152a.m1685h()));
            } while (c0152a.m1680c() < iM1680c);
            return;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 1) {
            do {
                z1b0Var.m95101b(c0152a.m1685h());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1686i2 = c0152a.m1686i();
        m1692R(iM1686i2);
        int iM1680c2 = c0152a.m1680c() + iM1686i2;
        do {
            z1b0Var.m95101b(c0152a.m1685h());
        } while (c0152a.m1680c() < iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: v */
    public final void mo1730v(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof o350;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 0) {
                do {
                    list.add(Integer.valueOf(c0152a.m1686i()));
                    if (c0152a.m1681d()) {
                        return;
                    } else {
                        iM1689l = c0152a.m1689l();
                    }
                } while (iM1689l == this.f2349b);
                this.f2351d = iM1689l;
                return;
            }
            if (iM87511r != 2) {
                throw InvalidProtocolBufferException.m1674b();
            }
            int iM1680c = c0152a.m1680c() + c0152a.m1686i();
            do {
                list.add(Integer.valueOf(c0152a.m1686i()));
            } while (c0152a.m1680c() < iM1680c);
            m1707O(iM1680c);
            return;
        }
        o350 o350Var = (o350) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 0) {
            do {
                o350Var.m66184b(c0152a.m1686i());
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l2 = c0152a.m1689l();
                }
            } while (iM1689l2 == this.f2349b);
            this.f2351d = iM1689l2;
            return;
        }
        if (iM87511r2 != 2) {
            throw InvalidProtocolBufferException.m1674b();
        }
        int iM1680c2 = c0152a.m1680c() + c0152a.m1686i();
        do {
            o350Var.m66184b(c0152a.m1686i());
        } while (c0152a.m1680c() < iM1680c2);
        m1707O(iM1680c2);
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: w */
    public final void mo1731w(List list) throws InvalidProtocolBufferException {
        int iM1689l;
        int iM1689l2;
        boolean z = list instanceof o350;
        C0152a c0152a = this.f2348a;
        if (!z) {
            int iM87511r = w9h1.m87511r(this.f2349b);
            if (iM87511r == 2) {
                int iM1686i = c0152a.m1686i();
                m1691Q(iM1686i);
                int iM1680c = c0152a.m1680c() + iM1686i;
                do {
                    list.add(Integer.valueOf(c0152a.m1684g()));
                } while (c0152a.m1680c() < iM1680c);
                return;
            }
            if (iM87511r != 5) {
                throw InvalidProtocolBufferException.m1674b();
            }
            do {
                list.add(Integer.valueOf(c0152a.m1684g()));
                if (c0152a.m1681d()) {
                    return;
                } else {
                    iM1689l = c0152a.m1689l();
                }
            } while (iM1689l == this.f2349b);
            this.f2351d = iM1689l;
            return;
        }
        o350 o350Var = (o350) list;
        int iM87511r2 = w9h1.m87511r(this.f2349b);
        if (iM87511r2 == 2) {
            int iM1686i2 = c0152a.m1686i();
            m1691Q(iM1686i2);
            int iM1680c2 = c0152a.m1680c() + iM1686i2;
            do {
                o350Var.m66184b(c0152a.m1684g());
            } while (c0152a.m1680c() < iM1680c2);
            return;
        }
        if (iM87511r2 != 5) {
            throw InvalidProtocolBufferException.m1674b();
        }
        do {
            o350Var.m66184b(c0152a.m1684g());
            if (c0152a.m1681d()) {
                return;
            } else {
                iM1689l2 = c0152a.m1689l();
            }
        } while (iM1689l2 == this.f2349b);
        this.f2351d = iM1689l2;
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: x */
    public final long mo1732x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m1708P(0);
        return nwe.m65762b(this.f2348a.m1687j());
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: y */
    public final String mo1733y() throws InvalidProtocolBufferException {
        m1708P(2);
        C0152a c0152a = this.f2348a;
        int iM1686i = c0152a.m1686i();
        if (iM1686i > 0) {
            int i = c0152a.f2342e;
            int i2 = c0152a.f2344g;
            if (iM1686i <= i - i2) {
                String str = new String(c0152a.f2341d, i2, iM1686i, de50.f47970a);
                c0152a.f2344g += iM1686i;
                return str;
            }
        }
        if (iM1686i == 0) {
            return "";
        }
        if (iM1686i < 0) {
            throw InvalidProtocolBufferException.m1676d();
        }
        throw InvalidProtocolBufferException.m1678f();
    }

    @Override // p204p.hru0
    /* JADX INFO: renamed from: z */
    public final int mo1734z() {
        int i = this.f2351d;
        if (i != 0) {
            this.f2349b = i;
            this.f2351d = 0;
        } else {
            this.f2349b = this.f2348a.m1689l();
        }
        int i2 = this.f2349b;
        return (i2 == 0 || i2 == this.f2350c) ? Alert.DURATION_SHOW_INDEFINITELY : w9h1.m87510q(i2);
    }
}

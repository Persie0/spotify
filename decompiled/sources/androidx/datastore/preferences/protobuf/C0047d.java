package androidx.datastore.preferences.protobuf;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.List;
import p204p.az70;
import p204p.cux;
import p204p.dva;
import p204p.f3t0;
import p204p.ge50;
import p204p.jhc0;
import p204p.jru0;
import p204p.mgy0;
import p204p.ptc;
import p204p.rb5;
import p204p.xyd1;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0047d implements jru0 {

    /* JADX INFO: renamed from: a */
    public final ptc f846a;

    /* JADX INFO: renamed from: b */
    public int f847b;

    /* JADX INFO: renamed from: c */
    public int f848c;

    /* JADX INFO: renamed from: d */
    public int f849d = 0;

    public C0047d(ptc ptcVar) {
        Charset charset = ge50.f79023a;
        this.f846a = ptcVar;
        ptcVar.f181100b = this;
    }

    /* JADX INFO: renamed from: M */
    public static C0047d m472M(ptc ptcVar) {
        C0047d c0047d = (C0047d) ptcVar.f181100b;
        return c0047d != null ? c0047d : new C0047d(ptcVar);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: A */
    public final void mo473A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m488Q(list, false);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: B */
    public final void mo474B(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 2) {
            int iMo445R0 = ptcVar.mo445R0();
            if ((iMo445R0 & 3) != 0) {
                throw InvalidProtocolBufferException.m423e();
            }
            int iMo456o0 = ptcVar.mo456o0() + iMo445R0;
            do {
                list.add(Float.valueOf(ptcVar.mo435H0()));
            } while (ptcVar.mo456o0() < iMo456o0);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.m420b();
        }
        do {
            list.add(Float.valueOf(ptcVar.mo435H0()));
            if (ptcVar.mo457p0()) {
                return;
            } else {
                iMo444Q0 = ptcVar.mo444Q0();
            }
        } while (iMo444Q0 == this.f847b);
        this.f849d = iMo444Q0;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: C */
    public final int mo475C() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(5);
        return this.f846a.mo438K0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: D */
    public final void mo476D(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo444Q0;
        if ((this.f847b & 7) != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        do {
            list.add(mo505n());
            ptc ptcVar = this.f846a;
            if (ptcVar.mo457p0()) {
                return;
            } else {
                iMo444Q0 = ptcVar.mo444Q0();
            }
        } while (iMo444Q0 == this.f847b);
        this.f849d = iMo444Q0;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: E */
    public final void mo477E(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 1) {
            do {
                list.add(Double.valueOf(ptcVar.mo431D0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo445R0 = ptcVar.mo445R0();
        if ((iMo445R0 & 7) != 0) {
            throw InvalidProtocolBufferException.m423e();
        }
        int iMo456o0 = ptcVar.mo456o0() + iMo445R0;
        do {
            list.add(Double.valueOf(ptcVar.mo431D0()));
        } while (ptcVar.mo456o0() < iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: F */
    public final long mo478F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo437J0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: G */
    public final String mo479G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(2);
        return this.f846a.mo443P0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: H */
    public final Object mo480H(mgy0 mgy0Var, cux cuxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(3);
        return m486O(mgy0Var, cuxVar);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: I */
    public final Object mo481I(mgy0 mgy0Var, cux cuxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(2);
        return m487P(mgy0Var, cuxVar);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: J */
    public final void mo482J(List list, mgy0 mgy0Var, cux cuxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo444Q0;
        int i = this.f847b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.m420b();
        }
        do {
            list.add(m486O(mgy0Var, cuxVar));
            ptc ptcVar = this.f846a;
            if (ptcVar.mo457p0() || this.f849d != 0) {
                return;
            } else {
                iMo444Q0 = ptcVar.mo444Q0();
            }
        } while (iMo444Q0 == i);
        this.f849d = iMo444Q0;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: K */
    public final void mo483K(List list, mgy0 mgy0Var, cux cuxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo444Q0;
        int i = this.f847b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        do {
            list.add(m487P(mgy0Var, cuxVar));
            ptc ptcVar = this.f846a;
            if (ptcVar.mo457p0() || this.f849d != 0) {
                return;
            } else {
                iMo444Q0 = ptcVar.mo444Q0();
            }
        } while (iMo444Q0 == i);
        this.f849d = iMo444Q0;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: L */
    public final void mo484L(jhc0 jhc0Var, rb5 rb5Var, cux cuxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(2);
        ptc ptcVar = this.f846a;
        int iMo459z0 = ptcVar.mo459z0(ptcVar.mo445R0());
        Object obj = rb5Var.f197473d;
        Object objM485N = "";
        Object objM485N2 = obj;
        while (true) {
            try {
                int iMo517z = mo517z();
                if (iMo517z == Integer.MAX_VALUE || ptcVar.mo457p0()) {
                    break;
                }
                if (iMo517z == 1) {
                    objM485N = m485N((xyd1) rb5Var.f197471b, null, null);
                } else if (iMo517z != 2) {
                    try {
                        if (!m491T()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!m491T()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM485N2 = m485N((xyd1) rb5Var.f197472c, obj.getClass(), cuxVar);
                }
            } catch (Throwable th) {
                ptcVar.mo458w0(iMo459z0);
                throw th;
            }
        }
        jhc0Var.put(objM485N, objM485N2);
        ptcVar.mo458w0(iMo459z0);
    }

    /* JADX INFO: renamed from: N */
    public final Object m485N(xyd1 xyd1Var, Class cls, cux cuxVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (xyd1Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(mo478F());
            case 3:
                return Long.valueOf(mo509r());
            case 4:
                return Integer.valueOf(mo506o());
            case 5:
                return Long.valueOf(mo492a());
            case 6:
                return Integer.valueOf(mo511t());
            case 7:
                return Boolean.valueOf(mo495d());
            case 8:
                return mo479G();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m490S(2);
                return m487P(f3t0.f65577c.m40698a(cls), cuxVar);
            case 11:
                return mo505n();
            case 12:
                return Integer.valueOf(mo498g());
            case 13:
                return Integer.valueOf(mo501j());
            case 14:
                return Integer.valueOf(mo475C());
            case 15:
                return Long.valueOf(mo496e());
            case 16:
                return Integer.valueOf(mo502k());
            case 17:
                return Long.valueOf(mo515x());
        }
    }

    /* JADX INFO: renamed from: O */
    public final Object m486O(mgy0 mgy0Var, cux cuxVar) {
        int i = this.f848c;
        this.f848c = ((this.f847b >>> 3) << 3) | 4;
        try {
            Object objMo543c = mgy0Var.mo543c();
            mgy0Var.mo549i(objMo543c, this, cuxVar);
            mgy0Var.mo541a(objMo543c);
            if (this.f847b != this.f848c) {
                throw InvalidProtocolBufferException.m423e();
            }
            this.f848c = i;
            return objMo543c;
        } catch (Throwable th) {
            this.f848c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: P */
    public final Object m487P(mgy0 mgy0Var, cux cuxVar) throws InvalidProtocolBufferException {
        ptc ptcVar = this.f846a;
        int iMo445R0 = ptcVar.mo445R0();
        if (ptcVar.f181099a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo459z0 = ptcVar.mo459z0(iMo445R0);
        Object objMo543c = mgy0Var.mo543c();
        ptcVar.f181099a++;
        mgy0Var.mo549i(objMo543c, this, cuxVar);
        mgy0Var.mo541a(objMo543c);
        ptcVar.mo455k0(0);
        ptcVar.f181099a--;
        ptcVar.mo458w0(iMo459z0);
        return objMo543c;
    }

    /* JADX INFO: renamed from: Q */
    public final void m488Q(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo444Q0;
        int iMo444Q1;
        if ((this.f847b & 7) != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        boolean z2 = list instanceof az70;
        ptc ptcVar = this.f846a;
        if (!z2 || z) {
            do {
                list.add(z ? mo479G() : mo516y());
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        az70 az70Var = (az70) list;
        do {
            az70Var.mo27580a1(mo505n());
            if (ptcVar.mo457p0()) {
                return;
            } else {
                iMo444Q1 = ptcVar.mo444Q0();
            }
        } while (iMo444Q1 == this.f847b);
        this.f849d = iMo444Q1;
    }

    /* JADX INFO: renamed from: R */
    public final void m489R(int i) throws InvalidProtocolBufferException {
        if (this.f846a.mo456o0() != i) {
            throw InvalidProtocolBufferException.m424f();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m490S(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f847b & 7) != i) {
            throw InvalidProtocolBufferException.m420b();
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m491T() {
        int i;
        ptc ptcVar = this.f846a;
        if (ptcVar.mo457p0() || (i = this.f847b) == this.f848c) {
            return false;
        }
        return ptcVar.mo447U0(i);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: a */
    public final long mo492a() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(1);
        return this.f846a.mo434G0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: b */
    public final void mo493b(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 2) {
            int iMo445R0 = ptcVar.mo445R0();
            if ((iMo445R0 & 3) != 0) {
                throw InvalidProtocolBufferException.m423e();
            }
            int iMo456o0 = ptcVar.mo456o0() + iMo445R0;
            do {
                list.add(Integer.valueOf(ptcVar.mo438K0()));
            } while (ptcVar.mo456o0() < iMo456o0);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.m420b();
        }
        do {
            list.add(Integer.valueOf(ptcVar.mo438K0()));
            if (ptcVar.mo457p0()) {
                return;
            } else {
                iMo444Q0 = ptcVar.mo444Q0();
            }
        } while (iMo444Q0 == this.f847b);
        this.f849d = iMo444Q0;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: c */
    public final void mo494c(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(ptcVar.mo441N0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Long.valueOf(ptcVar.mo441N0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: d */
    public final boolean mo495d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo429B0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: e */
    public final long mo496e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(1);
        return this.f846a.mo439L0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: f */
    public final void mo497f(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(ptcVar.mo446S0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Long.valueOf(ptcVar.mo446S0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: g */
    public final int mo498g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo445R0();
    }

    @Override // p204p.jru0
    public final int getTag() {
        return this.f847b;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: h */
    public final void mo499h(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(ptcVar.mo437J0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Long.valueOf(ptcVar.mo437J0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: i */
    public final void mo500i(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(ptcVar.mo432E0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Integer.valueOf(ptcVar.mo432E0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: j */
    public final int mo501j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo432E0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: k */
    public final int mo502k() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo440M0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: l */
    public final void mo503l(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(ptcVar.mo429B0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Boolean.valueOf(ptcVar.mo429B0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: m */
    public final void mo504m(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m488Q(list, true);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: n */
    public final dva mo505n() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(2);
        return this.f846a.mo430C0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: o */
    public final int mo506o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo436I0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: p */
    public final void mo507p(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(ptcVar.mo434G0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo445R0 = ptcVar.mo445R0();
        if ((iMo445R0 & 7) != 0) {
            throw InvalidProtocolBufferException.m423e();
        }
        int iMo456o0 = ptcVar.mo456o0() + iMo445R0;
        do {
            list.add(Long.valueOf(ptcVar.mo434G0()));
        } while (ptcVar.mo456o0() < iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: q */
    public final void mo508q(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(ptcVar.mo440M0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Integer.valueOf(ptcVar.mo440M0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: r */
    public final long mo509r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo446S0();
    }

    @Override // p204p.jru0
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(1);
        return this.f846a.mo431D0();
    }

    @Override // p204p.jru0
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(5);
        return this.f846a.mo435H0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: s */
    public final void mo510s(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(ptcVar.mo445R0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Integer.valueOf(ptcVar.mo445R0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: t */
    public final int mo511t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(5);
        return this.f846a.mo433F0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: u */
    public final void mo512u(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(ptcVar.mo439L0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo445R0 = ptcVar.mo445R0();
        if ((iMo445R0 & 7) != 0) {
            throw InvalidProtocolBufferException.m423e();
        }
        int iMo456o0 = ptcVar.mo456o0() + iMo445R0;
        do {
            list.add(Long.valueOf(ptcVar.mo439L0()));
        } while (ptcVar.mo456o0() < iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: v */
    public final void mo513v(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(ptcVar.mo436I0()));
                if (ptcVar.mo457p0()) {
                    return;
                } else {
                    iMo444Q0 = ptcVar.mo444Q0();
                }
            } while (iMo444Q0 == this.f847b);
            this.f849d = iMo444Q0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.m420b();
        }
        int iMo456o0 = ptcVar.mo456o0() + ptcVar.mo445R0();
        do {
            list.add(Integer.valueOf(ptcVar.mo436I0()));
        } while (ptcVar.mo456o0() < iMo456o0);
        m489R(iMo456o0);
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: w */
    public final void mo514w(List list) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i = this.f847b & 7;
        ptc ptcVar = this.f846a;
        if (i == 2) {
            int iMo445R0 = ptcVar.mo445R0();
            if ((iMo445R0 & 3) != 0) {
                throw InvalidProtocolBufferException.m423e();
            }
            int iMo456o0 = ptcVar.mo456o0() + iMo445R0;
            do {
                list.add(Integer.valueOf(ptcVar.mo433F0()));
            } while (ptcVar.mo456o0() < iMo456o0);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.m420b();
        }
        do {
            list.add(Integer.valueOf(ptcVar.mo433F0()));
            if (ptcVar.mo457p0()) {
                return;
            } else {
                iMo444Q0 = ptcVar.mo444Q0();
            }
        } while (iMo444Q0 == this.f847b);
        this.f849d = iMo444Q0;
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: x */
    public final long mo515x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(0);
        return this.f846a.mo441N0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: y */
    public final String mo516y() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m490S(2);
        return this.f846a.mo442O0();
    }

    @Override // p204p.jru0
    /* JADX INFO: renamed from: z */
    public final int mo517z() {
        int i = this.f849d;
        if (i != 0) {
            this.f847b = i;
            this.f849d = 0;
        } else {
            this.f847b = this.f846a.mo444Q0();
        }
        int i2 = this.f847b;
        return (i2 == 0 || i2 == this.f848c) ? Alert.DURATION_SHOW_INDEFINITELY : i2 >>> 3;
    }
}

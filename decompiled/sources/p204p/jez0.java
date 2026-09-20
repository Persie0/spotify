package p204p;

import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class jez0 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: R0 */
    public static final s05 f111755R0 = new s05(0.0f);

    /* JADX INFO: renamed from: S0 */
    public static final s05 f111756S0 = new s05(1.0f);

    /* JADX INFO: renamed from: L0 */
    public long f111757L0;

    /* JADX INFO: renamed from: M0 */
    public final jpi0 f111758M0;

    /* JADX INFO: renamed from: N0 */
    public cez0 f111759N0;

    /* JADX INFO: renamed from: O0 */
    public final bez0 f111760O0;

    /* JADX INFO: renamed from: P0 */
    public float f111761P0;

    /* JADX INFO: renamed from: Q0 */
    public final bez0 f111762Q0;

    /* JADX INFO: renamed from: X */
    public hqb f111763X;

    /* JADX INFO: renamed from: Y */
    public final lsi0 f111764Y;

    /* JADX INFO: renamed from: Z */
    public final cri0 f111765Z;

    /* JADX INFO: renamed from: c */
    public final yum0 f111766c;

    /* JADX INFO: renamed from: d */
    public final yum0 f111767d;

    /* JADX INFO: renamed from: e */
    public Object f111768e;

    /* JADX INFO: renamed from: f */
    public c791 f111769f;

    /* JADX INFO: renamed from: g */
    public long f111770g;

    /* JADX INFO: renamed from: h */
    public final ew40 f111771h;

    /* JADX INFO: renamed from: i */
    public mb31 f111772i;

    /* JADX INFO: renamed from: t */
    public final uum0 f111773t;

    /* JADX WARN: Type inference failed for: r3v7, types: [p.bez0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [p.bez0] */
    public jez0(uxi0 uxi0Var) {
        super(20);
        this.f111766c = sam.m77645B(uxi0Var);
        this.f111767d = sam.m77645B(uxi0Var);
        this.f111768e = uxi0Var;
        this.f111771h = new ew40(this, 19);
        this.f111773t = stf1.m79253m(0.0f);
        this.f111764Y = msi0.m62770a();
        this.f111765Z = new cri0();
        this.f111757L0 = Long.MIN_VALUE;
        this.f111758M0 = new jpi0();
        final int i = 0;
        this.f111760O0 = new gh00(this) { // from class: p.bez0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jez0 f26505b;

            {
                this.f26505b = this;
            }

            @Override // p204p.gh00
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                switch (i) {
                    case 0:
                        this.f26505b.f111757L0 = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        jez0 jez0Var = this.f26505b;
                        long j = jLongValue - jez0Var.f111757L0;
                        jez0Var.f111757L0 = jLongValue;
                        long jM72084O = q3d0.m72084O(j / ((double) jez0Var.f111761P0));
                        jpi0 jpi0Var = jez0Var.f111758M0;
                        if (jpi0Var.m53962i()) {
                            Object[] objArr = jpi0Var.f114675a;
                            int i2 = jpi0Var.f114676b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                cez0 cez0Var = (cez0) objArr[i4];
                                jez0.m53137L1(cez0Var, jM72084O);
                                cez0Var.f37218c = true;
                            }
                            c791 c791Var = jez0Var.f111769f;
                            if (c791Var != null) {
                                c791Var.m31701o();
                            }
                            int i5 = jpi0Var.f114676b;
                            Object[] objArr2 = jpi0Var.f114675a;
                            b450 b450VarM63417Y = n0e1.m63417Y(0, i5);
                            int i6 = b450VarM63417Y.f278778a;
                            int i7 = b450VarM63417Y.f278779b;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((cez0) objArr2[i6]).f37218c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            Arrays.fill(objArr2, i5 - i3, i5, (Object) null);
                            jpi0Var.f114676b -= i3;
                        }
                        cez0 cez0Var2 = jez0Var.f111759N0;
                        if (cez0Var2 != null) {
                            cez0Var2.f37222g = jez0Var.f111770g;
                            jez0.m53137L1(cez0Var2, jM72084O);
                            jez0Var.m53142O1(cez0Var2.f37219d);
                            if (cez0Var2.f37219d == 1.0f) {
                                jez0Var.f111759N0 = null;
                            }
                            jez0Var.m53141N1();
                        }
                        break;
                }
                return w2a1.f247311a;
            }
        };
        final int i2 = 1;
        this.f111762Q0 = new gh00(this) { // from class: p.bez0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jez0 f26505b;

            {
                this.f26505b = this;
            }

            @Override // p204p.gh00
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                switch (i2) {
                    case 0:
                        this.f26505b.f111757L0 = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        jez0 jez0Var = this.f26505b;
                        long j = jLongValue - jez0Var.f111757L0;
                        jez0Var.f111757L0 = jLongValue;
                        long jM72084O = q3d0.m72084O(j / ((double) jez0Var.f111761P0));
                        jpi0 jpi0Var = jez0Var.f111758M0;
                        if (jpi0Var.m53962i()) {
                            Object[] objArr = jpi0Var.f114675a;
                            int i3 = jpi0Var.f114676b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                cez0 cez0Var = (cez0) objArr[i5];
                                jez0.m53137L1(cez0Var, jM72084O);
                                cez0Var.f37218c = true;
                            }
                            c791 c791Var = jez0Var.f111769f;
                            if (c791Var != null) {
                                c791Var.m31701o();
                            }
                            int i6 = jpi0Var.f114676b;
                            Object[] objArr2 = jpi0Var.f114675a;
                            b450 b450VarM63417Y = n0e1.m63417Y(0, i6);
                            int i7 = b450VarM63417Y.f278778a;
                            int i8 = b450VarM63417Y.f278779b;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((cez0) objArr2[i7]).f37218c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            Arrays.fill(objArr2, i6 - i4, i6, (Object) null);
                            jpi0Var.f114676b -= i4;
                        }
                        cez0 cez0Var2 = jez0Var.f111759N0;
                        if (cez0Var2 != null) {
                            cez0Var2.f37222g = jez0Var.f111770g;
                            jez0.m53137L1(cez0Var2, jM72084O);
                            jez0Var.m53142O1(cez0Var2.f37219d);
                            if (cez0Var2.f37219d == 1.0f) {
                                jez0Var.f111759N0 = null;
                            }
                            jez0Var.m53141N1();
                        }
                        break;
                }
                return w2a1.f247311a;
            }
        };
    }

    /* JADX INFO: renamed from: F1 */
    public static final void m53133F1(jez0 jez0Var) {
        c791 c791Var = jez0Var.f111769f;
        uum0 uum0Var = jez0Var.f111773t;
        if (c791Var == null) {
            return;
        }
        cez0 cez0Var = jez0Var.f111759N0;
        if (cez0Var == null) {
            if (jez0Var.f111770g <= 0 || uum0Var.m84031v() == 1.0f || wj50.m88271j(jez0Var.f111767d.getValue(), jez0Var.f111766c.getValue())) {
                cez0Var = null;
            } else {
                cez0Var = new cez0();
                cez0Var.m32611l(uum0Var.m84031v());
                long j = jez0Var.f111770g;
                cez0Var.m32609j(j);
                cez0Var.m32607h(q3d0.m72084O((1.0d - ((double) uum0Var.m84031v())) * j));
                cez0Var.m32605f().mo76851e(uum0Var.m84031v(), 0);
            }
        }
        if (cez0Var != null) {
            cez0Var.m32609j(jez0Var.f111770g);
            jez0Var.f111758M0.m53954a(cez0Var);
            c791Var.m31699m(cez0Var);
        }
        jez0Var.f111759N0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: G1 */
    public static final Object m53134G1(jez0 jez0Var, ibk ibkVar) {
        eez0 eez0Var;
        jpi0 jpi0Var = jez0Var.f111758M0;
        if (ibkVar instanceof eez0) {
            eez0Var = (eez0) ibkVar;
            int i = eez0Var.f58895c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eez0Var.f58895c = i - Integer.MIN_VALUE;
            } else {
                eez0Var = new eez0(jez0Var, ibkVar);
            }
        } else {
            eez0Var = new eez0(jez0Var, ibkVar);
        }
        Object obj = eez0Var.f58893a;
        int i2 = eez0Var.f58895c;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (jpi0Var.m53961h() && jez0Var.f111759N0 == null) {
                return w2a1Var;
            }
            if (mkg1.m62158t(eez0Var.getContext()) == 0.0f) {
                jez0Var.m53139K1();
                jez0Var.f111757L0 = Long.MIN_VALUE;
                return w2a1Var;
            }
            if (jez0Var.f111757L0 == Long.MIN_VALUE) {
                bez0 bez0Var = jez0Var.f111760O0;
                eez0Var.f58895c = 1;
                if (cvf1.m34057t(bez0Var, eez0Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        do {
            if (!jpi0Var.m53962i() && jez0Var.f111759N0 == null) {
                jez0Var.f111757L0 = Long.MIN_VALUE;
                return w2a1Var;
            }
            eez0Var.f58895c = 2;
        } while (jez0Var.m53138J1(eez0Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: H1 */
    public static final Object m53135H1(jez0 jez0Var, ibk ibkVar) {
        hez0 hez0Var;
        Object value;
        Object obj;
        lsi0 lsi0Var = jez0Var.f111764Y;
        if (ibkVar instanceof hez0) {
            hez0Var = (hez0) ibkVar;
            int i = hez0Var.f90563d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hez0Var.f90563d = i - Integer.MIN_VALUE;
            } else {
                hez0Var = new hez0(jez0Var, ibkVar);
            }
        } else {
            hez0Var = new hez0(jez0Var, ibkVar);
        }
        Object obj2 = hez0Var.f90561b;
        int i2 = hez0Var.f90563d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            value = jez0Var.f111766c.getValue();
            hez0Var.f90560a = value;
            hez0Var.f90563d = 1;
            if (lsi0Var.mo54248a(hez0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            Object obj3 = hez0Var.f90560a;
            bga.m29073P(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = hez0Var.f90560a;
            bga.m29073P(obj2);
        }
        if (wj50.m88271j(obj2, obj)) {
            return w2a1.f247311a;
        }
        jez0Var.f111757L0 = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        hez0Var.f90560a = value;
        hez0Var.f90563d = 2;
        hqb hqbVar = new hqb(1, seg1.m77914f(hez0Var));
        hqbVar.m48222q();
        jez0Var.f111763X = hqbVar;
        lsi0Var.mo54249c(null);
        Object objM48221p = hqbVar.m48221p();
        if (objM48221p != yukVar) {
            obj = value;
            obj2 = objM48221p;
            if (wj50.m88271j(obj2, obj)) {
                return w2a1.f247311a;
            }
            jez0Var.f111757L0 = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0085, please report this as an issue */
    /* JADX INFO: renamed from: I1 */
    public static final Object m53136I1(jez0 jez0Var, ibk ibkVar) {
        iez0 iez0Var;
        Object value;
        Object obj;
        lsi0 lsi0Var = jez0Var.f111764Y;
        if (ibkVar instanceof iez0) {
            iez0Var = (iez0) ibkVar;
            int i = iez0Var.f101597d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iez0Var.f101597d = i - Integer.MIN_VALUE;
            } else {
                iez0Var = new iez0(jez0Var, ibkVar);
            }
        } else {
            iez0Var = new iez0(jez0Var, ibkVar);
        }
        Object obj2 = iez0Var.f101595b;
        int i2 = iez0Var.f101597d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            value = jez0Var.f111766c.getValue();
            iez0Var.f101594a = value;
            iez0Var.f101597d = 1;
            if (lsi0Var.mo54248a(iez0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            Object obj3 = iez0Var.f101594a;
            bga.m29073P(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = iez0Var.f101594a;
            bga.m29073P(obj2);
        }
        if (!wj50.m88271j(obj2, obj)) {
            jez0Var.f111757L0 = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return w2a1.f247311a;
        if (!wj50.m88271j(value, jez0Var.f111768e)) {
            iez0Var.f101594a = value;
            iez0Var.f101597d = 2;
            hqb hqbVar = new hqb(1, seg1.m77914f(iez0Var));
            hqbVar.m48222q();
            jez0Var.f111763X = hqbVar;
            lsi0Var.mo54249c(null);
            Object objM48221p = hqbVar.m48221p();
            if (objM48221p != yukVar) {
                obj = value;
                obj2 = objM48221p;
                if (!wj50.m88271j(obj2, obj)) {
                    jez0Var.f111757L0 = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return yukVar;
        }
        lsi0Var.mo54249c(null);
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: L1 */
    public static void m53137L1(cez0 cez0Var, long j) {
        long jM32604e = cez0Var.m32604e() + j;
        cez0Var.m32610k(jM32604e);
        long jM32601b = cez0Var.m32601b();
        if (jM32604e >= jM32601b) {
            cez0Var.m32611l(1.0f);
            return;
        }
        g5b1 g5b1VarM32600a = cez0Var.m32600a();
        if (g5b1VarM32600a == null) {
            float f = jM32604e / jM32601b;
            cez0Var.m32611l((f * 1.0f) + ((1 - f) * cez0Var.m32605f().mo76847a(0)));
            return;
        }
        s05 s05VarM32605f = cez0Var.m32605f();
        s05 s05VarM32603d = cez0Var.m32603d();
        if (s05VarM32603d == null) {
            s05VarM32603d = f111755R0;
        }
        cez0Var.m32611l(n0e1.m63436m(((s05) g5b1VarM32600a.mo35624m(jM32604e, s05VarM32605f, f111756S0, s05VarM32603d)).mo76847a(0), 0.0f, 1.0f));
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: C1 */
    public final void mo38143C1(c791 c791Var) {
        c791 c791Var2 = this.f111769f;
        if (c791Var2 != null && !c791Var.equals(c791Var2)) {
            nfq0.m64363b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f111769f + ", new instance: " + c791Var);
        }
        this.f111769f = c791Var;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: D1 */
    public final void mo38145D1() {
        this.f111769f = null;
        mb31 mb31Var = this.f111772i;
        if (mb31Var != null) {
            mb31Var.m61342b(this);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final Object m53138J1(ibk ibkVar) {
        float fM62158t = mkg1.m62158t(ibkVar.getContext());
        w2a1 w2a1Var = w2a1.f247311a;
        if (fM62158t <= 0.0f) {
            m53139K1();
            return w2a1Var;
        }
        this.f111761P0 = fM62158t;
        Object objM34057t = cvf1.m34057t(this.f111762Q0, ibkVar);
        return objM34057t == yuk.f276404a ? objM34057t : w2a1Var;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m53139K1() {
        c791 c791Var = this.f111769f;
        if (c791Var != null) {
            c791Var.m31689c();
        }
        this.f111758M0.m53957d();
        if (this.f111759N0 != null) {
            this.f111759N0 = null;
            m53142O1(1.0f);
            m53141N1();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public final Object m53140M1(float f, Object obj, mb61 mb61Var) {
        if (0.0f > f || f > 1.0f) {
            nfq0.m64362a("Expecting fraction between 0 and 1. Got " + f);
        }
        c791 c791Var = this.f111769f;
        if (c791Var != null) {
            Object objM33740a = cri0.m33740a(this.f111765Z, new gez0(obj, this.f111766c.getValue(), this, c791Var, f, null), mb61Var);
            if (objM33740a == yuk.f276404a) {
                return objM33740a;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: N1 */
    public final void m53141N1() {
        c791 c791Var = this.f111769f;
        if (c791Var == null) {
            return;
        }
        c791Var.m31698l(q3d0.m72084O(((double) this.f111773t.m84031v()) * ((Number) c791Var.f34838l.getValue()).longValue()));
    }

    /* JADX INFO: renamed from: O1 */
    public final void m53142O1(float f) {
        this.f111773t.m84032w(f);
    }

    /* JADX INFO: renamed from: P1 */
    public final void m53143P1(mb31 mb31Var) {
        na31 na31Var;
        if (wj50.m88271j(this.f111772i, mb31Var)) {
            return;
        }
        mb31 mb31Var2 = this.f111772i;
        if (mb31Var2 != null) {
            mb31Var2.m61342b(this);
        }
        mb31 mb31Var3 = this.f111772i;
        if (mb31Var3 != null && (na31Var = mb31Var3.f141787h) != null) {
            na31Var.m63947a();
        }
        this.f111772i = mb31Var;
        if (mb31Var != null) {
            mb31Var.f141787h = lb5.m58614m(mb31Var.f141783d);
        }
        mb31 mb31Var4 = this.f111772i;
        if (mb31Var4 != null) {
            mb31Var4.m61344d(this, hdg1.f90140a, this.f111771h);
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: Z0 */
    public final Object mo38160Z0() {
        return this.f111767d.getValue();
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: i1 */
    public final Object mo38169i1() {
        return this.f111766c.getValue();
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: y1 */
    public final void mo38185y1(Object obj) {
        this.f111767d.setValue(obj);
    }
}

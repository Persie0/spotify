package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uhe0 {

    /* JADX INFO: renamed from: a */
    public static final float f230436a;

    /* JADX INFO: renamed from: b */
    public static final float f230437b;

    /* JADX INFO: renamed from: c */
    public static final float f230438c = 12;

    /* JADX INFO: renamed from: d */
    public static final float f230439d = 8;

    /* JADX INFO: renamed from: e */
    public static final float f230440e = ContentType.LONG_FORM_ON_DEMAND;

    /* JADX INFO: renamed from: f */
    public static final float f230441f = 280;

    static {
        float f = 48;
        f230436a = f;
        f230437b = f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m83159a(final fxh0 fxh0Var, final oqi0 oqi0Var, final kqi0 kqi0Var, final qly0 qly0Var, final ch01 ch01Var, final long j, final float f, final float f2, final fyf fyfVar, xq00 xq00Var, final int i) {
        xq00Var.m91775k0(848986741);
        int i2 = i | (xq00Var.m91766g(fxh0Var) ? 4 : 2) | (xq00Var.m91766g(oqi0Var) ? 32 : 16) | (xq00Var.m91766g(qly0Var) ? 2048 : 1024) | (xq00Var.m91766g(ch01Var) ? 16384 : 8192) | (xq00Var.m91764f(j) ? 131072 : 65536) | (xq00Var.m91760d(f) ? 1048576 : 524288) | (xq00Var.m91760d(f2) ? 8388608 : 4194304) | (xq00Var.m91766g(null) ? 67108864 : 33554432) | (xq00Var.m91770i(fyfVar) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            c791 c791VarM47205u = hdg1.m47205u(oqi0Var, "DropDownMenu", xq00Var, (((i2 >> 3) & 14) | 48) & 126, 0);
            pg41 pg41VarM46087q = gxf1.m46087q(2, xq00Var);
            pg41 pg41VarM46087q2 = gxf1.m46087q(5, xq00Var);
            AbstractC1806e9 abstractC1806e9 = c791VarM47205u.f34827a;
            yum0 yum0Var = c791VarM47205u.f34830d;
            boolean zBooleanValue = ((Boolean) abstractC1806e9.mo38160Z0()).booleanValue();
            xq00Var.m91771i0(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            xq00Var.m91788r(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) yum0Var.getValue()).booleanValue();
            xq00Var.m91771i0(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            xq00Var.m91788r(false);
            Float fValueOf2 = Float.valueOf(f4);
            c791VarM47205u.m31692f();
            xq00Var.m91771i0(-745957716);
            xq00Var.m91788r(false);
            tm91 tm91Var = geg1.f79120a;
            w691 w691VarM47198n = hdg1.m47198n(c791VarM47205u, fValueOf, fValueOf2, pg41VarM46087q, tm91Var, xq00Var, 0);
            boolean zBooleanValue3 = ((Boolean) c791VarM47205u.f34827a.mo38160Z0()).booleanValue();
            xq00Var.m91771i0(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            xq00Var.m91788r(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) yum0Var.getValue()).booleanValue();
            xq00Var.m91771i0(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            xq00Var.m91788r(false);
            Float fValueOf4 = Float.valueOf(f6);
            c791VarM47205u.m31692f();
            xq00Var.m91771i0(2839488);
            xq00Var.m91788r(false);
            w691 w691VarM47198n2 = hdg1.m47198n(c791VarM47205u, fValueOf3, fValueOf4, pg41VarM46087q2, tm91Var, xq00Var, 0);
            boolean zBooleanValue5 = ((Boolean) xq00Var.m91774k(pz40.f183596a)).booleanValue();
            boolean zM91768h = xq00Var.m91768h(zBooleanValue5) | xq00Var.m91766g(w691VarM47198n) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91766g(w691VarM47198n2);
            Object objM91750T = xq00Var.m91750T();
            if (zM91768h || objM91750T == t6x0.f217647t) {
                Object rhe0Var = new rhe0(zBooleanValue5, oqi0Var, kqi0Var, w691VarM47198n, w691VarM47198n2);
                xq00Var.m91793t0(rhe0Var);
                objM91750T = rhe0Var;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            d861.m35255a(l0y0.m57831m(cxh0.f43038a, (gh00) objM91750T), ch01Var, j, 0L, f, f2, null, rkk.m75772x(-1463404422, new n90(fxh0Var, qly0Var, fyfVar, 5), xq00Var), xq00Var, (i3 & 896) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00(oqi0Var, kqi0Var, qly0Var, ch01Var, j, f, f2, fyfVar, i) { // from class: p.she0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ oqi0 f209188b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ kqi0 f209189c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ qly0 f209190d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ch01 f209191e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f209192f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ float f209193g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ float f209194h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ fyf f209195i;

                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM43076B = fyg1.m43076B(385);
                    uhe0.m83159a(this.f209187a, this.f209188b, this.f209189c, this.f209190d, this.f209191e, this.f209192f, this.f209193g, this.f209194h, this.f209195i, (xq00) obj, iM43076B);
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m83160b(fyf fyfVar, eh00 eh00Var, fxh0 fxh0Var, boolean z, jhe0 jhe0Var, f4m0 f4m0Var, xq00 xq00Var, int i) {
        int i2;
        boolean z2 = z;
        xq00Var.m91775k0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91766g(jhe0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= xq00Var.m91766g(f4m0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= xq00Var.m91766g(null) ? 67108864 : 33554432;
        }
        if (xq00Var.m91752Y(i2 & 1, (38347923 & i2) != 38347922)) {
            fxh0 fxh0VarM96864x = zsf1.m96864x(mi21.m61837u(mi21.m61822f(1.0f, hdi.m47245v(fxh0Var, null, vgx0.m85503a(0.0f, 6, true), z2, null, null, eh00Var, 24)), f230440e, f230437b, f230441f, 0.0f, 8), f4m0Var);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 48);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96864x);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                z2 = z2;
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                z2 = z2;
                xq00Var.m91776l(c2087le);
            } else {
                z2 = z2;
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            yhh yhhVar = roh.f201265j;
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iHashCode))) {
                pi9.m70087l(iHashCode, xq00Var, iHashCode, yhhVar);
            }
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            va71.m85016a(((qp91) xq00Var.m91774k(up91.f232603a)).f191234m, rkk.m75772x(865999929, new the0(jhe0Var, z2, fyfVar), xq00Var), xq00Var, 48);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new o39(fyfVar, eh00Var, fxh0Var, z2, jhe0Var, f4m0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    /* JADX INFO: renamed from: c */
    public static final long m83161c(c450 c450Var, c450 c450Var2) {
        float fMin;
        int i = c450Var2.f33848a;
        int i2 = c450Var2.f33851d;
        int i3 = c450Var2.f33848a;
        int i4 = c450Var2.f33850c;
        int i5 = c450Var2.f33849b;
        int i6 = c450Var.f33850c;
        int i7 = c450Var.f33849b;
        int i8 = c450Var.f33851d;
        int i9 = c450Var.f33848a;
        float fMin2 = 1.0f;
        if (i >= i6) {
            fMin = 0.0f;
        } else if (i4 <= i9) {
            fMin = 1.0f;
        } else if (c450Var2.m31426d() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(c450Var.f33850c, i4) + Math.max(i9, i3)) / 2) - i3) / c450Var2.m31426d();
        }
        if (i5 >= i8) {
            fMin2 = 0.0f;
        } else if (i2 > i7) {
            if (c450Var2.m31424b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i8, i2) + Math.max(i7, i5)) / 2) - i5) / c450Var2.m31424b();
            }
        }
        return b9m.m28515o(fMin, fMin2);
    }
}

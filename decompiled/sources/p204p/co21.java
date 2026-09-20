package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class co21 implements dut {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40155a;

    /* JADX INFO: renamed from: b */
    public final xiz f40156b;

    /* JADX INFO: renamed from: c */
    public final i5x f40157c;

    /* JADX INFO: renamed from: d */
    public final cph f40158d;

    public co21(gfi0 gfi0Var, hy21 hy21Var) {
        this.f40155a = 2;
        this.f40156b = axf1.m27398m(new n2d0(hy21Var, 23), ake0.f16506Y, nwe0.f159129d, null, new abc0(20, gfi0Var, hy21Var), 8);
        this.f40157c = mhf1.m61771p(this).m94133b(tye0.f224944U0, tye0.f224945V0);
        fyf fyfVar = ztg.f286161a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f40158d = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: g */
    public static final void m33481g(co21 co21Var, int i, yn21 yn21Var, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(-1353013764);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91766g(yn21Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91770i(co21Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            hvi0 hvi0Var = cks.f39079b;
            int iCeil = (int) Math.ceil(cks.m33187f(jwg1.m54450E(yn21Var.f274379a, ils.MILLISECONDS)) / 1000.0f);
            String strM54971F = k0e1.m54971F(R.plurals.ads_skip_delay_content_description, iCeil, new Object[]{Integer.valueOf(iCeil)}, xq00Var);
            fxh0 fxh0VarM39673I = epv0.m39673I(m071.f138554a, mi21.m61814B(cxh0.f43038a, null, 3));
            boolean zM91766g = xq00Var.m91766g(strM54971F);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new zpz0(strM54971F, 22);
                xq00Var.m91793t0(objM91750T);
            }
            zn91.m96545d(zoz0.m96643a(fxh0VarM39673I, (gh00) objM91750T), d7f0.f46174i, null, null, null, null, false, null, null, null, null, rkk.m75772x(655015603, new lmh(i, co21Var, iCeil, yn21Var), xq00Var), xq00Var, 0, 48, 2044);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a80(co21Var, i, yn21Var, i2, 21);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m33482h(co21 co21Var, int i, float f, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(-565079438);
        if ((i2 & 6) == 0) {
            i3 = i2 | (xq00Var.m91762e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91760d(f) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            long j = leu.m58815a(xq00Var).f112826d.f50025b;
            boolean zM91764f = xq00Var.m91764f(j);
            Object objM91750T = xq00Var.m91750T();
            if (zM91764f || objM91750T == t6x0.f217647t) {
                objM91750T = new q22(18, j);
                xq00Var.m91793t0(objM91750T);
            }
            p271.m68900c(f, 4, ((i3 >> 3) & 14) | 384, 0, leu.m58815a(xq00Var).f112825c.f221222e, leu.m58815a(xq00Var).f112825c.f221219b, xq00Var, z520.m95446z(cxh0.f43038a, (gh00) objM91750T));
            ahf1.m25932d(String.valueOf(i), null, leu.m58818d(xq00Var).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new un21(co21Var, i, f, i2, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m33483i(co21 co21Var, int i, float f, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(-1315123506);
        if ((i2 & 6) == 0) {
            i3 = i2 | (xq00Var.m91762e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91760d(f) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            long j = leu.m58815a(xq00Var).f112826d.f50025b;
            boolean zM91764f = xq00Var.m91764f(j);
            Object objM91750T = xq00Var.m91750T();
            if (zM91764f || objM91750T == t6x0.f217647t) {
                objM91750T = new q22(19, j);
                xq00Var.m91793t0(objM91750T);
            }
            p271.m68900c(f, 3, ((i3 >> 3) & 14) | 384, 0, leu.m58815a(xq00Var).f112825c.f221222e, leu.m58815a(xq00Var).f112825c.f221219b, xq00Var, z520.m95446z(cxh0.f43038a, (gh00) objM91750T));
            ahf1.m25932d(String.valueOf(i), null, leu.m58818d(xq00Var).f64978n, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new un21(co21Var, i, f, i2, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m33484j(co21 co21Var, int i, gh00 gh00Var, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(-1578888232);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91770i(co21Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                xq00Var.m91771i0(-1188132165);
                co21Var.m33486f(gh00Var, xq00Var, (i3 >> 3) & 126);
                xq00Var.m91788r(false);
            } else {
                if (iM38547C != 1) {
                    throw lq51.m59703i(-1188133157, xq00Var, false);
                }
                xq00Var.m91771i0(-1188130342);
                co21Var.m33485e(gh00Var, xq00Var, (i3 >> 3) & 126);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a80(co21Var, i, gh00Var, i2, 22);
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f40155a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f40157c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f40155a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f40158d;
    }

    /* JADX INFO: renamed from: e */
    public void m33485e(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1958400821);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(gh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM39673I = epv0.m39673I(m071.f138555b, cxh0.f43038a);
            tgu tguVar = new tgu(18);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new sy11(6, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T), tguVar, fxh0VarM39673I, null, vvx.m86517r(xq00Var), null, null, null, null, p9h.f175245b, p9h.f175246c, xq00Var, 0, 54, 984);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vn21(this, gh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m33486f(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1377887379);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM39673I = epv0.m39673I(m071.f138555b, cxh0.f43038a);
            wgu wguVar = wgu.f251150c;
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new sy11(7, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            riw0.m75607a(new peu(u40.f226523c, (eh00) objM91750T), wguVar, fxh0VarM39673I, null, null, null, false, null, null, p9h.f175244a, xq00Var, 0, 6, 1016);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vn21(this, gh00Var, i, 1);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f40155a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f40156b;
    }

    public co21(ik40 ik40Var) {
        this.f40155a = 1;
        this.f40156b = ik40Var.m50912k(this);
        this.f40157c = ((gao) ik40Var.f103007c).m44177c(this, new jq71(ik40Var, 27));
        fyf fyfVar = new fyf(new kih(5, 29), true, -1103705813);
        wpi0 wpi0Var = xwt.f266743a;
        this.f40158d = new cph(fyfVar, 3);
    }

    public co21(e940 e940Var, z9j0 z9j0Var, xv41 xv41Var, ry8 ry8Var) {
        int i = 3;
        this.f40155a = 3;
        this.f40156b = vsf1.m86335u(new e30(xv41Var, 9), duu0.f53288W0, new h200(z9j0Var, i), 4);
        this.f40157c = mhf1.m61771p(this).m94133b(jvv0.f116517Y, jvv0.f116519Z);
        fyf fyfVar = new fyf(new k20(17, e940Var, ry8Var), true, -1847199217);
        wpi0 wpi0Var = xwt.f266743a;
        this.f40158d = new cph(fyfVar, i);
    }

    public co21() {
        this.f40155a = 4;
        this.f40156b = axf1.m27397l(gau.f78095a, u6c1.f227287a1, nub1.f158556M0, null, u6c1.f227289b1, 8);
        this.f40157c = mhf1.m61771p(this).m94133b(myb1.f148394P0, myb1.f148395Q0);
        fyf fyfVar = ygh.f272579a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f40158d = new cph(fyfVar, 3);
    }

    public co21(mn21 mn21Var, th00 th00Var, fiz fizVar, fiz fizVar2, fiz fizVar3, fiz fizVar4, fiz fizVar5, eh00 eh00Var) {
        this.f40155a = 0;
        this.f40156b = axf1.m27398m(new u201(fizVar, this, fizVar5, fizVar2, fizVar3, fizVar4, 2), ve21.f240561Q0, al11.f16716W0, null, new dl0(3, th00Var), 8);
        this.f40157c = mhf1.m61771p(this).m94133b(j121.f107602O0, j121.f107603P0);
        fyf fyfVar = new fyf(new ki0(this, mn21Var, eh00Var), true, 1608496941);
        wpi0 wpi0Var = xwt.f266743a;
        this.f40158d = new cph(fyfVar, 3);
    }
}

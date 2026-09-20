package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a3c0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final hkh f11914a;

    /* JADX INFO: renamed from: b */
    public final q2c0 f11915b;

    /* JADX INFO: renamed from: c */
    public final zb70 f11916c;

    /* JADX INFO: renamed from: d */
    public final cz90 f11917d;

    /* JADX INFO: renamed from: e */
    public final ykn f11918e;

    /* JADX INFO: renamed from: f */
    public final f3c0 f11919f;

    /* JADX INFO: renamed from: g */
    public final my00 f11920g;

    /* JADX INFO: renamed from: h */
    public final hqg0 f11921h;

    /* JADX INFO: renamed from: i */
    public final pfm0 f11922i;

    public a3c0(hkh hkhVar, q2c0 q2c0Var, zb70 zb70Var, cz90 cz90Var, ykn yknVar, f3c0 f3c0Var, cu5 cu5Var, my00 my00Var, ka70 ka70Var, hqg0 hqg0Var) {
        this.f11914a = hkhVar;
        this.f11915b = q2c0Var;
        this.f11916c = zb70Var;
        this.f11917d = cz90Var;
        this.f11918e = yknVar;
        this.f11919f = f3c0Var;
        this.f11920g = my00Var;
        this.f11921h = hqg0Var;
        this.f11922i = new pfm0(new qfm0[]{new q040(f3c0Var.m40649c(), f3c0Var.m40650g(), null), new pw71(new p1x0(R.string.manage_blocked_content_page_header_title)), new zox(), new e6m0(true), ka70Var}, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m24623c(a3c0 a3c0Var, gh00 gh00Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1571025282);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            kqi0 kqi0VarM77651H = sam.m77651H(gh00Var, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = new s2c0(kqi0VarM77651H);
                xq00Var.m91793t0(objM91750T);
            }
            s2c0 s2c0Var = (s2c0) objM91750T;
            rmm0 rmm0Var = (rmm0) xq00Var.m91774k(q6m0.f185862a);
            boolean zM91766g = xq00Var.m91766g(rmm0Var) | xq00Var.m91770i(s2c0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == ia7Var) {
                objM91750T2 = new ri80(29, rmm0Var, s2c0Var);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49233e(rmm0Var, (gh00) objM91750T2, xq00Var);
            fyfVar.invoke(xq00Var, Integer.valueOf((i2 >> 3) & 14));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fya0(a3c0Var, gh00Var, fyfVar, i, 17);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m24624d(a3c0 a3c0Var, r2c0 r2c0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(2050180910);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(r2c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(a3c0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var2 = xq00Var;
            vig1.m85649d(null, null, null, null, rkk.m75772x(1495128231, new p220(r2c0Var, a3c0Var, gh00Var, 18), xq00Var), xq00Var2, 24576, 15);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t2c0(a3c0Var, r2c0Var, gh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m24625e(a3c0 a3c0Var, r2c0 r2c0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1088555695);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(r2c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(a3c0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = cu5.m33870t(r2c0Var);
                xq00Var.m91793t0(objM91750T);
            }
            fmg1.m42144p((j3c0) objM91750T, bga.m29058A(((rmm0) xq00Var.m91774k(q6m0.f185862a)).mo29876h()), a3c0Var.f11918e, a3c0Var.f11921h, gh00Var, xq00Var, (i2 << 9) & 57344);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t2c0(a3c0Var, r2c0Var, gh00Var, i, 1);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f11922i;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        boolean zM95561b = this.f11920g.f148246b.m95561b();
        hkh hkhVar = this.f11914a;
        fbk fbkVar = null;
        return zM95561b ? hkhVar.m47840a(tky.m81027c(new v4a0[0], new u2c0(this, fbkVar, 1)), rkk.m75763o(new w2c0(this, 1), true, -1842682792), new u5a0(new z2c0(this), new y2c0(this, 1), new zi5(16), kxb0.f127400W0), new hlh(null, null, null, false, 63)) : hkhVar.m47840a(tky.m81027c(new v4a0[0], new u2c0(this, fbkVar, 0)), rkk.m75763o(new w2c0(this, 0), true, 1728994071), new u5a0(new x2c0(this), new y2c0(this, 0), new ui5(16), kxb0.f127399V0), new hlh(null, null, null, false, 63));
    }
}

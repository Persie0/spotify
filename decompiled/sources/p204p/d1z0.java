package p204p;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.unit.TextUnit;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class d1z0 implements dut, mzd1 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f44379a;

    /* JADX INFO: renamed from: b */
    public final id01 f44380b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f44381c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f44382d;

    /* JADX INFO: renamed from: e */
    public final oge0 f44383e;

    /* JADX INFO: renamed from: f */
    public final kzs0 f44384f = new kzs0(new r6w0(this, 28));

    /* JADX INFO: renamed from: g */
    public final coj0 f44385g = mhf1.m61772q(this).m42292j(t4y0.f217163Z0, t4y0.f217164a1);

    /* JADX INFO: renamed from: h */
    public final cph f44386h;

    public d1z0(z9j0 z9j0Var, id01 id01Var, d3o d3oVar, d3o d3oVar2, oge0 oge0Var) {
        this.f44379a = z9j0Var;
        this.f44380b = id01Var;
        this.f44381c = d3oVar;
        this.f44382d = d3oVar2;
        this.f44383e = oge0Var;
        fyf fyfVar = new fyf(new fqv0(this, 21), true, 922455445);
        wpi0 wpi0Var = xwt.f266743a;
        this.f44386h = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f44385g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f44386h;
    }

    /* JADX INFO: renamed from: e */
    public final void m34676e(wwu wwuVar, njg1 njg1Var, sd01 sd01Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        String strM54978M;
        xq00Var.m91775k0(-1086982646);
        int i2 = i | (xq00Var.m91770i(wwuVar) ? 4 : 2) | (xq00Var.m91770i(njg1Var) ? 32 : 16) | (xq00Var.m91770i(sd01Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strM72918j = qjg1.m72918j(njg1Var, (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b));
            String strM52998r = jcg1.m52998r(sd01Var.f207845b, null, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64977m;
            long j = leu.m58815a(xq00Var).f112824b.f138758b;
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            ew31 ew31Var = if71Var.f101704a;
            float fMo26962D = yqqVar.mo26962D(ew31Var.f63411b);
            g15 g15Var = new g15();
            vsf1.m86333s(g15Var, "pageIcon", "�");
            g15Var.m43331g(strM72918j);
            if (strM52998r != null) {
                vsf1.m86333s(g15Var, "chevron", "�");
                g15Var.m43331g(strM52998r);
            }
            j15 j15VarM43339o = g15Var.m43339o();
            if (strM52998r == null || wl51.m88460J0(strM52998r)) {
                xq00Var.m91771i0(1754220838);
                strM54978M = k0e1.m54978M(R.string.settings_page_search_result_location_content_description_page, new Object[]{strM72918j}, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1754372738);
                strM54978M = k0e1.m54978M(R.string.f5997xdc0a0981, new Object[]{strM72918j, strM52998r}, xq00Var);
                xq00Var.m91788r(false);
            }
            boolean zM91766g = xq00Var.m91766g(strM54978M);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new p9v0(strM54978M, 25);
                xq00Var.m91793t0(objM91750T);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96644b = zoz0.m96644b(cxh0Var, false, (gh00) objM91750T);
            long j2 = ew31Var.f63411b;
            long j3 = ew31Var.f63411b;
            epv0.m39689i(j2);
            fxh0Var = cxh0Var;
            pqm0 pqm0Var = new pqm0("pageIcon", new fu40(new g6o0(4, epv0.m39669E(j2 & 1095216660480L, TextUnit.m308c(j2) * 1.5f), ew31Var.f63411b), rkk.m75772x(428315252, new gwp0(fMo26962D, j, wwuVar), xq00Var)));
            epv0.m39689i(j3);
            long jM39669E = epv0.m39669E(j3 & 1095216660480L, TextUnit.m308c(j3) * 0.8f);
            epv0.m39689i(jM39669E);
            long jM39669E2 = epv0.m39669E(jM39669E & 1095216660480L, TextUnit.m308c(jM39669E) * 1.5f);
            epv0.m39689i(j3);
            ahf1.m25933e(j15VarM43339o, fxh0VarM96644b, if71Var, j, null, null, 0, false, null, 0, null, opo.m67567q(pqm0Var, new pqm0("chevron", new fu40(new g6o0(4, jM39669E2, epv0.m39669E(j3 & 1095216660480L, TextUnit.m308c(j3) * 0.8f)), rkk.m75772x(-1377188043, new vrf(fMo26962D, j, 3), xq00Var)))), xq00Var, 0, 0, 2032);
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ics0(this, wwuVar, njg1Var, sd01Var, fxh0Var2, i, 8);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f44384f;
    }
}

package p204p;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class qnh implements dfo {

    /* JADX INFO: renamed from: a */
    public final pgo f190603a;

    /* JADX INFO: renamed from: b */
    public final a491 f190604b;

    /* JADX INFO: renamed from: c */
    public final vln f190605c;

    /* JADX INFO: renamed from: d */
    public final ohy0 f190606d;

    /* JADX INFO: renamed from: e */
    public final mlu0 f190607e;

    /* JADX INFO: renamed from: f */
    public final tjo f190608f = pag1.m69487w(new rko(oyq0.f171866f, 1, vlh.f242507X, new pko(vlh.f242523i), vlh.f242509Y), vlh.f242524t);

    /* JADX INFO: renamed from: g */
    public final xiz f190609g = axf1.m27398m(new pnh(this, 0), vlh.f242522h, yhh.f272900h, null, new pnh(this, 1), 8);

    /* JADX INFO: renamed from: h */
    public final j2a1 f190610h = new j2a1();

    /* JADX INFO: renamed from: i */
    public final cph f190611i;

    public qnh(pgo pgoVar, a491 a491Var, vln vlnVar, ohy0 ohy0Var, mlu0 mlu0Var) {
        this.f190603a = pgoVar;
        this.f190604b = a491Var;
        this.f190605c = vlnVar;
        this.f190606d = ohy0Var;
        this.f190607e = mlu0Var;
        fyf fyfVar = new fyf(new bhd(this, 24), true, -2075338480);
        wpi0 wpi0Var = xwt.f266743a;
        this.f190611i = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: f */
    public static final void m73353f(qnh qnhVar, long j, boolean z, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-445056472);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91764f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("compose-selection-page-bottom-bar", zsf1.m96832C(nec.m64246i(mi21.m61822f(1.0f, cxh0Var), j, kxf1.f127485a), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224766i, 7));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            boolean z2 = (i2 & 896) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new v7h(1, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T), new tgu(), epv0.m39673I("compose-selection-page-continue-button", cxh0Var), z ? sdu.f208086a : new qdu(context.getString(R.string.no_lines_selected)), null, null, null, null, null, null, rkk.m75772x(-1868178877, new k82(context, 3), xq00Var), xq00Var, 0, 48, 2024);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jnh(qnhVar, j, z, eh00Var, i, 0);
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f190610h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f190611i;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f190603a;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f190609g;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f190608f;
    }
}

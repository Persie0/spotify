package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes11.dex */
public final class nni0 implements dfo {

    /* JADX INFO: renamed from: a */
    public final er70 f156428a;

    /* JADX INFO: renamed from: b */
    public final er70 f156429b;

    /* JADX INFO: renamed from: c */
    public final x1p0 f156430c;

    /* JADX INFO: renamed from: d */
    public final pgo f156431d;

    /* JADX INFO: renamed from: e */
    public final tjo f156432e;

    /* JADX INFO: renamed from: f */
    public final xiz f156433f;

    /* JADX INFO: renamed from: g */
    public final i5x f156434g;

    /* JADX INFO: renamed from: h */
    public final cph f156435h;

    public nni0(er70 er70Var, er70 er70Var2, x1p0 x1p0Var, pgo pgoVar) {
        this.f156428a = er70Var;
        this.f156429b = er70Var2;
        this.f156430c = x1p0Var;
        this.f156431d = pgoVar;
        jqv0 jqv0Var = qpv0.f191387a;
        this.f156432e = pag1.m69485u(new rko(new jqx(jqv0Var.mo54112b(v140.class)), 1, uii0.f230701X0, new pko(uii0.f230697U0), uii0.f230703Y0), new rko(new jqx(jqv0Var.mo54112b(erc1.class)), 1, uii0.f230705Z0, new pko(uii0.f230698V0), uii0.f230706a1), new rko(new jqx(jqv0Var.mo54112b(daj.class)), 1, uii0.f230708b1, new pko(uii0.f230699W0), uii0.f230710c1), x4g0.f258114h);
        this.f156433f = axf1.m27398m(new lni0(this, 0), uii0.f230696T0, hzh0.f96941Z0, null, new lni0(this, 1), 8);
        this.f156434g = mhf1.m61771p(this).m94133b(zzf0.f287975Y0, zzf0.f287977Z0);
        fyf fyfVar = pvg.f181747a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f156435h = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final Object m65208g(nni0 nni0Var, String str, cvt cvtVar, ibk ibkVar) {
        mni0 mni0Var;
        if (ibkVar instanceof mni0) {
            mni0Var = (mni0) ibkVar;
            int i = mni0Var.f145434d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mni0Var.f145434d = i - Integer.MIN_VALUE;
            } else {
                mni0Var = new mni0(nni0Var, ibkVar);
            }
        } else {
            mni0Var = new mni0(nni0Var, ibkVar);
        }
        Object obj = mni0Var.f145432b;
        int i2 = mni0Var.f145434d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                e0c1 e0c1Var = (e0c1) nni0Var.f156428a.get();
                mni0Var.f145431a = str;
                mni0Var.f145434d = 1;
                Object objM83453a = ((uml) e0c1Var).m83453a(str, cvtVar, mni0Var);
                yuk yukVar = yuk.f276404a;
                str = yukVar;
                if (objM83453a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = mni0Var.f145431a;
                bga.m29073P(obj);
                str = str2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, edb.m38564m("Failed to play video: ", str), new Object[0]);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f156434g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f156435h;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f156431d;
    }

    /* JADX INFO: renamed from: f */
    public final void m65209f(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1379145136);
        int i2 = i & 1;
        if (xq00Var.m91752Y(i2, i2 != 0)) {
            pag1.m69468d(0, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mec(this, i);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f156433f;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f156432e;
    }
}

package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class j5s implements dfo {

    /* JADX INFO: renamed from: L0 */
    public final cph f109075L0;

    /* JADX INFO: renamed from: X */
    public final ns5 f109076X;

    /* JADX INFO: renamed from: Y */
    public final xiz f109077Y;

    /* JADX INFO: renamed from: Z */
    public final ct50 f109078Z;

    /* JADX INFO: renamed from: a */
    public final Context f109079a;

    /* JADX INFO: renamed from: b */
    public final g4s f109080b;

    /* JADX INFO: renamed from: c */
    public final fas f109081c;

    /* JADX INFO: renamed from: d */
    public final e97 f109082d;

    /* JADX INFO: renamed from: e */
    public final gmj f109083e;

    /* JADX INFO: renamed from: f */
    public final s5m0 f109084f;

    /* JADX INFO: renamed from: g */
    public final b2q0 f109085g;

    /* JADX INFO: renamed from: h */
    public final dxk0 f109086h;

    /* JADX INFO: renamed from: i */
    public final pgo f109087i;

    /* JADX INFO: renamed from: t */
    public final luk f109088t;

    public j5s(Context context, g4s g4sVar, fas fasVar, e97 e97Var, gmj gmjVar, s5m0 s5m0Var, b2q0 b2q0Var, dxk0 dxk0Var, pgo pgoVar, luk lukVar) {
        this.f109079a = context;
        this.f109080b = g4sVar;
        this.f109081c = fasVar;
        this.f109082d = e97Var;
        this.f109083e = gmjVar;
        this.f109084f = s5m0Var;
        this.f109085g = b2q0Var;
        this.f109086h = dxk0Var;
        this.f109087i = pgoVar;
        this.f109088t = lukVar;
        pag1.m69487w(new rko(u4g1.f226699Y0, 2, g5s.f76760i, new pko(g5s.f76755d), g5s.f76761t), g5s.f76756e);
        this.f109076X = new ns5(this);
        this.f109077Y = axf1.m27398m(new f5s(this, 0), g5s.f76753c, t1r.f216325X0, null, new f5s(this, 1), 8);
        this.f109078Z = hhg1.m47531j(g5s.f76757f, hmr.f93034T0, hmr.f93036V0);
        fyf fyfVar = new fyf(new m7q(this, 16), true, 1743183243);
        wpi0 wpi0Var = xwt.f266743a;
        this.f109075L0 = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX INFO: renamed from: f */
    public static final void m52473f(j5s j5sVar, s4s s4sVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        String string;
        x9s x9sVar;
        x9s s9sVar;
        u2s u2sVar;
        fxh0 fxh0VarM39673I;
        int i3;
        String strM54977L;
        boolean zM91768h;
        Object objM91750T;
        eh00 eh00Var;
        xq00Var.m91775k0(1250762166);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(s4sVar) : xq00Var.m91770i(s4sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(j5sVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            ehf1 ehf1Var = s4sVar.f205639e;
            vq50 vq50Var = s4sVar.f205638d;
            boolean z = ehf1Var instanceof u2l0;
            Context context = j5sVar.f109079a;
            String title = vq50Var.getTitle();
            if (vq50Var instanceof iq50) {
                string = context.getString(R.string.standard_download_element_entity_context_episode);
            } else {
                string = vq50Var instanceof gq50 ? context.getString(R.string.standard_download_element_entity_context_audiobook) : null;
            }
            String str = string;
            ehf1 ehf1Var2 = s4sVar.f205639e;
            if (ehf1Var2 instanceof o2l0) {
                x9sVar = t9s.f218351a;
            } else if (ehf1Var2 instanceof y2l0) {
                x9sVar = v9s.f239026a;
            } else if (ehf1Var2 instanceof k2l0) {
                x9sVar = q9s.f186659a;
            } else {
                if ((ehf1Var2 instanceof w2l0) || (ehf1Var2 instanceof s2l0) || (ehf1Var2 instanceof q2l0) || (ehf1Var2 instanceof u2l0)) {
                    x9sVar = p9s.f175296a;
                } else {
                    if (!(ehf1Var2 instanceof m2l0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f = ((m2l0) ehf1Var2).f139378b / 100.0f;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    s9sVar = new s9s(Float.valueOf(f));
                }
                u2sVar = new u2s(s9sVar, null, str, title, 2);
                fxh0VarM39673I = epv0.m39673I("standard_download_element_button", cxh0.f43038a);
                if (z) {
                    i3 = R.string.standard_download_element_download_accessibility;
                } else {
                    i3 = R.string.standard_download_element_remove_download_accessibility;
                }
                strM54977L = k0e1.m54977L(i3, xq00Var);
                zM91768h = xq00Var.m91768h(z) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                objM91750T = xq00Var.m91750T();
                if (zM91768h || objM91750T == t6x0.f217647t) {
                    objM91750T = new r20(gh00Var, z, 10);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00Var = (eh00) objM91750T;
                if (!wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                gug1.m45762d(u2sVar, new peu(new t40(strM54977L), eh00Var), fxh0VarM39673I, xq00Var, 0, 0);
            }
            s9sVar = x9sVar;
            u2sVar = new u2s(s9sVar, null, str, title, 2);
            fxh0VarM39673I = epv0.m39673I("standard_download_element_button", cxh0.f43038a);
            if (z) {
                i3 = R.string.standard_download_element_download_accessibility;
            } else {
                i3 = R.string.standard_download_element_remove_download_accessibility;
            }
            strM54977L = k0e1.m54977L(i3, xq00Var);
            zM91768h = xq00Var.m91768h(z) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            objM91750T = xq00Var.m91750T();
            if (zM91768h) {
                objM91750T = new r20(gh00Var, z, 10);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = new r20(gh00Var, z, 10);
                xq00Var.m91793t0(objM91750T);
            }
            eh00Var = (eh00) objM91750T;
            if (!wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            gug1.m45762d(u2sVar, new peu(new t40(strM54977L), eh00Var), fxh0VarM39673I, xq00Var, 0, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gek(j5sVar, s4sVar, gh00Var, i, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (p204p.x0h1.m89557A(r14, r5, r0) == r4) goto L22;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m52474g(j5s j5sVar, s4s s4sVar, ibk ibkVar) {
        h5s h5sVar;
        if (ibkVar instanceof h5s) {
            h5sVar = (h5s) ibkVar;
            int i = h5sVar.f87894d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5sVar.f87894d = i - Integer.MIN_VALUE;
            } else {
                h5sVar = new h5s(j5sVar, ibkVar);
            }
        } else {
            h5sVar = new h5s(j5sVar, ibkVar);
        }
        Object objM96567o = h5sVar.f87892b;
        int i2 = h5sVar.f87894d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                s4sVar = h5sVar.f87891a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96567o);
        Single singleFirstOrError = j5sVar.f109081c.m41192b(s4sVar.f205638d.mo45408o(), false).firstOrError();
        h5sVar.f87891a = s4sVar;
        h5sVar.f87894d = 1;
        objM96567o = zn91.m96567o(singleFirstOrError, h5sVar);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        s4s s4sVar2 = s4sVar;
        p7o p7oVar = new p7o(27, j5sVar, s4sVar2);
        j2r j2rVar = new j2r(4, j5sVar, s4sVar2);
        luk lukVar = j5sVar.f109088t;
        mp1 mp1Var = new mp1(14, j5sVar, s4sVar2, (das) objM96567o, p7oVar, j2rVar, null);
        h5sVar.f87891a = null;
        h5sVar.f87894d = 2;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f109078Z;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f109075L0;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f109087i;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f109077Y;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f109076X;
    }
}

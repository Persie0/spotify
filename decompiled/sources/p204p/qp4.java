package p204p;

import android.app.Application;
import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public final class qp4 implements kt11 {

    /* JADX INFO: renamed from: a */
    public boolean f191123a;

    /* JADX INFO: renamed from: b */
    public final Object f191124b;

    /* JADX INFO: renamed from: c */
    public Object f191125c;

    /* JADX INFO: renamed from: d */
    public Object f191126d;

    /* JADX INFO: renamed from: e */
    public Object f191127e;

    public qp4(uoa uoaVar, String str, ojq ojqVar, aef1 aef1Var) {
        this.f191127e = uoaVar;
        this.f191124b = str;
        this.f191125c = ojqVar;
        this.f191126d = aef1Var;
        this.f191123a = true;
    }

    /* JADX INFO: renamed from: f */
    public static IOException m73420f(qp4 qp4Var, long j, boolean z, IOException iOException, int i) {
        zuu0 zuu0Var = (zuu0) qp4Var.f191124b;
        boolean z2 = false;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        x5x x5xVar = (x5x) qp4Var.f191125c;
        if (iOException != null) {
            qp4Var.m73427l(iOException);
        }
        if (z4) {
            if (iOException != null) {
                x5xVar.mo80147v(zuu0Var, iOException);
            } else {
                x5xVar.mo55535t(zuu0Var, j);
            }
        }
        if (z3) {
            if (iOException != null) {
                x5xVar.mo80130A(zuu0Var, iOException);
            } else {
                x5xVar.mo55538y(zuu0Var, j);
            }
        }
        if (z4 && !z) {
            z2 = true;
        }
        return zuu0Var.m97074j(qp4Var, z2, (!z3 || z) ? z2 : true, z3 && z, (z4 && z) ? true : z2, iOException);
    }

    @Override // p204p.kt11
    /* JADX INFO: renamed from: a */
    public void mo45269a() {
        m73425j();
    }

    @Override // p204p.kt11
    /* JADX INFO: renamed from: b */
    public void mo45270b(VideoSurfaceView videoSurfaceView) {
        this.f191127e = videoSurfaceView;
    }

    @Override // p204p.kt11
    /* JADX INFO: renamed from: c */
    public void mo45271c(String str, s9p0 s9p0Var) {
        zv41 zv41Var;
        di41 di41Var = (di41) this.f191125c;
        di41 di41VarM89255l = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        if (s9p0Var != null && (zv41Var = s9p0Var.f206993b) != null) {
            di41VarM89255l = wxf1.m89255l(l5h1.m58232p(((hc80) this.f191124b).getLifecycle()), cyf1.m34370f(b0g1.m27776L(zv41Var, new oji(this, s9p0Var, str, null))));
        }
        this.f191125c = di41VarM89255l;
    }

    @Override // p204p.kt11
    /* JADX INFO: renamed from: d */
    public boolean mo45272d() {
        return this.f191123a;
    }

    /* JADX INFO: renamed from: e */
    public void m73421e() {
        synchronized (((x2b) this.f191127e)) {
            if (this.f191123a) {
                return;
            }
            this.f191123a = true;
            a0f1.m24341b((ai21) this.f191125c);
            try {
                ((nqr) this.f191124b).m65453a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public avu0 m73422g() {
        egx egxVarMo41637j = ((fgx) this.f191127e).mo41637j();
        avu0 avu0Var = egxVarMo41637j instanceof avu0 ? (avu0) egxVarMo41637j : null;
        if (avu0Var != null) {
            return avu0Var;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* JADX INFO: renamed from: h */
    public ovu0 m73423h(n2x0 n2x0Var) throws IOException {
        qp4 qp4Var;
        fgx fgxVar = (fgx) this.f191127e;
        try {
            String strM78534b = n2x0Var.f149862f.m78534b("Content-Type");
            if (strM78534b == null) {
                strM78534b = null;
            }
            long jMo41634g = fgxVar.mo41634g(n2x0Var);
            qp4Var = this;
            try {
                return new ovu0(strM78534b, jMo41634g, kif1.m56500i(new dgx(qp4Var, fgxVar.mo41629b(n2x0Var), jMo41634g, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((x5x) qp4Var.f191125c).mo80130A((zuu0) qp4Var.f191124b, iOException);
                m73427l(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            qp4Var = this;
        }
    }

    /* JADX INFO: renamed from: i */
    public z1x0 m73424i(boolean z) throws IOException {
        try {
            z1x0 z1x0VarMo41633f = ((fgx) this.f191127e).mo41633f(z);
            if (z1x0VarMo41633f == null) {
                return z1x0VarMo41633f;
            }
            z1x0VarMo41633f.f278435n = this;
            return z1x0VarMo41633f;
        } catch (IOException e) {
            ((x5x) this.f191125c).mo80130A((zuu0) this.f191124b, e);
            m73427l(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m73425j() {
        lg21 lg21Var = (lg21) this.f191126d;
        if (lg21Var != null) {
            if (((Boolean) lg21Var.f133058d.m79675a().getValue()).booleanValue() || ((Boolean) lg21Var.f133057c.m84985b().getValue()).booleanValue()) {
                lg21Var = null;
            }
            if (lg21Var != null) {
                lg21Var.m58926d();
            }
        }
        lg21 lg21Var2 = (lg21) this.f191126d;
        if (lg21Var2 != null) {
            lg21Var2.m58929h();
        }
        this.f191126d = null;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m73426k() {
        try {
            if (this.f191123a) {
                return;
            }
            this.f191123a = true;
            Context context = (Context) this.f191127e;
            if (context != null) {
                ((op4) this.f191125c).m67516a(context);
                context.unregisterComponentCallbacks((pp4) this.f191126d);
            }
            ((WeakReference) this.f191124b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m73427l(IOException iOException) {
        this.f191123a = true;
        ((fgx) this.f191127e).mo41637j().mo27264e((zuu0) this.f191124b, iOException);
    }

    /* JADX INFO: renamed from: m */
    public void m73428m(int i, int i2) {
        if (i < 0.0f) {
            pt40.m70891a("Index should be non-negative (" + i + ')');
        }
        ((vum0) this.f191124b).m86438w(i);
        ((nv70) this.f191127e).m65727a(i);
        ((vum0) this.f191125c).m86438w(i2);
    }

    /* JADX INFO: renamed from: n */
    public rb5 m73429n() throws SocketException {
        zuu0 zuu0Var = (zuu0) this.f191124b;
        if (zuu0Var.f286527X) {
            throw new IllegalStateException("Check failed.");
        }
        zuu0Var.f286527X = true;
        zuu0Var.f286535f.m59474j();
        synchronized (zuu0Var) {
            if (zuu0Var.f286525Q0 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (zuu0Var.f286521M0 || zuu0Var.f286522N0) {
                throw new IllegalStateException("Check failed.");
            }
            if (zuu0Var.f286529Z) {
                throw new IllegalStateException("Check failed.");
            }
            if (!zuu0Var.f286520L0) {
                throw new IllegalStateException("Check failed.");
            }
            zuu0Var.f286520L0 = false;
            zuu0Var.f286521M0 = true;
            zuu0Var.f286522N0 = true;
        }
        avu0 avu0Var = (avu0) ((fgx) this.f191127e).mo41637j();
        avu0Var.f20266e.setSoTimeout(0);
        avu0Var.mo27261b();
        return new rb5(this);
    }

    public qp4(Application application, c9k c9kVar, c4d1 c4d1Var) {
        this.f191124b = application;
        this.f191125c = c9kVar;
        this.f191126d = c4d1Var;
        application.registerActivityLifecycleCallbacks(new jhf1(c4d1Var));
    }

    public qp4(fcr fcrVar, hc80 hc80Var) {
        this.f191124b = hc80Var;
        wxf1.m89255l(l5h1.m58232p(hc80Var.getLifecycle()), b0g1.m27776L(fcrVar.m41340a(), new gm11(this, null, 2)));
    }

    public qp4(int i, int i2) {
        this.f191124b = bul.m30574z(i);
        this.f191125c = bul.m30574z(i2);
        this.f191127e = new nv70(i, 30, 100);
    }

    public qp4(hvu0 hvu0Var) {
        this.f191124b = new WeakReference(hvu0Var);
        this.f191125c = new op4(this, hvu0Var);
        this.f191126d = new pp4(this);
    }

    public qp4(zuu0 zuu0Var, x5x x5xVar, ggx ggxVar, fgx fgxVar) {
        this.f191124b = zuu0Var;
        this.f191125c = x5xVar;
        this.f191126d = ggxVar;
        this.f191127e = fgxVar;
    }

    public qp4(x2b x2bVar, nqr nqrVar) {
        this.f191127e = x2bVar;
        this.f191124b = nqrVar;
        ai21 ai21VarM65456d = nqrVar.m65456d(1);
        this.f191125c = ai21VarM65456d;
        this.f191126d = new v2b(x2bVar, this, ai21VarM65456d);
    }
}

package p204p;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nqr {

    /* JADX INFO: renamed from: a */
    public boolean f157320a;

    /* JADX INFO: renamed from: b */
    public final Object f157321b;

    /* JADX INFO: renamed from: c */
    public Object f157322c;

    /* JADX INFO: renamed from: d */
    public Object f157323d;

    public nqr() {
        this.f157321b = new Object();
        this.f157322c = new ArrayList();
        this.f157323d = new ArrayList();
        this.f157320a = true;
    }

    /* JADX INFO: renamed from: a */
    public void m65453a() {
        wqr wqrVar = (wqr) this.f157323d;
        synchronized (wqrVar) {
            try {
                if (this.f157320a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (wj50.m88271j(((pqr) this.f157321b).f180402g, this)) {
                    wqrVar.m88776c(this, false);
                }
                this.f157320a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m65454b() {
        wqr wqrVar = (wqr) this.f157323d;
        synchronized (wqrVar) {
            try {
                if (this.f157320a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (wj50.m88271j(((pqr) this.f157321b).f180402g, this)) {
                    wqrVar.m88776c(this, true);
                }
                this.f157320a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m65455c() {
        pqr pqrVar = (pqr) this.f157321b;
        if (wj50.m88271j(pqrVar.f180402g, this)) {
            wqr wqrVar = (wqr) this.f157323d;
            if (wqrVar.f254144Y) {
                wqrVar.m88776c(this, false);
            } else {
                pqrVar.f180401f = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public ai21 m65456d(int i) {
        wqr wqrVar = (wqr) this.f157323d;
        synchronized (wqrVar) {
            if (this.f157320a) {
                throw new IllegalStateException("Check failed.");
            }
            if (!wj50.m88271j(((pqr) this.f157321b).f180402g, this)) {
                return kif1.m56498g();
            }
            if (!((pqr) this.f157321b).f180400e) {
                boolean[] zArr = (boolean[]) this.f157322c;
                wj50.m88279p(zArr);
                zArr[i] = true;
            }
            try {
                return new dey(wqrVar.f254147b.mo40347k((tbn0) ((pqr) this.f157321b).f180399d.get(i), false), new ta31(2, wqrVar, this));
            } catch (FileNotFoundException unused) {
                return kif1.m56498g();
            }
        }
    }

    public nqr(xv41 xv41Var, hc80 hc80Var, ron0 ron0Var, zxx0 zxx0Var, hmx hmxVar, boolean z, boolean z2) {
        fiz fizVarM65834m;
        this.f157321b = ron0Var;
        this.f157320a = z;
        zv41 zv41VarM52819d = jag1.m52819d("");
        this.f157322c = zv41VarM52819d;
        zux zuxVarM43299d = g0g1.m43299d(hmxVar.m47991a(), new l181(zxx0Var.mo27555a(), 8), new adm0(17));
        fbk fbkVar = null;
        if (z2) {
            fizVarM65834m = xtm0.m92074U(zv41VarM52819d, new zf01(fbkVar, this, 18));
        } else {
            fizVarM65834m = nxf1.m65834m(Boolean.FALSE);
        }
        this.f157323d = bzf1.m31029u(g0g1.m43301f(zv41VarM52819d, xv41Var, zuxVarM43299d, fizVarM65834m, new yio0(this, fbkVar, 1)), n5h1.m63737m(hc80Var), hf11.m47320a(2, 5000L), new a191());
    }

    public nqr(wqr wqrVar, pqr pqrVar) {
        boolean[] zArr;
        this.f157323d = wqrVar;
        this.f157321b = pqrVar;
        if (pqrVar.f180400e) {
            zArr = null;
        } else {
            wqrVar.getClass();
            zArr = new boolean[2];
        }
        this.f157322c = zArr;
    }
}

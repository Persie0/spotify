package p204p;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class nad {

    /* JADX INFO: renamed from: a */
    public final xre f152042a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f152043b;

    /* JADX INFO: renamed from: c */
    public final y2d f152044c;

    /* JADX INFO: renamed from: d */
    public final ynb f152045d;

    /* JADX INFO: renamed from: e */
    public final g3d f152046e;

    public nad(xre xreVar, z9j0 z9j0Var, y2d y2dVar, ynb ynbVar, g3d g3dVar) {
        this.f152042a = xreVar;
        this.f152043b = z9j0Var;
        this.f152044c = y2dVar;
        this.f152045d = ynbVar;
        this.f152046e = g3dVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m63984a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ((wy3) this.f152042a).getClass();
        return timeUnit.toSeconds(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public final void m63985b(ykd ykdVar, gh00 gh00Var) {
        boolean z = ykdVar instanceof nkd;
        ujd ujdVar = ujd.f230970a;
        vjd vjdVar = vjd.f241952a;
        akd akdVar = akd.f16489a;
        wjd wjdVar = wjd.f251942a;
        tjd tjdVar = tjd.f220893a;
        yjd yjdVar = yjd.f273344a;
        wkd wkdVar = wkd.f252209a;
        if (!z && !ykdVar.equals(wkdVar) && !ykdVar.equals(ckd.f38921a) && !(ykdVar instanceof tkd) && !(ykdVar instanceof skd) && !(ykdVar instanceof jkd) && !(ykdVar instanceof kkd) && !ykdVar.equals(yjdVar) && !ykdVar.equals(tjdVar) && !(ykdVar instanceof bkd) && !(ykdVar instanceof mkd) && !(ykdVar instanceof ukd) && !ykdVar.equals(wjdVar) && !ykdVar.equals(ikd.f103089a) && !ykdVar.equals(akdVar) && !(ykdVar instanceof zjd) && !(ykdVar instanceof ekd) && !(ykdVar instanceof pkd) && !ykdVar.equals(hkd.f92420a) && !(ykdVar instanceof qkd) && !ykdVar.equals(vjdVar) && !ykdVar.equals(ujdVar) && !(ykdVar instanceof rkd) && !(ykdVar instanceof fkd) && !ykdVar.equals(okd.f166316a)) {
            if (ykdVar instanceof gkd) {
                gh00Var.invoke(new a9d(((gkd) ykdVar).f80782a, m63984a()));
                return;
            }
            if (ykdVar instanceof lkd) {
                lkd lkdVar = (lkd) ykdVar;
                gh00Var.invoke(new h9d(lkdVar.f134325a, lkdVar.f134326b, m63984a()));
                return;
            }
            if (ykdVar instanceof xjd) {
                l44 l44Var = this.f152045d.f274426a;
                if (l44Var.m58075h() && l44Var.m58081k()) {
                    this.f152046e.f76180b.mo25060a(w2a1.f247311a, null);
                    return;
                }
                zx9 zx9Var = new zx9(25, gh00Var);
                y2d y2dVar = this.f152044c;
                i3d i3dVar = (i3d) y2dVar.f268540b.mo25006a();
                c700 c700Var = y2dVar.f268539a;
                i3dVar.f98137W1 = new z9b(i3dVar, y2dVar, zx9Var, 7);
                i3dVar.f98139Y1 = false;
                i3dVar.mo63162p1(c700Var, j3d.f108359a);
                return;
            }
            boolean z2 = ykdVar instanceof xkd;
            z9j0 z9j0Var = this.f152043b;
            if (z2) {
                String str = ((xkd) ykdVar).f262341a;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, null));
                return;
            }
            if (ykdVar.equals(dkd.f49958a)) {
                z9j0Var.mo47345e();
                return;
            } else {
                if (!(ykdVar instanceof vkd)) {
                    throw new NoWhenBranchMatchedException();
                }
                gh00Var.invoke(new ead(((vkd) ykdVar).f242208a));
                return;
            }
        }
        if (ykdVar instanceof ckd) {
            gh00Var.invoke(h8d.f88680a);
            return;
        }
        if (ykdVar instanceof pkd) {
            gh00Var.invoke(new n9d(((pkd) ykdVar).f178446a));
            return;
        }
        if (ykdVar instanceof qkd) {
            qkd qkdVar = (qkd) ykdVar;
            gh00Var.invoke(new o9d(qkdVar.f189535a, qkdVar.f189536b));
            return;
        }
        if (ykdVar instanceof skd) {
            gh00Var.invoke(new x9d(((skd) ykdVar).f210078a, m63984a()));
            return;
        }
        if (ykdVar instanceof tkd) {
            xcl0 xcl0Var = ((tkd) ykdVar).f221122a;
            if (xcl0Var instanceof qcl0) {
                gh00Var.invoke(new aad(((qcl0) xcl0Var).f187383a, m63984a()));
                return;
            } else {
                gh00Var.invoke(new bad((ocl0) xcl0Var, m63984a()));
                return;
            }
        }
        if (ykdVar instanceof rkd) {
            rkd rkdVar = (rkd) ykdVar;
            String str2 = rkdVar.f200053a;
            xcl0 xcl0Var2 = rkdVar.f200054b;
            if (xcl0Var2 instanceof qcl0) {
                gh00Var.invoke(new v9d(str2, ((qcl0) xcl0Var2).f187383a, m63984a()));
                return;
            } else {
                gh00Var.invoke(new w9d(str2, (ocl0) xcl0Var2, m63984a()));
                return;
            }
        }
        if (ykdVar instanceof okd) {
            gh00Var.invoke(k9d.f120566a);
            return;
        }
        if (ykdVar instanceof fkd) {
            gh00Var.invoke(new w8d(((fkd) ykdVar).f70527a));
            return;
        }
        if (ykdVar instanceof ukd) {
            gh00Var.invoke(new dad(((ukd) ykdVar).f231278a));
            return;
        }
        if (wj50.m88271j(ykdVar, wkdVar)) {
            gh00Var.invoke(fad.f67510a);
            return;
        }
        if (wj50.m88271j(ykdVar, tjdVar)) {
            gh00Var.invoke(u7d.f227573a);
            return;
        }
        if (ykdVar instanceof ekd) {
            gh00Var.invoke(new p8d(((ekd) ykdVar).f60428a));
            return;
        }
        if (ykdVar instanceof ikd) {
            gh00Var.invoke(d9d.f46794a);
            return;
        }
        if (ykdVar instanceof hkd) {
            gh00Var.invoke(c9d.f35463a);
            return;
        }
        if (wj50.m88271j(ykdVar, yjdVar)) {
            gh00Var.invoke(z7d.f280171a);
            return;
        }
        if (ykdVar instanceof zjd) {
            gh00Var.invoke(new a8d(((zjd) ykdVar).f283422a));
            return;
        }
        if (ykdVar instanceof jkd) {
            gh00Var.invoke(new f9d(((jkd) ykdVar).f113285a));
            return;
        }
        if (ykdVar instanceof kkd) {
            kkd kkdVar = (kkd) ykdVar;
            gh00Var.invoke(new g9d(kkdVar.f123569b, kkdVar.f123568a));
            return;
        }
        if (ykdVar instanceof bkd) {
            bkd bkdVar = (bkd) ykdVar;
            gh00Var.invoke(new e8d(bkdVar.f27904a, bkdVar.f27905b));
            return;
        }
        if (ykdVar instanceof mkd) {
            mkd mkdVar = (mkd) ykdVar;
            gh00Var.invoke(new i9d(mkdVar.f144554a, mkdVar.f144555b));
            return;
        }
        boolean zM88271j = wj50.m88271j(ykdVar, vjdVar);
        w7d w7dVar = w7d.f248640a;
        if (zM88271j) {
            gh00Var.invoke(w7dVar);
            return;
        }
        if (wj50.m88271j(ykdVar, ujdVar)) {
            gh00Var.invoke(r8d.f196770a);
            return;
        }
        if (wj50.m88271j(ykdVar, akdVar)) {
            gh00Var.invoke(q8d.f186304a);
            return;
        }
        if (wj50.m88271j(ykdVar, wjdVar)) {
            gh00Var.invoke(w7dVar);
        } else if (z) {
            nkd nkdVar = (nkd) ykdVar;
            gh00Var.invoke(new j9d(nkdVar.f154855a, nkdVar.f154856b));
        }
    }
}

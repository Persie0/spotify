package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class mcu0 {

    /* JADX INFO: renamed from: a */
    public final nuu0 f142253a;

    public mcu0(luk lukVar, gcu0 gcu0Var) {
        this.f142253a = bzf1.m31029u(gcu0Var.mo44322d(), kk40.m56661c(mlg1.m62205A(njg1.m64613f(), lukVar).mo26608y(new uuk("ReachabilityMonitorConnectionApis")).mo26608y(new g12(14))), hf11.f90581a, new zbu0(null));
    }

    /* JADX INFO: renamed from: a */
    public static g0j m61494a(acu0 acu0Var) {
        if (acu0Var instanceof ybu0) {
            return g0j.f75376f;
        }
        if (!(acu0Var instanceof zbu0)) {
            throw new NoWhenBranchMatchedException();
        }
        Set set = ((zbu0) acu0Var).f281395a;
        return (set == null || set.contains(tgj0.f220201b)) ? g0j.f75380t : g0j.f75372X;
    }

    /* JADX INFO: renamed from: b */
    public final g0j m61495b() {
        return m61494a((acu0) this.f142253a.f158717a.getValue());
    }

    /* JADX INFO: renamed from: c */
    public final Observable m61496c() {
        return k0e1.m54988g(new r1a(this.f142253a, this, 15), dau.f47107a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61497d() {
        return this.f142253a.f158717a.getValue() instanceof zbu0;
    }

    /* JADX INFO: renamed from: e */
    public final Observable m61498e() {
        return k0e1.m54988g(new j5t0(this.f142253a, 13), dau.f47107a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m61499f() {
        acu0 acu0Var = (acu0) this.f142253a.f158717a.getValue();
        if (!(acu0Var instanceof ybu0)) {
            return false;
        }
        nqj0 nqj0Var = ((ybu0) acu0Var).f271248a;
        return (nqj0Var instanceof mqj0) && ((mqj0) nqj0Var).f146303b;
    }
}

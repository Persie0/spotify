package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class kkp implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f123678b;

    public /* synthetic */ kkp(Object obj, int i) {
        this.f123677a = i;
        this.f123678b = obj;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [p.jkx0] */
    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        String string;
        switch (this.f123677a) {
            case 0:
                lkp lkpVar = (lkp) this.f123678b;
                lkpVar.f134415c.onNext(ta80.ON_CREATE);
                lkpVar.f134420h.onNext(bvl0.f31393a);
                return;
            case 1:
                p2q p2qVar = (p2q) this.f123678b;
                wg61 wg61Var = p2qVar.f173393W0;
                r55 r55Var = p2qVar.f173399b;
                ((f9y0) r55Var.f42740d.f136904c).m41110c("root-ui-saved-state", new m2q(p2qVar, 0));
                ltx0 ltx0Var = r55Var.f42740d;
                Bundle bundleM41108a = ((f9y0) ltx0Var.f136904c).m41108a("root-ui-saved-state");
                gkx0 gkx0Var = bundleM41108a != null ? (gkx0) bundleM41108a.getParcelable("root-contraption-saved-state-key") : null;
                boolean z = gkx0Var == null;
                Parcelable parcelable = bundleM41108a != null ? bundleM41108a.getParcelable("logged-in-ui-saved-state") : null;
                dxn dxnVar = p2qVar.f173402e;
                if (!p2qVar.f173389S0) {
                    p2qVar.f173388R0 = parcelable;
                }
                jhp jhpVar = new jhp(p2qVar, 23);
                hgl hglVar = new hgl(0, p2qVar, p2q.class, "ensureLoggedInUiDetached", "ensureLoggedInUiDetached()V", 0, 0, 11);
                vub0 vub0Var = p2qVar.f173403f;
                gkx0 gkx0Var2 = gkx0Var;
                pwn pwnVar = dxnVar.f54034a;
                otn otnVar = pwnVar.f182076c;
                final m500 m500Var = (m500) otnVar.f169701f.f246642a;
                exn exnVar = (exn) otnVar.f169633b.f171365o6.get();
                kkx0 kkx0Var = new kkx0(m500Var, exnVar, otnVar.f169633b.m68295W1(), (nkq) otnVar.f169633b.f171374p6.get(), fkx0.m41961t((hdl0) otnVar.f169633b.f171383q6.get()), (oxe) pwnVar.f182075b.f212515w1.get(), gkx0Var2, jhpVar, hglVar, p2qVar, vub0Var);
                gc5 gc5Var = gkx0Var2 != null ? gkx0Var2.f80951b : null;
                prv0 prv0Var = new prv0(kkx0Var, 6);
                gc5 gc5Var2 = gc5Var;
                hkx0 hkx0Var = new hkx0(kkx0Var);
                ikx0 ikx0Var = new ikx0(kkx0Var);
                ?? r10 = new gi00() { // from class: p.jkx0
                    public final boolean equals(Object obj) {
                        if (obj instanceof jkx0) {
                            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // p204p.gi00
                    public final ai00 getFunctionDelegate() {
                        return new ri00(0, m500Var, m500.class, "getIntent", "getIntent()Landroid/content/Intent;", 0, 0);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                };
                otn otnVar2 = exnVar.f63803a.f182076c;
                fxn fxnVar = (fxn) otnVar2.f169633b.f171338l6.get();
                gxn gxnVar = (gxn) otnVar2.f169633b.f171356n6.get();
                kc5 kc5Var = new kc5(gc5Var2, m500Var, hkx0Var, ikx0Var, vub0Var, r10, m500Var, p2qVar, prv0Var, fxnVar, gxnVar);
                hzd0 hzd0Var = (hzd0) kc5Var.f121372h;
                w221 w221Var = new w221((jkx0) r10, m500Var);
                ((xoi0) w221Var.f247211b).mo33104m(a641.f12693a);
                kc5Var.f121369e = w221Var;
                wya0 wya0Var = gc5Var2 != null ? gc5Var2.f78493a : null;
                hxn hxnVar = (hxn) gxnVar.f85307a.f182076c.f169633b.f171347m6.get();
                wya0 wya0Var2 = wya0Var;
                tw80 tw80Var = new tw80(m500Var, wya0Var2, p2qVar, vub0Var, prv0Var, hxnVar);
                cyz0 cyz0Var = wya0Var2 != null ? wya0Var2.f256245a : null;
                son sonVar = hxnVar.f96248a.f182075b;
                rvw0 rvw0Var = new rvw0(cyz0Var, (Flowable) sonVar.f211567N2.get(), sonVar.f212578yc, sonVar.f212489v1, (qwx0) sonVar.f211648Q2.get());
                tw80Var.f224371g = rvw0Var;
                ((xoi0) rvw0Var.f203144f).m33100g(new iz0(tw80Var, 28));
                r12 r12Var = new r12(tw80Var, 5);
                tw80Var.f224372h = r12Var;
                m500Var.f31643a.mo31986a(r12Var);
                kc5Var.f121370f = tw80Var;
                w221 w221Var2 = (w221) kc5Var.f121369e;
                if (w221Var2 == null) {
                    wj50.m88260d0("splashScreenContraption");
                    throw null;
                }
                xoi0 xoi0Var = (xoi0) w221Var2.f247211b;
                xoi0 xoi0Var2 = (xoi0) tw80Var.f224370f;
                int i = 0;
                hzd0Var.mo49264n(xoi0Var, new ic5(i, xoi0Var2, kc5Var));
                hzd0Var.mo49264n(xoi0Var2, new jc5(i, xoi0Var, kc5Var));
                kkx0Var.f123732h = kc5Var;
                ((hzd0) kc5Var.f121373i).m33100g(new jj3(kkx0Var, 7));
                p2qVar.f173390T0 = kkx0Var;
                ((hc80) wg61Var.getValue()).getLifecycle().mo31986a(new o2q(p2qVar, z));
                ((f9y0) ltx0Var.f136904c).m41110c("INSTANCE_STATE_RECEIVING_PLUGIN_POINT", new C1982ik(p2qVar, 5));
                ((hc80) wg61Var.getValue()).getLifecycle().mo31986a(new dxi(p2qVar, 1));
                wa81.m87586a(p2qVar.f173383M0, "LoggedInUi", null, 2);
                p2qVar.f173397Z.m55145a();
                return;
            case 2:
                vmj0 vmj0Var = (vmj0) this.f123678b;
                ((f9y0) vmj0Var.f242850a.f42740d.f136904c).m41110c("INSTANCE_STATE_RECEIVING_PLUGIN_POINT", new C1982ik(vmj0Var, 12));
                ((hc80) vmj0Var.f242843R0.getValue()).getLifecycle().mo31986a(new dxi(vmj0Var, 3));
                vmj0Var.f242857h.m55145a();
                wa81.m87586a(vmj0Var.f242858i, "LoggedInUi", null, 2);
                return;
            case 3:
                jrw0 jrw0Var = (jrw0) this.f123678b;
                Bundle bundleM41108a2 = jrw0Var.f115329g.mo34135x().m41108a("report_blocking_state");
                if (jrw0Var.f115330h == null) {
                    jrw0Var.f115330h = bundleM41108a2 != null ? (hrw0) bundleM41108a2.getParcelable("report_blocking_data") : null;
                }
                if (jrw0Var.f115332j.length() == 0) {
                    if (bundleM41108a2 == null || (string = bundleM41108a2.getString("report_blocking_entity_uri")) == null) {
                        string = "";
                    }
                    jrw0Var.f115332j = string;
                    return;
                }
                return;
            default:
                fve1 fve1Var = ((vwe1) this.f123678b).f245485a;
                fve1Var.f73776c.m60127a(fve1Var.f73777d.switchMap(new va91(fve1Var, 17)).subscribe(new gzc1(fve1Var, 11), u9w0.f228291O0));
                return;
        }
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f123677a) {
            case 0:
                ((lkp) this.f123678b).f134415c.onNext(ta80.ON_DESTROY);
                return;
            case 1:
                p2q p2qVar = (p2q) this.f123678b;
                p2qVar.f173397Z.m55146b();
                kkx0 kkx0Var = p2qVar.f173390T0;
                if (kkx0Var != null) {
                    kc5 kc5Var = (kc5) kkx0Var.f123732h;
                    if (kc5Var == null) {
                        wj50.m88260d0("appLoggedInStateContraption");
                        throw null;
                    }
                    if (((w221) kc5Var.f121369e) == null) {
                        wj50.m88260d0("splashScreenContraption");
                        throw null;
                    }
                    tw80 tw80Var = (tw80) kc5Var.f121370f;
                    if (tw80Var == null) {
                        wj50.m88260d0("loggedInContraption");
                        throw null;
                    }
                    gb80 lifecycle = ((hc80) tw80Var.f224366b).getLifecycle();
                    r12 r12Var = (r12) tw80Var.f224372h;
                    if (r12Var == null) {
                        wj50.m88260d0("observer");
                        throw null;
                    }
                    lifecycle.mo31988d(r12Var);
                    rvw0 rvw0Var = (rvw0) tw80Var.f224371g;
                    if (rvw0Var == null) {
                        wj50.m88260d0("sessionContraption");
                        throw null;
                    }
                    ((iwr) rvw0Var.f203145g).m51847a();
                    ((xoi0) rvw0Var.f203144f).mo33104m(yl7.f273926a);
                    flw0 flw0Var = (flw0) kc5Var.f121371g;
                    if (flw0Var != null) {
                        ((gb80) flw0Var.f70878b).mo31988d((r12) flw0Var.f70880d);
                        ((xoi0) flw0Var.f70879c).mo33104m(q301.f184771b);
                    }
                    kc5Var.f121371g = null;
                    return;
                }
                return;
            case 2:
                ((vmj0) this.f123678b).f242857h.m55146b();
                return;
            case 3:
                ((jrw0) this.f123678b).f115329g.getLifecycle().mo31988d(this);
                return;
            default:
                hve1 hve1Var = ((vwe1) this.f123678b).f245486b;
                synchronized (hve1Var) {
                    try {
                        Iterator it = hve1Var.f95696a.iterator();
                        while (it.hasNext()) {
                            ((Connection) it.next()).dispose();
                        }
                        hve1Var.f95696a.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((vwe1) this.f123678b).f245485a.f73776c.m60129c();
                ((vwe1) this.f123678b).f245487c.f84741c.m60129c();
                hc80Var.getLifecycle().mo31988d(this);
                return;
        }
    }
}

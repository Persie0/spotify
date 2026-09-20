package p204p;

import com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class vvk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f245247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvk0(Object obj, int i) {
        super(0);
        this.f245246a = i;
        this.f245247b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        m500 m500VarM49715n0;
        switch (this.f245246a) {
            case 0:
                return new cjc0(((xvk0) this.f245247b).f266416a, uok0.f232464W0);
            case 1:
                return new C1873fu((ql9) this.f245247b, (byte) 0);
            case 2:
                return new en2((nvc) this.f245247b, (byte) 0);
            case 3:
                return new C1873fu((pvc) this.f245247b);
            case 4:
                return (pjh) ((i4t0) ((h1l0) this.f245247b).f86656b).get();
            case 5:
                cji0 cji0Var = (cji0) this.f245247b;
                return new lq0(new yiu(3, ((eju) cji0Var.f38593c).f60294b, (g3f) cji0Var.f38598h), (n430) cji0Var.f38597g, (s4k) cji0Var.f38596f);
            case 6:
                ctj ctjVar = ((h6l0) this.f245247b).f88184c;
                atj atjVar = ctjVar instanceof atj ? (atj) ctjVar : null;
                if (atjVar != null) {
                    return atjVar.f19698a;
                }
                return null;
            case 7:
                return jsf1.m54238k(((e9l0) this.f245247b).f57470b);
            case 8:
                return jsf1.m54238k(((fal0) this.f245247b).f67582e);
            case 9:
                cdp cdpVar = (cdp) ((tb5) this.f245247b).f218756b;
                cdpVar.f36928e.m60127a(q0f1.m71846z(((a7r) cdpVar.f36925b.get()).f13126a, new String[]{"DeviceLastConnection"}, new mgi(10)).firstElement().m23373k(cdpVar.f36927d).subscribe(new g8f(cdpVar, 27)));
                return w2a1.f247311a;
            case 10:
                return new cjc0((bmh) ((xuk0) this.f245247b).f266127b, mxk0.f148080X0);
            case 11:
                return Boolean.valueOf(((tnk0) ((yk0) this.f245247b).f273514c).mo75867h(ra81.HITCHES));
            case 12:
                return new SchedulerWorkRunner((Scheduler) ((wa30) this.f245247b).f249354c);
            case 13:
                ((OutputSwitcherJamLauncherActivity) this.f245247b).finish();
                return w2a1.f247311a;
            case 14:
                ((lzl0) ((yk0) this.f245247b).f273514c).mo24869a();
                return w2a1.f247311a;
            case 15:
                c1m0 c1m0Var = (c1m0) this.f245247b;
                z0m0 z0m0Var = c1m0Var.f33152a;
                qf40 qf40Var = (qf40) z0m0Var.m95080a().f118391c.getValue();
                q9j0 q9j0Var = c1m0Var.f33154c;
                l5j0 l5j0Var = c1m0Var.f33155d;
                l8j0 l8j0VarMo58241d = l5j0Var.mo58241d();
                b1m0 b1m0Var = b1m0.f22376h;
                q9j0Var.getClass();
                if (q9j0.m72404a(l8j0VarMo58241d, qf40Var, b1m0Var).f99747a == 4) {
                    l5j0Var.mo58240c(l5j0Var.mo58250m());
                    l5j0Var.mo58253p(null);
                }
                j1m0.m52166a(z0m0Var.m95080a().f118393e);
                return w2a1.f247311a;
            case 16:
                return ((w2m0) this.f245247b).f247387b.m96988u(13);
            case 17:
                return ((a3m0) this.f245247b).f12000a.m96988u(5);
            case 18:
                return ((w2m0) this.f245247b).f247387b.m96988u(9);
            case 19:
                ((xi8) this.f245247b).m91095f();
                return w2a1.f247311a;
            case 20:
                kbm0 kbm0Var = ((nbm0) ((ykn) this.f245247b).f273761g).get();
                if (kbm0Var != null) {
                    return kbm0Var.f121231a;
                }
                return null;
            case 21:
                h9y0 h9y0Var = (h9y0) this.f245247b;
                return Boolean.valueOf(h9y0Var instanceof m500 ? ((m500) h9y0Var).isChangingConfigurations() : (!(h9y0Var instanceof i500) || (m500VarM49715n0 = ((i500) h9y0Var).m49715n0()) == null) ? false : m500VarM49715n0.isChangingConfigurations());
            case 22:
                dii0 dii0Var = (dii0) this.f245247b;
                return new qq91((kv91) ((dcm0) dii0Var.f49377b).m35664b(kv91.class), (thm0) dii0Var.f49378c);
            case 23:
                dcm0 dcm0Var = ((f9m0) this.f245247b).f67303a;
                try {
                    anm0 anm0Var = (anm0) dcm0Var.m35664b(anm0.class);
                    kv91 kv91VarM29064G = bga.m29064G(dcm0Var);
                    lt91 lt91Var = (lt91) dcm0Var.m35664b(lt91.class);
                    qu91 qu91VarM29063F = bga.m29063F(dcm0Var);
                    if (qu91VarM29063F != null) {
                        return new qcm0(kv91VarM29064G, lt91Var, qu91VarM29063F, anm0Var.mo2758g());
                    }
                    throw new IllegalStateException("A page hosting the NPV must declare PageBoundLogger(true) and UbiProperties(isUbiImpressionV2LoggingEnabled = true)");
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("A page hosting the NPV must declare PageBoundLogger(true) and UbiProperties(isUbiImpressionV2LoggingEnabled = true)", e);
                }
            case 24:
                return (cwf) ((s2o) this.f245247b).f205039f;
            case 25:
                return new ccm0((fcm0) this.f245247b);
            case 26:
                cdm0 cdm0Var = (cdm0) this.f245247b;
                bji bjiVar = cdm0Var.f36912c;
                if (bjiVar != null) {
                    return (cdm0) bjiVar.mo29483e(new c3f(cdm0Var, 26));
                }
                return null;
            case 27:
                ldm0 ldm0Var = (ldm0) this.f245247b;
                bji bjiVar2 = ldm0Var.f132298b;
                if (bjiVar2 != null) {
                    return (ldm0) bjiVar2.mo29483e(new c3f(ldm0Var, 27));
                }
                return null;
            case 28:
                mdm0 mdm0Var = (mdm0) this.f245247b;
                bji bjiVar3 = mdm0Var.f142454e;
                if (bjiVar3 != null) {
                    return (mdm0) bjiVar3.mo29483e(new au3(mdm0Var, 15));
                }
                return null;
            default:
                Map map = (Map) ((mc01) ((dii0) this.f245247b).f49377b).f142007b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    lc01 lc01VarM61432a = mc01.m61432a((cbm0) entry.getKey(), (List) entry.getValue());
                    if (lc01VarM61432a != null) {
                        arrayList.add(lc01VarM61432a);
                    }
                }
                Set<lc01> setM43736n1 = g6f.m43736n1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (lc01 lc01Var : setM43736n1) {
                    sb01 sb01VarCreate = ((tb01) lc01Var.mo27096d().get()).create();
                    List<sd01> listM51276n = ipg1.m51276n(sb01VarCreate, di50.f49253f);
                    ArrayList arrayList3 = new ArrayList();
                    for (sd01 sd01Var : listM51276n) {
                        qf40 qf40Var2 = sd01Var.f207848e;
                        ArrayList arrayList4 = new ArrayList(i6f.m49804T(qf40Var2, 10));
                        Iterator<E> it = qf40Var2.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new ufm0(lc01Var, sb01VarCreate.f207311a, sb01VarCreate.f207312b, sd01Var, (na01) it.next()));
                        }
                        j6f.m52564V(arrayList4, arrayList3);
                    }
                    j6f.m52564V(arrayList3, arrayList2);
                }
                return arrayList2;
        }
    }
}

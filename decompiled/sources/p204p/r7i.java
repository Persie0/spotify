package p204p;

import android.net.ConnectivityManager;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.music.R;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class r7i extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196595a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f196596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7i(Object obj, int i) {
        super(0);
        this.f196595a = i;
        this.f196596b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.List] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f196595a) {
            case 0:
                wy3 wy3Var = new wy3();
                Scheduler scheduler = AndroidSchedulers.f7175a;
                RxAndroidPlugins.m23280b(scheduler);
                return new kb80(((s7i) this.f196596b).f206374d.getLifecycle(), wy3Var, scheduler);
            case 1:
                ((c8i) this.f196596b).f35239p.f45452k.setValue(null);
                return w2a1.f247311a;
            case 2:
                pci pciVar = (pci) this.f196596b;
                bji bjiVar = pciVar.f176113b;
                if (bjiVar != null) {
                    return (pci) bjiVar.mo29483e(new c3f(pciVar, 5));
                }
                return null;
            case 3:
                ngi ngiVar = (ngi) this.f196596b;
                return new cjc0(ngiVar.f153711a, new mgi(ngiVar, 0));
            case 4:
                C1947hm c1947hm = (C1947hm) this.f196596b;
                return ((l5p) c1947hm.f92784d).m58256a((pgo) c1947hm.f92783c);
            case 5:
                yii yiiVar = (yii) this.f196596b;
                kv91 kv91Var = yiiVar.f273126D1;
                Object obj = null;
                if (kv91Var == null) {
                    wj50.m88260d0("ubiLogger");
                    throw null;
                }
                hhh0 hhh0Var = yiiVar.f273127E1;
                if (hhh0Var == null) {
                    wj50.m88260d0("startRetryScreenEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c = hhh0Var.f91388a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("try_again_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57452p(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
                aji ajiVar = yiiVar.f273125C1;
                if (ajiVar == null) {
                    wj50.m88260d0("configurationLoadingTracking");
                    throw null;
                }
                ajiVar.f16279a.mo59114a(new sbq0("start_retry", "retry", n850.f151357c, null));
                if0 if0Var = yiiVar.f273124B1;
                if (if0Var != null) {
                    if0Var.m50412d(new j0r(true), new mab0(obj, 10), true);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("zeroNavigator");
                throw null;
            case 6:
                return bga.m29064G(((z42) this.f196596b).f279097b);
            case 7:
                return opo.m67570t(njg1.m64613f(), ((toi) this.f196596b).f222268e);
            case 8:
                fqi fqiVar = (fqi) this.f196596b;
                if (fqiVar.f72223c) {
                    fqiVar.f72223c = false;
                    fqiVar.f72222b.invoke();
                }
                return w2a1.f247311a;
            case 9:
                return (prd1) ((tti) this.f196596b).f223613b.get();
            case 10:
                luk lukVar = ((gzi) this.f196596b).f85953d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return kk40.m56661c(opo.m67570t(lukVar, x461VarM64613f).mo26608y(new uuk("ConnectionQualityDataSaver")));
            case 11:
                return Boolean.valueOf(((hv31) ((n6i) this.f196596b).f150891b).mo48713h(h0j.f86304a, false));
            case 12:
                return (ConnectivityManager) ((nn3) this.f196596b).f156318a.getApplicationContext().getSystemService(ConnectivityManager.class);
            case 13:
                return new s5u(((r1j) this.f196596b).f194869a.m44321c(), Integer.valueOf(R.string.settings_disabled_reason_offline), 2);
            case 14:
                suj sujVar = (suj) ((mrm) this.f196596b).f146579a.f222833b;
                gfi0 gfi0Var = (gfi0) ((ifn) sujVar.f214135a).f101788a.f169770j3.get();
                jg31.m53271i(gfi0Var);
                String strM58011d = ((l3n) sujVar.f214136b).m58011d();
                hg6 hg6Var = (hg6) ((ifn) sujVar.f214135a).f101788a.f169605Z5.get();
                jg31.m53271i(hg6Var);
                return new cjc0(new C1947hm(gfi0Var, strM58011d, hg6Var), ubj.f228798f);
            case 15:
                return (pjh) ((mhj) this.f196596b).f143801a.get();
            case 16:
                return (ijc1) ((foj) this.f196596b).invoke();
            case 17:
                ky70 ky70VarM76692g = ((ry70) this.f196596b).m76692g();
                int i = ky70VarM76692g.f127704l;
                my70 my70Var = (my70) g6f.m43689C0(ky70VarM76692g.f127705m);
                boolean z = false;
                int i2 = my70Var != null ? my70Var.f148333a : 0;
                if (i > 0 && i2 >= i - 8) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                orj orjVar = (orj) this.f196596b;
                dom domVar = orjVar.f168605d;
                pgo pgoVar = orjVar.f168602a;
                x28 x28Var = (x28) domVar.f51068a.f210441c;
                z9j0 z9j0VarMo26823c = ((aqj) x28Var.f257385d).mo26823c();
                jg31.m53271i(z9j0VarMo26823c);
                x28Var.getClass();
                aqj aqjVar = (aqj) x28Var.f257385d;
                Single singleMo26816M0 = aqjVar.mo26816M0();
                jg31.m53271i(singleMo26816M0);
                fk60 fk60VarMo26827j0 = aqjVar.mo26827j0();
                jg31.m53271i(fk60VarMo26827j0);
                return new qkv(pgoVar, z9j0VarMo26823c, new s1v0(singleMo26816M0, fk60VarMo26827j0, (edv) ((h4t0) x28Var.f257390i).get()), (slm) x28Var.f257376L0);
            case 19:
                return Integer.valueOf(((vum0) ((dxp) this.f196596b).f264315d.f99667c).m86437v());
            case 20:
                gwj gwjVar = (gwj) this.f196596b;
                return gwjVar.f85019c.m90262a(gwjVar.f85024h, false, Mode.MARTINI);
            case 21:
                return Integer.valueOf((int) (((Number) ((n3k) this.f196596b).f148353Q1.getValue()).intValue() * 0.6f));
            case 22:
                g4k g4kVar = (g4k) this.f196596b;
                return new cjc0(g4kVar.f76432b.m81357a(new it9(g4kVar, 17)), v0k.f236019R0);
            case 23:
                ((flw0) this.f196596b).m42035u();
                return w2a1.f247311a;
            case 24:
                ((di8) this.f196596b).f49275a.invoke(afb0.f15110a);
                return w2a1.f247311a;
            case 25:
                b7k b7kVar = (b7k) this.f196596b;
                return new cjc0(((trm) b7kVar.f24303e).m81357a(new gd8(b7kVar, 24)), v0k.f236031a1);
            case 26:
                if (((String) ((b9k) this.f196596b).f24962h) != null) {
                    return w2a1.f247311a;
                }
                wj50.m88260d0("scopeName");
                throw null;
            case 27:
                pak pakVar = (pak) this.f196596b;
                pakVar.f175546b.getClass();
                return new cjc0(new agc(5), new mgi(pakVar, 3));
            case 28:
                return new geg0(((ydk) this.f196596b).f271777a);
            default:
                qfk qfkVar = (qfk) this.f196596b;
                String str = qfkVar.f188219b.f208606b;
                qfkVar.f188221d.m36866a(qfkVar.f188220c, str, qlk.m73233l(str, null));
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i(b9k b9kVar, String str) {
        super(0);
        this.f196595a = 26;
        this.f196596b = b9kVar;
    }
}

package p204p;

import android.app.Application;
import android.app.UiModeManager;
import android.net.Uri;
import android.os.Debug;
import android.view.ViewGroup;
import com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase_Impl;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.music.R;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class nry extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f157625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nry(Object obj, int i) {
        super(0);
        this.f157624a = i;
        this.f157625b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Double dM29805p0;
        wko wkoVar;
        fbk fbkVar = null;
        int i = 1;
        int i2 = 0;
        switch (this.f157624a) {
            case 0:
                bsa bsaVar = (bsa) this.f157625b;
                yzo0 yzo0Var = (yzo0) bsaVar.f30268d;
                Uri uri = Uri.parse(yzo0Var.f277859a.f128765a);
                String strM27406u = axf1.m27406u(yzo0Var);
                boolean z = wj50.m88271j(yzo0Var.m94989c(), "interactive-dj") || wj50.m88271j(yzo0Var.m94989c(), "martini");
                n2s n2sVar = (n2s) bsaVar.f30267c;
                URL url = new URL(uri.toString());
                String str = yzo0Var.f277862d;
                s6s s6sVar = (s6s) n2sVar;
                rp4 rp4Var = s6sVar.f206186b;
                return new vwy(s6sVar.f206185a, s6sVar, url, strM27406u, str, new wwy(rp4Var.m76098b(), rp4Var.m76097a(), rp4Var.m76099c()), z, s6sVar.f206187c);
            case 1:
                return new o6z((FilterTagsDatabase_Impl) this.f157625b);
            case 2:
                ((pqz) this.f157625b).m70693J1();
                return w2a1.f247311a;
            case 3:
                ps3 ps3VarM96222a = ((zim) ((krz) this.f157625b).f125753b).m96222a();
                ps3VarM96222a.m70754e();
                return RxEventSources.m15655a(ps3VarM96222a.m70751b(jrz.f115342h));
            case 4:
                xq3 xq3Var = (xq3) this.f157625b;
                ((gh00) xq3Var.f264857b).invoke(new cvz(true));
                xq3.m91811b(xq3Var);
                return w2a1.f247311a;
            case 5:
                hwz hwzVar = (hwz) this.f157625b;
                zvz zvzVar = hwzVar.f96097i;
                hwzVar.f96087W0 = zvzVar.m97100a();
                hwzVar.f96089X0 = zvzVar.m97103d();
                hwzVar.f96086V0 = vqg1.m86216A(ttz.f223707R0, vqg1.m86247y(new ewz(hwzVar, i2)));
                hwzVar.f96098t.start();
                hwzVar.f96088X.start();
                hwzVar.f96090Y.start();
                hwzVar.f96091Z.start();
                hwzVar.f96076L0.start();
                hwzVar.f96077M0.start();
                hwzVar.f96078N0.start();
                waj wajVar = hwzVar.f96079O0;
                wajVar.getClass();
                wajVar.f249541c = edb.m38558g(Mobius.m15582d(brp.f30128D, wajVar.f249539a.m76259a(wajVar.f249540b.f183901a))).mo15595g(new m6s0(nau.f152117a));
                ep80 ep80VarM87892b = hwzVar.f96092d.m87892b();
                ep80VarM87892b.m39638b(new zmn0((gh00) new ewz(hwzVar, i), true), new ewz(hwzVar, 2));
                cp80 cp80VarM39637a = ep80VarM87892b.m39637a();
                hwzVar.f96082R0 = (tp80) cp80VarM39637a.f40491a.invoke();
                hwzVar.f96083S0 = cp80VarM39637a.f40493c;
                hwzVar.f96084T0 = cp80VarM39637a.f40492b;
                z8g1.m95591k(((xp80) hwzVar.m48951k()).f264537j, 3).m33099f(hwzVar.f96094f, new iz0(hwzVar, 15));
                return w2a1.f247311a;
            case 6:
                return mvl0.m62953p(((qoi0) ((ndy) this.f157625b).f152865b).f190990b);
            case 7:
                whr0.f251426i.f251432f.mo31988d((r200) this.f157625b);
                return w2a1.f247311a;
            case 8:
                i700 i700Var = (i700) this.f157625b;
                if (i700Var.f99395d.m87058v(new e8x(0, i700Var, i700.class, "connectFragmentLifecycle", "connectFragmentLifecycle()V", 0, 0, 7))) {
                    prv0 prv0Var = i700Var.f99388M0;
                    if (prv0Var != null) {
                        prv0Var.m70734a();
                    }
                    i700Var.f99388M0 = null;
                }
                return w2a1.f247311a;
            case 9:
                return (wkm0) ((i500) this.f157625b).m49703Y0().findViewById(R.id.page_toolbar);
            case 10:
                return Float.valueOf(((yc00) this.f157625b).f271349z);
            case 11:
                ((kg00) this.f157625b).f122263h.m71812a();
                return w2a1.f247311a;
            case 12:
                return (ViewGroup) ((fj00) this.f157625b).f70035g.findViewById(R.id.funkis_subfeed_framelayout);
            case 13:
                return ((r7i0) ((zl00) this.f157625b).f283882a.get()).mo43757c(false);
            case 14:
                sw00 sw00Var = (sw00) this.f157625b;
                String runtimeStat = Debug.getRuntimeStat(sw00Var.f214545a);
                return Double.valueOf(((runtimeStat == null || (dM29805p0 = bm51.m29805p0(runtimeStat)) == null) ? 0.0d : dM29805p0.doubleValue()) / sw00Var.f214548d);
            case 15:
                vw00 vw00Var = (vw00) this.f157625b;
                bji bjiVar = vw00Var.f245370b;
                if (bjiVar != null) {
                    return (vw00) bjiVar.mo29483e(new c3f(vw00Var, 13));
                }
                return null;
            case 16:
                ke10 ke10Var = (ke10) this.f157625b;
                synchronized (ke10.f121770d) {
                    wkoVar = ke10.f121772f;
                    if (wkoVar == null) {
                        wkoVar = (wko) ke10.f121771e.m75486a(ke10Var.f121774a, ie10.f101299a[0]);
                        ke10.f121772f = wkoVar;
                    }
                    break;
                }
                return wkoVar;
            case 17:
                return (MessageResponseToken) ((uf10) ((C1947hm) this.f157625b).f92784d).invoke();
            case 18:
                C2169nm c2169nm = (C2169nm) this.f157625b;
                x0h1.m89578u(n5h1.m63737m((r55) c2169nm.f155199e), null, 0, new if10(c2169nm, fbkVar, i2), 3);
                return w2a1.f247311a;
            case 19:
                qf10 qf10Var = (qf10) this.f157625b;
                x0h1.m89578u(n5h1.m63737m(qf10Var.f188093d), null, 0, new pf10(qf10Var, fbkVar, i), 3);
                return w2a1.f247311a;
            case 20:
                return (UiModeManager) ((Application) this.f157625b).getSystemService("uimode");
            case 21:
                return ((sag0) this.f157625b).mo24514e();
            case 22:
                return ((sag0) this.f157625b).mo24514e();
            case 23:
                ((jr10) this.f157625b).f115050a.finishAffinity();
                return w2a1.f247311a;
            case 24:
                return (kv91) ((e0n) ((mcu) this.f157625b).f142249b).get();
            case 25:
                return ((et10) this.f157625b).f62574d.f42740d.m59915g();
            case 26:
                return (kv91) ((e0n) ((pyu) this.f157625b).f183520b).get();
            case 27:
                return (kv91) ((ky10) this.f157625b).f127613a.get();
            case 28:
                my10 my10Var = (my10) this.f157625b;
                return my10Var.f148272c1.m89894j(my10Var);
            default:
                return (kv91) ((ny10) this.f157625b).f159662a.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nry(sw00 sw00Var, zi5 zi5Var) {
        super(0);
        this.f157624a = 14;
        this.f157625b = sw00Var;
    }
}

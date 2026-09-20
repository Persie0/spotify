package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes8.dex */
public final class l7i extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f130653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7i(Object obj, int i) {
        super(1);
        this.f130652a = i;
        this.f130653b = obj;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f130652a) {
            case 0:
                return ((n7i) this.f130653b).f151167c;
            case 1:
                ((Number) obj).intValue();
                return ((igg0) this.f130653b).mo24361d();
            case 2:
                ((a6q) ((View) obj).getTag()).mo2820d((haz0) this.f130653b);
                return w2a1.f247311a;
            case 3:
                return new vci(((bdi) this.f130653b).f26113c.f58522a, "");
            case 4:
                rmm0 rmm0Var = (rmm0) obj;
                rk0 rk0Var = (rk0) ((aei) this.f130653b).f14885f.f233077a.f167970c;
                vqm vqmVar = (vqm) ((h4t0) rk0Var.f199940h).get();
                dei deiVar = (dei) rk0Var.f199935c;
                bei beiVar = (bei) rk0Var.f199936d;
                l5p l5pVar = (l5p) beiVar.f26360g.get();
                jg31.m53271i(l5pVar);
                y4p y4pVar = (y4p) beiVar.f26359f.get();
                jg31.m53271i(y4pVar);
                return new nei(vqmVar, deiVar, new azp0(l5pVar, y4pVar, (wqm) ((h4t0) rk0Var.f199941i).get(), (opm) rk0Var.f199942t, (dcm0) rk0Var.f199937e, 20), rmm0Var, 0);
            case 5:
                ((q7i) this.f130653b).invoke(mdi.f142421a);
                return w2a1.f247311a;
            case 6:
                ((Number) obj).intValue();
                return ((ipg0) ((mei) this.f130653b).f142737h).mo24361d();
            case 7:
                ggi ggiVar = (ggi) obj;
                yfi yfiVar = (yfi) this.f130653b;
                if (((AbstractC2282q6) ggiVar.f79679c).isEmpty()) {
                    return new ysk(lau.f131415a, 27);
                }
                return new pj1(fag1.m41174w(yfiVar.mo24649e(), yfiVar.f272245e, ggiVar), ggiVar, yfiVar, 18);
            case 8:
                return mvl0.m62953p(new yxb(((bgi) this.f130653b).f26947c, 23));
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ari ariVar = (ari) this.f130653b;
                if (zBooleanValue) {
                    Context context = ariVar.f19070b;
                    String string = context.getString(R.string.app_install_dialog_title);
                    String string2 = context.getString(R.string.app_install_dialog_content);
                    String string3 = context.getString(R.string.app_install_dialog_button);
                    c700 c700Var = (c700) ariVar.f19072d.f23636b;
                    if (!c700Var.f34659L && !c700Var.m31611T()) {
                        bri briVar = new bri();
                        Bundle bundleM93449h = ydj.m93449h(ContextTrack.Metadata.KEY_TITLE, string, "body", string2);
                        bundleM93449h.putString("button_text", string3);
                        briVar.m49706b1(bundleM93449h);
                        new ine1(0, 14);
                        briVar.mo63162p1(c700Var, "AppInstallationDialogFragment");
                    }
                }
                return w2a1.f247311a;
            case 10:
                ((Boolean) obj).getClass();
                ((mx9) this.f130653b).invoke();
                return w2a1.f247311a;
            case 11:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54007u(mpz0Var, 2);
                jpz0.m53984B(mpz0Var, x2h1.m89751m(((d2j) ((e2j) this.f130653b)).f44570a));
                return w2a1.f247311a;
            case 12:
                return new rq91(((m2j) this.f130653b).f139365g);
            case 13:
                fdx0 fdx0Var = (fdx0) obj;
                itd1 itd1Var = (itd1) this.f130653b;
                if (!Float.isNaN(itd1Var.f105525d) || !Float.isNaN(itd1Var.f105526e)) {
                    fdx0Var.m41395u(b9m.m28515o(Float.isNaN(itd1Var.f105525d) ? 0.5f : itd1Var.f105525d, Float.isNaN(itd1Var.f105526e) ? 0.5f : itd1Var.f105526e));
                }
                if (!Float.isNaN(itd1Var.f105527f)) {
                    fdx0Var.m41387i(itd1Var.f105527f);
                }
                if (!Float.isNaN(itd1Var.f105528g)) {
                    fdx0Var.m41388k(itd1Var.f105528g);
                }
                if (!Float.isNaN(itd1Var.f105529h)) {
                    fdx0Var.m41389l(itd1Var.f105529h);
                }
                if (!Float.isNaN(itd1Var.f105530i)) {
                    fdx0Var.m41396v(itd1Var.f105530i);
                }
                if (!Float.isNaN(itd1Var.f105531j)) {
                    fdx0Var.m41397w(itd1Var.f105531j);
                }
                if (!Float.isNaN(itd1Var.f105532k)) {
                    fdx0Var.m41392p(itd1Var.f105532k);
                }
                if (!Float.isNaN(itd1Var.f105533l) || !Float.isNaN(itd1Var.f105534m)) {
                    fdx0Var.m41390m(Float.isNaN(itd1Var.f105533l) ? 1.0f : itd1Var.f105533l);
                    fdx0Var.m41391o(Float.isNaN(itd1Var.f105534m) ? 1.0f : itd1Var.f105534m);
                }
                if (!Float.isNaN(itd1Var.f105535n)) {
                    fdx0Var.m41380b(itd1Var.f105535n);
                }
                return w2a1.f247311a;
            case 14:
                return Boolean.valueOf(wj50.m88271j(((q8j) obj).f186328a, ((n8j) this.f130653b).f151545a));
            case 15:
                uaj uajVar = (uaj) this.f130653b;
                hzd0 hzd0Var = new hzd0();
                hzd0Var.mo33104m(new qh20(0L));
                hzd0Var.mo49264n(new q7t0(Observable.combineLatest(uajVar.f228509a.map(new tc5(uajVar, 4)), uajVar.f228510b, crs.f41379O0).distinctUntilChanged().toFlowable(BackpressureStrategy.f7190d)), new c53(hzd0Var, 3));
                return hzd0Var;
            case 16:
                y6s0 y6s0Var = (y6s0) ((m6s0) obj).f140572a.get((String) ((m12) this.f130653b).f138797c);
                return Boolean.valueOf((y6s0Var instanceof w6s0) || ((y6s0Var instanceof x6s0) && ((x6s0) y6s0Var).f258745a));
            case 17:
                zaj zajVar = (zaj) this.f130653b;
                return new gdc(new sgd(zajVar, 20), new xgg(zajVar, 15));
            case 18:
                return new gdc(5, (rmm0) obj, (ybj) this.f130653b);
            case 19:
                jpz0.m54000n((mpz0) obj, ((j15) this.f130653b).f107641b);
                return w2a1.f247311a;
            case 20:
                ((lwj) this.f130653b).f137583e.invoke(new jwj(((lg11) obj).f133052a));
                return w2a1.f247311a;
            case 21:
                ((icp) obj).f100858d = new mk0((n1k) this.f130653b, null, 7);
                return w2a1.f247311a;
            case 22:
                m2k m2kVar = (m2k) obj;
                z2k z2kVar = (z2k) this.f130653b;
                z6k z6kVar = m2kVar.f139370c;
                fbk fbkVar = null;
                return mvl0.m62953p(gyf1.m46148n(new vjz(new zux(m2kVar.f139369b, z6kVar != null ? new vjz(gyf1.m46157w(new nzx0(new j6a(z2kVar, new w6k(z6kVar, m2kVar.f139373f), fbkVar, 25)), z2k.f278600Y), new ic0(3, 11, fbkVar), 2) : new ysk(fbkVar, 27), new g1i(z2kVar, m2kVar, (fbk) null), 1), new w2k(2, 0, fbkVar)), v0k.f236027Y));
            case 23:
                ((icp) obj).f100858d = new C2198o1((b3k) this.f130653b, (fbk) null, 13);
                return w2a1.f247311a;
            case 24:
                pjf1.m70155l((icp) obj, new x2k((a3k) this.f130653b, 0));
                return w2a1.f247311a;
            case 25:
                ((gh00) ((kq0) this.f130653b).f125180b).invoke(f2k.f65202a);
                return w2a1.f247311a;
            case 26:
                ((icp) obj).f100858d = new C2198o1((np0) this.f130653b, (fbk) null, 15);
                return w2a1.f247311a;
            case 27:
                return ((ykg0) obj).m93988e(((g1k) this.f130653b).f75644d);
            case 28:
                x43 x43Var = (x43) this.f130653b;
                ((bc91) x43Var.f257965h).m28695a((String) x43Var.f257964g, (d850) obj);
                return w2a1.f247311a;
            default:
                return ((pak) this.f130653b).f175545a;
        }
    }
}

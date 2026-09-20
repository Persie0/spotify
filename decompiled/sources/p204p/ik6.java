package p204p;

import android.content.Context;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class ik6 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f103036a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f103037b;

    /* JADX INFO: renamed from: c */
    public final ui6 f103038c;

    /* JADX INFO: renamed from: d */
    public final skm f103039d;

    /* JADX INFO: renamed from: e */
    public final ukm f103040e;

    /* JADX INFO: renamed from: f */
    public final vkm f103041f;

    /* JADX INFO: renamed from: g */
    public final xkm f103042g;

    /* JADX INFO: renamed from: h */
    public final ykm f103043h;

    /* JADX INFO: renamed from: i */
    public final rmm0 f103044i;

    /* JADX INFO: renamed from: j */
    public final ti6 f103045j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1934he f103046k;

    /* JADX INFO: renamed from: l */
    public final hol0 f103047l;

    public ik6(Scheduler scheduler, Scheduler scheduler2, ui6 ui6Var, skm skmVar, ukm ukmVar, vkm vkmVar, wkm wkmVar, xkm xkmVar, ykm ykmVar, rmm0 rmm0Var, ti6 ti6Var, InterfaceC1934he interfaceC1934he) {
        hol0 hol0Var;
        this.f103036a = scheduler;
        this.f103037b = scheduler2;
        this.f103038c = ui6Var;
        this.f103039d = skmVar;
        this.f103040e = ukmVar;
        this.f103041f = vkmVar;
        this.f103042g = xkmVar;
        this.f103043h = ykmVar;
        this.f103044i = rmm0Var;
        this.f103045j = ti6Var;
        this.f103046k = interfaceC1934he;
        switch (wkmVar.f252260a) {
            case 0:
                dlm dlmVar = (dlm) ((igm) wkmVar.f252261b).f102010c;
                ui6 ui6Var2 = ((li6) dlmVar.f50227L0).f133732e;
                jg31.m53272j(ui6Var2);
                String str = ((li6) dlmVar.f50227L0).f133730c;
                jg31.m53272j(str);
                hol0Var = new hol0(ui6Var2, str, (ek6) dlmVar.f50241Y.get(), rmm0Var);
                break;
            default:
                ilm ilmVar = (ilm) ((igm) wkmVar.f252261b).f102010c;
                ui6 ui6Var3 = ((xi6) ilmVar.f103405Q0).f261774d;
                jg31.m53272j(ui6Var3);
                String str2 = ((xi6) ilmVar.f103405Q0).f261773c;
                jg31.m53272j(str2);
                hol0Var = new hol0(ui6Var3, str2, (ek6) ilmVar.f103416Z.get(), rmm0Var);
                break;
        }
        this.f103047l = hol0Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller m50924a() {
        mc1 mc1Var;
        mc1 mc1Var2;
        jz0 jz0Var;
        pj6 pj6Var;
        char c;
        char c2;
        azp0 azp0Var;
        fk6 fk6Var = new fk6();
        ukm ukmVar = this.f103040e;
        int i = ukmVar.f231316a;
        int i2 = 17;
        rmm0 rmm0Var = this.f103044i;
        switch (i) {
            case 0:
                dlm dlmVar = (dlm) ((igm) ukmVar.f231317b).f102010c;
                xqb xqbVarM36368b = dlmVar.m36368b();
                Scheduler scheduler = (Scheduler) ((ki6) dlmVar.f50228M0).f122837b.get();
                jg31.m53271i(scheduler);
                mc1Var = new mc1(rmm0Var, xqbVarM36368b, scheduler, i2);
                break;
            default:
                ilm ilmVar = (ilm) ((igm) ukmVar.f231317b).f102010c;
                xqb xqbVarM51032b = ilmVar.m51032b();
                Scheduler scheduler2 = (Scheduler) ((wi6) ilmVar.f103406R0).f251513b.get();
                jg31.m53271i(scheduler2);
                mc1Var = new mc1(rmm0Var, xqbVarM51032b, scheduler2, i2);
                break;
        }
        mc1 mc1Var3 = mc1Var;
        xkm xkmVar = this.f103042g;
        int i3 = xkmVar.f262395a;
        int i4 = 8;
        hol0 hol0Var = this.f103047l;
        switch (i3) {
            case 0:
                dlm dlmVar2 = (dlm) ((igm) xkmVar.f262396b).f102010c;
                xqb xqbVarM36368b2 = dlmVar2.m36368b();
                Scheduler scheduler3 = (Scheduler) ((ki6) dlmVar2.f50228M0).f122837b.get();
                jg31.m53271i(scheduler3);
                mc1Var2 = new mc1(xqbVarM36368b2, scheduler3, hol0Var, i4);
                break;
            default:
                ilm ilmVar2 = (ilm) ((igm) xkmVar.f262396b).f102010c;
                xqb xqbVarM51032b2 = ilmVar2.m51032b();
                Scheduler scheduler4 = (Scheduler) ((wi6) ilmVar2.f103406R0).f251513b.get();
                jg31.m53271i(scheduler4);
                mc1Var2 = new mc1(xqbVarM51032b2, scheduler4, hol0Var, i4);
                break;
        }
        mc1 mc1Var4 = mc1Var2;
        ykm ykmVar = this.f103043h;
        int i5 = ykmVar.f273751a;
        int i6 = 7;
        InterfaceC1934he interfaceC1934he = this.f103046k;
        switch (i5) {
            case 0:
                Context contextM56474a = ((ki6) ((dlm) ((igm) ykmVar.f273752b).f102010c).f50228M0).m56474a();
                jg31.m53271i(contextM56474a);
                jz0Var = new jz0(i6, contextM56474a, interfaceC1934he);
                break;
            default:
                Context contextM88186a = ((wi6) ((ilm) ((igm) ykmVar.f273752b).f102010c).f103406R0).m88186a();
                jg31.m53271i(contextM88186a);
                jz0Var = new jz0(i6, contextM88186a, interfaceC1934he);
                break;
        }
        jz0 jz0Var2 = jz0Var;
        vkm vkmVar = this.f103041f;
        int i7 = 3;
        int i8 = 19;
        int i9 = 0;
        int i10 = 1;
        int i11 = 21;
        switch (vkmVar.f242242a) {
            case 0:
                dlm dlmVar3 = (dlm) ((igm) vkmVar.f242243b).f102010c;
                z9j0 z9j0Var = (z9j0) ((ki6) dlmVar3.f50228M0).f122843h.get();
                jg31.m53271i(z9j0Var);
                fp9 fp9Var = new fp9(z9j0Var, 1);
                fdn0 fdn0Var = new fdn0((rg6) dlmVar3.f50230O0.get(), i10);
                dh30 dh30Var = new dh30(new c961((vh6) dlmVar3.f50247b.get(), i11), i8);
                fdn0 fdn0Var2 = new fdn0((rg6) dlmVar3.f50230O0.get(), i9);
                Scheduler scheduler5 = (Scheduler) ((ki6) dlmVar3.f50228M0).f122837b.get();
                jg31.m53271i(scheduler5);
                pe50 pe50Var = (pe50) ((ki6) dlmVar3.f50228M0).f122857v.get();
                jg31.m53271i(pe50Var);
                uk11 uk11Var = new uk11(pe50Var.m69710a(), 0);
                hc80 hc80Var = ((dcm0) dlmVar3.f50245a).f47583d.f68149c;
                jg31.m53272j(hc80Var);
                c = 0;
                rf50 rf50Var = (rf50) ((ki6) dlmVar3.f50228M0).f122860y.get();
                jg31.m53271i(rf50Var);
                im11 im11Var = new im11(rf50Var.m75422a(hc80Var, st91.f213865b), 1);
                nc2 nc2Var = (nc2) ((ki6) dlmVar3.f50228M0).f122856u.get();
                jg31.m53271i(nc2Var);
                sc01 sc01Var = new sc01(nc2Var, 3);
                c2 = 1;
                c961 c961Var = new c961((vh6) dlmVar3.f50247b.get(), i11);
                Scheduler scheduler6 = (Scheduler) ((ki6) dlmVar3.f50228M0).f122839d.get();
                jg31.m53271i(scheduler6);
                pj6Var = new pj6(fp9Var, fdn0Var, dh30Var, fdn0Var2, scheduler5, uk11Var, im11Var, sc01Var, new csr0(9, c961Var, scheduler6), new C2263po(6, dlmVar3.m36368b(), new c961((vh6) dlmVar3.f50247b.get(), 21)), jz0Var2, mc1Var3, mc1Var4);
                break;
            default:
                ilm ilmVar3 = (ilm) ((igm) vkmVar.f242243b).f102010c;
                z9j0 z9j0Var2 = (z9j0) ((wi6) ilmVar3.f103406R0).f251519h.get();
                jg31.m53271i(z9j0Var2);
                fp9 fp9Var2 = new fp9(z9j0Var2, 1);
                fdn0 fdn0Var3 = new fdn0((rg6) ilmVar3.f103402N0.get(), i10);
                dh30 dh30Var2 = new dh30(new c961((vh6) ilmVar3.f103422c.get(), i11), i8);
                fdn0 fdn0Var4 = new fdn0((rg6) ilmVar3.f103402N0.get(), i9);
                Scheduler scheduler7 = (Scheduler) ((wi6) ilmVar3.f103406R0).f251513b.get();
                jg31.m53271i(scheduler7);
                pe50 pe50Var2 = (pe50) ((wi6) ilmVar3.f103406R0).f251533v.get();
                jg31.m53271i(pe50Var2);
                uk11 uk11Var2 = new uk11(pe50Var2.m69710a(), 0);
                hc80 hc80Var2 = ((dcm0) ilmVar3.f103420b).f47583d.f68149c;
                jg31.m53272j(hc80Var2);
                rf50 rf50Var2 = (rf50) ((wi6) ilmVar3.f103406R0).f251536y.get();
                jg31.m53271i(rf50Var2);
                im11 im11Var2 = new im11(rf50Var2.m75422a(hc80Var2, st91.f213865b), 1);
                nc2 nc2Var2 = (nc2) ((wi6) ilmVar3.f103406R0).f251532u.get();
                jg31.m53271i(nc2Var2);
                sc01 sc01Var2 = new sc01(nc2Var2, i7);
                c961 c961Var2 = new c961((vh6) ilmVar3.f103422c.get(), i11);
                Scheduler scheduler8 = (Scheduler) ((wi6) ilmVar3.f103406R0).f251515d.get();
                jg31.m53271i(scheduler8);
                pj6Var = new pj6(fp9Var2, fdn0Var3, dh30Var2, fdn0Var4, scheduler7, uk11Var2, im11Var2, sc01Var2, new csr0(9, c961Var2, scheduler8), new C2263po(6, ilmVar3.m51032b(), new c961((vh6) ilmVar3.f103422c.get(), i11)), jz0Var2, mc1Var3, mc1Var4);
                c = 0;
                c2 = 1;
                break;
        }
        pj6 pj6Var2 = pj6Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15661c(gj6.class, pj6Var2.f178176c);
        subtypeEffectHandlerBuilderM15658c.m15665g(kj6.class, pj6Var2.f178185l);
        subtypeEffectHandlerBuilderM15658c.m15665g(oj6.class, pj6Var2.f178182i);
        fp9 fp9Var3 = pj6Var2.f178174a;
        Scheduler scheduler9 = pj6Var2.f178178e;
        subtypeEffectHandlerBuilderM15658c.m15662d(fj6.class, fp9Var3, scheduler9);
        subtypeEffectHandlerBuilderM15658c.m15662d(jj6.class, pj6Var2.f178175b, scheduler9);
        subtypeEffectHandlerBuilderM15658c.m15665g(ej6.class, pj6Var2.f178183j);
        subtypeEffectHandlerBuilderM15658c.m15662d(ij6.class, pj6Var2.f178177d, scheduler9);
        subtypeEffectHandlerBuilderM15658c.m15665g(hj6.class, pj6Var2.f178186m);
        subtypeEffectHandlerBuilderM15658c.m15662d(mj6.class, pj6Var2.f178179f, scheduler9);
        subtypeEffectHandlerBuilderM15658c.m15662d(nj6.class, pj6Var2.f178180g, scheduler9);
        subtypeEffectHandlerBuilderM15658c.m15662d(lj6.class, pj6Var2.f178181h, scheduler9);
        subtypeEffectHandlerBuilderM15658c.m15662d(dj6.class, pj6Var2.f178184k, scheduler9);
        MobiusLoop.Builder builderM15582d = Mobius.m15582d(fk6Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h()));
        skm skmVar = this.f103039d;
        int i12 = skmVar.f210164a;
        int i13 = 18;
        ti6 ti6Var = this.f103045j;
        switch (i12) {
            case 0:
                dlm dlmVar4 = (dlm) ((igm) skmVar.f210165b).f102010c;
                tkm tkmVar = (tkm) dlmVar4.f50239X.get();
                egb1 egb1Var = new egb1((ek6) dlmVar4.f50241Y.get(), 21);
                gcu0 gcu0Var = (gcu0) ((ki6) dlmVar4.f50228M0).f122849n.get();
                jg31.m53271i(gcu0Var);
                fs9 fs9Var = new fs9(gcu0Var, 19);
                wel0 wel0Var = new wel0((rg6) dlmVar4.f50230O0.get(), i13);
                ki6 ki6Var = (ki6) dlmVar4.f50228M0;
                qwx0 qwx0Var = (qwx0) ki6Var.f122845j.get();
                jg31.m53271i(qwx0Var);
                nc2 nc2Var3 = (nc2) ki6Var.f122856u.get();
                jg31.m53271i(nc2Var3);
                gmx gmxVar = (gmx) ki6Var.f122859x.get();
                jg31.m53271i(gmxVar);
                azp0Var = new azp0(tkmVar, egb1Var, fs9Var, wel0Var, new cxb(qwx0Var, nc2Var3, gmxVar, 25), ti6Var);
                break;
            default:
                ilm ilmVar4 = (ilm) ((igm) skmVar.f210165b).f102010c;
                tkm tkmVar2 = (tkm) ilmVar4.f103414Y.get();
                egb1 egb1Var2 = new egb1((ek6) ilmVar4.f103416Z.get(), 21);
                gcu0 gcu0Var2 = (gcu0) ((wi6) ilmVar4.f103406R0).f251523l.get();
                jg31.m53271i(gcu0Var2);
                fs9 fs9Var2 = new fs9(gcu0Var2, 19);
                wel0 wel0Var2 = new wel0((rg6) ilmVar4.f103402N0.get(), i13);
                wi6 wi6Var = (wi6) ilmVar4.f103406R0;
                qwx0 qwx0Var2 = (qwx0) wi6Var.f251521j.get();
                jg31.m53271i(qwx0Var2);
                nc2 nc2Var4 = (nc2) wi6Var.f251532u.get();
                jg31.m53271i(nc2Var4);
                gmx gmxVar2 = (gmx) wi6Var.f251535x.get();
                jg31.m53271i(gmxVar2);
                azp0Var = new azp0(tkmVar2, egb1Var2, fs9Var2, wel0Var2, new cxb(qwx0Var2, nc2Var4, gmxVar2, 25), ti6Var);
                break;
        }
        ti6 ti6Var2 = (ti6) ((fs9) azp0Var.f21668f).f72807b;
        Observable map = ti6Var2.f220560h.observeOn(ti6Var2.f220557e).map(e8f.f57163R0);
        PublishSubject publishSubject = ((ek6) ((egb1) azp0Var.f21664b).f59299b).f60390a;
        fiz fizVarM44321c = ((gcu0) ((fs9) azp0Var.f21665c).f72807b).m44321c();
        dau dauVar = dau.f47107a;
        Observable map2 = k0e1.m54988g(fizVarM44321c, dauVar).map(u0o0.f225544Q0);
        rg6 rg6Var = (rg6) ((wel0) azp0Var.f21666d).f250581b;
        Observable map3 = k0e1.m54988g(xtm0.m92074U(rg6Var.f198842e, new C2102lt((fbk) null, rg6Var, 12)), dauVar).map(jbr0.f110862b);
        cxb cxbVar = (cxb) azp0Var.f21667e;
        Observable observableM54988g = k0e1.m54988g(((gmx) cxbVar.f42974d).f81493a, dauVar);
        Observable observableM64106a = ((nc2) cxbVar.f42973c).m64106a();
        Observable observable = ((rwx0) ((qwx0) cxbVar.f42972b)).f203428a;
        Observable observableCombineLatest = Observable.combineLatest(observableM54988g, observableM64106a, observable.map(xwe.f266650R0).distinctUntilChanged(), observable.map(e8f.f57161P0).distinctUntilChanged(), ket.f121952R0);
        ObservableSource[] observableSourceArr = new ObservableSource[5];
        observableSourceArr[c] = map;
        observableSourceArr[c2] = publishSubject;
        observableSourceArr[2] = map2;
        observableSourceArr[3] = map3;
        observableSourceArr[4] = observableCombineLatest;
        MobiusLoop.Builder builderM38558g = edb.m38558g(builderM15582d.mo15596h(RxEventSources.m15655a(observableSourceArr)).mo15590b(new gk6(this)).mo15592d(new hk6(this)));
        ai6 ai6Var = ti6Var.f220561i;
        return Mobius.m15581c(builderM38558g, new jk6(true, false, lau.f131415a, false, false, false, xdp0.f260519a, this.f103038c, ai6Var == null ? new ai6(null, null, null, null, null, 1023) : ai6Var), MainThreadWorkRunner.m15627a());
    }
}

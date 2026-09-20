package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class shy implements dfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209287a = 2;

    /* JADX INFO: renamed from: b */
    public final pgo f209288b;

    /* JADX INFO: renamed from: c */
    public final luk f209289c;

    /* JADX INFO: renamed from: d */
    public final luk f209290d;

    /* JADX INFO: renamed from: e */
    public final mko f209291e;

    /* JADX INFO: renamed from: f */
    public final mmh0 f209292f;

    /* JADX INFO: renamed from: g */
    public final cph f209293g;

    /* JADX INFO: renamed from: h */
    public final i5x f209294h;

    public shy(Flowable flowable, zke1 zke1Var, jf90 jf90Var, pgo pgoVar, luk lukVar, luk lukVar2) {
        this.f209288b = pgoVar;
        this.f209289c = lukVar;
        this.f209290d = lukVar2;
        rpt rptVar = new rpt(new d670(zke1Var, pgoVar, flowable, 12), jf90Var, lukVar);
        ArrayList arrayList = new ArrayList();
        this.f209291e = arrayList.isEmpty() ? ns5.f157671i : arrayList.size() == 1 ? (mko) g6f.m43741q0(arrayList) : new bbf(arrayList);
        v961 v961Var = v961.f238877s;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        oot ootVar = new oot(rptVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(vft.class), c1033x3ae6ae8e.m15631a(ootVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(gft.class), new C1037x558fa59a().m15633a(new pnt(rptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(wjt.class), new C1037x558fa59a().m15633a(new unt(rptVar)));
        this.f209292f = alf1.m26339v(sje1.f209829a, v961Var, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), fad1.f67532Z0, new vje1(this));
        fyf fyfVar = aih.f15990a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f209293g = new cph(fyfVar, 3);
        this.f209294h = mhf1.m61771p(this).m94133b(u8d1.f227917T0, u8d1.f227918U0);
    }

    /* JADX INFO: renamed from: f */
    public static h520 m78143f(d520 d520Var) {
        String str = d520Var.f45309a;
        String str2 = d520Var.f45310b;
        ArrayList arrayList = d520Var.f45311c;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((z420) it.next()).f279098a);
        }
        return new h520(str, arrayList2, str2);
    }

    /* JADX INFO: renamed from: g */
    public static Next m78144g(i520 i520Var, d520 d520Var) {
        pqm0 pqm0VarM34378n = cyf1.m34378n(i520Var, m78143f(d520Var));
        return Next.m15607i((i520) pqm0VarM34378n.f180350a, s601.m77309l0((Set) pqm0VarM34378n.f180351b, Collections.singleton(new egt(d520Var.f45311c))));
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f209287a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f209294h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f209287a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f209293g;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        switch (this.f209287a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f209288b;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f209287a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f209292f;
    }

    @Override // p204p.izd1
    public final mko getData() {
        switch (this.f209287a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f209291e;
    }

    public shy(pgo pgoVar, gfi0 gfi0Var, luk lukVar, luk lukVar2) {
        mko bbfVar;
        this.f209288b = pgoVar;
        this.f209289c = lukVar;
        this.f209290d = lukVar2;
        int i = 3;
        ppt pptVar = new ppt(lukVar, new mm90(pgoVar, i), new wiy0(gfi0Var, 10));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oko(rhy.f199388b, c7c.f34844a));
        if (arrayList.isEmpty()) {
            bbfVar = ns5.f157671i;
        } else {
            bbfVar = arrayList.size() == 1 ? (mko) g6f.m43741q0(arrayList) : new bbf(arrayList);
        }
        this.f209291e = bbfVar;
        nhy nhyVar = new nhy("", "", null, ihy.f102379a, fhy.f69729a);
        brp brpVar = brp.f30139k;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        mot motVar = new mot(pptVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(hgt.class), c1033x3ae6ae8e.m15631a(motVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(qjt.class), new C1037x558fa59a().m15633a(new nnt(pptVar)));
        this.f209292f = alf1.m26339v(nhyVar, brpVar, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), new tys(this, 15), new qhy(this));
        fyf fyfVar = khg.f122651a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f209293g = new cph(fyfVar, i);
        this.f209294h = mhf1.m61771p(this).m94133b(nhx.f154106U0, nhx.f154107V0);
    }

    public shy(pgo pgoVar, gfi0 gfi0Var, xre xreVar, zf90 zf90Var, luk lukVar, luk lukVar2) {
        mko bbfVar;
        this.f209288b = pgoVar;
        this.f209289c = lukVar;
        this.f209290d = lukVar2;
        int i = 3;
        qpt qptVar = new qpt(lukVar, new bq70(pgoVar), new a470(i, xreVar, zf90Var), new vse(gfi0Var), new wse(gfi0Var));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nko(uy10.f235096X, c7c.f34844a));
        if (arrayList.isEmpty()) {
            bbfVar = ns5.f157671i;
        } else {
            bbfVar = arrayList.size() == 1 ? (mko) g6f.m43741q0(arrayList) : new bbf(arrayList);
        }
        this.f209291e = bbfVar;
        h520 h520Var = new h520("", lau.f131415a, "");
        brp brpVar = brp.f30146r;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        not notVar = new not(qptVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(egt.class), c1033x3ae6ae8e.m15631a(notVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(okt.class), new C1033x3ae6ae8e().m15631a(new xot(qptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(rht.class), new C1037x558fa59a().m15633a(new ont(qptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(tht.class), new C1037x558fa59a().m15633a(new tnt(qptVar)));
        this.f209292f = alf1.m26339v(h520Var, brpVar, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), new tys(this, 27), new k520(this));
        fyf fyfVar = nkg.f154874a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f209293g = new cph(fyfVar, i);
        this.f209294h = mhf1.m61771p(this).m94133b(et00.f62549W0, et00.f62551X0);
    }
}

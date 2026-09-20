package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes5.dex */
public final class jc51 {

    /* JADX INFO: renamed from: a */
    public final na51 f110991a;

    /* JADX INFO: renamed from: b */
    public final Observable f110992b;

    /* JADX INFO: renamed from: c */
    public final Observable f110993c;

    /* JADX INFO: renamed from: d */
    public final dh31 f110994d;

    /* JADX INFO: renamed from: e */
    public final luk f110995e;

    /* JADX INFO: renamed from: f */
    public final luk f110996f;

    /* JADX INFO: renamed from: g */
    public final String f110997g;

    public jc51(na51 na51Var, Observable observable, Observable observable2, dh31 dh31Var, luk lukVar, luk lukVar2, String str) {
        this.f110991a = na51Var;
        this.f110992b = observable;
        this.f110993c = observable2;
        this.f110994d = dh31Var;
        this.f110995e = lukVar;
        this.f110996f = lukVar2;
        this.f110997g = str;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller m52918a(pd51 pd51Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        qb51 qb51Var = new qb51(this.f110994d);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(pb51.class), c1037x558fa59a.m15633a(qb51Var));
        C1037x558fa59a c1037x558fa59a2 = new C1037x558fa59a();
        luk lukVar = this.f110996f;
        na51 na51Var = this.f110991a;
        String str = this.f110997g;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ob51.class), c1037x558fa59a2.m15633a(new sb51(lukVar, na51Var, str)));
        return Mobius.m15580b(Mobius.m15582d(gc51.f78494a, new C1044a(this.f110995e, coroutinesSubtypeEffectHandlerBuilderM42464h)).mo15596h(RxEventSources.m15655a(this.f110992b.map(mmq0.f145205R0).onErrorResumeNext(new it2(str, 10)), this.f110993c.map(onq0.f167322Q0).onErrorResumeNext(new b1h1(str, 18)))).mo15592d(new hc51(this)).mo15590b(new ic51(this)).mo15594f(new AndroidLogger("Story for ".concat(str))), pd51Var, fc51.f68011a, MainThreadWorkRunner.m15627a());
    }
}

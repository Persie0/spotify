package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes8.dex */
public final class l6c1 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final q831 f130308a;

    /* JADX INFO: renamed from: b */
    public final luk f130309b;

    /* JADX INFO: renamed from: c */
    public final n6q f130310c;

    public l6c1(q831 q831Var, luk lukVar, n6q n6qVar) {
        this.f130308a = q831Var;
        this.f130309b = lukVar;
        this.f130310c = n6qVar;
    }

    @Override // p204p.eh00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1044a invoke() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        h6c1 h6c1Var = new h6c1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(e6c1.class), c1037x558fa59a.m15633a(h6c1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(d6c1.class), new C1037x558fa59a().m15633a(new i6c1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(f6c1.class), new C1037x558fa59a().m15633a(new j6c1(this)));
        return new C1044a(this.f130309b, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }
}

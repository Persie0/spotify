package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes6.dex */
public final class twz implements wsa0 {

    /* JADX INFO: renamed from: a */
    public final ud80 f224518a;

    /* JADX INFO: renamed from: b */
    public final String f224519b;

    /* JADX INFO: renamed from: c */
    public final C1044a f224520c;

    /* JADX INFO: renamed from: d */
    public final brp f224521d;

    public twz(ud80 ud80Var, String str, luk lukVar) {
        this.f224518a = ud80Var;
        this.f224519b = str;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        rwz rwzVar = new rwz(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(yuz.class), c1037x558fa59a.m15633a(rwzVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zuz.class), new C1037x558fa59a().m15633a(new swz(this)));
        this.f224520c = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
        this.f224521d = brp.f30143o;
    }

    @Override // p204p.wsa0
    /* JADX INFO: renamed from: a */
    public final Connectable mo24834a() {
        return this.f224520c;
    }

    @Override // p204p.wsa0
    /* JADX INFO: renamed from: b */
    public final Update mo24835b() {
        return this.f224521d;
    }
}

package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class sx9 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tx9 f214847a;

    public sx9(tx9 tx9Var) {
        this.f214847a = tx9Var;
    }

    @Override // com.spotify.mobius.functions.Function
    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        tx9 tx9Var = this.f214847a;
        rx9 rx9Var = new rx9(tx9Var);
        jw9 jw9Var = tx9Var.f224606b;
        wj50.m88279p(consumer);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        ew9 ew9Var = new ew9(jw9Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(lv9.class), c1037x558fa59a.m15633a(ew9Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(gv9.class), new C1037x558fa59a().m15633a(new wv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(iv9.class), new C1037x558fa59a().m15633a(new xv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(jv9.class), new C1037x558fa59a().m15633a(new ov9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(hv9.class), new C1037x558fa59a().m15633a(new pv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(wu9.class), new C1037x558fa59a().m15633a(new qv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(yu9.class), new C1037x558fa59a().m15633a(new rv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(vu9.class), new C1037x558fa59a().m15633a(new sv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(fv9.class), new C1037x558fa59a().m15633a(new tv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(dv9.class), new C1037x558fa59a().m15633a(new yv9()));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(cv9.class), new C1037x558fa59a().m15633a(new zv9()));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(av9.class), new C1037x558fa59a().m15633a(new aw9(consumer, jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bv9.class), new C1037x558fa59a().m15633a(new bw9(consumer, jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ev9.class), new C1037x558fa59a().m15633a(new cw9(consumer)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(kv9.class), new C1037x558fa59a().m15633a(new gw9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(mv9.class), new C1037x558fa59a().m15633a(new iw9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(xu9.class), new C1037x558fa59a().m15633a(new uv9(jw9Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zu9.class), new C1037x558fa59a().m15633a(new vv9(jw9Var)));
        return Mobius.m15582d(rx9Var, new C1044a(tlp.f221498c, coroutinesSubtypeEffectHandlerBuilderM42464h));
    }
}

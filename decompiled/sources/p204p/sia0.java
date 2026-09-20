package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class sia0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1044a f209389a;

    public sia0(wiy0 wiy0Var, frv0 frv0Var, C2557x2 c2557x2, oge0 oge0Var, e1v0 e1v0Var, vw90 vw90Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        ria0 ria0Var = new ria0(wiy0Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(cia0.class), c1033x3ae6ae8e.m15631a(ria0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(dia0.class), new C1037x558fa59a().m15633a(new kia0(frv0Var, c2557x2)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(wha0.class), new C1037x558fa59a().m15633a(new hia0(c2557x2)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(yha0.class), new C1033x3ae6ae8e().m15631a(new pia0(oge0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bia0.class), new C1037x558fa59a().m15633a(new lia0(e1v0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(qha0.class), new C1037x558fa59a().m15633a(new mia0(e1v0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(aia0.class), new C1037x558fa59a().m15633a(new nia0(vw90Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(oha0.class), new C1037x558fa59a().m15633a(new iia0(vw90Var)));
        n5q n5qVar = xsr.f265651a;
        this.f209389a = new C1044a(pvb0.f181680a, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f209389a.mo3269P(consumer);
    }
}

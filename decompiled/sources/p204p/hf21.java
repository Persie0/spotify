package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class hf21 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final ago f90586a;

    /* JADX INFO: renamed from: b */
    public final gbc0 f90587b;

    /* JADX INFO: renamed from: c */
    public final skd0 f90588c;

    public hf21(ago agoVar, gbc0 gbc0Var, skd0 skd0Var) {
        this.f90586a = agoVar;
        this.f90587b = gbc0Var;
        this.f90588c = skd0Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        rlv0 rlv0Var = new rlv0();
        rlv0Var.f200373a = gbu.f78413a;
        rlv0 rlv0Var2 = new rlv0();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        gf21 gf21Var = new gf21(rlv0Var2, rlv0Var, this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(jf21.class), c1037x558fa59a.m15633a(gf21Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(if21.class), new C1037x558fa59a().m15633a(new ff21(this)));
        return new C1044a(xsr.f265652b, coroutinesSubtypeEffectHandlerBuilderM42464h).mo3269P(consumer);
    }
}

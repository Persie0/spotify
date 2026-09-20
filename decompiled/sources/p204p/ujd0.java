package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class ujd0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final qtd0 f230971a;

    /* JADX INFO: renamed from: b */
    public final luk f230972b;

    /* JADX INFO: renamed from: c */
    public qe70 f230973c = bfd0.f26694g;

    /* JADX INFO: renamed from: d */
    public qe70 f230974d = pec0.f176705Q0;

    /* JADX INFO: renamed from: e */
    public qe70 f230975e = pec0.f176704P0;

    /* JADX INFO: renamed from: f */
    public qe70 f230976f = pec0.f176706R0;

    /* JADX INFO: renamed from: g */
    public qe70 f230977g = bfd0.f26693f;

    /* JADX INFO: renamed from: h */
    public qe70 f230978h = bfd0.f26695h;

    /* JADX INFO: renamed from: i */
    public final C1044a f230979i;

    public ujd0(qtd0 qtd0Var, luk lukVar, luk lukVar2) {
        this.f230971a = qtd0Var;
        this.f230972b = lukVar2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        rjd0 rjd0Var = new rjd0(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bid0.class), c1037x558fa59a.m15633a(rjd0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(gid0.class), new C1037x558fa59a().m15633a(new tjd0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(eid0.class), new C1037x558fa59a().m15633a(new ljd0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(fid0.class), new C1037x558fa59a().m15633a(new mjd0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(did0.class), new C1037x558fa59a().m15633a(new njd0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(hid0.class), new C1037x558fa59a().m15633a(new ojd0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(cid0.class), new C1037x558fa59a().m15633a(new pjd0(this)));
        this.f230979i = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f230979i.mo3269P(consumer);
    }
}

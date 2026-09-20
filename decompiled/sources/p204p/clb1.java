package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class clb1 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final String f39235a;

    /* JADX INFO: renamed from: b */
    public final mb61 f39236b;

    /* JADX INFO: renamed from: c */
    public final Object f39237c;

    /* JADX INFO: renamed from: d */
    public final h9p f39238d;

    /* JADX INFO: renamed from: e */
    public final luk f39239e;

    /* JADX INFO: renamed from: f */
    public final hrw f39240f;

    /* JADX INFO: renamed from: g */
    public final k9b f39241g;

    /* JADX INFO: renamed from: h */
    public final om0 f39242h;

    /* JADX INFO: renamed from: i */
    public final C1044a f39243i;

    /* JADX WARN: Multi-variable type inference failed */
    public clb1(String str, th00 th00Var, th00 th00Var2, h9p h9pVar, luk lukVar, luk lukVar2, hrw hrwVar, k9b k9bVar, om0 om0Var) {
        this.f39235a = str;
        this.f39236b = (mb61) th00Var;
        this.f39237c = th00Var2;
        this.f39238d = h9pVar;
        this.f39239e = lukVar2;
        this.f39240f = hrwVar;
        this.f39241g = k9bVar;
        this.f39242h = om0Var;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        zkb1 zkb1Var = new zkb1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(brr.class), c1037x558fa59a.m15633a(zkb1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(gq40.class), new C1037x558fa59a().m15633a(new alb1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ycn0.class), new C1037x558fa59a().m15633a(new ykb1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(pm70.class), new C1037x558fa59a().m15633a(new blb1(this)));
        this.f39243i = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f39243i.mo3269P(consumer);
    }
}

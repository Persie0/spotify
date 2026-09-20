package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class de30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ke30 f47955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ie30 f47956b;

    public de30(ke30 ke30Var, ie30 ie30Var) {
        this.f47955a = ke30Var;
        this.f47956b = ie30Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        jd30 jd30Var = (jd30) obj;
        this.f47955a.f121784a.f111443a.invoke();
        Iterator it = jd30Var.f111228b.iterator();
        while (it.hasNext()) {
            om0.m67310a(this.f47956b.f101305a, (qm0) it.next(), jd30Var.f111227a.mo29280c(), null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}

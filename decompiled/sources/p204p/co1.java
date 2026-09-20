package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class co1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fp1 f40146a;

    public co1(fp1 fp1Var) {
        this.f40146a = fp1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        j5q j5qVar = this.f40146a.f71663d;
        Set setSingleton = Collections.singleton(((wm1) obj).f252680a);
        j5qVar.getClass();
        Iterator it = setSingleton.iterator();
        while (it.hasNext()) {
            j5qVar.f109068d.put((String) it.next(), f5q.f66132a);
        }
        return w2a1.f247311a;
    }
}

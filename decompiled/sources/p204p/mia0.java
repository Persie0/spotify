package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class mia0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e1v0 f143989a;

    public mia0(e1v0 e1v0Var) {
        this.f143989a = e1v0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qfa0 qfa0Var = ((qha0) obj).f188701c;
        e1v0 e1v0Var = this.f143989a;
        ArrayList arrayList = new ArrayList(e1v0Var.m37567a());
        j6f.m52567Y(arrayList, new d1v0(qfa0Var, 1));
        e1v0Var.m37568b(arrayList);
        return w2a1.f247311a;
    }
}

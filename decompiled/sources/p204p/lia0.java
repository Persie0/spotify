package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class lia0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e1v0 f133755a;

    public lia0(e1v0 e1v0Var) {
        this.f133755a = e1v0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qfa0 qfa0Var = ((bia0) obj).f27373c;
        e1v0 e1v0Var = this.f133755a;
        ArrayList arrayList = new ArrayList(e1v0Var.m37567a());
        j6f.m52567Y(arrayList, new d1v0(qfa0Var, 0));
        arrayList.add(0, qfa0Var);
        e1v0Var.m37568b(g6f.m43714b1(arrayList, 30));
        return w2a1.f247311a;
    }
}

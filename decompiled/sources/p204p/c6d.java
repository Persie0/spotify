package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class c6d implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h7d f34513a;

    public c6d(h7d h7dVar) {
        this.f34513a = h7dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        b6d b6dVar;
        if (ibkVar instanceof b6d) {
            b6dVar = (b6d) ibkVar;
            int i = b6dVar.f23938b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b6dVar.f23938b = i - Integer.MIN_VALUE;
            } else {
                b6dVar = new b6d(this, ibkVar);
            }
        } else {
            b6dVar = new b6d(this, ibkVar);
        }
        b6d b6dVar2 = b6dVar;
        Object obj2 = b6dVar2.f23937a;
        int i2 = b6dVar2.f23938b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            t4d t4dVar = (t4d) obj;
            vyr0 vyr0Var = this.f34513a.f88419h;
            String str = t4dVar.f216974a;
            String str2 = t4dVar.f216975b;
            String str3 = t4dVar.f216976c;
            lzu0 lzu0Var = t4dVar.f216977d;
            b6dVar2.f23938b = 1;
            Object objM86858t = vyr0Var.m86858t(str, str2, str3, lzu0Var, b6dVar2);
            yuk yukVar = yuk.f276404a;
            if (objM86858t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            ((s6x0) obj2).getClass();
        }
        return w2a1.f247311a;
    }
}

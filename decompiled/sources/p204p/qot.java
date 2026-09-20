package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class qot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tpt f191036a;

    public qot(tpt tptVar) {
        this.f191036a = tptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        jot jotVar;
        if (ibkVar instanceof jot) {
            jotVar = (jot) ibkVar;
            int i = jotVar.f114508b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jotVar.f114508b = i - Integer.MIN_VALUE;
            } else {
                jotVar = new jot(this, ibkVar);
            }
        } else {
            jotVar = new jot(this, ibkVar);
        }
        Object obj2 = jotVar.f114507a;
        int i2 = jotVar.f114508b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vjz vjzVar = new vjz(new rc10(new f2a0(fag1.m41173v((pgo) this.f191036a.f222596d.f206296b, q6f0.f185769a, ((ggt) obj).f79745a), 0), 15), new ga2(3, 23, null), 2);
            d6i d6iVar = new d6i(bqz0Var, 15);
            jotVar.f114508b = 1;
            Object objCollect = vjzVar.collect(d6iVar, jotVar);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}

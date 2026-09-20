package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class dwh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fs9 f53698a;

    public dwh(fs9 fs9Var) {
        this.f53698a = fs9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        cwh cwhVar;
        if (ibkVar instanceof cwh) {
            cwhVar = (cwh) ibkVar;
            int i = cwhVar.f42758b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cwhVar.f42758b = i - Integer.MIN_VALUE;
            } else {
                cwhVar = new cwh(this, ibkVar);
            }
        } else {
            cwhVar = new cwh(this, ibkVar);
        }
        Object obj2 = cwhVar.f42757a;
        int i2 = cwhVar.f42758b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        rv7 rv7VarM42553s = this.f53698a.m42553s(((mvh) obj).f147584a);
        z6d z6dVar = new z6d(bqz0Var, 17);
        cwhVar.f42758b = 1;
        Object objCollect = rv7VarM42553s.collect(new ede(z6dVar, 27), cwhVar);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}

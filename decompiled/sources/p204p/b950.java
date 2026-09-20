package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class b950 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qyr f24774a;

    public b950(qyr qyrVar) {
        this.f24774a = qyrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        a950 a950Var;
        if (ibkVar instanceof a950) {
            a950Var = (a950) ibkVar;
            int i = a950Var.f13473b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a950Var.f13473b = i - Integer.MIN_VALUE;
            } else {
                a950Var = new a950(this, ibkVar);
            }
        } else {
            a950Var = new a950(this, ibkVar);
        }
        Object obj2 = a950Var.f13472a;
        int i2 = a950Var.f13473b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        fiz fizVar = this.f24774a.f194020e;
        zax zaxVar = new zax(bqz0Var, 21);
        a950Var.f13473b = 1;
        Object objCollect = fizVar.collect(new wc30(zaxVar, 12), a950Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}

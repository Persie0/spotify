package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class zvh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qzh f286709a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ugi f286710b;

    public zvh(qzh qzhVar, ugi ugiVar) {
        this.f286709a = qzhVar;
        this.f286710b = ugiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        yvh yvhVar;
        if (ibkVar instanceof yvh) {
            yvhVar = (yvh) ibkVar;
            int i = yvhVar.f276668b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvhVar.f276668b = i - Integer.MIN_VALUE;
            } else {
                yvhVar = new yvh(this, ibkVar);
            }
        } else {
            yvhVar = new yvh(this, ibkVar);
        }
        Object obj2 = yvhVar.f276667a;
        int i2 = yvhVar.f276668b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new j6a(this.f286709a, (dvh) obj, this.f286710b, (fbk) null, 17));
            z6d z6dVar = new z6d(bqz0Var, 15);
            yvhVar.f276668b = 1;
            Object objCollect = nzx0Var.collect(z6dVar, yvhVar);
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

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class zot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f284871a;

    public zot(spt sptVar) {
        this.f284871a = sptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        yot yotVar;
        if (ibkVar instanceof yot) {
            yotVar = (yot) ibkVar;
            int i = yotVar.f274730b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yotVar.f274730b = i - Integer.MIN_VALUE;
            } else {
                yotVar = new yot(this, ibkVar);
            }
        } else {
            yotVar = new yot(this, ibkVar);
        }
        Object obj2 = yotVar.f274729a;
        int i2 = yotVar.f274730b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new yyj0(this.f284871a.f212947g, (qit) obj, (fbk) null, 26));
            d6i d6iVar = new d6i(bqz0Var, 20);
            yotVar.f274730b = 1;
            Object objCollect = nzx0Var.collect(d6iVar, yotVar);
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

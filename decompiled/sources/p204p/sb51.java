package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class sb51 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ luk f207358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ na51 f207359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f207360c;

    public sb51(luk lukVar, na51 na51Var, String str) {
        this.f207358a = lukVar;
        this.f207359b = na51Var;
        this.f207360c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rb51 rb51Var;
        if (ibkVar instanceof rb51) {
            rb51Var = (rb51) ibkVar;
            int i = rb51Var.f197476b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rb51Var.f197476b = i - Integer.MIN_VALUE;
            } else {
                rb51Var = new rb51(this, ibkVar);
            }
        } else {
            rb51Var = new rb51(this, ibkVar);
        }
        Object obj2 = rb51Var.f197475a;
        int i2 = rb51Var.f197476b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fiz fizVarM34374j = cyf1.m34374j(new nzx0(new ld01((ob51) obj, this.f207359b, this.f207360c, (fbk) null, 19)), this.f207358a);
            aeq0 aeq0Var = new aeq0(bqz0Var, 21);
            rb51Var.f197476b = 1;
            Object objCollect = fizVarM34374j.collect(aeq0Var, rb51Var);
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

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class d46 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v1k0 f45089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m500 f45090b;

    public d46(m500 m500Var, v1k0 v1k0Var) {
        this.f45089a = v1k0Var;
        this.f45090b = m500Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        c46 c46Var;
        if (ibkVar instanceof c46) {
            c46Var = (c46) ibkVar;
            int i = c46Var.f33853b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46Var.f33853b = i - Integer.MIN_VALUE;
            } else {
                c46Var = new c46(this, ibkVar);
            }
        } else {
            c46Var = new c46(this, ibkVar);
        }
        Object obj2 = c46Var.f33852a;
        int i2 = c46Var.f33853b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new wj0((xu5) obj, this.f45089a, this.f45090b, (fbk) null, 8));
            n5q n5qVar = xsr.f265651a;
            fiz fizVarM34374j = cyf1.m34374j(nzx0Var, pvb0.f181680a);
            h61 h61Var = new h61(bqz0Var, 10);
            c46Var.f33853b = 1;
            Object objCollect = fizVarM34374j.collect(h61Var, c46Var);
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

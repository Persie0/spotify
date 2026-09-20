package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class fwh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xre f74066a;

    public fwh(xre xreVar) {
        this.f74066a = xreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ewh ewhVar;
        if (ibkVar instanceof ewh) {
            ewhVar = (ewh) ibkVar;
            int i = ewhVar.f63550b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ewhVar.f63550b = i - Integer.MIN_VALUE;
            } else {
                ewhVar = new ewh(this, ibkVar);
            }
        } else {
            ewhVar = new ewh(this, ibkVar);
        }
        Object obj2 = ewhVar.f63549a;
        int i2 = ewhVar.f63550b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new C2004j6((ivh) obj, this.f74066a, null));
            z6d z6dVar = new z6d(bqz0Var, 18);
            ewhVar.f63550b = 1;
            Object objCollect = nzx0Var.collect(z6dVar, ewhVar);
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

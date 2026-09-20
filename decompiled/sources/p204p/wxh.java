package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class wxh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xre f256036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qzh f256037b;

    public wxh(xre xreVar, qzh qzhVar) {
        this.f256036a = xreVar;
        this.f256037b = qzhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        vxh vxhVar;
        if (ibkVar instanceof vxh) {
            vxhVar = (vxh) ibkVar;
            int i = vxhVar.f245743b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxhVar.f245743b = i - Integer.MIN_VALUE;
            } else {
                vxhVar = new vxh(this, ibkVar);
            }
        } else {
            vxhVar = new vxh(this, ibkVar);
        }
        Object obj2 = vxhVar.f245742a;
        int i2 = vxhVar.f245743b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new d37((rxh) obj, this.f256036a, this.f256037b, (fbk) null));
            z6d z6dVar = new z6d(bqz0Var, 22);
            vxhVar.f245743b = 1;
            Object objCollect = nzx0Var.collect(z6dVar, vxhVar);
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

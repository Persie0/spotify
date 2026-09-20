package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class wuc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s6b0 f255138a;

    public wuc0(s6b0 s6b0Var) {
        this.f255138a = s6b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vuc0 vuc0Var;
        if (ibkVar instanceof vuc0) {
            vuc0Var = (vuc0) ibkVar;
            int i = vuc0Var.f244921b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vuc0Var.f244921b = i - Integer.MIN_VALUE;
            } else {
                vuc0Var = new vuc0(this, ibkVar);
            }
        } else {
            vuc0Var = new vuc0(this, ibkVar);
        }
        Object obj2 = vuc0Var.f244920a;
        int i2 = vuc0Var.f244921b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fiz fizVar = (fiz) this.f255138a.invoke((stc0) obj);
            mwa0 mwa0Var = new mwa0(bqz0Var, 9);
            vuc0Var.f244921b = 1;
            Object objCollect = fizVar.collect(mwa0Var, vuc0Var);
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

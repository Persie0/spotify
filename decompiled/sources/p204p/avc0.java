package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class avc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nwo f20157a;

    public avc0(nwo nwoVar) {
        this.f20157a = nwoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        zuc0 zuc0Var;
        if (ibkVar instanceof zuc0) {
            zuc0Var = (zuc0) ibkVar;
            int i = zuc0Var.f286415b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zuc0Var.f286415b = i - Integer.MIN_VALUE;
            } else {
                zuc0Var = new zuc0(this, ibkVar);
            }
        } else {
            zuc0Var = new zuc0(this, ibkVar);
        }
        Object obj2 = zuc0Var.f286414a;
        int i2 = zuc0Var.f286415b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fiz fizVar = (fiz) this.f20157a.invoke((fuc0) obj);
            mwa0 mwa0Var = new mwa0(bqz0Var, 11);
            zuc0Var.f286415b = 1;
            Object objCollect = fizVar.collect(mwa0Var, zuc0Var);
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

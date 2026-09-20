package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class oot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rpt f167691a;

    public oot(rpt rptVar) {
        this.f167691a = rptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (((p204p.fiz) r8).collect(r6, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hot hotVar;
        if (ibkVar instanceof hot) {
            hotVar = (hot) ibkVar;
            int i = hotVar.f93603b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hotVar.f93603b = i - Integer.MIN_VALUE;
            } else {
                hotVar = new hot(this, ibkVar);
            }
        } else {
            hotVar = new hot(this, ibkVar);
        }
        Object objM35093p = hotVar.f93602a;
        int i2 = hotVar.f93603b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = hotVar.f93605d;
                bga.m29073P(objM35093p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM35093p);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM35093p);
        d670 d670Var = this.f167691a.f201642a;
        hotVar.f93605d = bqz0Var;
        hotVar.f93603b = 1;
        objM35093p = d670Var.m35093p(hotVar);
        if (objM35093p != yukVar) {
        }
        return yukVar;
        d6i d6iVar = new d6i(bqz0Var, 13);
        hotVar.f93605d = null;
        hotVar.f93603b = 2;
    }
}

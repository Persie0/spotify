package p204p;

import com.spotify.home.evopage.mobius.C0788e;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class qex implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0788e f188055a;

    public qex(C0788e c0788e) {
        this.f188055a = c0788e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        pex pexVar;
        if (ibkVar instanceof pex) {
            pexVar = (pex) ibkVar;
            int i = pexVar.f176875b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pexVar.f176875b = i - Integer.MIN_VALUE;
            } else {
                pexVar = new pex(this, ibkVar);
            }
        } else {
            pexVar = new pex(this, ibkVar);
        }
        Object obj2 = pexVar.f176874a;
        int i2 = pexVar.f176875b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Effect.LoadHomeStructure loadHomeStructure = (Effect.LoadHomeStructure) obj;
            l1a0 l1a0Var = this.f188055a.f4157a;
            boolean zM51620i = l1a0Var.f128666c.m51620i();
            l1a0Var.f128674k.mo40805i(new v530(zM51620i ? 1 : 2));
            nzx0 nzx0VarM65833l = zM51620i ? nxf1.m65833l(new e1a0(loadHomeStructure, null, l1a0Var)) : nxf1.m65833l(new y0a0(loadHomeStructure, null, l1a0Var));
            zax zaxVar = new zax(bqz0Var, 6);
            pexVar.f176875b = 1;
            Object objCollect = nzx0VarM65833l.collect(zaxVar, pexVar);
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

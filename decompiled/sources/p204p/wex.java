package p204p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class wex implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fyd f250640a;

    public wex(fyd fydVar) {
        this.f250640a = fydVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vex vexVar;
        if (ibkVar instanceof vex) {
            vexVar = (vex) ibkVar;
            int i = vexVar.f240834b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vexVar.f240834b = i - Integer.MIN_VALUE;
            } else {
                vexVar = new vex(this, ibkVar);
            }
        } else {
            vexVar = new vex(this, ibkVar);
        }
        Object forceReloadChecked = vexVar.f240833a;
        int i2 = vexVar.f240834b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = vexVar.f240836d;
                bga.m29073P(forceReloadChecked);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(forceReloadChecked);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(forceReloadChecked);
        vexVar.f240836d = bqz0Var;
        vexVar.f240834b = 1;
        fyd fydVar = this.f250640a;
        forceReloadChecked = new Event.ForceReloadChecked(fydVar.f74701a.f279107a.mo48713h(z430.f279106b, false), fydVar.f74702b.m49854o(false));
        if (forceReloadChecked != yukVar) {
        }
        return yukVar;
        vexVar.f240836d = null;
        vexVar.f240834b = 2;
    }
}

package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;
import com.spotify.home.evopage.mobius.C0788e;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class uex implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0788e f229610a;

    public uex(C0788e c0788e) {
        this.f229610a = c0788e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r3.mo30229d(r1, r2) == r6) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        tex texVar;
        bqz0 bqz0Var2;
        if (ibkVar instanceof tex) {
            texVar = (tex) ibkVar;
            int i = texVar.f219803b;
            if ((i & Integer.MIN_VALUE) != 0) {
                texVar.f219803b = i - Integer.MIN_VALUE;
            } else {
                texVar = new tex(this, ibkVar);
            }
        } else {
            texVar = new tex(this, ibkVar);
        }
        Object obj2 = texVar.f219802a;
        int i2 = texVar.f219803b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var2 = texVar.f219805d;
                bga.m29073P(obj2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        lyk0 lyk0Var = (lyk0) this.f229610a.f4165i.get();
        texVar.f219805d = bqz0Var;
        texVar.f219803b = 1;
        ((myk0) lyk0Var).getClass();
        t3x0 t3x0VarM37075x = dv9.m37075x(ResolvedHome.m5767o().m5770r(), false);
        String filterValue = ((Effect.OfflineFallbackResponse) obj).getFilterValue();
        lau lauVar = lau.f131415a;
        gbu gbuVar = gbu.f78413a;
        cvw cvwVar = new cvw(lauVar, gbuVar, gbuVar, null, t3x0VarM37075x, false, i3a0.f98081c, filterValue, gbuVar, kaa0.f120852e, "", "");
        if (cvwVar != yukVar) {
            bqz0Var2 = bqz0Var;
            obj2 = cvwVar;
        }
        return yukVar;
        texVar.f219805d = null;
        texVar.f219803b = 2;
    }
}

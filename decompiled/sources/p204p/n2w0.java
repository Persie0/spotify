package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class n2w0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q1w0 f149848a;

    public n2w0(q1w0 q1w0Var) {
        this.f149848a = q1w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r1.mo30229d(r3, r12) == r15) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        m2w0 m2w0Var;
        bqz0 bqz0Var2;
        Object objM95161b;
        if (ibkVar instanceof m2w0) {
            m2w0Var = (m2w0) ibkVar;
            int i = m2w0Var.f139471b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2w0Var.f139471b = i - Integer.MIN_VALUE;
            } else {
                m2w0Var = new m2w0(this, ibkVar);
            }
        } else {
            m2w0Var = new m2w0(this, ibkVar);
        }
        m2w0 m2w0Var2 = m2w0Var;
        Object obj2 = m2w0Var2.f139470a;
        int i2 = m2w0Var2.f139471b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0 bqz0Var3 = m2w0Var2.f139473d;
                bga.m29073P(obj2);
                objM95161b = ((s6x0) obj2).f206218a;
                bqz0Var2 = bqz0Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        b2w0 b2w0Var = (b2w0) obj;
        String str = b2w0Var.f22732c;
        dhl dhlVar = b2w0Var.f22736g;
        String str2 = b2w0Var.f22730a;
        String str3 = b2w0Var.f22734e;
        String str4 = b2w0Var.f22735f;
        Map mapM56700m0 = dhlVar.f49126a;
        if (bm51.m29803n0(str, "spotify:show", false)) {
            mapM56700m0 = kkc0.m56700m0(mapM56700m0, Collections.singletonMap(Context.Metadata.KEY_END_CONTEXT_ACTION, ContextTrack.TrackAction.STOP));
        }
        u1w0 u1w0Var = new u1w0(mapM56700m0, dhlVar.f49127b);
        List list = b2w0Var.f22733d;
        bqz0Var2 = bqz0Var;
        m2w0Var2.f139473d = bqz0Var2;
        m2w0Var2.f139471b = 1;
        objM95161b = z1w0.m95161b(this.f149848a, str, str2, list, str3, str4, null, u1w0Var, false, m2w0Var2, 160);
        if (objM95161b != yukVar) {
        }
        return yukVar;
        wgl wglVar = new wgl(objM95161b);
        m2w0Var2.f139473d = null;
        m2w0Var2.f139471b = 2;
    }
}

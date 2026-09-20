package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class q590 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r9.mo30229d(p204p.u590.f226950a, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        p590 p590Var;
        if (ibkVar instanceof p590) {
            p590Var = (p590) ibkVar;
            int i = p590Var.f174119b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p590Var.f174119b = i - Integer.MIN_VALUE;
            } else {
                p590Var = new p590(this, ibkVar);
            }
        } else {
            p590Var = new p590(this, ibkVar);
        }
        Object obj2 = p590Var.f174118a;
        int i2 = p590Var.f174119b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = p590Var.f174121d;
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
        m590 m590Var = (m590) obj;
        hvi0 hvi0Var = cks.f39079b;
        m590Var.getClass();
        long jM54450E = jwg1.m54450E(TimeUnit.MILLISECONDS.toMillis(m590Var.f140168a), ils.MILLISECONDS);
        p590Var.f174121d = bqz0Var;
        p590Var.f174119b = 1;
        if (njg1.m64620m(jM54450E, p590Var) != yukVar) {
        }
        return yukVar;
        p590Var.f174121d = null;
        p590Var.f174119b = 2;
    }
}

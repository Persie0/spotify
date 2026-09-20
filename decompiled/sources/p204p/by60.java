package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class by60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f32087a;

    public by60(iy60 iy60Var) {
        this.f32087a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L37;
     */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ay60 ay60Var;
        Object ow60Var;
        if (ibkVar instanceof ay60) {
            ay60Var = (ay60) ibkVar;
            int i = ay60Var.f21114b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ay60Var.f21114b = i - Integer.MIN_VALUE;
            } else {
                ay60Var = new ay60(this, ibkVar);
            }
        } else {
            ay60Var = new ay60(this, ibkVar);
        }
        Object objM33049F = ay60Var.f21113a;
        int i2 = ay60Var.f21114b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = ay60Var.f21116d;
                    bga.m29073P(objM33049F);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM33049F);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM33049F);
            bx60 bx60Var = (bx60) obj;
            aj2 aj2Var = this.f32087a.f106868b;
            nk2 nk2Var = bx60Var.f31791a;
            String str = bx60Var.f31792b;
            ay60Var.f21116d = bqz0Var;
            ay60Var.f21114b = 1;
            objM33049F = ((ck2) aj2Var).m33049F(nk2Var, str, ay60Var);
            if (objM33049F == yukVar) {
            }
            return yukVar;
            kpk kpkVar = (kpk) objM33049F;
            if (kpkVar instanceof jpk) {
                ow60Var = new iw60(((jpk) kpkVar).f114683a, ((jpk) kpkVar).f114684b);
            } else {
                if (!(kpkVar instanceof ipk)) {
                    throw new NoWhenBranchMatchedException();
                }
                ow60Var = new ow60(((ipk) kpkVar).f104518a);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to load suggestion pills", e2);
            ow60Var = new ow60(lau.f131415a);
        }
        ay60Var.f21116d = null;
        ay60Var.f21114b = 2;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.PlayerState;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class huc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juc1 f95368a;

    public huc1(juc1 juc1Var) {
        this.f95368a = juc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r10.mo30229d(r9, r0) == r7) goto L52;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        guc1 guc1Var;
        btc1 btc1Var;
        int i;
        int i2;
        int i3;
        if (ibkVar instanceof guc1) {
            guc1Var = (guc1) ibkVar;
            int i4 = guc1Var.f84445b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                guc1Var.f84445b = i4 - Integer.MIN_VALUE;
            } else {
                guc1Var = new guc1(this, ibkVar);
            }
        } else {
            guc1Var = new guc1(this, ibkVar);
        }
        Object objM86755t = guc1Var.f84444a;
        int i5 = guc1Var.f84445b;
        juc1 juc1Var = this.f95368a;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        try {
            if (i5 == 0) {
                bga.m29073P(objM86755t);
                onc oncVar = juc1Var.f116081X;
                guc1Var.f84447d = bqz0Var;
                guc1Var.f84448e = 0;
                guc1Var.f84445b = 1;
                objM86755t = vyf1.m86755t(oncVar, guc1Var);
                if (objM86755t != yukVar) {
                    i = 0;
                }
                return yukVar;
            }
            if (i5 == 1) {
                i = guc1Var.f84448e;
                bqz0Var = guc1Var.f84447d;
                bga.m29073P(objM86755t);
            } else if (i5 == 2) {
                i3 = guc1Var.f84449f;
                bqz0Var = guc1Var.f84447d;
                bga.m29073P(objM86755t);
                i2 = i3;
                if (i2 == 0) {
                    z = false;
                }
                btc1Var = new btc1(z);
                guc1Var.f84447d = null;
                guc1Var.f84445b = 3;
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
            }
            return w2a1.f247311a;
            PlayerState playerState = (PlayerState) objM86755t;
            i2 = (!playerState.isPlaying() || playerState.isPaused()) ? 0 : 1;
            if (i2 != 0) {
                guc1Var.f84447d = bqz0Var;
                guc1Var.f84448e = i;
                guc1Var.f84449f = i2;
                guc1Var.f84445b = 2;
                if (juc1.m54339e(juc1Var, guc1Var) != yukVar) {
                    i3 = i2;
                    i2 = i3;
                    if (i2 == 0) {
                        z = false;
                    }
                    btc1Var = new btc1(z);
                    guc1Var.f84447d = null;
                    guc1Var.f84445b = 3;
                }
            } else {
                if (i2 == 0) {
                    z = false;
                }
                btc1Var = new btc1(z);
                guc1Var.f84447d = null;
                guc1Var.f84445b = 3;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to pause player for recording", e2);
            btc1Var = new btc1(false);
        }
        return yukVar;
    }
}

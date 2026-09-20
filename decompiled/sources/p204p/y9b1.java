package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.familyverify.p064v1.TriggerQrCodeVerificationStartNotificationRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class y9b1 {

    /* JADX INFO: renamed from: a */
    public final luk f270561a;

    /* JADX INFO: renamed from: b */
    public final luk f270562b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f270563c;

    /* JADX INFO: renamed from: d */
    public final v0y f270564d;

    /* JADX INFO: renamed from: e */
    public final o9i0 f270565e;

    /* JADX INFO: renamed from: f */
    public final boolean f270566f;

    public y9b1(luk lukVar, luk lukVar2, z9j0 z9j0Var, v0y v0yVar, o9i0 o9i0Var, sh4 sh4Var) {
        this.f270561a = lukVar;
        this.f270562b = lukVar2;
        this.f270563c = z9j0Var;
        this.f270564d = v0yVar;
        this.f270565e = o9i0Var;
        this.f270566f = sh4Var.m78124a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m93151a(y9b1 y9b1Var, ibk ibkVar) {
        x9b1 x9b1Var;
        if (ibkVar instanceof x9b1) {
            x9b1Var = (x9b1) ibkVar;
            int i = x9b1Var.f259314c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9b1Var.f259314c = i - Integer.MIN_VALUE;
            } else {
                x9b1Var = new x9b1(y9b1Var, ibkVar);
            }
        } else {
            x9b1Var = new x9b1(y9b1Var, ibkVar);
        }
        Object obj = x9b1Var.f259312a;
        int i2 = x9b1Var.f259314c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            bga.m29073P(obj);
            o9i0 o9i0Var = y9b1Var.f270565e;
            boolean z = y9b1Var.f270566f;
            x9b1Var.f259314c = 1;
            mk91 mk91VarM10654q = TriggerQrCodeVerificationStartNotificationRequest.m10654q();
            mk91VarM10654q.m62067m();
            mk91VarM10654q.m62068q(z);
            TriggerQrCodeVerificationStartNotificationRequest triggerQrCodeVerificationStartNotificationRequest = (TriggerQrCodeVerificationStartNotificationRequest) mk91VarM10654q.build();
            p9i0 p9i0Var = o9i0Var.f163044a;
            wj50.m88279p(triggerQrCodeVerificationStartNotificationRequest);
            Object objM69398d = p9i0Var.m69398d(triggerQrCodeVerificationStartNotificationRequest, x9b1Var);
            yuk yukVar = yuk.f276404a;
            if (objM69398d != yukVar) {
                objM69398d = w2a1Var;
            }
            return objM69398d == yukVar ? yukVar : w2a1Var;
        } catch (Exception e) {
            Logger.m3967c(e, "Failed to trigger QR verification notification", new Object[0]);
            return w2a1Var;
        }
    }
}

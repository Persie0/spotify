package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class dy60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f54199a;

    public dy60(iy60 iy60Var) {
        this.f54199a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L31;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        cy60 cy60Var;
        cw60 cw60Var;
        if (ibkVar instanceof cy60) {
            cy60Var = (cy60) ibkVar;
            int i = cy60Var.f43172b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cy60Var.f43172b = i - Integer.MIN_VALUE;
            } else {
                cy60Var = new cy60(this, ibkVar);
            }
        } else {
            cy60Var = new cy60(this, ibkVar);
        }
        Object objM86755t = cy60Var.f43171a;
        int i2 = cy60Var.f43172b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = cy60Var.f43174d;
                    bga.m29073P(objM86755t);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM86755t);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM86755t);
            ov60 ov60Var = this.f54199a.f106869c;
            e560 e560Var = new e560(4, ov60Var.f170430d, ov60Var);
            cy60Var.f43174d = bqz0Var;
            cy60Var.f43172b = 1;
            objM86755t = vyf1.m86755t(e560Var, cy60Var);
            if (objM86755t == yukVar) {
            }
            return yukVar;
            cw60Var = new cw60(((Boolean) objM86755t).booleanValue());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to load disclaimer preference", e2);
            cw60Var = new cw60(false);
        }
        cy60Var.f43174d = null;
        cy60Var.f43172b = 2;
    }
}

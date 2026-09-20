package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ie11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ le11 f101300a;

    public ie11(le11 le11Var) {
        this.f101300a = le11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (p204p.sxg1.m79616D(r9, r0, r6, r10) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (p204p.x0h1.m89557A(r11, r0, r10) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        return r5;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        he11 he11Var;
        int i;
        if (ibkVar instanceof he11) {
            he11Var = (he11) ibkVar;
            int i2 = he11Var.f90286b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                he11Var.f90286b = i2 - Integer.MIN_VALUE;
            } else {
                he11Var = new he11(this, ibkVar);
            }
        } else {
            he11Var = new he11(this, ibkVar);
        }
        Object obj2 = he11Var.f90285a;
        int i3 = he11Var.f90286b;
        le11 le11Var = this.f101300a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj2);
                try {
                    String str = ((yd11) obj).f271621a;
                    v5m v5mVarMo28301c = le11Var.f132429d.mo28301c();
                    vx01 vx01Var = new vx01(le11Var, fbkVar, 8);
                    he11Var.f90288d = 0;
                    he11Var.f90286b = 1;
                } catch (Exception unused) {
                    i = 0;
                    luk lukVar = le11Var.f132431f;
                    r611 r611Var = new r611(le11Var, fbkVar, 1);
                    he11Var.f90288d = i;
                    he11Var.f90286b = 2;
                }
            } else if (i3 == 1) {
                i = he11Var.f90288d;
                try {
                    bga.m29073P(obj2);
                } catch (Exception unused2) {
                    luk lukVar2 = le11Var.f132431f;
                    r611 r611Var2 = new r611(le11Var, fbkVar, 1);
                    he11Var.f90288d = i;
                    he11Var.f90286b = 2;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}

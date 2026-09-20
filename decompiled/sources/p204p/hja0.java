package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class hja0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rb5 f92001a;

    public hja0(rb5 rb5Var) {
        this.f92001a = rb5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        gja0 gja0Var;
        xja0 xja0Var;
        if (ibkVar instanceof gja0) {
            gja0Var = (gja0) ibkVar;
            int i = gja0Var.f80421b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gja0Var.f80421b = i - Integer.MIN_VALUE;
            } else {
                gja0Var = new gja0(this, ibkVar);
            }
        } else {
            gja0Var = new gja0(this, ibkVar);
        }
        Object obj2 = gja0Var.f80420a;
        int i2 = gja0Var.f80421b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = gja0Var.f80423d;
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
            pha0 pha0Var = (pha0) obj;
            rb5 rb5Var = this.f92001a;
            int i3 = pha0Var.f177518c;
            gja0Var.f80423d = bqz0Var;
            gja0Var.f80421b = 1;
            if (rb5Var.m75153u(i3, gja0Var) == yukVar) {
            }
            return yukVar;
            xja0Var = new xja0(true);
        } catch (Exception unused) {
            xja0Var = new xja0(false);
        }
        gja0Var.f80423d = null;
        gja0Var.f80421b = 2;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class iud0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kud0 f105949a;

    public iud0(kud0 kud0Var) {
        this.f105949a = kud0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r9.mo30229d(r11, r0) == r7) goto L28;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hud0 hud0Var;
        bqz0 bqz0Var2;
        mud0 mud0Var;
        int i;
        bqz0 bqz0Var3;
        if (ibkVar instanceof hud0) {
            hud0Var = (hud0) ibkVar;
            int i2 = hud0Var.f95373b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hud0Var.f95373b = i2 - Integer.MIN_VALUE;
            } else {
                hud0Var = new hud0(this, ibkVar);
            }
        } else {
            hud0Var = new hud0(this, ibkVar);
        }
        Object objM57387b = hud0Var.f95372a;
        int i3 = hud0Var.f95373b;
        kud0 kud0Var = this.f105949a;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM57387b);
            mud0 mud0Var2 = (mud0) obj;
            hud0Var.f95375d = bqz0Var;
            hud0Var.f95376e = mud0Var2;
            hud0Var.f95377f = 0;
            hud0Var.f95373b = 1;
            if (kud0.m57386a(kud0Var, hud0Var) != yukVar) {
                bqz0Var2 = bqz0Var;
                mud0Var = mud0Var2;
                i = 0;
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = hud0Var.f95377f;
            mud0Var = hud0Var.f95376e;
            bqz0Var2 = hud0Var.f95375d;
            bga.m29073P(objM57387b);
        } else if (i3 == 2) {
            bqz0Var3 = hud0Var.f95375d;
            bga.m29073P(objM57387b);
            hud0Var.f95375d = null;
            hud0Var.f95376e = null;
            hud0Var.f95373b = 3;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM57387b);
        }
        return w2a1.f247311a;
        long j = mud0Var.f147313a;
        hud0Var.f95375d = bqz0Var2;
        hud0Var.f95376e = null;
        hud0Var.f95377f = i;
        hud0Var.f95373b = 2;
        objM57387b = kud0.m57387b(kud0Var, j, hud0Var);
        if (objM57387b != yukVar) {
            bqz0Var3 = bqz0Var2;
            hud0Var.f95375d = null;
            hud0Var.f95376e = null;
            hud0Var.f95373b = 3;
        }
        return yukVar;
    }
}

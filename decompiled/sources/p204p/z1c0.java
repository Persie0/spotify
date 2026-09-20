package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class z1c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a2c0 f278281a;

    public z1c0(a2c0 a2c0Var) {
        this.f278281a = a2c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        y1c0 y1c0Var;
        if (ibkVar instanceof y1c0) {
            y1c0Var = (y1c0) ibkVar;
            int i = y1c0Var.f268228b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y1c0Var.f268228b = i - Integer.MIN_VALUE;
            } else {
                y1c0Var = new y1c0(this, ibkVar);
            }
        } else {
            y1c0Var = new y1c0(this, ibkVar);
        }
        Object objM60535a = y1c0Var.f268227a;
        int i2 = y1c0Var.f268228b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = y1c0Var.f268230d;
                bga.m29073P(objM60535a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM60535a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM60535a);
        c1c0 c1c0Var = (c1c0) obj;
        m1c0 m1c0Var = this.f278281a.f11623a;
        String str = c1c0Var.f33049c;
        String str2 = c1c0Var.f33050d;
        ss8 ss8Var = c1c0Var.f33051e;
        y1c0Var.f268230d = bqz0Var;
        y1c0Var.f268228b = 1;
        objM60535a = m1c0Var.m60535a(str, str2, ss8Var, y1c0Var);
        if (objM60535a != yukVar) {
        }
        return yukVar;
        y1c0Var.f268230d = null;
        y1c0Var.f268228b = 2;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class u61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f227195a;

    public u61(x61 x61Var) {
        this.f227195a = x61Var;
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
        t61 t61Var;
        if (ibkVar instanceof t61) {
            t61Var = (t61) ibkVar;
            int i = t61Var.f217412b;
            if ((i & Integer.MIN_VALUE) != 0) {
                t61Var.f217412b = i - Integer.MIN_VALUE;
            } else {
                t61Var = new t61(this, ibkVar);
            }
        } else {
            t61Var = new t61(this, ibkVar);
        }
        Object objM24830b = t61Var.f217411a;
        int i2 = t61Var.f217412b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = t61Var.f217414d;
                bga.m29073P(objM24830b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM24830b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM24830b);
        h51 h51Var = (h51) obj;
        a61 a61Var = this.f227195a.f258554a;
        String str = h51Var.f87699b;
        String str2 = h51Var.f87700c;
        gpm0 gpm0Var = h51Var.f87701d;
        t61Var.f217414d = bqz0Var;
        t61Var.f217412b = 1;
        objM24830b = a61Var.m24830b(str, str2, gpm0Var, t61Var);
        if (objM24830b != yukVar) {
        }
        return yukVar;
        t61Var.f217414d = null;
        t61Var.f217412b = 2;
    }
}

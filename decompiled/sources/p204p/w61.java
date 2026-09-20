package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class w61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f248227a;

    public w61(x61 x61Var) {
        this.f248227a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r11.mo30229d(r12, r6) == r8) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        v61 v61Var;
        if (ibkVar instanceof v61) {
            v61Var = (v61) ibkVar;
            int i = v61Var.f237701b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v61Var.f237701b = i - Integer.MIN_VALUE;
            } else {
                v61Var = new v61(this, ibkVar);
            }
        } else {
            v61Var = new v61(this, ibkVar);
        }
        v61 v61Var2 = v61Var;
        Object objM24832d = v61Var2.f237700a;
        int i2 = v61Var2.f237701b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = v61Var2.f237703d;
                bga.m29073P(objM24832d);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM24832d);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM24832d);
        j51 j51Var = (j51) obj;
        a61 a61Var = this.f248227a.f258554a;
        String str = j51Var.f108832b;
        String str2 = j51Var.f108833c;
        String str3 = j51Var.f108834d;
        gpm0 gpm0Var = j51Var.f108835e;
        v61Var2.f237703d = bqz0Var;
        v61Var2.f237701b = 1;
        objM24832d = a61Var.m24832d(str, str2, str3, gpm0Var, v61Var2);
        if (objM24832d != yukVar) {
        }
        return yukVar;
        v61Var2.f237703d = null;
        v61Var2.f237701b = 2;
    }
}

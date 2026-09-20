package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class qtv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ utv0 f192492a;

    public qtv0(utv0 utv0Var) {
        this.f192492a = utv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r14.mo30229d(r15, r7) == r11) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v8, types: [p.mtv0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ptv0 ptv0Var;
        Object xtv0Var;
        if (ibkVar instanceof ptv0) {
            ptv0Var = (ptv0) ibkVar;
            int i = ptv0Var.f181261b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ptv0Var.f181261b = i - Integer.MIN_VALUE;
            } else {
                ptv0Var = new ptv0(this, ibkVar);
            }
        } else {
            ptv0Var = new ptv0(this, ibkVar);
        }
        ptv0 ptv0Var2 = ptv0Var;
        Object obj2 = ptv0Var2.f181260a;
        int i2 = ptv0Var2.f181261b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    mtv0 mtv0Var = ptv0Var2.f181264e;
                    bqz0Var = ptv0Var2.f181263d;
                    bga.m29073P(obj2);
                    obj = mtv0Var;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(obj2);
            mtv0 mtv0Var2 = (mtv0) obj;
            zby zbyVar = this.f192492a.f233997a;
            String str = mtv0Var2.f147190b;
            Boolean boolValueOf = Boolean.valueOf(!mtv0Var2.f147191c);
            ptv0Var2.f181263d = bqz0Var;
            ptv0Var2.f181264e = mtv0Var2;
            ptv0Var2.f181261b = 1;
            obj = mtv0Var2;
            if (zby.m95882j(zbyVar, str, boolValueOf, null, null, null, ptv0Var2, 28) == yukVar) {
            }
            return yukVar;
            xtv0Var = new vtv0(obj.f147191c);
        } catch (Throwable unused) {
            xtv0Var = new xtv0(!obj.f147191c);
        }
        ptv0Var2.f181263d = null;
        ptv0Var2.f181264e = null;
        ptv0Var2.f181261b = 2;
    }
}

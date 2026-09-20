package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class c8e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r7e1 f35194a;

    public c8e1(r7e1 r7e1Var) {
        this.f35194a = r7e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        b8e1 b8e1Var;
        if (ibkVar instanceof b8e1) {
            b8e1Var = (b8e1) ibkVar;
            int i = b8e1Var.f24575b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b8e1Var.f24575b = i - Integer.MIN_VALUE;
            } else {
                b8e1Var = new b8e1(this, ibkVar);
            }
        } else {
            b8e1Var = new b8e1(this, ibkVar);
        }
        Object objM74898a = b8e1Var.f24574a;
        int i2 = b8e1Var.f24575b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = b8e1Var.f24577d;
                bga.m29073P(objM74898a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM74898a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM74898a);
        f7e1 f7e1Var = (f7e1) obj;
        String str = f7e1Var.f66667e;
        String str2 = f7e1Var.f66668f;
        b8e1Var.f24577d = bqz0Var;
        b8e1Var.f24575b = 1;
        objM74898a = this.f35194a.m74898a(str, str2, b8e1Var);
        if (objM74898a != yukVar) {
        }
        return yukVar;
        b8e1Var.f24577d = null;
        b8e1Var.f24575b = 2;
    }
}

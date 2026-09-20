package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class o6r0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m7r0 f162406a;

    public o6r0(m7r0 m7r0Var) {
        this.f162406a = m7r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        n6r0 n6r0Var;
        Object obj2;
        if (ibkVar instanceof n6r0) {
            n6r0Var = (n6r0) ibkVar;
            int i = n6r0Var.f150943b;
            if ((i & Integer.MIN_VALUE) != 0) {
                n6r0Var.f150943b = i - Integer.MIN_VALUE;
            } else {
                n6r0Var = new n6r0(this, ibkVar);
            }
        } else {
            n6r0Var = new n6r0(this, ibkVar);
        }
        Object objM61093e = n6r0Var.f150942a;
        int i2 = n6r0Var.f150943b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = n6r0Var.f150945d;
                bga.m29073P(objM61093e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61093e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM61093e);
        f6r0 f6r0Var = (f6r0) obj;
        String str = f6r0Var.f66490c;
        String str2 = f6r0Var.f66492e;
        d850 d850Var = f6r0Var.f66493f;
        n6r0Var.f150945d = bqz0Var;
        n6r0Var.f150943b = 1;
        objM61093e = this.f162406a.m61093e(str, str2, d850Var, n6r0Var);
        if (objM61093e != yukVar) {
        }
        return yukVar;
        h7r0 h7r0Var = (h7r0) objM61093e;
        if (wj50.m88271j(h7r0Var, g7r0.f77335a)) {
            obj2 = b7r0.f24374a;
        } else {
            if (!(h7r0Var instanceof f7r0)) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = a7r0.f13128a;
        }
        n6r0Var.f150945d = null;
        n6r0Var.f150943b = 2;
    }
}

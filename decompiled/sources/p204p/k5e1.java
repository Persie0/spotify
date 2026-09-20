package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class k5e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fs9 f119491a;

    public k5e1(fs9 fs9Var) {
        this.f119491a = fs9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        j5e1 j5e1Var;
        if (ibkVar instanceof j5e1) {
            j5e1Var = (j5e1) ibkVar;
            int i = j5e1Var.f108948b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j5e1Var.f108948b = i - Integer.MIN_VALUE;
            } else {
                j5e1Var = new j5e1(this, ibkVar);
            }
        } else {
            j5e1Var = new j5e1(this, ibkVar);
        }
        Object obj2 = j5e1Var.f108947a;
        int i2 = j5e1Var.f108948b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            q0m q0mVar = ((s4e1) obj).f205578a;
            byte[] bArr = null;
            try {
                File fileM92243b = ((xvo) this.f119491a.f72807b).m92243b(q0mVar);
                if (fileM92243b.exists()) {
                    byte[] bArrM71563W = pxy.m71563W(fileM92243b);
                    fileM92243b.setLastModified(System.currentTimeMillis());
                    bArr = bArrM71563W;
                }
            } catch (Exception unused) {
            }
            Object z5e1Var = new z5e1(bArr != null ? new t67(bArr) : new w67(q0mVar.f184022a, q0mVar.f184023b, q0mVar.f184024c), q0mVar.f184026e);
            j5e1Var.f108948b = 1;
            Object objMo30229d = bqz0Var.mo30229d(z5e1Var, j5e1Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}

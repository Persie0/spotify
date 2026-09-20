package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class nry0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i5z f157626a;

    public nry0(i5z i5zVar) {
        this.f157626a = i5zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r13.mo30229d(r14, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        mry0 mry0Var;
        zqy0 zqy0Var;
        if (ibkVar instanceof mry0) {
            mry0Var = (mry0) ibkVar;
            int i = mry0Var.f146645b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mry0Var.f146645b = i - Integer.MIN_VALUE;
            } else {
                mry0Var = new mry0(this, ibkVar);
            }
        } else {
            mry0Var = new mry0(this, ibkVar);
        }
        Object obj2 = mry0Var.f146644a;
        int i2 = mry0Var.f146645b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                zqy0Var = mry0Var.f146648e;
                bqz0Var = mry0Var.f146647d;
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
        zqy0Var = (zqy0) obj;
        b70 b70Var = zqy0Var.f285480a;
        String str = b70Var.f24106a;
        String str2 = b70Var.f24107b;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        tbf tbfVar = new tbf(str, str2, xgg1.m90749Z4().f36166c, zqy0Var.f285481b, null);
        mry0Var.f146647d = bqz0Var;
        mry0Var.f146648e = zqy0Var;
        mry0Var.f146645b = 1;
        if (this.f157626a.m49785q(tbfVar, mry0Var) != yukVar) {
        }
        return yukVar;
        ity0 ity0Var = new ity0(zqy0Var.f285481b);
        mry0Var.f146647d = null;
        mry0Var.f146648e = null;
        mry0Var.f146645b = 2;
    }
}

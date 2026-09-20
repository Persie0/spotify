package p204p;

import com.spotify.home.slotloading.SlotEffect$LoadSlotContent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class ps21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ts21 f180719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f180720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f180721c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f180722d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f180723e;

    public ps21(ts21 ts21Var, String str, boolean z, boolean z2, String str2) {
        this.f180719a = ts21Var;
        this.f180720b = str;
        this.f180721c = z;
        this.f180722d = z2;
        this.f180723e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r12.mo30229d(r13, r7) == r9) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        os21 os21Var;
        if (ibkVar instanceof os21) {
            os21Var = (os21) ibkVar;
            int i = os21Var.f168718b;
            if ((i & Integer.MIN_VALUE) != 0) {
                os21Var.f168718b = i - Integer.MIN_VALUE;
            } else {
                os21Var = new os21(this, ibkVar);
            }
        } else {
            os21Var = new os21(this, ibkVar);
        }
        os21 os21Var2 = os21Var;
        Object objM90962t = os21Var2.f168717a;
        int i2 = os21Var2.f168718b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = os21Var2.f168720d;
                bga.m29073P(objM90962t);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM90962t);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM90962t);
        SlotEffect$LoadSlotContent slotEffect$LoadSlotContent = (SlotEffect$LoadSlotContent) obj;
        xh70 xh70Var = this.f180719a.f223191b;
        os21Var2.f168720d = bqz0Var;
        os21Var2.f168718b = 1;
        objM90962t = xh70Var.m90962t(slotEffect$LoadSlotContent, this.f180720b, this.f180721c, this.f180722d, this.f180723e, os21Var2);
        if (objM90962t != yukVar) {
        }
        return yukVar;
        os21Var2.f168720d = null;
        os21Var2.f168718b = 2;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ke11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ le11 f121777a;

    public ke11(le11 le11Var) {
        this.f121777a = le11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r13.mo30229d(r5, r0) == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v8, types: [p.wd11] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        je11 je11Var;
        Object we11Var;
        if (ibkVar instanceof je11) {
            je11Var = (je11) ibkVar;
            int i = je11Var.f111432b;
            if ((i & Integer.MIN_VALUE) != 0) {
                je11Var.f111432b = i - Integer.MIN_VALUE;
            } else {
                je11Var = new je11(this, ibkVar);
            }
        } else {
            je11Var = new je11(this, ibkVar);
        }
        Object objM79641x = je11Var.f111431a;
        int i2 = je11Var.f111432b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    wd11 wd11Var = je11Var.f111435e;
                    bqz0Var = je11Var.f111434d;
                    bga.m29073P(objM79641x);
                    obj = wd11Var;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM79641x);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM79641x);
            wd11 wd11Var2 = (wd11) obj;
            e3p e3pVar = this.f121777a.f132426a;
            td11 td11Var = wd11Var2.f250190a;
            String str = wd11Var2.f250191b;
            je11Var.f111434d = bqz0Var;
            je11Var.f111435e = wd11Var2;
            je11Var.f111432b = 1;
            objM79641x = sxg1.m79641x(e3pVar, td11Var, str, je11Var);
            obj = wd11Var2;
            if (objM79641x == yukVar) {
            }
            return yukVar;
            avr avrVar = (avr) objM79641x;
            List list = avrVar.f20250a;
            String str2 = avrVar.f20251b;
            we11Var = new xe11(obj.f250192c, obj.f250190a.f219211d, str2, list);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            we11Var = new we11(obj.f250192c, obj.f250190a.f219211d);
        }
        je11Var.f111434d = null;
        je11Var.f111435e = null;
        je11Var.f111432b = 2;
    }
}

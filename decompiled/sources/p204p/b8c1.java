package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class b8c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c8c1 f24566a;

    public b8c1(c8c1 c8c1Var) {
        this.f24566a = c8c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r15.mo30229d(r0, r8) == r13) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v4, types: [p.bqz0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        a8c1 a8c1Var;
        e8c1 e8c1Var;
        ?? r15;
        if (ibkVar instanceof a8c1) {
            a8c1Var = (a8c1) ibkVar;
            int i = a8c1Var.f13252b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a8c1Var.f13252b = i - Integer.MIN_VALUE;
            } else {
                a8c1Var = new a8c1(this, ibkVar);
            }
        } else {
            a8c1Var = new a8c1(this, ibkVar);
        }
        a8c1 a8c1Var2 = a8c1Var;
        Object obj2 = a8c1Var2.f13251a;
        int i2 = a8c1Var2.f13252b;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        bqz0 bqz0Var2 = a8c1Var2.f13254d;
                        bga.m29073P(obj2);
                        obj = bqz0Var2;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj2);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj2);
                t7c1 t7c1Var = (t7c1) obj;
                try {
                    zby zbyVar = this.f24566a.f35184a;
                    String str = t7c1Var.f217749c;
                    Boolean boolValueOf = Boolean.valueOf(t7c1Var.f217750d);
                    bqz0 bqz0Var3 = bqz0Var;
                    a8c1Var2.f13254d = bqz0Var3;
                    a8c1Var2.f13252b = 1;
                    obj = bqz0Var3;
                    if (zby.m95882j(zbyVar, str, null, null, null, boolValueOf, a8c1Var2, 14) == yukVar) {
                    }
                } catch (Exception unused) {
                    obj = bqz0Var;
                    e8c1Var = new e8c1(3, false);
                    r15 = obj;
                }
                return yukVar;
                e8c1Var = new e8c1(3, true);
                r15 = obj;
            } catch (Exception unused2) {
            }
            a8c1Var2.f13254d = null;
            a8c1Var2.f13252b = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}

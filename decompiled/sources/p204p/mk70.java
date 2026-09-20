package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class mk70 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sk70 f144516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rmm0 f144517b;

    public mk70(sk70 sk70Var, rmm0 rmm0Var) {
        this.f144516a = sk70Var;
        this.f144517b = rmm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [p.nl70] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, p.yuk] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Exception {
        lk70 lk70Var;
        nl70 nl70Var = this.f144516a.f210049b;
        if (ibkVar instanceof lk70) {
            lk70Var = (lk70) ibkVar;
            int i = lk70Var.f134278b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk70Var.f134278b = i - Integer.MIN_VALUE;
            } else {
                lk70Var = new lk70(this, ibkVar);
            }
        } else {
            lk70Var = new lk70(this, ibkVar);
        }
        Object obj2 = lk70Var.f134277a;
        int i2 = lk70Var.f134278b;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ik70 ik70Var = (ik70) obj;
                nl70Var.f155017a = true;
                x4j0 x4j0VarMo29869a = this.f144517b.mo29869a();
                pjn0 pjn0Var = ik70Var.f103050a;
                n6x0 n6x0Var = new n6x0(new tl70(pjn0Var.f178288a, pjn0Var.f178289b, pjn0Var.f178290c, pjn0Var.f178291d));
                lk70Var.f134278b = 1;
                Object objM89557A = x0h1.m89557A((luk) x4j0VarMo29869a.f258138b, new oxl0(x4j0VarMo29869a, n6x0Var, null, 11), lk70Var);
                nl70Var = yuk.f276404a;
                if (objM89557A != nl70Var) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A == nl70Var) {
                    return nl70Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            nl70Var.f155017a = false;
            throw e2;
        }
    }
}

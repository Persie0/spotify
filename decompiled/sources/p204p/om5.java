package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class om5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qm5 f166973a;

    public om5(qm5 qm5Var) {
        this.f166973a = qm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r12 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r11.mo30229d(r2, r0) == r6) goto L32;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        nm5 nm5Var;
        if (ibkVar instanceof nm5) {
            nm5Var = (nm5) ibkVar;
            int i = nm5Var.f155299b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm5Var.f155299b = i - Integer.MIN_VALUE;
            } else {
                nm5Var = new nm5(this, ibkVar);
            }
        } else {
            nm5Var = new nm5(this, ibkVar);
        }
        Object objM89901r = nm5Var.f155298a;
        int i2 = nm5Var.f155299b;
        Object ym5Var = xm5.f263292a;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = nm5Var.f155301d;
                bga.m29073P(objM89901r);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89901r);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89901r);
        ql5 ql5Var = (ql5) obj;
        lk5 lk5VarMo27644a = this.f166973a.f190136k.mo27644a();
        okp0 okp0Var = lk5VarMo27644a instanceof okp0 ? (okp0) lk5VarMo27644a : null;
        if (okp0Var == null) {
            nm5Var.f155301d = null;
            nm5Var.f155299b = 2;
        } else {
            n6b n6bVar = new n6b(ql5Var.f189735a, ql5Var.f189737c, ql5Var.f189736b);
            nm5Var.f155301d = bqz0Var;
            nm5Var.f155299b = 1;
            objM89901r = okp0Var.f166434c.m89901r(n6bVar, nm5Var);
        }
        return yukVar;
        q6b q6bVar = (q6b) objM89901r;
        if (q6bVar instanceof p6b) {
            ym5Var = new ym5(((p6b) q6bVar).f174338a);
        } else if (!wj50.m88271j(q6bVar, o6b.f162307a)) {
            throw new NoWhenBranchMatchedException();
        }
        nm5Var.f155301d = null;
        nm5Var.f155299b = 2;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class im5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qm5 f103593a;

    public im5(qm5 qm5Var) {
        this.f103593a = qm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        if (r2.mo30229d(r1, r3) == r9) goto L42;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hm5 hm5Var;
        bqz0 bqz0Var2;
        Object um5Var;
        bqz0 bqz0Var3;
        xk5 xk5Var = this.f103593a.f190136k;
        if (ibkVar instanceof hm5) {
            hm5Var = (hm5) ibkVar;
            int i = hm5Var.f92829b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hm5Var.f92829b = i - Integer.MIN_VALUE;
            } else {
                hm5Var = new hm5(this, ibkVar);
            }
        } else {
            hm5Var = new hm5(this, ibkVar);
        }
        Object objMo52739b = hm5Var.f92828a;
        int i2 = hm5Var.f92829b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var3 = hm5Var.f92831d;
                bga.m29073P(objMo52739b);
                bms0 bms0Var = (bms0) objMo52739b;
                if (wj50.m88271j(bms0Var, ams0.f17198a)) {
                    um5Var = new vm5(null, null);
                } else {
                    if (!wj50.m88271j(bms0Var, zls0.f284073a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    um5Var = new um5(Collections.singletonList(new ik5("Failed to update prompt")));
                }
                hm5Var.f92831d = null;
                hm5Var.f92829b = 3;
            } else if (i2 == 2) {
                bqz0Var2 = hm5Var.f92831d;
                bga.m29073P(objMo52739b);
                um5Var = nkf1.m64688d((qk5) objMo52739b, xk5Var, true);
                bqz0Var3 = bqz0Var2;
                hm5Var.f92831d = null;
                hm5Var.f92829b = 3;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objMo52739b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objMo52739b);
        pl5 pl5Var = (pl5) obj;
        lk5 lk5VarMo27644a = xk5Var.mo27644a();
        j9a1 j9a1Var = lk5VarMo27644a != null ? (j9a1) lk5VarMo27644a : null;
        if (j9a1Var == null) {
            um5Var = new um5(Collections.singletonList(new ik5("This content type does not support updates")));
            bqz0Var3 = bqz0Var;
            hm5Var.f92831d = null;
            hm5Var.f92829b = 3;
        } else {
            String str = pl5Var.f178637a;
            String str2 = pl5Var.f178638b;
            String str3 = pl5Var.f178639c;
            ykz0 ykz0Var = pl5Var.f178640d;
            y210 y210VarMo27654m = xk5Var.mo27654m(new a310(str, str2, str3, null, ykz0Var != null ? ykz0Var.f273866a : null, null, pl5Var.f178641e, false, pl5Var.f178642f, pl5Var.f178643g, 168));
            hm5Var.f92831d = bqz0Var;
            hm5Var.f92829b = 2;
            objMo52739b = j9a1Var.mo52739b(y210VarMo27654m, hm5Var);
            if (objMo52739b != yukVar) {
                bqz0Var2 = bqz0Var;
                um5Var = nkf1.m64688d((qk5) objMo52739b, xk5Var, true);
                bqz0Var3 = bqz0Var2;
                hm5Var.f92831d = null;
                hm5Var.f92829b = 3;
            }
        }
        return yukVar;
    }
}

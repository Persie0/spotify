package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class gm5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qm5 f81284a;

    public gm5(qm5 qm5Var) {
        this.f81284a = qm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r4.mo30229d(r1, r3) == r8) goto L26;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        fm5 fm5Var;
        bqz0 bqz0Var2;
        xk5 xk5Var = this.f81284a.f190136k;
        if (ibkVar instanceof fm5) {
            fm5Var = (fm5) ibkVar;
            int i = fm5Var.f70954b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fm5Var.f70954b = i - Integer.MIN_VALUE;
            } else {
                fm5Var = new fm5(this, ibkVar);
            }
        } else {
            fm5Var = new fm5(this, ibkVar);
        }
        Object objMo59216a = fm5Var.f70953a;
        int i2 = fm5Var.f70954b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var2 = fm5Var.f70956d;
                bga.m29073P(objMo59216a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objMo59216a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objMo59216a);
        dl5 dl5Var = (dl5) obj;
        String str = dl5Var.f50120a;
        String str2 = dl5Var.f50121b;
        String str3 = dl5Var.f50122c;
        ykz0 ykz0Var = dl5Var.f50123d;
        y210 y210VarMo27654m = xk5Var.mo27654m(new a310(str, str2, null, str3, ykz0Var != null ? ykz0Var.f273866a : null, dl5Var.f50124e, null, false, null, dl5Var.f50125f, 448));
        lk5 lk5VarMo27644a = xk5Var.mo27644a();
        fm5Var.f70956d = bqz0Var;
        fm5Var.f70954b = 1;
        objMo59216a = lk5VarMo27644a.mo59216a(y210VarMo27654m, fm5Var);
        if (objMo59216a != yukVar) {
            bqz0Var2 = bqz0Var;
        }
        return yukVar;
        xn5 xn5VarM64688d = nkf1.m64688d((qk5) objMo59216a, xk5Var, false);
        fm5Var.f70956d = null;
        fm5Var.f70954b = 2;
    }
}

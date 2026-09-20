package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class ti91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wi91 f220584a;

    public ti91(wi91 wi91Var) {
        this.f220584a = wi91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L28;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        si91 si91Var;
        Object objM84972c;
        if (ibkVar instanceof si91) {
            si91Var = (si91) ibkVar;
            int i = si91Var.f209386b;
            if ((i & Integer.MIN_VALUE) != 0) {
                si91Var.f209386b = i - Integer.MIN_VALUE;
            } else {
                si91Var = new si91(this, ibkVar);
            }
        } else {
            si91Var = new si91(this, ibkVar);
        }
        Object obj2 = si91Var.f209385a;
        int i2 = si91Var.f209386b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = si91Var.f209388d;
                bga.m29073P(obj2);
                objM84972c = ((s6x0) obj2).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        v9l0 v9l0Var = this.f220584a.f251569a;
        si91Var.f209388d = bqz0Var;
        si91Var.f209386b = 1;
        objM84972c = v9l0Var.m84972c(si91Var);
        if (objM84972c != yukVar) {
        }
        return yukVar;
        if (objM84972c instanceof c6x0) {
            objM84972c = null;
        }
        itw itwVar = wj50.m88271j(objM84972c, Boolean.TRUE) ? itw.f105784g : itw.f105782e;
        si91Var.f209388d = null;
        si91Var.f209386b = 2;
    }
}

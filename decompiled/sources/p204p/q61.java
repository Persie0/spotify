package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class q61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f185638a;

    public q61(x61 x61Var) {
        this.f185638a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r11.mo30229d(r12, r6) == r8) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        p61 p61Var;
        if (ibkVar instanceof p61) {
            p61Var = (p61) ibkVar;
            int i = p61Var.f174267b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p61Var.f174267b = i - Integer.MIN_VALUE;
            } else {
                p61Var = new p61(this, ibkVar);
            }
        } else {
            p61Var = new p61(this, ibkVar);
        }
        p61 p61Var2 = p61Var;
        Object objM24831c = p61Var2.f174266a;
        int i2 = p61Var2.f174267b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = p61Var2.f174269d;
                bga.m29073P(objM24831c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM24831c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM24831c);
        i51 i51Var = (i51) obj;
        a61 a61Var = this.f185638a.f258554a;
        String str = i51Var.f98730b;
        String str2 = i51Var.f98731c;
        String str3 = i51Var.f98732d;
        gpm0 gpm0Var = i51Var.f98733e;
        p61Var2.f174269d = bqz0Var;
        p61Var2.f174267b = 1;
        objM24831c = a61Var.m24831c(str, str2, str3, gpm0Var, p61Var2);
        if (objM24831c != yukVar) {
        }
        return yukVar;
        p61Var2.f174269d = null;
        p61Var2.f174267b = 2;
    }
}

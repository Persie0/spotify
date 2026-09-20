package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class k61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f119610a;

    public k61(x61 x61Var) {
        this.f119610a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        j61 j61Var;
        if (ibkVar instanceof j61) {
            j61Var = (j61) ibkVar;
            int i = j61Var.f109190b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j61Var.f109190b = i - Integer.MIN_VALUE;
            } else {
                j61Var = new j61(this, ibkVar);
            }
        } else {
            j61Var = new j61(this, ibkVar);
        }
        Object obj2 = j61Var.f109189a;
        int i2 = j61Var.f109190b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        o51 o51Var = (o51) obj;
        a61 a61Var = this.f119610a.f258554a;
        String str = o51Var.f161832b;
        boolean z = o51Var.f161833c;
        i26 i26Var = a61Var.f12667g;
        i26Var.getClass();
        yab yabVarM65827f = nxf1.m65827f(new ml1(3, i26Var, str, (fbk) null, z));
        h61 h61Var = new h61(bqz0Var, 1);
        j61Var.f109190b = 1;
        Object objCollect = yabVarM65827f.collect(new i80(h61Var, str, z, 1), j61Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}

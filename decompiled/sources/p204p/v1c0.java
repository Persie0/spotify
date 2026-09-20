package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class v1c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a2c0 f236318a;

    public v1c0(a2c0 a2c0Var) {
        this.f236318a = a2c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        u1c0 u1c0Var;
        if (ibkVar instanceof u1c0) {
            u1c0Var = (u1c0) ibkVar;
            int i = u1c0Var.f225752b;
            if ((i & Integer.MIN_VALUE) != 0) {
                u1c0Var.f225752b = i - Integer.MIN_VALUE;
            } else {
                u1c0Var = new u1c0(this, ibkVar);
            }
        } else {
            u1c0Var = new u1c0(this, ibkVar);
        }
        Object obj2 = u1c0Var.f225751a;
        int i2 = u1c0Var.f225752b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        g1c0 g1c0Var = (g1c0) obj;
        m1c0 m1c0Var = this.f236318a.f11623a;
        String str = g1c0Var.f75579c;
        boolean z = g1c0Var.f75580d;
        i26 i26Var = m1c0Var.f138935e;
        i26Var.getClass();
        yab yabVarM65827f = nxf1.m65827f(new ml1(3, i26Var, str, (fbk) null, z));
        mwa0 mwa0Var = new mwa0(bqz0Var, 5);
        u1c0Var.f225752b = 1;
        Object objCollect = yabVarM65827f.collect(new i80(mwa0Var, str, z, 2), u1c0Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}

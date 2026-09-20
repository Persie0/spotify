package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class fy60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f74532a;

    public fy60(iy60 iy60Var) {
        this.f74532a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ey60 ey60Var;
        if (ibkVar instanceof ey60) {
            ey60Var = (ey60) ibkVar;
            int i = ey60Var.f63969b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ey60Var.f63969b = i - Integer.MIN_VALUE;
            } else {
                ey60Var = new ey60(this, ibkVar);
            }
        } else {
            ey60Var = new ey60(this, ibkVar);
        }
        Object obj2 = ey60Var.f63968a;
        int i2 = ey60Var.f63969b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object pw60Var = new pw60(((wl91) this.f74532a.f106876t).m88506a());
            ey60Var.f63969b = 1;
            Object objMo30229d = bqz0Var.mo30229d(pw60Var, ey60Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class kia0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ frv0 f122900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2557x2 f122901b;

    public kia0(frv0 frv0Var, C2557x2 c2557x2) {
        this.f122900a = frv0Var;
        this.f122901b = c2557x2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        jia0 jia0Var;
        if (ibkVar instanceof jia0) {
            jia0Var = (jia0) ibkVar;
            int i = jia0Var.f112707b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jia0Var.f112707b = i - Integer.MIN_VALUE;
            } else {
                jia0Var = new jia0(this, ibkVar);
            }
        } else {
            jia0Var = new jia0(this, ibkVar);
        }
        Object obj2 = jia0Var.f112706a;
        int i2 = jia0Var.f112707b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            dia0 dia0Var = (dia0) obj;
            qfa0 qfa0Var = dia0Var.f49291c;
            String str = dia0Var.f49292d;
            jia0Var.f112707b = 1;
            Object objM42513i = this.f122900a.m42513i(qfa0Var, str, jia0Var);
            yuk yukVar = yuk.f276404a;
            if (objM42513i == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        this.f122901b.f257319a.mo47345e();
        return w2a1.f247311a;
    }
}

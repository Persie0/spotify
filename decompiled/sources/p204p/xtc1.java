package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class xtc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juc1 f265841a;

    public xtc1(juc1 juc1Var) {
        this.f265841a = juc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (p204p.juc1.m54340f(r8, r1) == r5) goto L24;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wtc1 wtc1Var;
        ttc1 ttc1Var;
        int i;
        juc1 juc1Var = this.f265841a;
        sy31 sy31Var = juc1Var.f116090g;
        if (ibkVar instanceof wtc1) {
            wtc1Var = (wtc1) ibkVar;
            int i2 = wtc1Var.f254922b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtc1Var.f254922b = i2 - Integer.MIN_VALUE;
            } else {
                wtc1Var = new wtc1(this, ibkVar);
            }
        } else {
            wtc1Var = new wtc1(this, ibkVar);
        }
        Object obj2 = wtc1Var.f254921a;
        int i3 = wtc1Var.f254922b;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = wtc1Var.f254925e;
                ttc1Var = wtc1Var.f254924d;
                bga.m29073P(obj2);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        ttc1 ttc1Var2 = (ttc1) obj;
        ((xc30) sy31Var).m90346g();
        wtc1Var.f254924d = ttc1Var2;
        wtc1Var.f254925e = 0;
        wtc1Var.f254922b = 1;
        if (((xc30) sy31Var).m90341a(wtc1Var) != yukVar) {
            ttc1Var = ttc1Var2;
            i = 0;
        }
        return yukVar;
        if (ttc1Var.f223575a) {
            wtc1Var.f254924d = null;
            wtc1Var.f254925e = i;
            wtc1Var.f254922b = 2;
        }
        return w2a1.f247311a;
    }
}

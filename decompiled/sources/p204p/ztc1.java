package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ztc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juc1 f286138a;

    public ztc1(juc1 juc1Var) {
        this.f286138a = juc1Var;
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
        ytc1 ytc1Var;
        ltc1 ltc1Var;
        int i;
        juc1 juc1Var = this.f286138a;
        sy31 sy31Var = juc1Var.f116090g;
        if (ibkVar instanceof ytc1) {
            ytc1Var = (ytc1) ibkVar;
            int i2 = ytc1Var.f276093b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ytc1Var.f276093b = i2 - Integer.MIN_VALUE;
            } else {
                ytc1Var = new ytc1(this, ibkVar);
            }
        } else {
            ytc1Var = new ytc1(this, ibkVar);
        }
        Object obj2 = ytc1Var.f276092a;
        int i3 = ytc1Var.f276093b;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = ytc1Var.f276096e;
                ltc1Var = ytc1Var.f276095d;
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
        ltc1 ltc1Var2 = (ltc1) obj;
        ((xc30) sy31Var).m90342b();
        ytc1Var.f276095d = ltc1Var2;
        ytc1Var.f276096e = 0;
        ytc1Var.f276093b = 1;
        if (((xc30) sy31Var).m90341a(ytc1Var) != yukVar) {
            ltc1Var = ltc1Var2;
            i = 0;
        }
        return yukVar;
        if (ltc1Var.f136750a) {
            ytc1Var.f276095d = null;
            ytc1Var.f276096e = i;
            ytc1Var.f276093b = 2;
        }
        return w2a1.f247311a;
    }
}

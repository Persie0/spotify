package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class bed implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ er70 f26333a;

    public bed(er70 er70Var) {
        this.f26333a = er70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r7.mo30229d(r1, r0) == r4) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        aed aedVar;
        qcd qcdVar;
        Object objM93525a;
        if (ibkVar instanceof aed) {
            aedVar = (aed) ibkVar;
            int i = aedVar.f14836b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedVar.f14836b = i - Integer.MIN_VALUE;
            } else {
                aedVar = new aed(this, ibkVar);
            }
        } else {
            aedVar = new aed(this, ibkVar);
        }
        Object obj2 = aedVar.f14835a;
        int i2 = aedVar.f14836b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                qcdVar = aedVar.f14839e;
                bqz0Var = aedVar.f14838d;
                bga.m29073P(obj2);
                objM93525a = ((s6x0) obj2).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        qcdVar = (qcd) obj;
        ye41 ye41Var = (ye41) this.f26333a.get();
        String str = qcdVar.f187307a;
        aedVar.f14838d = bqz0Var;
        aedVar.f14839e = qcdVar;
        aedVar.f14836b = 1;
        objM93525a = ye41Var.m93525a(str, aedVar);
        if (objM93525a != yukVar) {
        }
        return yukVar;
        Object lddVar = s6x0.m77348a(objM93525a) == null ? new ldd((ocl0) objM93525a, qcdVar.f187307a) : new jdd(qcdVar.f187307a);
        aedVar.f14838d = null;
        aedVar.f14839e = null;
        aedVar.f14836b = 2;
    }
}

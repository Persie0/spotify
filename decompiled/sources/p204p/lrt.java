package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class lrt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mrt f136359a;

    public lrt(mrt mrtVar) {
        this.f136359a = mrtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        krt krtVar;
        if (ibkVar instanceof krt) {
            krtVar = (krt) ibkVar;
            int i = krtVar.f125723b;
            if ((i & Integer.MIN_VALUE) != 0) {
                krtVar.f125723b = i - Integer.MIN_VALUE;
            } else {
                krtVar = new krt(this, ibkVar);
            }
        } else {
            krtVar = new krt(this, ibkVar);
        }
        Object objM53432a = krtVar.f125722a;
        int i2 = krtVar.f125723b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = krtVar.f125725d;
                bga.m29073P(objM53432a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM53432a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM53432a);
        jhz0 jhz0Var = this.f136359a.f146603c;
        krtVar.f125725d = bqz0Var;
        krtVar.f125723b = 1;
        objM53432a = jhz0Var.m53432a((alt) obj, krtVar);
        if (objM53432a != yukVar) {
        }
        return yukVar;
        krtVar.f125725d = null;
        krtVar.f125723b = 2;
    }
}

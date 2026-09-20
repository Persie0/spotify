package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class sh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ft01 f208975a;

    public sh1(ft01 ft01Var) {
        this.f208975a = ft01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L33;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rh1 rh1Var;
        Object c6x0Var;
        if (ibkVar instanceof rh1) {
            rh1Var = (rh1) ibkVar;
            int i = rh1Var.f199081b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rh1Var.f199081b = i - Integer.MIN_VALUE;
            } else {
                rh1Var = new rh1(this, ibkVar);
            }
        } else {
            rh1Var = new rh1(this, ibkVar);
        }
        Object objM67755c = rh1Var.f199080a;
        int i2 = rh1Var.f199081b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = rh1Var.f199083d;
                    bga.m29073P(objM67755c);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM67755c);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM67755c);
            vg1 vg1Var = (vg1) obj;
            ft01 ft01Var = this.f208975a;
            String str = vg1Var.f241091a;
            rh1Var.f199083d = bqz0Var;
            rh1Var.f199081b = 1;
            objM67755c = ((ot01) ft01Var).m67755c(str, rh1Var);
            if (objM67755c == yukVar) {
            }
            return yukVar;
            gt01 gt01Var = (gt01) objM67755c;
            c6x0Var = new bh1(gt01Var.f84063a, gt01Var.f84065c, gt01Var.f84066d);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            qlg1.m73220y(rh1Var.getContext());
            c6x0Var = ah1.f15575a;
        }
        rh1Var.f199083d = null;
        rh1Var.f199081b = 2;
    }
}

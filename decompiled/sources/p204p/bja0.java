package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class bja0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c0v0 f27647a;

    public bja0(c0v0 c0v0Var) {
        this.f27647a = c0v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L31;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        aja0 aja0Var;
        bka0 bka0Var;
        if (ibkVar instanceof aja0) {
            aja0Var = (aja0) ibkVar;
            int i = aja0Var.f16205b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aja0Var.f16205b = i - Integer.MIN_VALUE;
            } else {
                aja0Var = new aja0(this, ibkVar);
            }
        } else {
            aja0Var = new aja0(this, ibkVar);
        }
        Object objM96771i = aja0Var.f16204a;
        int i2 = aja0Var.f16205b;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = aja0Var.f16207d;
                    bga.m29073P(objM96771i);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96771i);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM96771i);
            c0v0 c0v0Var = this.f27647a;
            aja0Var.f16207d = bqz0Var;
            aja0Var.f16205b = 1;
            objM96771i = c0v0Var.f32886a.m96771i(aja0Var);
            if (objM96771i == obj2) {
            }
            return obj2;
            List<zzu0> list = (List) objM96771i;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (zzu0 zzu0Var : list) {
                arrayList.add(new d510(zzu0Var.f288115b, zzu0Var.f288114a));
            }
            bka0Var = new bka0(arrayList);
        } catch (Exception unused) {
            bka0Var = new bka0(lau.f131415a);
        }
        aja0Var.f16207d = null;
        aja0Var.f16205b = 2;
    }
}

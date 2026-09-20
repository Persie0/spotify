package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class sy01 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pcb f215079a;

    public sy01(pcb pcbVar) {
        this.f215079a = pcbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ry01 ry01Var;
        if (ibkVar instanceof ry01) {
            ry01Var = (ry01) ibkVar;
            int i = ry01Var.f203778b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry01Var.f203778b = i - Integer.MIN_VALUE;
            } else {
                ry01Var = new ry01(this, ibkVar);
            }
        } else {
            ry01Var = new ry01(this, ibkVar);
        }
        Object objM69548b = ry01Var.f203777a;
        int i2 = ry01Var.f203778b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ry01Var.f203780d;
                bga.m29073P(objM69548b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM69548b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM69548b);
        ry01Var.f203780d = bqz0Var;
        ry01Var.f203778b = 1;
        objM69548b = this.f215079a.m69548b((zz01) obj, ry01Var);
        if (objM69548b != yukVar) {
        }
        return yukVar;
        ry01Var.f203780d = null;
        ry01Var.f203778b = 2;
    }
}

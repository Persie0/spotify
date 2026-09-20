package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class flf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glf0 f70765a;

    public flf0(glf0 glf0Var) {
        this.f70765a = glf0Var;
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
        elf0 elf0Var;
        if (ibkVar instanceof elf0) {
            elf0Var = (elf0) ibkVar;
            int i = elf0Var.f60695b;
            if ((i & Integer.MIN_VALUE) != 0) {
                elf0Var.f60695b = i - Integer.MIN_VALUE;
            } else {
                elf0Var = new elf0(this, ibkVar);
            }
        } else {
            elf0Var = new elf0(this, ibkVar);
        }
        Object objM90059g = elf0Var.f60694a;
        int i2 = elf0Var.f60695b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = elf0Var.f60697d;
                bga.m29073P(objM90059g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM90059g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM90059g);
        x610 x610Var = this.f70765a.f81078l;
        elf0Var.f60697d = bqz0Var;
        elf0Var.f60695b = 1;
        objM90059g = x610Var.m90059g((tlf0) obj, elf0Var);
        if (objM90059g != yukVar) {
        }
        return yukVar;
        elf0Var.f60697d = null;
        elf0Var.f60695b = 2;
    }
}

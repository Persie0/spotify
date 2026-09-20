package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class vi91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wi91 f241652a;

    public vi91(wi91 wi91Var) {
        this.f241652a = wi91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r9.mo30229d(r10, r0) == r6) goto L32;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ui91 ui91Var;
        int i;
        itw itwVar;
        bqz0 bqz0Var2;
        if (ibkVar instanceof ui91) {
            ui91Var = (ui91) ibkVar;
            int i2 = ui91Var.f230645b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ui91Var.f230645b = i2 - Integer.MIN_VALUE;
            } else {
                ui91Var = new ui91(this, ibkVar);
            }
        } else {
            ui91Var = new ui91(this, ibkVar);
        }
        Object obj2 = ui91Var.f230644a;
        int i3 = ui91Var.f230645b;
        wi91 wi91Var = this.f241652a;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj2);
            fal0 fal0Var = wi91Var.f251570b;
            ui91Var.f230647d = bqz0Var;
            ui91Var.f230648e = 0;
            ui91Var.f230645b = 1;
            Object objM41181a = fal0Var.m41181a(ui91Var);
            if (objM41181a != yukVar) {
                obj2 = objM41181a;
                i = 0;
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = ui91Var.f230648e;
            bqz0Var = ui91Var.f230647d;
            bga.m29073P(obj2);
        } else if (i3 == 2) {
            bqz0Var2 = ui91Var.f230647d;
            bga.m29073P(obj2);
            itwVar = itw.f105778a;
            ui91Var.f230647d = null;
            ui91Var.f230645b = 3;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        if (((Boolean) obj2).booleanValue()) {
            iml0 iml0Var = wi91Var.f251571c;
            ui91Var.f230647d = bqz0Var;
            ui91Var.f230648e = i;
            ui91Var.f230645b = 2;
            if (((uml0) iml0Var).m83459f(ui91Var) != yukVar) {
                bqz0Var2 = bqz0Var;
                itwVar = itw.f105778a;
                ui91Var.f230647d = null;
                ui91Var.f230645b = 3;
            }
        } else {
            bqz0 bqz0Var3 = bqz0Var;
            itwVar = itw.f105782e;
            bqz0Var2 = bqz0Var3;
            ui91Var.f230647d = null;
            ui91Var.f230645b = 3;
        }
        return yukVar;
    }
}

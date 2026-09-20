package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class sws implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ flw0 f214711a;

    public sws(flw0 flw0Var) {
        this.f214711a = flw0Var;
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
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rws rwsVar;
        if (ibkVar instanceof rws) {
            rwsVar = (rws) ibkVar;
            int i = rwsVar.f203402b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwsVar.f203402b = i - Integer.MIN_VALUE;
            } else {
                rwsVar = new rws(this, ibkVar);
            }
        } else {
            rwsVar = new rws(this, ibkVar);
        }
        Object objM42022e = rwsVar.f203401a;
        int i2 = rwsVar.f203402b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = rwsVar.f203404d;
                bga.m29073P(objM42022e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM42022e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM42022e);
        rwsVar.f203404d = bqz0Var;
        rwsVar.f203402b = 1;
        objM42022e = this.f214711a.m42022e((gws) obj, rwsVar);
        if (objM42022e != yukVar) {
        }
        return yukVar;
        rwsVar.f203404d = null;
        rwsVar.f203402b = 2;
    }
}

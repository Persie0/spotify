package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class a4v implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bc21 f12316a;

    public a4v(bc21 bc21Var) {
        this.f12316a = bc21Var;
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
        z3v z3vVar;
        if (ibkVar instanceof z3v) {
            z3vVar = (z3v) ibkVar;
            int i = z3vVar.f279039b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z3vVar.f279039b = i - Integer.MIN_VALUE;
            } else {
                z3vVar = new z3v(this, ibkVar);
            }
        } else {
            z3vVar = new z3v(this, ibkVar);
        }
        Object objM28666j = z3vVar.f279038a;
        int i2 = z3vVar.f279039b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = z3vVar.f279041d;
                bga.m29073P(objM28666j);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM28666j);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM28666j);
        z3vVar.f279041d = bqz0Var;
        z3vVar.f279039b = 1;
        objM28666j = this.f12316a.m28666j((y3v) obj, z3vVar);
        if (objM28666j != yukVar) {
        }
        return yukVar;
        z3vVar.f279041d = null;
        z3vVar.f279039b = 2;
    }
}

package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yab extends fnc {

    /* JADX INFO: renamed from: e */
    public final mb61 f270861e;

    /* JADX WARN: Multi-variable type inference failed */
    public yab(th00 th00Var, juk jukVar, int i, int i2) {
        super(th00Var, jukVar, i, i2);
        this.f270861e = (mb61) th00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fnc, p204p.enc
    /* JADX INFO: renamed from: g */
    public final Object mo39486g(sir0 sir0Var, fbk fbkVar) {
        xab xabVar;
        if (fbkVar instanceof xab) {
            xabVar = (xab) fbkVar;
            int i = xabVar.f259642d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xabVar.f259642d = i - Integer.MIN_VALUE;
            } else {
                xabVar = new xab(this, (ibk) fbkVar);
            }
        } else {
            xabVar = new xab(this, (ibk) fbkVar);
        }
        Object obj = xabVar.f259640b;
        int i2 = xabVar.f259642d;
        if (i2 == 0) {
            bga.m29073P(obj);
            xabVar.f259639a = sir0Var;
            xabVar.f259642d = 1;
            Object objMo39486g = super.mo39486g(sir0Var, xabVar);
            Object obj2 = yuk.f276404a;
            if (objMo39486g == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sir0Var = xabVar.f259639a;
            bga.m29073P(obj);
        }
        if (sir0Var.mo30213E()) {
            return w2a1.f247311a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.mb61, p.th00] */
    @Override // p204p.fnc, p204p.enc
    /* JADX INFO: renamed from: h */
    public final enc mo39487h(juk jukVar, int i, int i2) {
        return new yab(this.f270861e, jukVar, i, i2);
    }
}

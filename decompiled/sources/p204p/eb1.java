package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class eb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hb1 f57766a;

    public eb1(hb1 hb1Var) {
        this.f57766a = hb1Var;
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
        db1 db1Var;
        if (ibkVar instanceof db1) {
            db1Var = (db1) ibkVar;
            int i = db1Var.f47170b;
            if ((i & Integer.MIN_VALUE) != 0) {
                db1Var.f47170b = i - Integer.MIN_VALUE;
            } else {
                db1Var = new db1(this, ibkVar);
            }
        } else {
            db1Var = new db1(this, ibkVar);
        }
        Object objM46959b = db1Var.f47169a;
        int i2 = db1Var.f47170b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = db1Var.f47172d;
                bga.m29073P(objM46959b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46959b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM46959b);
        db1Var.f47172d = bqz0Var;
        db1Var.f47170b = 1;
        objM46959b = hb1.m46959b(this.f57766a, (kb1) obj, db1Var);
        if (objM46959b != yukVar) {
        }
        return yukVar;
        db1Var.f47172d = null;
        db1Var.f47170b = 2;
    }
}

package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class bwh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fs9 f31657a;

    public bwh(fs9 fs9Var) {
        this.f31657a = fs9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        awh awhVar;
        if (ibkVar instanceof awh) {
            awhVar = (awh) ibkVar;
            int i = awhVar.f20538b;
            if ((i & Integer.MIN_VALUE) != 0) {
                awhVar.f20538b = i - Integer.MIN_VALUE;
            } else {
                awhVar = new awh(this, ibkVar);
            }
        } else {
            awhVar = new awh(this, ibkVar);
        }
        Object obj2 = awhVar.f20537a;
        int i2 = awhVar.f20538b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        String str = ((lvh) obj).f137310a;
        yab yabVarM42551q = this.f31657a.m42551q(Collections.singletonList(str), r5f.NOT_INTERESTED);
        z6d z6dVar = new z6d(bqz0Var, 16);
        awhVar.f20538b = 1;
        Object objCollect = yabVarM42551q.collect(new C2189nt(new ede(z6dVar, 26), str, 18), awhVar);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}

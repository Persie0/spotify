package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.offline_esperanto.proto.C1091c;
import com.spotify.offline_esperanto.proto.EsOffline$DeviceKey;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zhl0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kil0 f282958a;

    public zhl0(kil0 kil0Var) {
        this.f282958a = kil0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        yhl0 yhl0Var;
        if (ibkVar instanceof yhl0) {
            yhl0Var = (yhl0) ibkVar;
            int i = yhl0Var.f272919b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yhl0Var.f272919b = i - Integer.MIN_VALUE;
            } else {
                yhl0Var = new yhl0(this, ibkVar);
            }
        } else {
            yhl0Var = new yhl0(this, ibkVar);
        }
        Object obj2 = yhl0Var.f272918a;
        int i2 = yhl0Var.f272919b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            lhl0 lhl0Var = (lhl0) obj;
            uob uobVar = this.f282958a.f123011c;
            y3l0 y3l0Var = uobVar.f232371a;
            f5r f5rVar = lhl0Var.f133598b;
            List listM43728j1 = g6f.m43728j1(lhl0Var.f133597a);
            fwk0 fwk0Var = y3l0Var.f268961a;
            C1091c c1091cM16137t = EsOffline$GetContextsRequest.m16137t();
            ylw ylwVarM16113q = EsOffline$DeviceKey.m16113q();
            ylwVarM16113q.m94175q(f5rVar.f66138c);
            ylwVarM16113q.m94174m(f5rVar.f66139d);
            c1091cM16137t.m16215r(ylwVarM16113q);
            c1091cM16137t.m16213m(listM43728j1);
            nzx0 nzx0Var = new nzx0(new tpf0(new vgk0(new px70(k0e1.m54985d(fwk0Var.m42969c((EsOffline$GetContextsRequest) c1091cM16137t.build())), 24), 2), (fbk) null, uobVar));
            mwa0 mwa0Var = new mwa0(bqz0Var, 25);
            yhl0Var.f272919b = 1;
            Object objCollect = nzx0Var.collect(mwa0Var, yhl0Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}

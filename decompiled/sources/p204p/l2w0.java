package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l2w0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gjs0 f129116a;

    public l2w0(gjs0 gjs0Var) {
        this.f129116a = gjs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        k2w0 k2w0Var;
        fiz yskVar;
        if (ibkVar instanceof k2w0) {
            k2w0Var = (k2w0) ibkVar;
            int i = k2w0Var.f118697b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2w0Var.f118697b = i - Integer.MIN_VALUE;
            } else {
                k2w0Var = new k2w0(this, ibkVar);
            }
        } else {
            k2w0Var = new k2w0(this, ibkVar);
        }
        Object obj2 = k2w0Var.f118696a;
        int i2 = k2w0Var.f118697b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            List list = ((e2w0) obj).f55543a;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (bm51.m29803n0((String) obj3, "spotify:episode", false)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                yskVar = new ysk(new chl[0], 26);
            } else {
                x0q0 x0q0Var = (x0q0) this.f129116a.f80557b;
                Boolean bool = Boolean.TRUE;
                Map mapM56695h0 = kkc0.m56695h0(new pqm0("playabilityRestriction", bool), new pqm0("playable", bool), new pqm0("link", bool));
                List listSingletonList = Collections.singletonList(22);
                nau nauVar = nau.f152117a;
                yskVar = new vdm0(k0e1.m54985d(x0q0Var.m89602b(arrayList, new u0q0(mapM56695h0, nauVar, nauVar, listSingletonList, null, 135)).map(oyq0.f171869i).onErrorReturn(new cx10(arrayList)).onErrorComplete()), 22);
            }
            aeq0 aeq0Var = new aeq0(bqz0Var, 6);
            k2w0Var.f118697b = 1;
            Object objCollect = yskVar.collect(aeq0Var, k2w0Var);
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

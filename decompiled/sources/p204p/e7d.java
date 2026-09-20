package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class e7d implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h7d f56910a;

    public e7d(h7d h7dVar) {
        this.f56910a = h7dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        d7d d7dVar;
        fiz yskVar;
        if (ibkVar instanceof d7d) {
            d7dVar = (d7d) ibkVar;
            int i = d7dVar.f46071b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d7dVar.f46071b = i - Integer.MIN_VALUE;
            } else {
                d7dVar = new d7d(this, ibkVar);
            }
        } else {
            d7dVar = new d7d(this, ibkVar);
        }
        Object obj2 = d7dVar.f46070a;
        int i2 = d7dVar.f46071b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            bq70 bq70Var = this.f56910a.f88425n;
            ArrayList arrayList = ((d5d) obj).f45398a;
            l44 l44Var = ((ynb) bq70Var.f29721b).f274426a;
            if (l44Var.m58075h() && l44Var.m58049O() && !arrayList.isEmpty()) {
                int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((pla1) obj3).f178681a, obj3);
                }
                ob90 ob90Var = (ob90) bq70Var.f29722c;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pla1) it.next()).f178681a);
                }
                yskVar = new vjz(new mp80(mvl0.m62953p(new e560(28, ((gc90) ob90Var).m44312l(arrayList2), linkedHashMap)), 12), new ga2(3, 13, null), 2);
            } else {
                yskVar = new ysk(new v8d(nau.f152117a), 27);
            }
            z6d z6dVar = new z6d(bqz0Var, 3);
            d7dVar.f46071b = 1;
            Object objCollect = yskVar.collect(z6dVar, d7dVar);
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

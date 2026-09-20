package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class not implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qpt f156792a;

    public not(qpt qptVar) {
        this.f156792a = qptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        got gotVar;
        fiz vjzVar;
        if (ibkVar instanceof got) {
            gotVar = (got) ibkVar;
            int i = gotVar.f83012b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gotVar.f83012b = i - Integer.MIN_VALUE;
            } else {
                gotVar = new got(this, ibkVar);
            }
        } else {
            gotVar = new got(this, ibkVar);
        }
        Object obj2 = gotVar.f83011a;
        int i2 = gotVar.f83012b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            egt egtVar = (egt) obj;
            bq70 bq70Var = this.f156792a.f191374a;
            ArrayList arrayList = egtVar.f59400a;
            if (arrayList.isEmpty()) {
                vjzVar = new ysk(new w420(new IllegalArgumentException("No members to load")), 27);
            } else {
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(fag1.m41173v((pgo) bq70Var.f29721b, c7c.f34844a, ((z420) it.next()).f279098a));
                }
                vjzVar = new vjz(new rc10(new ner((fiz[]) g6f.m43728j1(arrayList2).toArray(new fiz[0]), egtVar, bq70Var, 24), 14), new ga2(3, 21, null), 2);
            }
            d6i d6iVar = new d6i(bqz0Var, 12);
            gotVar.f83012b = 1;
            Object objCollect = vjzVar.collect(d6iVar, gotVar);
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

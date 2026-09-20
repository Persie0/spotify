package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class lot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ opt f135544a;

    public lot(opt optVar) {
        this.f135544a = optVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        eot eotVar;
        yiy yiyVar;
        if (ibkVar instanceof eot) {
            eotVar = (eot) ibkVar;
            int i = eotVar.f61473b;
            if ((i & Integer.MIN_VALUE) != 0) {
                eotVar.f61473b = i - Integer.MIN_VALUE;
            } else {
                eotVar = new eot(this, ibkVar);
            }
        } else {
            eotVar = new eot(this, ibkVar);
        }
        Object obj2 = eotVar.f61472a;
        int i2 = eotVar.f61473b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            d670 d670Var = this.f135544a.f168018a;
            Set set = ((wft) obj).f250891a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((oa90) it.next()).ordinal();
                if (iOrdinal == 0) {
                    yiyVar = yiy.f273220a;
                } else if (iOrdinal == 1) {
                    yiyVar = yiy.f273222c;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yiyVar = yiy.f273221b;
                }
                linkedHashSet.add(yiyVar);
            }
            fbk fbkVar = null;
            int i3 = 19;
            onc oncVarM92105z = xtm0.m92105z(xtm0.m92103x(new nzx0(new g090(d670Var, fbkVar, i3)), new g090(d670Var, linkedHashSet, fbkVar, 20)), new mp80(((jnb) d670Var.f45619d).m53817b(), i3));
            d6i d6iVar = new d6i(bqz0Var, 10);
            eotVar.f61473b = 1;
            Object objCollect = oncVarM92105z.collect(d6iVar, eotVar);
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

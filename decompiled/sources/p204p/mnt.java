package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class mnt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ npt f145475a;

    public mnt(npt nptVar) {
        this.f145475a = nptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lnt lntVar;
        fiz yskVar;
        Long l;
        String strM59033t;
        Long l2;
        h990 h990Var;
        if (ibkVar instanceof lnt) {
            lntVar = (lnt) ibkVar;
            int i = lntVar.f135222b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lntVar.f135222b = i - Integer.MIN_VALUE;
            } else {
                lntVar = new lnt(this, ibkVar);
            }
        } else {
            lntVar = new lnt(this, ibkVar);
        }
        Object obj2 = lntVar.f135221a;
        int i2 = lntVar.f135222b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        li80 li80Var = this.f145475a.f157066a;
        y990 y990Var = ((yft) obj).f272327a;
        Map map = y990Var.f270537a;
        Map map2 = y990Var.f270538b;
        boolean zIsEmpty = map.isEmpty();
        j990 j990Var = j990.f110129a;
        if (zIsEmpty) {
            yskVar = new ysk(j990Var, 27);
        } else if (map.size() == 1) {
            z990 z990Var = (z990) map2.get(g6f.m43739p0(map.keySet()));
            yskVar = (z990Var == null || (h990Var = z990Var.f280724b) == null || h990Var.f88901a.length() == 0) ? new ysk(j990Var, 27) : new nzx0(new m320(li80Var, h990Var, (fbk) null, 29));
        } else {
            List listM43728j1 = g6f.m43728j1(map2.values());
            xre xreVar = (xre) li80Var.f133742d;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listM43728j1) {
                h990 h990Var2 = ((z990) obj3).f280724b;
                if (h990Var2 != null && h990Var2.f88903c && h990Var2.f88901a.length() > 0) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : listM43728j1) {
                h990 h990Var3 = ((z990) obj4).f280724b;
                if (h990Var3 != null && !h990Var3.f88903c && h990Var3.f88901a.length() != 0 && (l2 = h990Var3.f88904d) != null) {
                    if (fr0.m42463g((wy3) xreVar, l2.longValue()) <= 604800000) {
                        arrayList2.add(obj4);
                    }
                }
            }
            int size = arrayList2.size() + arrayList.size();
            if (size == 0) {
                yskVar = new ysk(j990Var, 27);
            } else if (arrayList.size() == 1 && size == 1) {
                z990 z990Var2 = (z990) g6f.m43741q0(arrayList);
                h990 h990Var4 = z990Var2.f280724b;
                yskVar = (h990Var4 == null || (strM59033t = li80.m59033t(z990Var2.f280723a, map)) == null) ? new ysk(j990Var, 27) : new ysk(new m990(h990Var4.f88904d, z990Var2.f280723a, strM59033t, h990Var4.f88901a, h990Var4.f88902b), 27);
            } else if (arrayList.size() == 1) {
                String strM59033t2 = li80.m59033t(((z990) g6f.m43741q0(arrayList)).f280723a, map);
                yskVar = strM59033t2 == null ? new ysk(j990Var, 27) : new ysk(new n990(strM59033t2), 27);
            } else if (!arrayList.isEmpty()) {
                yskVar = new ysk(new k990(arrayList.size()), 27);
            } else if (arrayList2.size() == 1) {
                z990 z990Var3 = (z990) g6f.m43741q0(arrayList2);
                h990 h990Var5 = z990Var3.f280724b;
                if (h990Var5 == null || (l = h990Var5.f88904d) == null) {
                    yskVar = new ysk(j990Var, 27);
                } else {
                    long jLongValue = l.longValue();
                    String strM59033t3 = li80.m59033t(z990Var3.f280723a, map);
                    yskVar = strM59033t3 == null ? new ysk(j990Var, 27) : new ier(new nzx0(new gj70(false, l, xreVar, (zf90) li80Var.f133741c, true, null)), z990Var3, strM59033t3, h990Var5, jLongValue, 1);
                }
            } else {
                yskVar = new ysk(l990.f131040a, 27);
            }
        }
        d6i d6iVar = new d6i(bqz0Var, 9);
        lntVar.f135222b = 1;
        Object objCollect = yskVar.collect(new qb90(d6iVar, 19), lntVar);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}

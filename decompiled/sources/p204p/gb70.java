package p204p;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class gb70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ib70 f78218b;

    public /* synthetic */ gb70(ib70 ib70Var, int i) {
        this.f78217a = i;
        this.f78218b = ib70Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f78217a;
        ib70 ib70Var = this.f78218b;
        switch (i) {
            case 0:
                return Arrays.asList(ib70Var.m50160m().mo53208I(rm41.f200445l), ib70Var.m50160m().mo53208I(rm41.f200447n), ib70Var.m50160m().mo53208I(rm41.f200448o), ib70Var.m50160m().mo53208I(rm41.f200446m));
            default:
                EnumMap enumMap = new EnumMap(her0.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (her0 her0Var : her0.values()) {
                    String strM73844b = her0Var.f90500a.m73844b();
                    if (strM73844b == null) {
                        ib70.m50144a(47);
                        throw null;
                    }
                    jd21 jd21VarMo27380q = ib70Var.m50159l(strM73844b).mo27380q();
                    if (jd21VarMo27380q == null) {
                        ib70.m50144a(48);
                        throw null;
                    }
                    String strM73844b2 = her0Var.f90501b.m73844b();
                    if (strM73844b2 == null) {
                        ib70.m50144a(47);
                        throw null;
                    }
                    jd21 jd21VarMo27380q2 = ib70Var.m50159l(strM73844b2).mo27380q();
                    if (jd21VarMo27380q2 == null) {
                        ib70.m50144a(48);
                        throw null;
                    }
                    enumMap.put(her0Var, jd21VarMo27380q2);
                    map.put(jd21VarMo27380q, jd21VarMo27380q2);
                    map2.put(jd21VarMo27380q2, jd21VarMo27380q);
                }
                return new hb70(enumMap, map, map2);
        }
    }
}

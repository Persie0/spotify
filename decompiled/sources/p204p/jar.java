package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jar extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110534a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Set f110535b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f110536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jar() {
        super(3, null);
        this.f110534a = 0;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f110534a) {
            case 0:
                jar jarVar = new jar(3, 0, (fbk) obj3);
                jarVar.f110535b = (Set) obj;
                jarVar.f110536c = (List) obj2;
                return jarVar.invokeSuspend(w2a1.f247311a);
            case 1:
                jar jarVar2 = new jar(3, 1, (fbk) obj3);
                jarVar2.f110535b = (Set) obj;
                jarVar2.f110536c = (List) obj2;
                return jarVar2.invokeSuspend(w2a1.f247311a);
            default:
                jar jarVar3 = new jar(3, 2, (fbk) obj3);
                jarVar3.f110536c = (List) obj;
                jarVar3.f110535b = (Set) obj2;
                return jarVar3.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f110534a) {
            case 0:
                Set set = this.f110535b;
                List list = this.f110536c;
                bga.m29073P(obj);
                return new pqm0(set, list);
            case 1:
                Set setM77308k0 = this.f110535b;
                List<pqm0> list2 = this.f110536c;
                bga.m29073P(obj);
                for (pqm0 pqm0Var : list2) {
                    int iIntValue = ((Number) pqm0Var.f180350a).intValue();
                    setM77308k0 = ((Boolean) pqm0Var.f180351b).booleanValue() ? s601.m77308k0(new Integer(iIntValue), setM77308k0) : s601.m77304g0(new Integer(iIntValue), setM77308k0);
                }
                return setM77308k0;
            default:
                List<wyz0> list3 = this.f110536c;
                Set set2 = this.f110535b;
                bga.m29073P(obj);
                if (set2.isEmpty()) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(i6f.m49804T(list3, 10));
                for (wyz0 wyz0VarM89389a : list3) {
                    if (set2.contains(wyz0VarM89389a.f256414a)) {
                        wyz0VarM89389a = wyz0.m89389a(wyz0VarM89389a, null, null, 507);
                    }
                    arrayList.add(wyz0VarM89389a);
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jar(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f110534a = i2;
    }
}

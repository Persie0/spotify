package p204p;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class fu00 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f73364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ st00 f73365c;

    public /* synthetic */ fu00(niz nizVar, st00 st00Var, int i) {
        this.f73363a = i;
        this.f73364b = nizVar;
        this.f73365c = st00Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        eu00 eu00Var;
        ohm0 ohm0Var;
        phm0 phm0Var;
        switch (this.f73363a) {
            case 0:
                if (fbkVar instanceof eu00) {
                    eu00Var = (eu00) fbkVar;
                    int i = eu00Var.f62834b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        eu00Var.f62834b = i - Integer.MIN_VALUE;
                    } else {
                        eu00Var = new eu00(this, fbkVar);
                    }
                } else {
                    eu00Var = new eu00(this, fbkVar);
                }
                Object obj2 = eu00Var.f62833a;
                int i2 = eu00Var.f62834b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    if (((Map) obj).get(this.f73365c) instanceof bu00) {
                        eu00Var.f62834b = 1;
                        Object objEmit = this.f73364b.emit(obj, eu00Var);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof ohm0) {
                    ohm0Var = (ohm0) fbkVar;
                    int i3 = ohm0Var.f165506b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ohm0Var.f165506b = i3 - Integer.MIN_VALUE;
                    } else {
                        ohm0Var = new ohm0(this, fbkVar);
                    }
                } else {
                    ohm0Var = new ohm0(this, fbkVar);
                }
                Object obj3 = ohm0Var.f165505a;
                int i4 = ohm0Var.f165506b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Set<String> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
                    for (String str : set) {
                        String str2 = this.f73365c.f213751a;
                        if (new gf41(str).f79270c != df41.EPISODE) {
                            throw new IllegalArgumentException("ItemUri must be an episode");
                        }
                        arrayList.add(new st00(str2, str));
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList);
                    ohm0Var.f165506b = 1;
                    Object objEmit2 = this.f73364b.emit(setM43736n1, ohm0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof phm0) {
                    phm0Var = (phm0) fbkVar;
                    int i5 = phm0Var.f177685b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        phm0Var.f177685b = i5 - Integer.MIN_VALUE;
                    } else {
                        phm0Var = new phm0(this, fbkVar);
                    }
                } else {
                    phm0Var = new phm0(this, fbkVar);
                }
                Object obj4 = phm0Var.f177684a;
                int i6 = phm0Var.f177685b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    LinkedHashSet linkedHashSetM77308k0 = s601.m77308k0(this.f73365c, (Set) obj);
                    phm0Var.f177685b = 1;
                    Object objEmit3 = this.f73364b.emit(linkedHashSetM77308k0, phm0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}

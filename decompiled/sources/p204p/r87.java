package p204p;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class r87 implements zql0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196724a = 1;

    /* JADX INFO: renamed from: b */
    public final nuu0 f196725b;

    /* JADX INFO: renamed from: c */
    public final Object f196726c;

    /* JADX INFO: renamed from: d */
    public final Object f196727d;

    public r87(hc80 hc80Var, Set set, k6m k6mVar) {
        this.f196726c = set;
        this.f196727d = k6mVar;
        r1a r1aVar = new r1a(k6mVar.f119783b, this, 3);
        ub80 ub80VarM58232p = l5h1.m58232p(hc80Var.getLifecycle());
        Set set2 = set;
        int iM31820L = c95.m31820L(i6f.m49804T(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        for (Object obj : set2) {
            linkedHashMap.put(obj, wql0.f254055a);
        }
        this.f196725b = bzf1.m31029u(r1aVar, ub80VarM58232p, hf11.f90581a, new yql0(linkedHashMap));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // p204p.zql0
    /* JADX INFO: renamed from: a */
    public final Object mo36073a(String str, tql0 tql0Var, st91 st91Var, fbk fbkVar) {
        q87 q87Var;
        r4m r4mVar;
        Object objValueOf;
        int i = this.f196724a;
        yuk yukVar = yuk.f276404a;
        boolean z = true;
        Object obj = this.f196727d;
        switch (i) {
            case 0:
                if (fbkVar instanceof q87) {
                    q87Var = (q87) fbkVar;
                    int i2 = q87Var.f186255d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        q87Var.f186255d = i2 - Integer.MIN_VALUE;
                    } else {
                        q87Var = new q87(this, (ibk) fbkVar);
                    }
                } else {
                    q87Var = new q87(this, (ibk) fbkVar);
                }
                Object objM86757v = q87Var.f186253b;
                int i3 = q87Var.f186255d;
                if (i3 == 0) {
                    bga.m29073P(objM86757v);
                    nuu0 nuu0VarM57369d = ((ku00) obj).m57369d(str);
                    q87Var.f186252a = str;
                    q87Var.f186255d = 1;
                    objM86757v = vyf1.m86757v(nuu0VarM57369d, q87Var);
                    if (objM86757v == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = q87Var.f186252a;
                    bga.m29073P(objM86757v);
                }
                if (objM86757v instanceof pr00) {
                    ((s5m0) this.f196726c).m77283a(str);
                }
                return Boolean.FALSE;
            default:
                k6m k6mVar = (k6m) obj;
                if (fbkVar instanceof r4m) {
                    r4mVar = (r4m) fbkVar;
                    int i4 = r4mVar.f195809d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        r4mVar.f195809d = i4 - Integer.MIN_VALUE;
                    } else {
                        r4mVar = new r4m(this, (ibk) fbkVar);
                    }
                } else {
                    r4mVar = new r4m(this, (ibk) fbkVar);
                }
                Object objM86756u = r4mVar.f195807b;
                int i5 = r4mVar.f195809d;
                int i6 = 2;
                if (i5 == 0) {
                    bga.m29073P(objM86756u);
                    int iOrdinal = tql0Var.ordinal();
                    if (iOrdinal == 0) {
                        r4mVar.f195806a = str;
                        r4mVar.f195809d = 1;
                        k6mVar.mo38767b(str, r4mVar);
                        if (w2a1.f247311a == yukVar) {
                            return yukVar;
                        }
                    } else if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Boolean.valueOf(z);
                }
                if (i5 == 1) {
                    str = r4mVar.f195806a;
                    bga.m29073P(objM86756u);
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = r4mVar.f195806a;
                    bga.m29073P(objM86756u);
                }
                objValueOf = ((s6x0) objM86756u).f206218a;
                if (!(objValueOf instanceof c6x0)) {
                    objValueOf = Boolean.valueOf(((z4m) objValueOf).f279296a.contains(str));
                }
                z = true ^ (objValueOf instanceof c6x0);
                return Boolean.valueOf(z);
                xv41 xv41Var = k6mVar.f119783b;
                hvi0 hvi0Var = cks.f39079b;
                int i7 = 5;
                fbk fbkVar2 = null;
                vjz vjzVar = new vjz(new ou8(gyf1.m46157w(xv41Var, jwg1.m54449D(30, ils.SECONDS)), i7), new ww0(3, i7, fbkVar2), 2);
                moe moeVar = new moe(fbkVar2, str, i6);
                r4mVar.f195806a = str;
                r4mVar.f195809d = 2;
                objM86756u = vyf1.m86756u(vjzVar, moeVar, r4mVar);
                if (objM86756u == yukVar) {
                    return yukVar;
                }
                objValueOf = ((s6x0) objM86756u).f206218a;
                if (!(objValueOf instanceof c6x0)) {
                    objValueOf = Boolean.valueOf(((z4m) objValueOf).f279296a.contains(str));
                }
                z = true ^ (objValueOf instanceof c6x0);
                return Boolean.valueOf(z);
        }
    }

    @Override // p204p.zql0
    public final xv41 getStatus() {
        switch (this.f196724a) {
            case 0:
                break;
        }
        return this.f196725b;
    }

    public r87(s5m0 s5m0Var, fiz fizVar, ku00 ku00Var, c9k c9kVar) {
        this.f196726c = s5m0Var;
        this.f196727d = ku00Var;
        this.f196725b = bzf1.m31029u(xtm0.m92074U(fizVar, new C2102lt((fbk) null, this, 14)), c9kVar, hf11.f90581a, new yql0(nau.f152117a));
    }
}

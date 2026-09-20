package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nc41 extends z09 {

    /* JADX INFO: renamed from: K */
    public final mqr f152427K;

    /* JADX INFO: renamed from: L */
    public final boolean f152428L;

    public nc41(mqr mqrVar, th00 th00Var, boolean z, kf81 kf81Var, int[] iArr, at8 at8Var, luk lukVar, gh00 gh00Var, gh00 gh00Var2, boolean z2, boolean z3, r3p0 r3p0Var) {
        super(th00Var, z, z3, r3p0Var, kf81Var, iArr, at8Var, lukVar, gh00Var, gh00Var2);
        this.f152427K = mqrVar;
        this.f152428L = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public static Object m64118F(nc41 nc41Var, ArrayList arrayList, ibk ibkVar) throws Throwable {
        mc41 mc41Var;
        nc41 nc41Var2;
        List list;
        if (ibkVar instanceof mc41) {
            mc41Var = (mc41) ibkVar;
            int i = mc41Var.f142062e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc41Var.f142062e = i - Integer.MIN_VALUE;
            } else {
                mc41Var = new mc41(nc41Var, ibkVar);
            }
        } else {
            mc41Var = new mc41(nc41Var, ibkVar);
        }
        Object objM89557A = mc41Var.f142060c;
        int i2 = mc41Var.f142062e;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            boolean z = nc41Var.f152428L;
            yuk yukVar = yuk.f276404a;
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pqm0 pqm0Var = (pqm0) it.next();
                    int iIntValue = ((Number) pqm0Var.f180350a).intValue();
                    Object obj = ((nad0) pqm0Var.f180351b).mo32207c().f209894j;
                    lfz0 lfz0Var = obj instanceof lfz0 ? (lfz0) obj : null;
                    lc41 lc41Var = lfz0Var != null ? new lc41(iIntValue, nc41Var.f44201d[iIntValue], lfz0Var) : null;
                    if (lc41Var != null) {
                        arrayList2.add(lc41Var);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    r300 r300Var = ((lc41) obj2).f131825b;
                    if (nc41Var.f278025G || nc41Var.m95059D(r300Var)) {
                        arrayList3.add(obj2);
                    }
                }
                List listM43711Y0 = g6f.m43711Y0(arrayList3, new fd11(7));
                if (!listM43711Y0.isEmpty()) {
                    whj whjVarM58921a = ((lc41) g6f.m43741q0(listM43711Y0)).f131826c.m58921a();
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
                    Iterator it2 = listM43711Y0.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((lc41) it2.next()).f131826c.f133028b);
                    }
                    mqr mqrVar = nc41Var.f152427K;
                    mc41Var.f142058a = nc41Var;
                    mc41Var.f142059b = listM43711Y0;
                    mc41Var.f142062e = 2;
                    objM89557A = x0h1.m89557A((luk) mqrVar.f146344c, new kp1(mqrVar, arrayList4, whjVarM58921a, fbkVar, 19), mc41Var);
                    if (objM89557A != yukVar) {
                        nc41Var2 = nc41Var;
                        list = listM43711Y0;
                    }
                }
                return null;
            }
            mc41Var.f142058a = null;
            mc41Var.f142062e = 1;
            Object objM95058C = z09.m95058C(nc41Var, arrayList, mc41Var);
            if (objM95058C != yukVar) {
                return objM95058C;
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM89557A);
            return objM89557A;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = mc41Var.f142059b;
        nc41Var2 = mc41Var.f142058a;
        bga.m29073P(objM89557A);
        int iIntValue2 = ((Number) objM89557A).intValue();
        if (iIntValue2 != -1) {
            lc41 lc41Var2 = (lc41) list.get(iIntValue2);
            if (lc41Var2.f131825b.f195382k < nc41Var2.f44201d[nc41Var2.f278026H].f195382k && !nc41Var2.f278025G) {
                lc41Var2 = null;
            }
            if (lc41Var2 != null) {
                return new Integer(lc41Var2.f131824a);
            }
        }
        return null;
    }

    @Override // p204p.z09
    /* JADX INFO: renamed from: B */
    public final Object mo64119B(ArrayList arrayList, u37 u37Var) {
        return m64118F(this, arrayList, u37Var);
    }

    @Override // p204p.z09
    /* JADX INFO: renamed from: E */
    public final Object mo64120E(nad0 nad0Var, l92 l92Var) {
        Object obj = nad0Var.mo32207c().f209894j;
        fbk fbkVar = null;
        lfz0 lfz0Var = obj instanceof lfz0 ? (lfz0) obj : null;
        if (lfz0Var == null) {
            return Boolean.FALSE;
        }
        String str = lfz0Var.f133028b;
        whj whjVarM58921a = lfz0Var.m58921a();
        mqr mqrVar = this.f152427K;
        return x0h1.m89557A((luk) mqrVar.f146344c, new sqt(mqrVar, str, whjVarM58921a, fbkVar, 13), l92Var);
    }
}

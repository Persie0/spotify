package p204p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vxq {

    /* JADX INFO: renamed from: a */
    public static final uxq f245806a;

    /* JADX INFO: renamed from: b */
    public static final uxq f245807b;

    /* JADX INFO: renamed from: c */
    public static final uxq f245808c;

    /* JADX INFO: renamed from: d */
    public static final uxq f245809d;

    /* JADX INFO: renamed from: e */
    public static final uxq f245810e;

    /* JADX INFO: renamed from: f */
    public static final uxq f245811f;

    /* JADX INFO: renamed from: g */
    public static final uxq f245812g;

    /* JADX INFO: renamed from: h */
    public static final uxq f245813h;

    /* JADX INFO: renamed from: i */
    public static final uxq f245814i;

    /* JADX INFO: renamed from: j */
    public static final Map f245815j;

    /* JADX INFO: renamed from: k */
    public static final uxq f245816k;

    /* JADX INFO: renamed from: l */
    public static final fz3 f245817l;

    /* JADX INFO: renamed from: m */
    public static final x74 f245818m;

    /* JADX INFO: renamed from: n */
    public static final tm4 f245819n;

    /* JADX INFO: renamed from: o */
    public static final qxh0 f245820o;

    /* JADX INFO: renamed from: p */
    public static final HashMap f245821p;

    static {
        we60 we60Var = we60.f250460Y;
        uxq uxqVar = new uxq(we60Var, 0);
        f245806a = uxqVar;
        we60 we60Var2 = we60.f250461Z;
        uxq uxqVar2 = new uxq(we60Var2, 1);
        f245807b = uxqVar2;
        we60 we60Var3 = we60.f250456L0;
        uxq uxqVar3 = new uxq(we60Var3, 2);
        f245808c = uxqVar3;
        we60 we60Var4 = we60.f250466i;
        uxq uxqVar4 = new uxq(we60Var4, 3);
        f245809d = uxqVar4;
        we60 we60Var5 = we60.f250457M0;
        uxq uxqVar5 = new uxq(we60Var5, 4);
        f245810e = uxqVar5;
        we60 we60Var6 = we60.f250459X;
        uxq uxqVar6 = new uxq(we60Var6, 5);
        f245811f = uxqVar6;
        we60 we60Var7 = we60.f250465h;
        uxq uxqVar7 = new uxq(we60Var7, 6);
        f245812g = uxqVar7;
        we60 we60Var8 = we60.f250467t;
        uxq uxqVar8 = new uxq(we60Var8, 7);
        f245813h = uxqVar8;
        we60 we60Var9 = we60.f250458N0;
        uxq uxqVar9 = new uxq(we60Var9, 8);
        f245814i = uxqVar9;
        Collections.unmodifiableSet(bk5.m29624m1(new uxq[]{uxqVar, uxqVar2, uxqVar4, uxqVar6}));
        HashMap mapM32578q = ceg1.m32578q(4);
        mapM32578q.put(uxqVar2, 0);
        mapM32578q.put(uxqVar, 0);
        mapM32578q.put(uxqVar4, 1);
        mapM32578q.put(uxqVar3, 1);
        mapM32578q.put(uxqVar5, 2);
        f245815j = Collections.unmodifiableMap(mapM32578q);
        f245816k = uxqVar5;
        int i = 9;
        f245817l = new fz3(i);
        f245818m = new x74(i);
        f245819n = new tm4(i);
        try {
            Iterator it = Arrays.asList(new qxh0[0]).iterator();
            f245820o = it.hasNext() ? (qxh0) it.next() : qxh0.f193680a;
            HashMap map = new HashMap();
            f245821p = map;
            map.put(we60Var, uxqVar);
            map.put(we60Var2, uxqVar2);
            map.put(we60Var3, uxqVar3);
            map.put(we60Var4, uxqVar4);
            map.put(we60Var5, uxqVar5);
            map.put(we60Var6, uxqVar6);
            map.put(we60Var7, uxqVar7);
            map.put(we60Var8, uxqVar8);
            map.put(we60Var9, uxqVar9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m86670a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 16) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m86671b(uxq uxqVar, uxq uxqVar2) {
        if (uxqVar == null) {
            m86670a(12);
            throw null;
        }
        g50 g50Var = uxqVar.f235026a;
        if (uxqVar2 == null) {
            m86670a(13);
            throw null;
        }
        g50 g50Var2 = uxqVar2.f235026a;
        Integer numMo43564a = g50Var.mo43564a(g50Var2);
        if (numMo43564a != null) {
            return numMo43564a;
        }
        Integer numMo43564a2 = g50Var2.mo43564a(g50Var);
        if (numMo43564a2 != null) {
            return Integer.valueOf(-numMo43564a2.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static tqo m86672c(rzu0 rzu0Var, tqo tqoVar, oqo oqoVar) {
        tqo tqoVarM86672c;
        if (tqoVar == null) {
            m86670a(8);
            throw null;
        }
        if (oqoVar == null) {
            m86670a(9);
            throw null;
        }
        for (tqo tqoVar2 = (tqo) tqoVar.mo27377a(); tqoVar2 != null && tqoVar2.mo28470e() != f245811f; tqoVar2 = (tqo) rxq.m76670h(tqoVar2, tqo.class, true)) {
            if (!tqoVar2.mo28470e().m84184a(rzu0Var, tqoVar2, oqoVar)) {
                return tqoVar2;
            }
        }
        if (!(tqoVar instanceof an91) || (tqoVarM86672c = m86672c(rzu0Var, ((bn91) ((an91) tqoVar)).f28738e1, oqoVar)) == null) {
            return null;
        }
        return tqoVarM86672c;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m86673d(tqo tqoVar, oqo oqoVar) {
        if (oqoVar == null) {
            m86670a(7);
            throw null;
        }
        unq0 unq0VarM76667e = rxq.m76667e(oqoVar);
        if (unq0VarM76667e != unq0.f232223Q0) {
            return unq0VarM76667e.equals(rxq.m76667e(tqoVar));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m86674e(uxq uxqVar) {
        if (uxqVar != null) {
            return uxqVar == f245806a || uxqVar == f245807b;
        }
        m86670a(14);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m86675f(eab eabVar, oqo oqoVar) {
        if (eabVar == null) {
            m86670a(2);
            throw null;
        }
        if (oqoVar != null) {
            return m86672c(f245818m, eabVar, oqoVar) == null;
        }
        m86670a(3);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static uxq m86676g(g50 g50Var) {
        if (g50Var == null) {
            m86670a(15);
            throw null;
        }
        uxq uxqVar = (uxq) f245821p.get(g50Var);
        if (uxqVar != null) {
            return uxqVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + g50Var);
    }
}

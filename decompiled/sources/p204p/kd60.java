package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kd60 {

    /* JADX INFO: renamed from: a */
    public static final uxq f121621a;

    /* JADX INFO: renamed from: b */
    public static final uxq f121622b;

    /* JADX INFO: renamed from: c */
    public static final uxq f121623c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f121624d;

    static {
        we60 we60Var = we60.f250462e;
        uxq uxqVar = new uxq(we60Var, 9);
        f121621a = uxqVar;
        we60 we60Var2 = we60.f250464g;
        uxq uxqVar2 = new uxq(we60Var2, 10);
        f121622b = uxqVar2;
        we60 we60Var3 = we60.f250463f;
        uxq uxqVar3 = new uxq(we60Var3, 11);
        f121623c = uxqVar3;
        HashMap map = new HashMap();
        f121624d = map;
        map.put(we60Var, uxqVar);
        map.put(we60Var2, uxqVar2);
        map.put(we60Var3, uxqVar3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56162a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m56163b(rzu0 rzu0Var, tqo tqoVar, oqo oqoVar) {
        tqo tqoVarM76680r;
        if (oqoVar == null) {
            m56162a(1);
            throw null;
        }
        if (tqoVar instanceof eab) {
            tqoVarM76680r = rxq.m76680r((eab) tqoVar);
        } else {
            int i = rxq.f203658a;
            tqoVarM76680r = tqoVar;
        }
        if (m56164c(tqoVarM76680r, oqoVar)) {
            return true;
        }
        return vxq.f245808c.m84184a(rzu0Var, tqoVar, oqoVar);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m56164c(tqo tqoVar, oqo oqoVar) {
        if (tqoVar == null) {
            m56162a(2);
            throw null;
        }
        if (oqoVar == null) {
            m56162a(3);
            throw null;
        }
        m3m0 m3m0Var = (m3m0) rxq.m76670h(tqoVar, m3m0.class, false);
        m3m0 m3m0Var2 = (m3m0) rxq.m76670h(oqoVar, m3m0.class, false);
        return (m3m0Var2 == null || m3m0Var == null || !((n3m0) m3m0Var).f150085f.equals(((n3m0) m3m0Var2).f150085f)) ? false : true;
    }
}

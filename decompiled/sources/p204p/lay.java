package p204p;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lay {

    /* JADX INFO: renamed from: a */
    public static final euf f131442a = jlg1.m53700j(mxq.f148161h, mxq.f148162i);

    /* JADX INFO: renamed from: a */
    public static final zr60 m58579a(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return zr60.f285551b;
        }
        ArrayList<pqm0> arrayListM43746s1 = g6f.m43746s1(list, list2);
        int iM31820L = c95.m31820L(i6f.m49804T(arrayListM43746s1, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (pqm0 pqm0Var : arrayListM43746s1) {
            ur60 ur60Var = (ur60) pqm0Var.f180350a;
            ur60 ur60Var2 = (ur60) pqm0Var.f180351b;
            xr60 xr60Var = xr60.f265273c;
            linkedHashMap.put(ur60Var, tqg1.m81324l(upf.m83703t(ur60Var2, null, 7)));
        }
        return new zr60(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (p204p.qug1.m73946p(r0) == true) goto L18;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sr60 m58580b(sr60 sr60Var, String str) {
        AbstractC1969i7 abstractC1969i7 = sr60Var instanceof AbstractC1969i7 ? (AbstractC1969i7) sr60Var : null;
        if (abstractC1969i7 != null) {
            if (!(abstractC1969i7.mo27067y() instanceof dhw)) {
                zwq zwqVar = abstractC1969i7 instanceof zwq ? (zwq) abstractC1969i7 : null;
                if (zwqVar != null) {
                    gd70 gd70Var = zwqVar.f287046b;
                    if (gd70Var != null) {
                    }
                }
            }
            return sr60Var;
        }
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        if (kq60VarMo27067y != null) {
            List<xr60> listMo27065K = sr60Var.mo27065K();
            ArrayList arrayList = new ArrayList(i6f.m49804T(listMo27065K, 10));
            for (xr60 xr60Var : listMo27065K) {
                sr60 sr60Var2 = xr60Var.f265275b;
                arrayList.add(new xr60(xr60Var.f265274a, sr60Var2 != null ? m58580b(sr60Var2, str) : null));
            }
            return upf.m83704u(kq60VarMo27067y, arrayList, false, sr60Var.getAnnotations(), null);
        }
        throw new IllegalStateException(("Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '" + sr60Var + "' (" + qpv0.f191387a.mo54112b(sr60Var.getClass()) + ") which belongs to member '" + str + '\'').toString());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: c */
    public static final Collection m58581c(cq60 cq60Var) {
        lpv0 lpv0Var = ((zp60) cq60Var.f40746c.getValue()).f284958t;
        qr60 qr60Var = zp60.f284940x[16];
        return (Collection) lpv0Var.invoke();
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: d */
    public static final jay m58582d(up60 up60Var) {
        if (up60Var instanceof cq60) {
            lpv0 lpv0Var = ((zp60) ((cq60) up60Var).f40746c.getValue()).f284960v;
            qr60 qr60Var = zp60.f284940x[18];
            return (jay) lpv0Var.invoke();
        }
        if (up60Var instanceof goi0) {
            return m58582d(((goi0) up60Var).f82964a);
        }
        throw new IllegalStateException(("Unknown type " + qpv0.f191387a.mo54112b(up60Var.getClass())).toString());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m58583e(tvq tvqVar) {
        return j0b1.m52048g(tvqVar) == null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m58584f(Object obj) {
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final ycw m58585g(tvq tvqVar, hxg1 hxg1Var) {
        int i;
        Field fieldM61884s;
        Class<?> declaringClass;
        List listMo25528e = tvqVar.mo25528e();
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo25528e.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((hr60) next).getKind() != 1) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hr60) it2.next()).getType());
        }
        boolean z = tvqVar instanceof qr60;
        if (z && (fieldM61884s = mif1.m61884s((qr60) tvqVar)) != null && (declaringClass = fieldM61884s.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            i = 3;
        } else if (z) {
            i = 2;
        } else if (!(tvqVar instanceof oq60)) {
            throw new IllegalStateException(("Unknown kind for " + qpv0.f191387a.mo54112b(tvqVar.getClass())).toString());
        }
        int i2 = i;
        oq60 oq60Var = tvqVar instanceof oq60 ? (oq60) tvqVar : null;
        Method methodM61885t = oq60Var != null ? mif1.m61885t(oq60Var) : null;
        Type[] genericParameterTypes = methodM61885t != null ? methodM61885t.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listM29620k1 = bk5.m29620k1(genericParameterTypes);
        Class<?>[] parameterTypes = methodM61885t != null ? methodM61885t.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new ycw(i2, tvqVar.getName(), methodM61885t != null ? methodM61885t.getName() : null, (List) tvqVar.f224214g.invoke(), arrayList2, bk5.m29620k1(parameterTypes), listM29620k1, m58583e(tvqVar), hxg1Var);
    }
}

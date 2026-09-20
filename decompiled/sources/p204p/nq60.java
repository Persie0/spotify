package p204p;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nq60 implements ife {

    /* JADX INFO: renamed from: a */
    public static final urv0 f157171a = new urv0("<v#(\\d+)>");

    /* JADX INFO: renamed from: M */
    public static void m65378M(ArrayList arrayList, List list, boolean z, boolean z2) {
        if (wj50.m88271j(g6f.m43689C0(list), DefaultConstructorMarker.class)) {
            list = list.subList(0, list.size() - 1);
        }
        int size = z2 ? list.size() - 1 : list.size();
        arrayList.addAll(list);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.TYPE);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    /* JADX INFO: renamed from: X */
    public static Method m65379X(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class clsM89583z;
        Method methodM65379X;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM65380Y = m65380Y(cls, str, clsArr, cls2);
        if (methodM65380Y != null) {
            return methodM65380Y;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM65379X = m65379X(superclass, str, clsArr, cls2, z)) != null) {
            return methodM65379X;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            wj50.m88279p(cls3);
            Method methodM65379X2 = m65379X(cls3, str, clsArr, cls2, z);
            if (methodM65379X2 != null) {
                return methodM65379X2;
            }
            if (z && (clsM89583z = x0h1.m89583z(bov0.m30096d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodM65380Y2 = m65380Y(clsM89583z, str, clsArr, cls2);
                if (methodM65380Y2 != null) {
                    return methodM65380Y2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public static Method m65380Y(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (wj50.m88271j(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            for (Method method : cls.getDeclaredMethods()) {
                if (wj50.m88271j(method.getName(), str) && wj50.m88271j(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final wc70 m65381N(int i, String str) {
        x870 x870VarMo28591U = mo28591U(i);
        if (x870VarMo28591U == null) {
            return null;
        }
        if (x870VarMo28591U.m90181b() == null) {
            return gr6.m45470e(x870VarMo28591U) ? new gc70(this, str, null, x870VarMo28591U) : new wc70(this, str, null, x870VarMo28591U);
        }
        throw new cvk("Local property " + x870VarMo28591U.m90180a() + " is an extension, which is not yet supported");
    }

    /* JADX INFO: renamed from: O */
    public final Method m65382O(String str, boolean z, String str2, boolean z2) {
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo28587A());
        }
        xyx xyxVarM52053l = j0b1.m52053l(bov0.m30096d(mo28587A()), str2, true);
        m65378M(arrayList, xyxVarM52053l.m92434l(), false, z2);
        Class clsMo45471V = mo45471V();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsM92435m = xyxVarM52053l.m92435m();
        wj50.m88279p(clsM92435m);
        return m65379X(clsMo45471V, strConcat, clsArr, clsM92435m, z);
    }

    /* JADX INFO: renamed from: P */
    public final Method m65383P(String str, String str2) {
        Method methodM65379X;
        if (str.equals("<init>")) {
            return null;
        }
        xyx xyxVarM52053l = j0b1.m52053l(bov0.m30096d(mo28587A()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) xyxVarM52053l.m92434l()).toArray(new Class[0]);
        Class clsM92435m = xyxVarM52053l.m92435m();
        wj50.m88279p(clsM92435m);
        Method methodM65379X2 = m65379X(mo45471V(), str, clsArr, clsM92435m, false);
        if (methodM65379X2 != null) {
            return methodM65379X2;
        }
        if (!mo45471V().isInterface() || (methodM65379X = m65379X(Object.class, str, clsArr, clsM92435m, false)) == null) {
            return null;
        }
        return methodM65379X;
    }

    /* JADX INFO: renamed from: Q */
    public final x870 m65384Q(String str, String str2) {
        ArrayList arrayListM45473a0 = ((gr60) this).m45473a0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM45473a0) {
            x870 x870Var = (x870) obj;
            if (wj50.m88271j(x870Var.m90180a(), str) && wj50.m88271j(qlk.m73228g(x870Var, this), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbM38573v = edb.m38573v("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbM38573v.append(this);
            throw new cvk(sbM38573v.toString());
        }
        if (arrayList.size() <= 1) {
            return (x870) g6f.m43706T0(arrayList);
        }
        StringBuilder sbM38573v2 = edb.m38573v("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbM38573v2.append(this);
        throw new cvk(sbM38573v2.toString());
    }

    /* JADX INFO: renamed from: R */
    public abstract Collection mo28588R();

    /* JADX INFO: renamed from: S */
    public abstract Collection mo28589S(qti0 qti0Var);

    /* JADX INFO: renamed from: T */
    public abstract nys0 mo28590T(int i);

    /* JADX INFO: renamed from: U */
    public abstract x870 mo28591U(int i);

    /* JADX INFO: renamed from: V */
    public Class mo45471V() {
        Class cls = (Class) bov0.f29262c.get(mo28587A());
        return cls == null ? mo28587A() : cls;
    }

    /* JADX INFO: renamed from: W */
    public abstract Collection mo28592W(qti0 qti0Var);
}

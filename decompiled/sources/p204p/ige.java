package p204p;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ige {

    /* JADX INFO: renamed from: c */
    public static final ige f101970c = new ige();

    /* JADX INFO: renamed from: a */
    public final HashMap f101971a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f101972b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static void m50512c(HashMap map, hge hgeVar, ta80 ta80Var, Class cls) {
        ta80 ta80Var2 = (ta80) map.get(hgeVar);
        if (ta80Var2 == null || ta80Var == ta80Var2) {
            if (ta80Var2 == null) {
                map.put(hgeVar, ta80Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + hgeVar.f91143b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ta80Var2 + ", new value " + ta80Var);
    }

    /* JADX INFO: renamed from: a */
    public final gge m50513a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f101971a;
        if (superclass != null) {
            gge ggeVarM50513a = (gge) map2.get(superclass);
            if (ggeVarM50513a == null) {
                ggeVarM50513a = m50513a(superclass, null);
            }
            map.putAll(ggeVarM50513a.f79650b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            gge ggeVarM50513a2 = (gge) map2.get(cls2);
            if (ggeVarM50513a2 == null) {
                ggeVarM50513a2 = m50513a(cls2, null);
            }
            for (Map.Entry entry : ggeVarM50513a2.f79650b.entrySet()) {
                m50512c(map, (hge) entry.getKey(), (ta80) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            zal0 zal0Var = (zal0) method.getAnnotation(zal0.class);
            if (zal0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!hc80.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                ta80 ta80VarValue = zal0Var.value();
                if (parameterTypes.length > 1) {
                    if (!ta80.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (ta80VarValue != ta80.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m50512c(map, new hge(method, i), ta80VarValue, cls);
                z = true;
            }
        }
        gge ggeVar = new gge(map);
        map2.put(cls, ggeVar);
        this.f101972b.put(cls, Boolean.valueOf(z));
        return ggeVar;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50514b(Class cls) {
        HashMap map = this.f101972b;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((zal0) method.getAnnotation(zal0.class)) != null) {
                    m50513a(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}

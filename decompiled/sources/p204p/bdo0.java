package p204p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bdo0 {

    /* JADX INFO: renamed from: a */
    public static final Method f26190a;

    /* JADX INFO: renamed from: b */
    public static final Method f26191b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        wj50.m88279p(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (wj50.m88271j(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (wj50.m88271j(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        f26190a = method2;
        for (Method method3 : methods) {
            if (wj50.m88271j(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f26191b = method;
    }
}

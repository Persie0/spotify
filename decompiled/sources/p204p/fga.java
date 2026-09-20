package p204p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class fga implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object f69261a;

    public fga(Object obj) {
        this.f69261a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof fga;
        Object obj2 = this.f69261a;
        return z ? obj2.equals(((fga) obj).f69261a) : obj2.equals(obj);
    }

    public final int hashCode() {
        return this.f69261a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.f69261a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Reflection failed for method " + method, e2);
        }
    }
}

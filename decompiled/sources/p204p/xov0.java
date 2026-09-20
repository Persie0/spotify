package p204p;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class xov0 extends tov0 {

    /* JADX INFO: renamed from: b */
    public final Object f264375b;

    public xov0(Object obj) {
        this.f264375b = obj;
    }

    @Override // p204p.tov0
    /* JADX INFO: renamed from: t */
    public final Member mo70492t() {
        tey teyVar = hkg1.f92442c;
        Object obj = this.f264375b;
        Method method = null;
        if (teyVar == null) {
            Class<?> cls = obj.getClass();
            try {
                teyVar = new tey(27, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                teyVar = new tey(27, method, method);
            }
            hkg1.f92442c = teyVar;
        }
        Method method2 = (Method) teyVar.f219809c;
        method = method2 != null ? (Method) method2.invoke(obj, null) : null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* JADX INFO: renamed from: x */
    public final zd60 m91564x() {
        tey teyVar = hkg1.f92442c;
        Object obj = this.f264375b;
        Class cls = null;
        if (teyVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                teyVar = new tey(27, cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                teyVar = new tey(27, cls, cls);
            }
            hkg1.f92442c = teyVar;
        }
        Method method = (Method) teyVar.f219808b;
        cls = method != null ? (Class) method.invoke(obj, null) : null;
        if (cls != null) {
            return new oov0(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}

package p204p;

import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a600 {

    /* JADX INFO: renamed from: a */
    public static final ab21 f12659a = new ab21(0);

    /* JADX INFO: renamed from: b */
    public static Class m24826b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        ab21 ab21Var = f12659a;
        ab21 ab21Var2 = (ab21) ab21Var.get(classLoader);
        if (ab21Var2 == null) {
            ab21Var2 = new ab21(0);
            ab21Var.put(classLoader, ab21Var2);
        }
        Class cls = (Class) ab21Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ab21Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m24827c(ClassLoader classLoader, String str) {
        try {
            return m24826b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(e, s571.m77251j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"));
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(e2, s571.m77251j("Unable to instantiate fragment ", str, ": make sure class name exists"));
        }
    }

    /* JADX INFO: renamed from: a */
    public i500 mo24828a(ClassLoader classLoader, String str) {
        try {
            return (i500) m24827c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(e, s571.m77251j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(e2, s571.m77251j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(e3, s571.m77251j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"));
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(e4, s571.m77251j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"));
        }
    }
}

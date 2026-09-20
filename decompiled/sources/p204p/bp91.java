package p204p;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class bp91 extends ap91 {
    @Override // p204p.ap91
    /* JADX INFO: renamed from: I1 */
    public final Typeface mo26663I1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f17859h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f17855L0.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p204p.ap91
    /* JADX INFO: renamed from: L1 */
    public final Method mo26665L1(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p204p.ap91, p204p.xo91, p204p.AbstractC1806e9
    /* JADX INFO: renamed from: S0 */
    public final Typeface mo26669S0(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }
}

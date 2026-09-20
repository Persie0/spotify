package p204p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class opv0 extends t5m0 {
    @Override // p204p.t5m0
    /* JADX INFO: renamed from: d */
    public final Object mo67579d(Class cls, Object obj, Method method, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return fz6.m43168x(cls, obj, method, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }

    @Override // p204p.t5m0
    /* JADX INFO: renamed from: e */
    public final boolean mo67580e(Method method) {
        return method.isDefault();
    }
}

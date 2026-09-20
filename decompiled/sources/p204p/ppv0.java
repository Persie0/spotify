package p204p;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes3.dex */
public final class ppv0 extends t5m0 {
    @Override // p204p.t5m0
    /* JADX INFO: renamed from: c */
    public final String mo70597c(Method method, int i) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.mo70597c(method, i);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // p204p.t5m0
    /* JADX INFO: renamed from: d */
    public final Object mo67579d(Class cls, Object obj, Method method, Object[] objArr) {
        return fz6.m43168x(cls, obj, method, objArr);
    }

    @Override // p204p.t5m0
    /* JADX INFO: renamed from: e */
    public final boolean mo67580e(Method method) {
        return method.isDefault();
    }
}

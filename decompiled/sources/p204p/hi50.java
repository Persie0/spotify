package p204p;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class hi50 extends ii50 {
    public hi50(Method method) {
        super(method, Collections.singletonList(method.getDeclaringClass()));
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        m50693a(objArr);
        Object obj = objArr[0];
        Object[] objArrM29640y0 = objArr.length <= 1 ? new Object[0] : bk5.m29640y0(1, objArr.length, objArr);
        return this.f102449a.invoke(obj, Arrays.copyOf(objArrM29640y0, objArrM29640y0.length));
    }
}

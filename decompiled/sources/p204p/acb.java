package p204p;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class acb extends xbb implements dga {

    /* JADX INFO: renamed from: g */
    public final boolean f14308g;

    /* JADX INFO: renamed from: h */
    public final Object f14309h;

    /* JADX WARN: Illegal instructions before constructor call */
    public acb(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : bk5.m29640y0(1, genericParameterTypes.length, genericParameterTypes)));
        this.f14308g = z;
        this.f14309h = obj;
    }

    @Override // p204p.xbb, p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        mo32239a(objArr);
        mbq mbqVar = new mbq(2);
        mbqVar.m61421b(this.f14309h);
        mbqVar.m61422c(objArr);
        ArrayList arrayList = mbqVar.f141956a;
        return m90313c(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}

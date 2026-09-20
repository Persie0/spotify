package p204p;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class gi50 extends ii50 implements dga {

    /* JADX INFO: renamed from: d */
    public final Object f80072d;

    public gi50(Method method, Object obj) {
        super(method, lau.f131415a);
        this.f80072d = obj;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        m50693a(objArr);
        return this.f102449a.invoke(this.f80072d, Arrays.copyOf(objArr, objArr.length));
    }
}

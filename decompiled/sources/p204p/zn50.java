package p204p;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zn50 {

    /* JADX INFO: renamed from: a */
    public final Class f284412a;

    /* JADX INFO: renamed from: b */
    public final Object f284413b;

    /* JADX INFO: renamed from: c */
    public final Method f284414c;

    /* JADX INFO: renamed from: d */
    public final List f284415d;

    public zn50(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f284412a = cls;
        this.f284413b = obj;
        this.f284414c = method;
        this.f284415d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f284412a.getName(), this.f284414c.getName(), this.f284415d);
    }
}

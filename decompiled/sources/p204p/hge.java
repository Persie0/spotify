package p204p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class hge {

    /* JADX INFO: renamed from: a */
    public final int f91142a;

    /* JADX INFO: renamed from: b */
    public final Method f91143b;

    public hge(Method method, int i) {
        this.f91142a = i;
        this.f91143b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hge)) {
            return false;
        }
        hge hgeVar = (hge) obj;
        return this.f91142a == hgeVar.f91142a && this.f91143b.getName().equals(hgeVar.f91143b.getName());
    }

    public final int hashCode() {
        return this.f91143b.getName().hashCode() + (this.f91142a * 31);
    }
}

package p204p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class st91 implements f2b1, Serializable {

    /* JADX INFO: renamed from: b */
    public static final st91 f213865b = new st91(lau.f131415a);

    /* JADX INFO: renamed from: a */
    public final Object f213866a;

    public st91(List list) {
        this.f213866a = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p204p.f2b1
    /* JADX INFO: renamed from: a */
    public final List mo30507a() {
        return ofg1.m66850s(this.f213866a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !st91.class.equals(obj.getClass())) {
            return false;
        }
        return this.f213866a.equals(((st91) obj).f213866a);
    }

    public final int hashCode() {
        return this.f213866a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final String toString() {
        ?? r0 = this.f213866a;
        return r0.isEmpty() ? "" : g6f.m43753y0(r0, "/", "{", "}", null, 56);
    }
}

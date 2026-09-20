package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class dnk0 {

    /* JADX INFO: renamed from: a */
    public final Object f50849a;

    /* JADX INFO: renamed from: b */
    public final Object f50850b;

    public dnk0(Set set, Set set2) {
        this.f50849a = set;
        this.f50850b = set2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: a */
    public final Set m36482a() {
        return this.f50849a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: b */
    public final Set m36483b() {
        return this.f50850b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk0)) {
            return false;
        }
        dnk0 dnk0Var = (dnk0) obj;
        return this.f50849a.equals(dnk0Var.f50849a) && this.f50850b.equals(dnk0Var.f50850b);
    }

    public final int hashCode() {
        return this.f50850b.hashCode() + (this.f50849a.hashCode() * 31);
    }
}

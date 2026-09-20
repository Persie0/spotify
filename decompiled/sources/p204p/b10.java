package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b10 {

    /* JADX INFO: renamed from: a */
    public final qe70 f22159a;

    /* JADX INFO: renamed from: b */
    public final Set f22160b;

    /* JADX WARN: Multi-variable type inference failed */
    public b10(Set set, gh00 gh00Var) {
        this.f22159a = (qe70) gh00Var;
        this.f22160b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return wj50.m88271j(this.f22159a, b10Var.f22159a) && wj50.m88271j(this.f22160b, b10Var.f22160b);
    }

    public final int hashCode() {
        return this.f22160b.hashCode() + (this.f22159a.hashCode() * 31);
    }

    public /* synthetic */ b10(gh00 gh00Var) {
        this(gbu.f78413a, gh00Var);
    }
}

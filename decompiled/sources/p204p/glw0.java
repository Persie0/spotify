package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class glw0 {

    /* JADX INFO: renamed from: a */
    public final List f81190a;

    /* JADX INFO: renamed from: b */
    public final Set f81191b;

    public glw0(List list, Set set) {
        this.f81190a = list;
        this.f81191b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glw0)) {
            return false;
        }
        glw0 glw0Var = (glw0) obj;
        return wj50.m88271j(this.f81190a, glw0Var.f81190a) && wj50.m88271j(this.f81191b, glw0Var.f81191b);
    }

    public final int hashCode() {
        return this.f81191b.hashCode() + (this.f81190a.hashCode() * 31);
    }
}

package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z7a {

    /* JADX INFO: renamed from: a */
    public final List f280144a;

    public z7a(ae50 ae50Var) {
        this.f280144a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7a) && wj50.m88271j(this.f280144a, ((z7a) obj).f280144a);
    }

    public final int hashCode() {
        return this.f280144a.hashCode();
    }
}

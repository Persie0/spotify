package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s740 {

    /* JADX INFO: renamed from: a */
    public final Object f206273a;

    /* JADX INFO: renamed from: b */
    public final Set f206274b;

    public s740(List list, Set set) {
        this.f206273a = list;
        this.f206274b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s740)) {
            return false;
        }
        s740 s740Var = (s740) obj;
        return this.f206273a.equals(s740Var.f206273a) && wj50.m88271j(this.f206274b, s740Var.f206274b);
    }

    public final int hashCode() {
        return this.f206274b.hashCode() + (this.f206273a.hashCode() * 31);
    }
}

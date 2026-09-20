package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class dm51 {

    /* JADX INFO: renamed from: a */
    public final List f50427a;

    public dm51(ae50 ae50Var) {
        this.f50427a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm51) && wj50.m88271j(this.f50427a, ((dm51) obj).f50427a);
    }

    public final int hashCode() {
        return this.f50427a.hashCode();
    }
}

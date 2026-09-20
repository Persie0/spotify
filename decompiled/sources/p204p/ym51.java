package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class ym51 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f274163a;

    /* JADX INFO: renamed from: b */
    public final int f274164b;

    public ym51(Object obj, int i) {
        this.f274163a = obj;
        this.f274164b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym51)) {
            return false;
        }
        ym51 ym51Var = (ym51) obj;
        return wj50.m88271j(this.f274163a, ym51Var.f274163a) && this.f274164b == ym51Var.f274164b;
    }

    public final int hashCode() {
        Object obj = this.f274163a;
        return Integer.hashCode(this.f274164b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}

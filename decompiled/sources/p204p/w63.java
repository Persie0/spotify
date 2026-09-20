package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class w63 {

    /* JADX INFO: renamed from: a */
    public final ty80 f248237a;

    /* JADX INFO: renamed from: b */
    public final Map f248238b;

    public w63(ty80 ty80Var, Map map) {
        this.f248237a = ty80Var;
        this.f248238b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w63)) {
            return false;
        }
        w63 w63Var = (w63) obj;
        return wj50.m88271j(this.f248237a, w63Var.f248237a) && wj50.m88271j(this.f248238b, w63Var.f248238b);
    }

    public final int hashCode() {
        return this.f248238b.hashCode() + (this.f248237a.hashCode() * 31);
    }
}

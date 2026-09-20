package p204p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class e9j0 implements f9j0 {

    /* JADX INFO: renamed from: a */
    public final UUID f57457a;

    /* JADX INFO: renamed from: b */
    public final p9j0 f57458b;

    /* JADX INFO: renamed from: c */
    public final Map f57459c;

    /* JADX INFO: renamed from: d */
    public final tf60 f57460d;

    /* JADX INFO: renamed from: e */
    public final tf60 f57461e;

    public e9j0(UUID uuid, p9j0 p9j0Var, Map map, tf60 tf60Var, tf60 tf60Var2) {
        this.f57457a = uuid;
        this.f57458b = p9j0Var;
        this.f57459c = map;
        this.f57460d = tf60Var;
        this.f57461e = tf60Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9j0)) {
            return false;
        }
        e9j0 e9j0Var = (e9j0) obj;
        return wj50.m88271j(this.f57457a, e9j0Var.f57457a) && wj50.m88271j(this.f57458b, e9j0Var.f57458b) && wj50.m88271j(this.f57459c, e9j0Var.f57459c) && wj50.m88271j(this.f57460d, e9j0Var.f57460d) && wj50.m88271j(this.f57461e, e9j0Var.f57461e);
    }

    public final int hashCode() {
        return this.f57461e.hashCode() + ((this.f57460d.hashCode() + edb.m38557f((this.f57458b.hashCode() + (this.f57457a.hashCode() * 31)) * 31, 31, this.f57459c)) * 31);
    }
}

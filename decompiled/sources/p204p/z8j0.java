package p204p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class z8j0 {

    /* JADX INFO: renamed from: a */
    public final UUID f280490a;

    /* JADX INFO: renamed from: b */
    public final p9j0 f280491b;

    /* JADX INFO: renamed from: c */
    public final Map f280492c;

    public z8j0(UUID uuid, p9j0 p9j0Var, Map map) {
        this.f280490a = uuid;
        this.f280491b = p9j0Var;
        this.f280492c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8j0)) {
            return false;
        }
        z8j0 z8j0Var = (z8j0) obj;
        return wj50.m88271j(this.f280490a, z8j0Var.f280490a) && wj50.m88271j(this.f280491b, z8j0Var.f280491b) && wj50.m88271j(this.f280492c, z8j0Var.f280492c);
    }

    public final int hashCode() {
        return this.f280492c.hashCode() + ((this.f280491b.hashCode() + (this.f280490a.hashCode() * 31)) * 31);
    }
}

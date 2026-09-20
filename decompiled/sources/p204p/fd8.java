package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fd8 {

    /* JADX INFO: renamed from: a */
    public final ed8 f68395a;

    /* JADX INFO: renamed from: b */
    public final Map f68396b;

    public fd8(ed8 ed8Var, Map map) {
        this.f68395a = ed8Var;
        this.f68396b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd8)) {
            return false;
        }
        fd8 fd8Var = (fd8) obj;
        return wj50.m88271j(this.f68395a, fd8Var.f68395a) && wj50.m88271j(this.f68396b, fd8Var.f68396b);
    }

    public final int hashCode() {
        ed8 ed8Var = this.f68395a;
        return this.f68396b.hashCode() + ((ed8Var == null ? 0 : ed8Var.hashCode()) * 31);
    }
}

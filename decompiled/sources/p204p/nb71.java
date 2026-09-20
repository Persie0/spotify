package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class nb71 {

    /* JADX INFO: renamed from: a */
    public final Object f152205a;

    /* JADX INFO: renamed from: b */
    public final boolean f152206b;

    public nb71(Map map, boolean z) {
        this.f152205a = map;
        this.f152206b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb71)) {
            return false;
        }
        nb71 nb71Var = (nb71) obj;
        return this.f152205a.equals(nb71Var.f152205a) && this.f152206b == nb71Var.f152206b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152206b) + (this.f152205a.hashCode() * 31);
    }
}

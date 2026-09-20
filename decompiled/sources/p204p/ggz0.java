package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ggz0 {

    /* JADX INFO: renamed from: a */
    public final Object f79772a;

    /* JADX INFO: renamed from: b */
    public final boolean f79773b;

    public ggz0(Map map, boolean z) {
        this.f79772a = map;
        this.f79773b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggz0)) {
            return false;
        }
        ggz0 ggz0Var = (ggz0) obj;
        return this.f79772a.equals(ggz0Var.f79772a) && this.f79773b == ggz0Var.f79773b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79773b) + (this.f79772a.hashCode() * 31);
    }
}

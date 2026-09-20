package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class cf80 {

    /* JADX INFO: renamed from: a */
    public final Map f37292a;

    /* JADX INFO: renamed from: b */
    public final i490 f37293b;

    /* JADX INFO: renamed from: c */
    public final boolean f37294c;

    public cf80(Map map, i490 i490Var, boolean z) {
        this.f37292a = map;
        this.f37293b = i490Var;
        this.f37294c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf80)) {
            return false;
        }
        cf80 cf80Var = (cf80) obj;
        return wj50.m88271j(this.f37292a, cf80Var.f37292a) && wj50.m88271j(this.f37293b, cf80Var.f37293b) && this.f37294c == cf80Var.f37294c;
    }

    public final int hashCode() {
        int iHashCode = this.f37292a.hashCode() * 31;
        i490 i490Var = this.f37293b;
        return Boolean.hashCode(this.f37294c) + ((iHashCode + (i490Var == null ? 0 : i490Var.hashCode())) * 31);
    }
}

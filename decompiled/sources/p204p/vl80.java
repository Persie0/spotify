package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vl80 {

    /* JADX INFO: renamed from: a */
    public final String f242401a;

    /* JADX INFO: renamed from: b */
    public final String f242402b;

    /* JADX INFO: renamed from: c */
    public final int f242403c;

    public vl80(String str, String str2, int i) {
        this.f242401a = str;
        this.f242402b = str2;
        this.f242403c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl80)) {
            return false;
        }
        vl80 vl80Var = (vl80) obj;
        return wj50.m88271j(this.f242401a, vl80Var.f242401a) && wj50.m88271j(this.f242402b, vl80Var.f242402b) && this.f242403c == vl80Var.f242403c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f242403c) + s571.m77243b(this.f242401a.hashCode() * 31, 31, this.f242402b);
    }
}

package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vl2 {

    /* JADX INFO: renamed from: a */
    public final String f242364a;

    /* JADX INFO: renamed from: b */
    public final String f242365b;

    /* JADX INFO: renamed from: c */
    public final int f242366c;

    public vl2(String str, String str2, int i) {
        this.f242364a = str;
        this.f242365b = str2;
        this.f242366c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl2)) {
            return false;
        }
        vl2 vl2Var = (vl2) obj;
        return wj50.m88271j(this.f242364a, vl2Var.f242364a) && wj50.m88271j(this.f242365b, vl2Var.f242365b) && this.f242366c == vl2Var.f242366c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f242366c) + s571.m77243b(this.f242364a.hashCode() * 31, 31, this.f242365b);
    }
}

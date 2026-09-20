package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ey40 implements fy40 {

    /* JADX INFO: renamed from: a */
    public final String f63939a;

    /* JADX INFO: renamed from: b */
    public final int f63940b;

    public ey40(String str, int i) {
        this.f63939a = str;
        this.f63940b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey40)) {
            return false;
        }
        ey40 ey40Var = (ey40) obj;
        return wj50.m88271j(this.f63939a, ey40Var.f63939a) && this.f63940b == ey40Var.f63940b;
    }

    public final int hashCode() {
        int iHashCode = this.f63939a.hashCode() * 31;
        int i = this.f63940b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v860 {

    /* JADX INFO: renamed from: a */
    public final String f238412a;

    /* JADX INFO: renamed from: b */
    public final int f238413b;

    public v860(String str, int i) {
        this.f238412a = str;
        this.f238413b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v860)) {
            return false;
        }
        v860 v860Var = (v860) obj;
        return wj50.m88271j(this.f238412a, v860Var.f238412a) && this.f238413b == v860Var.f238413b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f238413b) + (this.f238412a.hashCode() * 31);
    }
}

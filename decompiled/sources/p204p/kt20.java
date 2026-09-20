package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kt20 {

    /* JADX INFO: renamed from: a */
    public final String f126117a;

    /* JADX INFO: renamed from: b */
    public final String f126118b;

    public kt20(String str, String str2) {
        this.f126117a = str;
        this.f126118b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt20)) {
            return false;
        }
        kt20 kt20Var = (kt20) obj;
        return wj50.m88271j(this.f126117a, kt20Var.f126117a) && wj50.m88271j(this.f126118b, kt20Var.f126118b);
    }

    public final int hashCode() {
        return this.f126118b.hashCode() + (this.f126117a.hashCode() * 31);
    }
}

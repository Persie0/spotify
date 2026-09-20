package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hoo0 {

    /* JADX INFO: renamed from: a */
    public final String f93584a;

    /* JADX INFO: renamed from: b */
    public final int f93585b;

    public hoo0(String str, int i) {
        this.f93584a = str;
        this.f93585b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoo0)) {
            return false;
        }
        hoo0 hoo0Var = (hoo0) obj;
        return this.f93584a.equals(hoo0Var.f93584a) && this.f93585b == hoo0Var.f93585b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f93585b) + (this.f93584a.hashCode() * 31);
    }
}

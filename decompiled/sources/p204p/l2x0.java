package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l2x0 {

    /* JADX INFO: renamed from: a */
    public final String f129117a;

    /* JADX INFO: renamed from: b */
    public final String f129118b;

    public l2x0(String str, String str2) {
        this.f129117a = str;
        this.f129118b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2x0)) {
            return false;
        }
        l2x0 l2x0Var = (l2x0) obj;
        return wj50.m88271j(this.f129117a, l2x0Var.f129117a) && wj50.m88271j(this.f129118b, l2x0Var.f129118b);
    }

    public final int hashCode() {
        return this.f129118b.hashCode() + (this.f129117a.hashCode() * 31);
    }
}

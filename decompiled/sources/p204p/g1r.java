package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g1r {

    /* JADX INFO: renamed from: a */
    public final String f75701a;

    /* JADX INFO: renamed from: b */
    public final String f75702b;

    public g1r(String str, String str2) {
        this.f75701a = str;
        this.f75702b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1r)) {
            return false;
        }
        g1r g1rVar = (g1r) obj;
        return wj50.m88271j(this.f75701a, g1rVar.f75701a) && wj50.m88271j(this.f75702b, g1rVar.f75702b);
    }

    public final int hashCode() {
        return this.f75702b.hashCode() + (this.f75701a.hashCode() * 31);
    }
}

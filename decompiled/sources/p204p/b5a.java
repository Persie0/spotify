package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b5a implements c5a {

    /* JADX INFO: renamed from: a */
    public final String f23531a;

    /* JADX INFO: renamed from: b */
    public final String f23532b;

    public b5a(String str, String str2) {
        this.f23531a = str;
        this.f23532b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5a)) {
            return false;
        }
        b5a b5aVar = (b5a) obj;
        return wj50.m88271j(this.f23531a, b5aVar.f23531a) && wj50.m88271j(this.f23532b, b5aVar.f23532b);
    }

    public final int hashCode() {
        return this.f23532b.hashCode() + (this.f23531a.hashCode() * 31);
    }
}

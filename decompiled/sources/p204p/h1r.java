package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h1r {

    /* JADX INFO: renamed from: a */
    public final String f86682a;

    /* JADX INFO: renamed from: b */
    public final String f86683b;

    /* JADX INFO: renamed from: c */
    public final String f86684c;

    public h1r(String str, String str2, String str3) {
        this.f86682a = str;
        this.f86683b = str2;
        this.f86684c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1r)) {
            return false;
        }
        h1r h1rVar = (h1r) obj;
        return wj50.m88271j(this.f86682a, h1rVar.f86682a) && wj50.m88271j(this.f86683b, h1rVar.f86683b) && wj50.m88271j(this.f86684c, h1rVar.f86684c);
    }

    public final int hashCode() {
        return this.f86684c.hashCode() + s571.m77243b(this.f86682a.hashCode() * 31, 31, this.f86683b);
    }
}

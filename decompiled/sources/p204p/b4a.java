package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b4a {

    /* JADX INFO: renamed from: a */
    public final String f23285a;

    /* JADX INFO: renamed from: b */
    public final String f23286b;

    public b4a(String str, String str2) {
        this.f23285a = str;
        this.f23286b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4a)) {
            return false;
        }
        b4a b4aVar = (b4a) obj;
        return wj50.m88271j(this.f23285a, b4aVar.f23285a) && wj50.m88271j(this.f23286b, b4aVar.f23286b);
    }

    public final int hashCode() {
        return this.f23286b.hashCode() + (this.f23285a.hashCode() * 31);
    }
}

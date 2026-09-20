package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b7a implements c7a {

    /* JADX INFO: renamed from: a */
    public final String f24199a;

    /* JADX INFO: renamed from: b */
    public final int f24200b;

    public b7a(String str, int i) {
        this.f24199a = str;
        this.f24200b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7a)) {
            return false;
        }
        b7a b7aVar = (b7a) obj;
        return wj50.m88271j(this.f24199a, b7aVar.f24199a) && this.f24200b == b7aVar.f24200b;
    }

    public final int hashCode() {
        String str = this.f24199a;
        return edb.m38547C(this.f24200b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

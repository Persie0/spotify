package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a7a implements c7a {

    /* JADX INFO: renamed from: a */
    public final String f13000a;

    /* JADX INFO: renamed from: b */
    public final int f13001b;

    public a7a(String str, int i) {
        this.f13000a = str;
        this.f13001b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7a)) {
            return false;
        }
        a7a a7aVar = (a7a) obj;
        return wj50.m88271j(this.f13000a, a7aVar.f13000a) && this.f13001b == a7aVar.f13001b;
    }

    public final int hashCode() {
        String str = this.f13000a;
        return edb.m38547C(this.f13001b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

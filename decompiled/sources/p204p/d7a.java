package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d7a {

    /* JADX INFO: renamed from: a */
    public final String f46050a;

    /* JADX INFO: renamed from: b */
    public final String f46051b;

    /* JADX INFO: renamed from: c */
    public final boolean f46052c;

    public d7a(String str, String str2, boolean z) {
        this.f46050a = str;
        this.f46051b = str2;
        this.f46052c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7a)) {
            return false;
        }
        d7a d7aVar = (d7a) obj;
        return wj50.m88271j(this.f46050a, d7aVar.f46050a) && wj50.m88271j(this.f46051b, d7aVar.f46051b) && this.f46052c == d7aVar.f46052c;
    }

    public final int hashCode() {
        int iHashCode = this.f46050a.hashCode() * 31;
        String str = this.f46051b;
        return Boolean.hashCode(this.f46052c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ d7a() {
        this("", null, false);
    }
}

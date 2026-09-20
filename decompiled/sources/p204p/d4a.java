package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d4a implements g4a {

    /* JADX INFO: renamed from: a */
    public final String f45119a;

    /* JADX INFO: renamed from: b */
    public final String f45120b;

    public d4a(String str, String str2) {
        this.f45119a = str;
        this.f45120b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4a)) {
            return false;
        }
        d4a d4aVar = (d4a) obj;
        return wj50.m88271j(this.f45119a, d4aVar.f45119a) && wj50.m88271j(this.f45120b, d4aVar.f45120b);
    }

    public final int hashCode() {
        int iHashCode = this.f45119a.hashCode() * 31;
        String str = this.f45120b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

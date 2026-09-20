package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kjt implements xmt {

    /* JADX INFO: renamed from: a */
    public final String f123422a;

    /* JADX INFO: renamed from: b */
    public final String f123423b;

    public kjt(String str, String str2) {
        this.f123422a = str;
        this.f123423b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjt)) {
            return false;
        }
        kjt kjtVar = (kjt) obj;
        if (!wj50.m88271j(this.f123422a, kjtVar.f123422a)) {
            return false;
        }
        String str = kjtVar.f123423b;
        wp6 wp6Var = ahn0.f15723b;
        return wj50.m88271j(this.f123423b, str);
    }

    public final int hashCode() {
        int iHashCode = this.f123422a.hashCode() * 31;
        wp6 wp6Var = ahn0.f15723b;
        return Long.hashCode(20000L) + s571.m77243b(iHashCode, 31, this.f123423b);
    }
}

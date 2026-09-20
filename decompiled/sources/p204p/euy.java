package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class euy {

    /* JADX INFO: renamed from: a */
    public final String f63108a;

    /* JADX INFO: renamed from: b */
    public final String f63109b;

    public euy(String str, String str2) {
        this.f63108a = str;
        this.f63109b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euy)) {
            return false;
        }
        euy euyVar = (euy) obj;
        return wj50.m88271j(this.f63108a, euyVar.f63108a) && wj50.m88271j(this.f63109b, euyVar.f63109b);
    }

    public final int hashCode() {
        return this.f63109b.hashCode() + (this.f63108a.hashCode() * 31);
    }
}

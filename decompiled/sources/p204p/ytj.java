package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ytj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f276128a;

    /* JADX INFO: renamed from: b */
    public final String f276129b;

    /* JADX INFO: renamed from: c */
    public final String f276130c;

    public ytj(String str, String str2, String str3) {
        this.f276128a = str;
        this.f276129b = str2;
        this.f276130c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytj)) {
            return false;
        }
        ytj ytjVar = (ytj) obj;
        return wj50.m88271j(this.f276128a, ytjVar.f276128a) && wj50.m88271j(this.f276129b, ytjVar.f276129b) && wj50.m88271j(this.f276130c, ytjVar.f276130c);
    }

    public final int hashCode() {
        int iHashCode = this.f276128a.hashCode() * 31;
        String str = this.f276129b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276130c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

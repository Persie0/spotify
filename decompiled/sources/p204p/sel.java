package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sel implements ffl {

    /* JADX INFO: renamed from: a */
    public final String f208320a;

    /* JADX INFO: renamed from: b */
    public final String f208321b;

    /* JADX INFO: renamed from: c */
    public final Integer f208322c;

    public sel(Integer num, String str, String str2) {
        this.f208320a = str;
        this.f208321b = str2;
        this.f208322c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sel)) {
            return false;
        }
        sel selVar = (sel) obj;
        return wj50.m88271j(this.f208320a, selVar.f208320a) && wj50.m88271j(this.f208321b, selVar.f208321b) && wj50.m88271j(this.f208322c, selVar.f208322c);
    }

    public final int hashCode() {
        String str = this.f208320a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f208321b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f208322c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}

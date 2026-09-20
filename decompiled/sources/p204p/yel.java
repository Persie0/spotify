package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yel implements ffl {

    /* JADX INFO: renamed from: a */
    public final String f272006a;

    /* JADX INFO: renamed from: b */
    public final Integer f272007b;

    public yel(Integer num, String str) {
        this.f272006a = str;
        this.f272007b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yel)) {
            return false;
        }
        yel yelVar = (yel) obj;
        return wj50.m88271j(this.f272006a, yelVar.f272006a) && wj50.m88271j(this.f272007b, yelVar.f272007b);
    }

    public final int hashCode() {
        String str = this.f272006a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f272007b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}

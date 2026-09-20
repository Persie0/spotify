package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f202560a;

    /* JADX INFO: renamed from: b */
    public final String f202561b;

    /* JADX INFO: renamed from: c */
    public final boolean f202562c;

    public rtc0(String str, String str2, boolean z) {
        this.f202560a = str;
        this.f202561b = str2;
        this.f202562c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtc0)) {
            return false;
        }
        rtc0 rtc0Var = (rtc0) obj;
        return wj50.m88271j(this.f202560a, rtc0Var.f202560a) && wj50.m88271j(this.f202561b, rtc0Var.f202561b) && this.f202562c == rtc0Var.f202562c;
    }

    public final int hashCode() {
        int iHashCode = this.f202560a.hashCode() * 31;
        String str = this.f202561b;
        return Boolean.hashCode(this.f202562c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}

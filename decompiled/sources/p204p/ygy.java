package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ygy {

    /* JADX INFO: renamed from: a */
    public final String f272690a;

    /* JADX INFO: renamed from: b */
    public final String f272691b;

    /* JADX INFO: renamed from: c */
    public final boolean f272692c;

    /* JADX INFO: renamed from: d */
    public final Long f272693d;

    public ygy(Long l, String str, String str2, boolean z) {
        this.f272690a = str;
        this.f272691b = str2;
        this.f272692c = z;
        this.f272693d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygy)) {
            return false;
        }
        ygy ygyVar = (ygy) obj;
        return wj50.m88271j(this.f272690a, ygyVar.f272690a) && wj50.m88271j(this.f272691b, ygyVar.f272691b) && this.f272692c == ygyVar.f272692c && wj50.m88271j(this.f272693d, ygyVar.f272693d);
    }

    public final int hashCode() {
        int iHashCode = this.f272690a.hashCode() * 31;
        String str = this.f272691b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f272692c);
        Long l = this.f272693d;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}

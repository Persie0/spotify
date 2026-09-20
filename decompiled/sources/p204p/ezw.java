package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ezw implements s2x {

    /* JADX INFO: renamed from: a */
    public final String f64480a;

    /* JADX INFO: renamed from: b */
    public final boolean f64481b;

    /* JADX INFO: renamed from: c */
    public final boolean f64482c;

    /* JADX INFO: renamed from: d */
    public final String f64483d;

    public ezw(String str, boolean z, String str2, boolean z2) {
        this.f64480a = str;
        this.f64481b = z;
        this.f64482c = z2;
        this.f64483d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezw)) {
            return false;
        }
        ezw ezwVar = (ezw) obj;
        return wj50.m88271j(this.f64480a, ezwVar.f64480a) && this.f64481b == ezwVar.f64481b && this.f64482c == ezwVar.f64482c && wj50.m88271j(this.f64483d, ezwVar.f64483d);
    }

    public final int hashCode() {
        String str = this.f64480a;
        int iM77245d = s571.m77245d(s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f64481b), 31, this.f64482c);
        String str2 = this.f64483d;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}

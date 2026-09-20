package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class tzc0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f225212a;

    /* JADX INFO: renamed from: b */
    public final String f225213b;

    /* JADX INFO: renamed from: c */
    public final boolean f225214c;

    /* JADX INFO: renamed from: d */
    public final String f225215d;

    /* JADX INFO: renamed from: e */
    public final String f225216e;

    /* JADX INFO: renamed from: f */
    public final Map f225217f;

    public tzc0(qf40 qf40Var, String str, boolean z, String str2, String str3, Map map) {
        this.f225212a = qf40Var;
        this.f225213b = str;
        this.f225214c = z;
        this.f225215d = str2;
        this.f225216e = str3;
        this.f225217f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzc0)) {
            return false;
        }
        tzc0 tzc0Var = (tzc0) obj;
        return wj50.m88271j(this.f225212a, tzc0Var.f225212a) && wj50.m88271j(this.f225213b, tzc0Var.f225213b) && this.f225214c == tzc0Var.f225214c && wj50.m88271j(this.f225215d, tzc0Var.f225215d) && wj50.m88271j(this.f225216e, tzc0Var.f225216e) && wj50.m88271j(this.f225217f, tzc0Var.f225217f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f225212a.hashCode() * 31, 31, this.f225213b), 31, this.f225214c);
        String str = this.f225215d;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225216e;
        return this.f225217f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

package p204p;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class vpk {

    /* JADX INFO: renamed from: k */
    public static final Pattern f243707k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f243708l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f243709m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n */
    public static final Pattern f243710n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f243711a;

    /* JADX INFO: renamed from: b */
    public final String f243712b;

    /* JADX INFO: renamed from: c */
    public final long f243713c;

    /* JADX INFO: renamed from: d */
    public final String f243714d;

    /* JADX INFO: renamed from: e */
    public final String f243715e;

    /* JADX INFO: renamed from: f */
    public final boolean f243716f;

    /* JADX INFO: renamed from: g */
    public final boolean f243717g;

    /* JADX INFO: renamed from: h */
    public final boolean f243718h;

    /* JADX INFO: renamed from: i */
    public final boolean f243719i;

    /* JADX INFO: renamed from: j */
    public final String f243720j;

    public vpk(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f243711a = str;
        this.f243712b = str2;
        this.f243713c = j;
        this.f243714d = str3;
        this.f243715e = str4;
        this.f243716f = z;
        this.f243717g = z2;
        this.f243718h = z3;
        this.f243719i = z4;
        this.f243720j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vpk)) {
            return false;
        }
        vpk vpkVar = (vpk) obj;
        return wj50.m88271j(vpkVar.f243711a, this.f243711a) && wj50.m88271j(vpkVar.f243712b, this.f243712b) && vpkVar.f243713c == this.f243713c && wj50.m88271j(vpkVar.f243714d, this.f243714d) && wj50.m88271j(vpkVar.f243715e, this.f243715e) && vpkVar.f243716f == this.f243716f && vpkVar.f243717g == this.f243717g && vpkVar.f243718h == this.f243718h && vpkVar.f243719i == this.f243719i && wj50.m88271j(vpkVar.f243720j, this.f243720j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(dq60.m36605e(s571.m77243b(s571.m77243b(527, 31, this.f243711a), 31, this.f243712b), this.f243713c, 31), 31, this.f243714d), 31, this.f243715e), 31, this.f243716f), 31, this.f243717g), 31, this.f243718h), 31, this.f243719i);
        String str = this.f243720j;
        return iM77245d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f243711a);
        sb.append('=');
        sb.append(this.f243712b);
        if (this.f243718h) {
            long j = this.f243713c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) rlo.f200345a.get()).format(new Date(j)));
            }
        }
        if (!this.f243719i) {
            sb.append("; domain=");
            sb.append(this.f243714d);
        }
        sb.append("; path=");
        sb.append(this.f243715e);
        if (this.f243716f) {
            sb.append("; secure");
        }
        if (this.f243717g) {
            sb.append("; httponly");
        }
        String str = this.f243720j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}

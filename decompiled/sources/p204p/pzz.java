package p204p;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pzz {

    /* JADX INFO: renamed from: a */
    public final String f183860a;

    /* JADX INFO: renamed from: b */
    public final String f183861b;

    /* JADX INFO: renamed from: c */
    public final String f183862c;

    /* JADX INFO: renamed from: d */
    public final List f183863d;

    /* JADX INFO: renamed from: e */
    public final String f183864e;

    /* JADX INFO: renamed from: f */
    public final String f183865f;

    /* JADX INFO: renamed from: g */
    public final String f183866g;

    public pzz(String str, String str2, String str3, String str4, List list, String str5) {
        str.getClass();
        this.f183860a = str;
        str2.getClass();
        this.f183861b = str2;
        this.f183862c = str3;
        list.getClass();
        this.f183863d = list;
        this.f183864e = str4;
        this.f183865f = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.f183866g = klh.m56837i(sb, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f183860a + ", mProviderPackage: " + this.f183861b + ", mQuery: " + this.f183862c + ", mSystemFont: " + this.f183864e + ", mVariationSettings: " + this.f183865f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f183863d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}

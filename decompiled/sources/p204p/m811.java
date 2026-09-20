package p204p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m811 {

    /* JADX INFO: renamed from: a */
    public final Uri f140895a;

    /* JADX INFO: renamed from: b */
    public final Integer f140896b;

    /* JADX INFO: renamed from: c */
    public final Integer f140897c;

    /* JADX INFO: renamed from: d */
    public final String f140898d;

    /* JADX INFO: renamed from: e */
    public final String f140899e;

    /* JADX INFO: renamed from: f */
    public final boolean f140900f;

    /* JADX INFO: renamed from: g */
    public final List f140901g;

    public m811(Uri uri, Integer num, Integer num2, String str, String str2, boolean z, List list) {
        this.f140895a = uri;
        this.f140896b = num;
        this.f140897c = num2;
        this.f140898d = str;
        this.f140899e = str2;
        this.f140900f = z;
        this.f140901g = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m61105a() {
        String str = this.f140899e;
        String str2 = this.f140898d;
        if (str2 == null || str == null) {
            return str2 != null ? str2 : str;
        }
        return klh.m56834f(str2, "\n", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m811)) {
            return false;
        }
        m811 m811Var = (m811) obj;
        return wj50.m88271j(this.f140895a, m811Var.f140895a) && wj50.m88271j(this.f140896b, m811Var.f140896b) && wj50.m88271j(this.f140897c, m811Var.f140897c) && wj50.m88271j(this.f140898d, m811Var.f140898d) && wj50.m88271j(this.f140899e, m811Var.f140899e) && this.f140900f == m811Var.f140900f && wj50.m88271j(this.f140901g, m811Var.f140901g);
    }

    public final int hashCode() {
        int iHashCode = this.f140895a.hashCode() * 31;
        Integer num = this.f140896b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f140897c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f140898d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f140899e;
        return this.f140901g.hashCode() + s571.m77245d((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f140900f);
    }
}

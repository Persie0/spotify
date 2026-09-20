package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public final class hmo {

    /* JADX INFO: renamed from: a */
    public final String f93005a;

    /* JADX INFO: renamed from: b */
    public final Date f93006b;

    /* JADX INFO: renamed from: c */
    public final boolean f93007c;

    public hmo(String str, Date date, boolean z) {
        this.f93005a = str;
        this.f93006b = date;
        this.f93007c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmo)) {
            return false;
        }
        hmo hmoVar = (hmo) obj;
        return wj50.m88271j(this.f93005a, hmoVar.f93005a) && wj50.m88271j(this.f93006b, hmoVar.f93006b) && this.f93007c == hmoVar.f93007c;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(edb.m38547C(2) * 31, 31, this.f93005a);
        Date date = this.f93006b;
        return Boolean.hashCode(this.f93007c) + ((iM77243b + (date == null ? 0 : date.hashCode())) * 31);
    }
}

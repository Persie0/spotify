package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pi01 {

    /* JADX INFO: renamed from: a */
    public final String f177805a;

    /* JADX INFO: renamed from: b */
    public final String f177806b;

    /* JADX INFO: renamed from: c */
    public final long f177807c;

    /* JADX INFO: renamed from: d */
    public final pla1 f177808d;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public pi01(String str, String str2, long j, pla1 pla1Var) {
        this.f177805a = str;
        this.f177806b = str2;
        this.f177807c = j;
        this.f177808d = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi01)) {
            return false;
        }
        pi01 pi01Var = (pi01) obj;
        return wj50.m88271j(this.f177805a, pi01Var.f177805a) && wj50.m88271j(this.f177806b, pi01Var.f177806b) && this.f177807c == pi01Var.f177807c && wj50.m88271j(this.f177808d, pi01Var.f177808d);
    }

    public final int hashCode() {
        return this.f177808d.hashCode() + dq60.m36605e(s571.m77243b(this.f177805a.hashCode() * 31, 31, this.f177806b), this.f177807c, 31);
    }
}

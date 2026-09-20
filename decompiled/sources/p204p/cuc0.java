package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class cuc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final Uri f42087a;

    /* JADX INFO: renamed from: b */
    public final String f42088b;

    /* JADX INFO: renamed from: c */
    public final qf40 f42089c;

    /* JADX INFO: renamed from: d */
    public final String f42090d;

    public cuc0(Uri uri, String str, qf40 qf40Var, String str2) {
        this.f42087a = uri;
        this.f42088b = str;
        this.f42089c = qf40Var;
        this.f42090d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuc0)) {
            return false;
        }
        cuc0 cuc0Var = (cuc0) obj;
        return wj50.m88271j(this.f42087a, cuc0Var.f42087a) && wj50.m88271j(this.f42088b, cuc0Var.f42088b) && wj50.m88271j(this.f42089c, cuc0Var.f42089c) && wj50.m88271j(this.f42090d, cuc0Var.f42090d);
    }

    public final int hashCode() {
        int iM42461e = fr0.m42461e(this.f42089c, s571.m77243b(this.f42087a.hashCode() * 31, 31, this.f42088b), 31);
        String str = this.f42090d;
        return iM42461e + (str == null ? 0 : str.hashCode());
    }
}

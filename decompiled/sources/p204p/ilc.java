package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class ilc {

    /* JADX INFO: renamed from: a */
    public final Uri f103351a;

    /* JADX INFO: renamed from: b */
    public final String f103352b;

    /* JADX INFO: renamed from: c */
    public final boolean f103353c;

    /* JADX INFO: renamed from: d */
    public final boolean f103354d;

    public ilc(Uri uri, String str, boolean z, boolean z2) {
        this.f103351a = uri;
        this.f103352b = str;
        this.f103353c = z;
        this.f103354d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilc)) {
            return false;
        }
        ilc ilcVar = (ilc) obj;
        return wj50.m88271j(this.f103351a, ilcVar.f103351a) && wj50.m88271j(this.f103352b, ilcVar.f103352b) && this.f103353c == ilcVar.f103353c && this.f103354d == ilcVar.f103354d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103354d) + s571.m77245d(s571.m77245d(s571.m77243b(this.f103351a.hashCode() * 31, 31, this.f103352b), 31, this.f103353c), 31, true);
    }
}

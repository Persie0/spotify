package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class vrb1 {

    /* JADX INFO: renamed from: a */
    public final String f244151a;

    /* JADX INFO: renamed from: b */
    public final Uri f244152b;

    /* JADX INFO: renamed from: c */
    public final long f244153c;

    public vrb1(String str, Uri uri, long j) {
        this.f244151a = str;
        this.f244152b = uri;
        this.f244153c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrb1)) {
            return false;
        }
        vrb1 vrb1Var = (vrb1) obj;
        return this.f244151a.equals(vrb1Var.f244151a) && this.f244152b.equals(vrb1Var.f244152b) && this.f244153c == vrb1Var.f244153c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dq60.m36605e(nap.m64019l(this.f244152b, this.f244151a.hashCode() * 31, 31), this.f244153c, 31);
    }
}

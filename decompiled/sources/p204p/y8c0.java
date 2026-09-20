package p204p;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class y8c0 {

    /* JADX INFO: renamed from: a */
    public final int f270269a;

    /* JADX INFO: renamed from: b */
    public final String f270270b;

    /* JADX INFO: renamed from: c */
    public final String f270271c;

    /* JADX INFO: renamed from: d */
    public final int f270272d;

    /* JADX INFO: renamed from: e */
    public final Uri f270273e;

    /* JADX INFO: renamed from: f */
    public final long f270274f;

    public y8c0(int i, String str, String str2, int i2, Uri uri, long j) {
        this.f270269a = i;
        this.f270270b = str;
        this.f270271c = str2;
        this.f270272d = i2;
        this.f270273e = uri;
        this.f270274f = j;
    }

    /* JADX INFO: renamed from: a */
    public final String m93120a() {
        voc1 voc1VarM83614b;
        int iM38547C = edb.m38547C(this.f270272d);
        String str = this.f270270b;
        if (iM38547C == 0 || iM38547C == 1 || iM38547C == 2) {
            voc1VarM83614b = xoc1.f263938M3.m83614b("spotify:internal:managed-account-details:child:".concat(str));
        } else if (iM38547C != 3) {
            if (iM38547C != 4) {
                throw new NoWhenBranchMatchedException();
            }
            voc1VarM83614b = xoc1.f263938M3.m83614b("spotify:internal:managed-account-details:child:".concat(str));
        } else {
            voc1VarM83614b = xoc1.f263946N3.m83614b("spotify:internal:managed-account-details:teen:".concat(str));
        }
        return voc1VarM83614b.f243453a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8c0)) {
            return false;
        }
        y8c0 y8c0Var = (y8c0) obj;
        if (this.f270269a != y8c0Var.f270269a || !this.f270270b.equals(y8c0Var.f270270b) || !this.f270271c.equals(y8c0Var.f270271c) || this.f270272d != y8c0Var.f270272d || !this.f270273e.equals(y8c0Var.f270273e)) {
            return false;
        }
        long j = y8c0Var.f270274f;
        int i = n6f.f150872l;
        return as91.m27074b(this.f270274f, j);
    }

    public final int hashCode() {
        int iM64019l = nap.m64019l(this.f270273e, f710.m40938f(this.f270272d, s571.m77243b(s571.m77243b(Integer.hashCode(this.f270269a) * 31, 31, this.f270270b), 31, this.f270271c), 31), 31);
        int i = n6f.f150872l;
        return Long.hashCode(this.f270274f) + iM64019l;
    }
}

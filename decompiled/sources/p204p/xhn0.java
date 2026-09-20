package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xhn0 {

    /* JADX INFO: renamed from: a */
    public final String f261678a;

    /* JADX INFO: renamed from: b */
    public final byte[] f261679b;

    /* JADX INFO: renamed from: c */
    public final String f261680c;

    /* JADX INFO: renamed from: d */
    public final boolean f261681d;

    /* JADX INFO: renamed from: e */
    public final long f261682e;

    public xhn0(String str, byte[] bArr, String str2, boolean z, long j) {
        this.f261678a = str;
        this.f261679b = bArr;
        this.f261680c = str2;
        this.f261681d = z;
        this.f261682e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (xhn0.class.equals(obj != null ? obj.getClass() : null)) {
            xhn0 xhn0Var = (xhn0) obj;
            if (wj50.m88271j(this.f261678a, xhn0Var.f261678a) && Arrays.equals(this.f261679b, xhn0Var.f261679b) && bm51.m29797h0(this.f261680c, xhn0Var.f261680c, false) && this.f261681d == xhn0Var.f261681d && this.f261682e == xhn0Var.f261682e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM80647e = tfe.m80647e(this.f261678a.hashCode() * 31, this.f261679b, 31);
        String str = this.f261680c;
        return Long.hashCode(this.f261682e) + s571.m77245d((iM80647e + (str != null ? str.hashCode() : 0)) * 31, 31, this.f261681d);
    }
}

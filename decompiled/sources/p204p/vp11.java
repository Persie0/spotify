package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class vp11 {

    /* JADX INFO: renamed from: a */
    public final String f243567a;

    /* JADX INFO: renamed from: b */
    public final String f243568b;

    /* JADX INFO: renamed from: c */
    public final Uri f243569c;

    /* JADX INFO: renamed from: d */
    public final Integer f243570d;

    /* JADX INFO: renamed from: e */
    public final boolean f243571e;

    public vp11(String str, String str2, Uri uri, Integer num, boolean z) {
        this.f243567a = str;
        this.f243568b = str2;
        this.f243569c = uri;
        this.f243570d = num;
        this.f243571e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp11)) {
            return false;
        }
        vp11 vp11Var = (vp11) obj;
        return wj50.m88271j(this.f243567a, vp11Var.f243567a) && wj50.m88271j(this.f243568b, vp11Var.f243568b) && wj50.m88271j(this.f243569c, vp11Var.f243569c) && wj50.m88271j(this.f243570d, vp11Var.f243570d) && this.f243571e == vp11Var.f243571e;
    }

    public final int hashCode() {
        int iM64019l = nap.m64019l(this.f243569c, s571.m77243b(this.f243567a.hashCode() * 31, 31, this.f243568b), 31);
        Integer num = this.f243570d;
        return Boolean.hashCode(this.f243571e) + ((iM64019l + (num == null ? 0 : num.hashCode())) * 31);
    }
}

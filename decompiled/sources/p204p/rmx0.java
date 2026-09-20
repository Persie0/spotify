package p204p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class rmx0 {

    /* JADX INFO: renamed from: r */
    public static final rmx0 f200634r = new rmx0("", "", null, null, 0, false, 0, 0, 0, 0, null, null, false, false);

    /* JADX INFO: renamed from: a */
    public final String f200635a;

    /* JADX INFO: renamed from: b */
    public final String f200636b;

    /* JADX INFO: renamed from: c */
    public final String f200637c;

    /* JADX INFO: renamed from: d */
    public final Uri f200638d;

    /* JADX INFO: renamed from: e */
    public final int f200639e;

    /* JADX INFO: renamed from: f */
    public final boolean f200640f;

    /* JADX INFO: renamed from: g */
    public final int f200641g;

    /* JADX INFO: renamed from: h */
    public final int f200642h;

    /* JADX INFO: renamed from: i */
    public final int f200643i;

    /* JADX INFO: renamed from: j */
    public final int f200644j;

    /* JADX INFO: renamed from: k */
    public final Bundle f200645k;

    /* JADX INFO: renamed from: l */
    public final wmd0 f200646l;

    /* JADX INFO: renamed from: m */
    public final boolean f200647m;

    /* JADX INFO: renamed from: n */
    public final boolean f200648n;

    /* JADX INFO: renamed from: o */
    public final wg61 f200649o = new wg61(new qmx0(this, 1));

    /* JADX INFO: renamed from: p */
    public final wg61 f200650p = new wg61(new nzk0(this, 24));

    /* JADX INFO: renamed from: q */
    public final wg61 f200651q = new wg61(new qmx0(this, 0));

    public rmx0(String str, String str2, String str3, Uri uri, int i, boolean z, int i2, int i3, int i4, int i5, Bundle bundle, wmd0 wmd0Var, boolean z2, boolean z3) {
        this.f200635a = str;
        this.f200636b = str2;
        this.f200637c = str3;
        this.f200638d = uri;
        this.f200639e = i;
        this.f200640f = z;
        this.f200641g = i2;
        this.f200642h = i3;
        this.f200643i = i4;
        this.f200644j = i5;
        this.f200645k = bundle;
        this.f200646l = wmd0Var;
        this.f200647m = z2;
        this.f200648n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmx0)) {
            return false;
        }
        rmx0 rmx0Var = (rmx0) obj;
        return wj50.m88271j(this.f200635a, rmx0Var.f200635a) && wj50.m88271j(this.f200636b, rmx0Var.f200636b) && wj50.m88271j(this.f200637c, rmx0Var.f200637c) && wj50.m88271j(this.f200638d, rmx0Var.f200638d) && this.f200639e == rmx0Var.f200639e && this.f200640f == rmx0Var.f200640f && this.f200641g == rmx0Var.f200641g && this.f200642h == rmx0Var.f200642h && this.f200643i == rmx0Var.f200643i && this.f200644j == rmx0Var.f200644j && wj50.m88271j(this.f200645k, rmx0Var.f200645k) && wj50.m88271j(this.f200646l, rmx0Var.f200646l) && this.f200647m == rmx0Var.f200647m && this.f200648n == rmx0Var.f200648n;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f200635a.hashCode() * 31, 31, this.f200636b);
        String str = this.f200637c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f200638d;
        int iM62800g = mt60.m62800g(this.f200644j, mt60.m62800g(this.f200643i, mt60.m62800g(this.f200642h, mt60.m62800g(this.f200641g, s571.m77245d(mt60.m62800g(this.f200639e, (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.f200640f), 31), 31), 31), 31);
        Bundle bundle = this.f200645k;
        int iHashCode2 = (iM62800g + (bundle == null ? 0 : bundle.hashCode())) * 31;
        wmd0 wmd0Var = this.f200646l;
        return Boolean.hashCode(this.f200648n) + s571.m77245d((iHashCode2 + (wmd0Var != null ? wmd0Var.hashCode() : 0)) * 31, 31, this.f200647m);
    }
}

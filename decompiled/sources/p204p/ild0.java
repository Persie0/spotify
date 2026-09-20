package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ild0 {

    /* JADX INFO: renamed from: a */
    public final String f103357a;

    /* JADX INFO: renamed from: b */
    public final String f103358b;

    /* JADX INFO: renamed from: c */
    public final List f103359c;

    /* JADX INFO: renamed from: d */
    public final int f103360d;

    /* JADX INFO: renamed from: e */
    public final boolean f103361e;

    /* JADX INFO: renamed from: f */
    public final Uri f103362f;

    /* JADX INFO: renamed from: g */
    public final String f103363g;

    /* JADX INFO: renamed from: h */
    public final int f103364h;

    /* JADX INFO: renamed from: i */
    public final String f103365i;

    /* JADX INFO: renamed from: j */
    public final int f103366j;

    /* JADX INFO: renamed from: k */
    public final int f103367k;

    /* JADX INFO: renamed from: l */
    public final int f103368l;

    /* JADX INFO: renamed from: m */
    public final Set f103369m;

    /* JADX INFO: renamed from: n */
    public final Bundle f103370n;

    public ild0(String str, String str2, List list, int i, boolean z, Uri uri, String str3, int i2, String str4, int i3, int i4, int i5, Set set, Bundle bundle) {
        this.f103357a = str;
        this.f103358b = str2;
        this.f103359c = list;
        this.f103360d = i;
        this.f103361e = z;
        this.f103362f = uri;
        this.f103363g = str3;
        this.f103364h = i2;
        this.f103365i = str4;
        this.f103366j = i3;
        this.f103367k = i4;
        this.f103368l = i5;
        this.f103369m = set;
        this.f103370n = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ild0)) {
            return false;
        }
        ild0 ild0Var = (ild0) obj;
        return wj50.m88271j(this.f103357a, ild0Var.f103357a) && wj50.m88271j(this.f103358b, ild0Var.f103358b) && wj50.m88271j(this.f103359c, ild0Var.f103359c) && this.f103360d == ild0Var.f103360d && this.f103361e == ild0Var.f103361e && wj50.m88271j(this.f103362f, ild0Var.f103362f) && wj50.m88271j(this.f103363g, ild0Var.f103363g) && this.f103364h == ild0Var.f103364h && wj50.m88271j(this.f103365i, ild0Var.f103365i) && this.f103366j == ild0Var.f103366j && this.f103367k == ild0Var.f103367k && this.f103368l == ild0Var.f103368l && wj50.m88271j(this.f103369m, ild0Var.f103369m) && wj50.m88271j(this.f103370n, ild0Var.f103370n);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f103360d, s571.m77244c(s571.m77243b(this.f103357a.hashCode() * 31, 31, this.f103358b), 31, this.f103359c), 31), 31, this.f103361e);
        Uri uri = this.f103362f;
        int iHashCode = (iM77245d + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f103363g;
        int iM62800g = mt60.m62800g(this.f103364h, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f103365i;
        int iM56830b = klh.m56830b(mt60.m62800g(this.f103368l, mt60.m62800g(this.f103367k, mt60.m62800g(this.f103366j, (iM62800g + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31, this.f103369m);
        Bundle bundle = this.f103370n;
        return iM56830b + (bundle != null ? bundle.hashCode() : 0);
    }
}

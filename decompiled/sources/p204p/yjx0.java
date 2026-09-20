package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class yjx0 {

    /* JADX INFO: renamed from: a */
    public final String f273492a;

    /* JADX INFO: renamed from: b */
    public final String f273493b;

    /* JADX INFO: renamed from: c */
    public final String f273494c;

    /* JADX INFO: renamed from: d */
    public final boolean f273495d;

    /* JADX INFO: renamed from: e */
    public final boolean f273496e;

    /* JADX INFO: renamed from: f */
    public final boolean f273497f;

    /* JADX INFO: renamed from: g */
    public final hg40 f273498g;

    /* JADX INFO: renamed from: h */
    public final Bundle f273499h;

    public /* synthetic */ yjx0(String str, String str2, String str3, boolean z, boolean z2, hg40 hg40Var, Bundle bundle, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : hg40Var, (i & 128) != 0 ? null : bundle);
    }

    /* JADX INFO: renamed from: a */
    public static yjx0 m93942a(yjx0 yjx0Var, String str, hg40 hg40Var, int i) {
        if ((i & 1) != 0) {
            str = yjx0Var.f273492a;
        }
        String str2 = str;
        String str3 = yjx0Var.f273493b;
        String str4 = yjx0Var.f273494c;
        boolean z = yjx0Var.f273495d;
        boolean z2 = yjx0Var.f273496e;
        boolean z3 = yjx0Var.f273497f;
        if ((i & 64) != 0) {
            hg40Var = yjx0Var.f273498g;
        }
        Bundle bundle = yjx0Var.f273499h;
        yjx0Var.getClass();
        return new yjx0(str2, str3, str4, z, z2, z3, hg40Var, bundle);
    }

    /* JADX INFO: renamed from: b */
    public final String m93943b() {
        return this.f273493b;
    }

    /* JADX INFO: renamed from: c */
    public final String m93944c() {
        return this.f273492a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m93945d() {
        return this.f273496e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjx0)) {
            return false;
        }
        yjx0 yjx0Var = (yjx0) obj;
        return wj50.m88271j(this.f273492a, yjx0Var.f273492a) && wj50.m88271j(this.f273493b, yjx0Var.f273493b) && wj50.m88271j(this.f273494c, yjx0Var.f273494c) && this.f273495d == yjx0Var.f273495d && this.f273496e == yjx0Var.f273496e && this.f273497f == yjx0Var.f273497f && wj50.m88271j(this.f273498g, yjx0Var.f273498g) && wj50.m88271j(this.f273499h, yjx0Var.f273499h);
    }

    public final int hashCode() {
        String str = this.f273492a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273493b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f273494c;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f273495d), 31, this.f273496e), 31, this.f273497f);
        hg40 hg40Var = this.f273498g;
        int iHashCode3 = (iM77245d + (hg40Var == null ? 0 : hg40Var.hashCode())) * 31;
        Bundle bundle = this.f273499h;
        return iHashCode3 + (bundle != null ? bundle.hashCode() : 0);
    }

    public yjx0(String str, String str2, String str3, boolean z, boolean z2, boolean z3, hg40 hg40Var, Bundle bundle) {
        this.f273492a = str;
        this.f273493b = str2;
        this.f273494c = str3;
        this.f273495d = z;
        this.f273496e = z2;
        this.f273497f = z3;
        this.f273498g = hg40Var;
        this.f273499h = bundle;
    }
}

package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zw2 {

    /* JADX INFO: renamed from: a */
    public final String f286882a;

    /* JADX INFO: renamed from: b */
    public final List f286883b;

    /* JADX INFO: renamed from: c */
    public final String f286884c;

    /* JADX INFO: renamed from: d */
    public final String f286885d;

    /* JADX INFO: renamed from: e */
    public final String f286886e;

    /* JADX INFO: renamed from: f */
    public final boolean f286887f;

    /* JADX INFO: renamed from: g */
    public final boolean f286888g;

    /* JADX INFO: renamed from: h */
    public final String f286889h;

    public zw2(String str, List list, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this.f286882a = str;
        this.f286883b = list;
        this.f286884c = str2;
        this.f286885d = str3;
        this.f286886e = str4;
        this.f286887f = z;
        this.f286888g = z2;
        this.f286889h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw2)) {
            return false;
        }
        zw2 zw2Var = (zw2) obj;
        return wj50.m88271j(this.f286882a, zw2Var.f286882a) && wj50.m88271j(this.f286883b, zw2Var.f286883b) && wj50.m88271j(this.f286884c, zw2Var.f286884c) && wj50.m88271j(this.f286885d, zw2Var.f286885d) && wj50.m88271j(this.f286886e, zw2Var.f286886e) && this.f286887f == zw2Var.f286887f && this.f286888g == zw2Var.f286888g && wj50.m88271j(this.f286889h, zw2Var.f286889h);
    }

    public final int hashCode() {
        return this.f286889h.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77244c(this.f286882a.hashCode() * 31, 31, this.f286883b), 31, this.f286884c), 31, this.f286885d), 31, this.f286886e), 31, this.f286887f), 31, this.f286888g);
    }
}

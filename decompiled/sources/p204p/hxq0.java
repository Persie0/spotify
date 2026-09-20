package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class hxq0 {

    /* JADX INFO: renamed from: a */
    public final String f96267a;

    /* JADX INFO: renamed from: b */
    public final List f96268b;

    /* JADX INFO: renamed from: c */
    public final String f96269c;

    /* JADX INFO: renamed from: d */
    public final String f96270d;

    /* JADX INFO: renamed from: e */
    public final boolean f96271e;

    /* JADX INFO: renamed from: f */
    public final boolean f96272f;

    /* JADX INFO: renamed from: g */
    public final boolean f96273g;

    /* JADX INFO: renamed from: h */
    public final boolean f96274h;

    /* JADX INFO: renamed from: i */
    public final boolean f96275i;

    /* JADX INFO: renamed from: j */
    public final boolean f96276j;

    /* JADX INFO: renamed from: k */
    public final boolean f96277k;

    /* JADX INFO: renamed from: l */
    public final PlayabilityRestriction f96278l;

    public hxq0(String str, List list, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, PlayabilityRestriction playabilityRestriction) {
        this.f96267a = str;
        this.f96268b = list;
        this.f96269c = str2;
        this.f96270d = str3;
        this.f96271e = z;
        this.f96272f = z2;
        this.f96273g = z3;
        this.f96274h = z4;
        this.f96275i = z5;
        this.f96276j = z6;
        this.f96277k = z7;
        this.f96278l = playabilityRestriction;
    }

    /* JADX INFO: renamed from: a */
    public static hxq0 m49037a(hxq0 hxq0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PlayabilityRestriction playabilityRestriction, int i) {
        String str = hxq0Var.f96267a;
        List list = hxq0Var.f96268b;
        String str2 = hxq0Var.f96269c;
        String str3 = hxq0Var.f96270d;
        if ((i & 16) != 0) {
            z = hxq0Var.f96271e;
        }
        return new hxq0(str, list, str2, str3, z, (i & 32) != 0 ? hxq0Var.f96272f : z2, (i & 64) != 0 ? hxq0Var.f96273g : z3, (i & 128) != 0 ? hxq0Var.f96274h : z4, (i & 256) != 0 ? hxq0Var.f96275i : z5, (i & 512) != 0 ? hxq0Var.f96276j : z6, hxq0Var.f96277k, (i & 2048) != 0 ? hxq0Var.f96278l : playabilityRestriction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxq0)) {
            return false;
        }
        hxq0 hxq0Var = (hxq0) obj;
        return wj50.m88271j(this.f96267a, hxq0Var.f96267a) && wj50.m88271j(this.f96268b, hxq0Var.f96268b) && wj50.m88271j(this.f96269c, hxq0Var.f96269c) && wj50.m88271j(this.f96270d, hxq0Var.f96270d) && this.f96271e == hxq0Var.f96271e && this.f96272f == hxq0Var.f96272f && this.f96273g == hxq0Var.f96273g && this.f96274h == hxq0Var.f96274h && this.f96275i == hxq0Var.f96275i && this.f96276j == hxq0Var.f96276j && this.f96277k == hxq0Var.f96277k && this.f96278l == hxq0Var.f96278l;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f96267a.hashCode() * 31, 31, this.f96268b);
        String str = this.f96269c;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96270d;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f96271e), 31, this.f96272f), 31, this.f96273g), 31, this.f96274h), 31, this.f96275i), 31, this.f96276j), 31, this.f96277k);
        PlayabilityRestriction playabilityRestriction = this.f96278l;
        return iM77245d + (playabilityRestriction != null ? playabilityRestriction.hashCode() : 0);
    }
}

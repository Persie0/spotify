package p204p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: classes6.dex */
public final class n0y {

    /* JADX INFO: renamed from: a */
    public final UbiSpecificationId f149198a;

    /* JADX INFO: renamed from: b */
    public final String f149199b;

    /* JADX INFO: renamed from: c */
    public final String f149200c;

    /* JADX INFO: renamed from: d */
    public final Integer f149201d;

    public /* synthetic */ n0y(UbiSpecificationId ubiSpecificationId, String str, Integer num, int i) {
        this(ubiSpecificationId, str, (String) null, (i & 8) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: a */
    public final String m63462a() {
        return this.f149200c;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m63463b() {
        return this.f149201d;
    }

    /* JADX INFO: renamed from: c */
    public final UbiSpecificationId m63464c() {
        return this.f149198a;
    }

    /* JADX INFO: renamed from: d */
    public final String m63465d() {
        return this.f149199b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0y)) {
            return false;
        }
        n0y n0yVar = (n0y) obj;
        return this.f149198a == n0yVar.f149198a && wj50.m88271j(this.f149199b, n0yVar.f149199b) && wj50.m88271j(this.f149200c, n0yVar.f149200c) && wj50.m88271j(this.f149201d, n0yVar.f149201d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f149198a.hashCode() * 31, 31, this.f149199b);
        String str = this.f149200c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f149201d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public n0y(UbiSpecificationId ubiSpecificationId, String str, String str2, Integer num) {
        this.f149198a = ubiSpecificationId;
        this.f149199b = str;
        this.f149200c = str2;
        this.f149201d = num;
    }
}

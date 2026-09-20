package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class j721 {
    public static final i721 Companion = new i721();

    /* JADX INFO: renamed from: h */
    public static final fr70[] f109469h = {null, null, null, null, null, null, q3d0.m72078I(2, aa11.f13711O0)};

    /* JADX INFO: renamed from: a */
    public final String f109470a;

    /* JADX INFO: renamed from: b */
    public final String f109471b;

    /* JADX INFO: renamed from: c */
    public final String f109472c;

    /* JADX INFO: renamed from: d */
    public final String f109473d;

    /* JADX INFO: renamed from: e */
    public final String f109474e;

    /* JADX INFO: renamed from: f */
    public final String f109475f;

    /* JADX INFO: renamed from: g */
    public final Map f109476g;

    public /* synthetic */ j721(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        if (31 != (i & 31)) {
            edo.m38617p(i, 31, h721.f88322a.getDescriptor());
            throw null;
        }
        this.f109470a = str;
        this.f109471b = str2;
        this.f109472c = str3;
        this.f109473d = str4;
        this.f109474e = str5;
        if ((i & 32) == 0) {
            this.f109475f = null;
        } else {
            this.f109475f = str6;
        }
        if ((i & 64) == 0) {
            this.f109476g = null;
        } else {
            this.f109476g = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j721)) {
            return false;
        }
        j721 j721Var = (j721) obj;
        return wj50.m88271j(this.f109470a, j721Var.f109470a) && wj50.m88271j(this.f109471b, j721Var.f109471b) && wj50.m88271j(this.f109472c, j721Var.f109472c) && wj50.m88271j(this.f109473d, j721Var.f109473d) && wj50.m88271j(this.f109474e, j721Var.f109474e) && wj50.m88271j(this.f109475f, j721Var.f109475f) && wj50.m88271j(this.f109476g, j721Var.f109476g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f109470a.hashCode() * 31, 31, this.f109471b), 31, this.f109472c), 31, this.f109473d), 31, this.f109474e);
        String str = this.f109475f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f109476g;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public j721(String str, String str2, String str3, String str4, String str5, Map map) {
        this.f109470a = str;
        this.f109471b = str2;
        this.f109472c = str3;
        this.f109473d = "android";
        this.f109474e = str4;
        this.f109475f = str5;
        this.f109476g = map;
    }
}

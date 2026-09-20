package p204p;

import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o640 {

    /* JADX INFO: renamed from: a */
    public final String f162207a;

    /* JADX INFO: renamed from: b */
    public final String f162208b;

    /* JADX INFO: renamed from: c */
    public final String f162209c;

    /* JADX INFO: renamed from: d */
    public final Integer f162210d;

    /* JADX INFO: renamed from: e */
    public final ry8 f162211e;

    /* JADX INFO: renamed from: f */
    public final ry8 f162212f;

    /* JADX INFO: renamed from: g */
    public final ry8 f162213g;

    /* JADX INFO: renamed from: h */
    public final ry8 f162214h;

    /* JADX INFO: renamed from: i */
    public final x76 f162215i;

    /* JADX INFO: renamed from: j */
    public final ry8 f162216j;

    /* JADX INFO: renamed from: k */
    public final List f162217k;

    /* JADX INFO: renamed from: l */
    public final List f162218l;

    /* JADX INFO: renamed from: m */
    public final ry8 f162219m;

    /* JADX INFO: renamed from: n */
    public final boolean f162220n;

    /* JADX INFO: renamed from: o */
    public final boolean f162221o;

    public o640(String str, String str2, String str3, Integer num, ry8 ry8Var, ry8 ry8Var2, ry8 ry8Var3, ry8 ry8Var4, x76 x76Var, ry8 ry8Var5, List list, List list2, ry8 ry8Var6, boolean z, boolean z2, int i) {
        String str4 = (i & 2) != 0 ? null : str2;
        String str5 = (i & 4) != 0 ? null : str3;
        Integer num2 = (i & 8) != 0 ? null : num;
        ry8 ry8Var7 = (i & 32) != 0 ? null : ry8Var;
        ry8 ry8Var8 = (i & 64) != 0 ? null : ry8Var2;
        ry8 ry8Var9 = (i & 128) != 0 ? null : ry8Var3;
        ry8 ry8Var10 = (i & 256) != 0 ? null : ry8Var4;
        x76 x76Var2 = (i & 512) != 0 ? null : x76Var;
        ry8 ry8Var11 = (i & 1024) != 0 ? null : ry8Var5;
        int i2 = i & 2048;
        List list3 = lau.f131415a;
        List list4 = i2 != 0 ? list3 : list;
        list3 = (i & 4096) == 0 ? list2 : list3;
        ry8 ry8Var12 = (i & 8192) == 0 ? ry8Var6 : null;
        boolean z3 = (i & 16384) != 0 ? false : z;
        boolean z4 = (i & 32768) == 0 ? z2 : false;
        this.f162207a = str;
        this.f162208b = str4;
        this.f162209c = str5;
        this.f162210d = num2;
        this.f162211e = ry8Var7;
        this.f162212f = ry8Var8;
        this.f162213g = ry8Var9;
        this.f162214h = ry8Var10;
        this.f162215i = x76Var2;
        this.f162216j = ry8Var11;
        this.f162217k = list4;
        this.f162218l = list3;
        this.f162219m = ry8Var12;
        this.f162220n = z3;
        this.f162221o = z4;
        if (list4.size() > 5) {
            throw new IllegalArgumentException("leadingActionElements cannot have more than 5 elements");
        }
        if (list3.size() > 2) {
            throw new IllegalArgumentException("trailingActionElements cannot have more than 2 elements");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o640)) {
            return false;
        }
        o640 o640Var = (o640) obj;
        return wj50.m88271j(this.f162207a, o640Var.f162207a) && wj50.m88271j(this.f162208b, o640Var.f162208b) && wj50.m88271j(this.f162209c, o640Var.f162209c) && wj50.m88271j(this.f162210d, o640Var.f162210d) && wj50.m88271j(this.f162211e, o640Var.f162211e) && wj50.m88271j(this.f162212f, o640Var.f162212f) && wj50.m88271j(this.f162213g, o640Var.f162213g) && wj50.m88271j(this.f162214h, o640Var.f162214h) && wj50.m88271j(this.f162215i, o640Var.f162215i) && wj50.m88271j(this.f162216j, o640Var.f162216j) && wj50.m88271j(this.f162217k, o640Var.f162217k) && wj50.m88271j(this.f162218l, o640Var.f162218l) && wj50.m88271j(this.f162219m, o640Var.f162219m) && this.f162220n == o640Var.f162220n && this.f162221o == o640Var.f162221o;
    }

    public final int hashCode() {
        int iHashCode = this.f162207a.hashCode() * 31;
        String str = this.f162208b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f162209c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f162210d;
        int iM40938f = f710.m40938f(3, (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31);
        ry8 ry8Var = this.f162211e;
        int iHashCode4 = (iM40938f + (ry8Var == null ? 0 : ry8Var.hashCode())) * 31;
        ry8 ry8Var2 = this.f162212f;
        int iHashCode5 = (iHashCode4 + (ry8Var2 == null ? 0 : ry8Var2.hashCode())) * 31;
        ry8 ry8Var3 = this.f162213g;
        int iHashCode6 = (iHashCode5 + (ry8Var3 == null ? 0 : ry8Var3.hashCode())) * 31;
        ry8 ry8Var4 = this.f162214h;
        int iHashCode7 = (((iHashCode6 + (ry8Var4 == null ? 0 : ry8Var4.hashCode())) * 31) + (this.f162215i == null ? 0 : Integer.hashCode(R.string.artist_badges_artwork_content_description))) * 31;
        ry8 ry8Var5 = this.f162216j;
        int iM77244c = s571.m77244c(s571.m77244c((iHashCode7 + (ry8Var5 == null ? 0 : ry8Var5.hashCode())) * 31, 31, this.f162217k), 31, this.f162218l);
        ry8 ry8Var6 = this.f162219m;
        return Boolean.hashCode(this.f162221o) + s571.m77245d((iM77244c + (ry8Var6 != null ? ry8Var6.hashCode() : 0)) * 31, 31, this.f162220n);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.adsinternal.adscore.model.Format;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 implements Parcelable, gh0 {
    public static final Parcelable.Creator<fh0> CREATOR;

    /* JADX INFO: renamed from: b1 */
    public static final Set f69487b1;

    /* JADX INFO: renamed from: L0 */
    public final boolean f69488L0;

    /* JADX INFO: renamed from: M0 */
    public final List f69489M0;

    /* JADX INFO: renamed from: N0 */
    public final String f69490N0;

    /* JADX INFO: renamed from: O0 */
    public final Map f69491O0;

    /* JADX INFO: renamed from: P0 */
    public final String f69492P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f69493Q0;

    /* JADX INFO: renamed from: R0 */
    public final String f69494R0;

    /* JADX INFO: renamed from: S0 */
    public final String f69495S0;

    /* JADX INFO: renamed from: T0 */
    public final String f69496T0;

    /* JADX INFO: renamed from: U0 */
    public final String f69497U0;

    /* JADX INFO: renamed from: V0 */
    public final Long f69498V0;

    /* JADX INFO: renamed from: W0 */
    public final mv0 f69499W0;

    /* JADX INFO: renamed from: X */
    public final boolean f69500X;

    /* JADX INFO: renamed from: X0 */
    public final boolean f69501X0;

    /* JADX INFO: renamed from: Y */
    public final boolean f69502Y;

    /* JADX INFO: renamed from: Y0 */
    public final Set f69503Y0;

    /* JADX INFO: renamed from: Z */
    public final Format f69504Z;

    /* JADX INFO: renamed from: Z0 */
    public final int f69505Z0;

    /* JADX INFO: renamed from: a */
    public final String f69506a;

    /* JADX INFO: renamed from: a1 */
    public final int f69507a1;

    /* JADX INFO: renamed from: b */
    public final String f69508b;

    /* JADX INFO: renamed from: c */
    public final String f69509c;

    /* JADX INFO: renamed from: d */
    public final String f69510d;

    /* JADX INFO: renamed from: e */
    public final String f69511e;

    /* JADX INFO: renamed from: f */
    public final Map f69512f;

    /* JADX INFO: renamed from: g */
    public final b7d0 f69513g;

    /* JADX INFO: renamed from: h */
    public final String f69514h;

    /* JADX INFO: renamed from: i */
    public final String f69515i;

    /* JADX INFO: renamed from: t */
    public final String f69516t;

    static {
        koq0 koq0Var = new koq0(29);
        CREATOR = new C2267ps(24);
        f69487b1 = s601.m77310m0(qm0.STARTED, qm0.FIRST_QUARTILE, qm0.MIDPOINT, qm0.THIRD_QUARTILE, qm0.ENDED, qm0.UNLOADED, qm0.NONCONTINUOUS_VIEWABILITY, qm0.CONTINUOUS_VIEWABILITY, qm0.IMPRESSION);
        koq0.m57005c(koq0Var, null, null, null, null, null, null, null, null, null, null, 524287);
    }

    public fh0(String str, String str2, String str3, String str4, String str5, int i, Map map, b7d0 b7d0Var, String str6, String str7, String str8, boolean z, boolean z2, Format format, boolean z3, List list, String str9, Map map2, int i2) {
        this.f69506a = str;
        this.f69508b = str2;
        this.f69509c = str3;
        this.f69510d = str4;
        this.f69511e = str5;
        this.f69505Z0 = i;
        this.f69512f = map;
        this.f69513g = b7d0Var;
        this.f69514h = str6;
        this.f69515i = str7;
        this.f69516t = str8;
        this.f69500X = z;
        this.f69502Y = z2;
        this.f69504Z = format;
        this.f69488L0 = z3;
        this.f69489M0 = list;
        this.f69490N0 = str9;
        this.f69491O0 = map2;
        this.f69507a1 = i2;
        this.f69492P0 = (String) map.get("buttonMessage");
        zqg1.m96742q((String) map.get("video_orientation"));
        this.f69493Q0 = (String) map.get("tagline");
        this.f69494R0 = (String) map.get("secondaryTag");
        this.f69495S0 = (String) map.get("logoImage");
        this.f69496T0 = (String) map.get("displayImage");
        String str10 = (String) map.get("product_name");
        this.f69497U0 = str10 == null ? "" : str10;
        String str11 = (String) map.get("viewable_threshold_ms");
        this.f69498V0 = str11 != null ? bm51.m29808s0(10, str11) : null;
        mv0 mv0Var = mv0.f147461b;
        this.f69499W0 = ytg1.m94621l(str9);
        String str12 = (String) map.get("minimizable");
        this.f69501X0 = str12 != null ? Boolean.parseBoolean(str12) : true;
        this.f69503Y0 = Collections.synchronizedSet(g6f.m43734m1(f69487b1));
    }

    /* JADX INFO: renamed from: m */
    public static fh0 m41638m(int i, int i2, String str, fh0 fh0Var) {
        String str2 = fh0Var.f69506a;
        String str3 = fh0Var.f69508b;
        String str4 = fh0Var.f69509c;
        String str5 = fh0Var.f69510d;
        String str6 = (i2 & 16) != 0 ? fh0Var.f69511e : str;
        int i3 = fh0Var.f69505Z0;
        Map map = fh0Var.f69512f;
        b7d0 b7d0Var = fh0Var.f69513g;
        String str7 = fh0Var.f69514h;
        String str8 = fh0Var.f69515i;
        String str9 = fh0Var.f69516t;
        boolean z = fh0Var.f69500X;
        boolean z2 = fh0Var.f69502Y;
        Format format = fh0Var.f69504Z;
        boolean z3 = fh0Var.f69488L0;
        List list = fh0Var.f69489M0;
        String str10 = fh0Var.f69490N0;
        Map map2 = fh0Var.f69491O0;
        int i4 = (i2 & 262144) != 0 ? fh0Var.f69507a1 : i;
        fh0Var.getClass();
        return new fh0(str2, str3, str4, str5, str6, i3, map, b7d0Var, str7, str8, str9, z, z2, format, z3, list, str10, map2, i4);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f69506a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        fh0 fh0Var = (fh0) obj;
        return so0.m78597b(this.f69506a, fh0Var.f69506a) && wj50.m88271j(this.f69508b, fh0Var.f69508b) && wj50.m88271j(this.f69509c, fh0Var.f69509c) && wj50.m88271j(this.f69510d, fh0Var.f69510d) && wj50.m88271j(this.f69511e, fh0Var.f69511e) && this.f69505Z0 == fh0Var.f69505Z0 && wj50.m88271j(this.f69512f, fh0Var.f69512f) && wj50.m88271j(this.f69513g, fh0Var.f69513g) && ud6.m82833h(this.f69514h, fh0Var.f69514h) && wj50.m88271j(this.f69515i, fh0Var.f69515i) && l7l.m58433n(this.f69516t, fh0Var.f69516t) && this.f69500X == fh0Var.f69500X && this.f69502Y == fh0Var.f69502Y && this.f69504Z == fh0Var.f69504Z && this.f69488L0 == fh0Var.f69488L0 && wj50.m88271j(this.f69489M0, fh0Var.f69489M0) && wj50.m88271j(this.f69490N0, fh0Var.f69490N0) && wj50.m88271j(this.f69491O0, fh0Var.f69491O0) && this.f69507a1 == fh0Var.f69507a1;
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: h */
    public final String mo29282h() {
        return this.f69511e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f69507a1) + edb.m38557f(s571.m77243b(s571.m77244c(s571.m77245d((this.f69504Z.hashCode() + s571.m77245d(s571.m77245d((l7l.m58435p(this.f69516t) + s571.m77243b((ud6.m82835j(this.f69514h) + ((this.f69513g.hashCode() + edb.m38557f(f710.m40938f(this.f69505Z0, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(so0.m78598c(this.f69506a) * 31, 31, this.f69508b), 31, this.f69509c), 31, this.f69510d), 31, this.f69511e), 31), 31, this.f69512f)) * 31)) * 31, 31, this.f69515i)) * 31, 31, this.f69500X), 31, this.f69502Y)) * 31, 31, this.f69488L0), 31, this.f69489M0), 31, this.f69490N0), 31, this.f69491O0);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f69516t;
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: k */
    public final String mo29284k() {
        return this.f69509c;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f69514h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qsg1.m73721a0(this.f69506a, parcel);
        parcel.writeString(this.f69508b);
        parcel.writeString(this.f69509c);
        parcel.writeString(this.f69510d);
        parcel.writeString(this.f69511e);
        parcel.writeString(AbstractC0000a.m27z(this.f69505Z0));
        Iterator itM91403l = xl81.m91403l(parcel, this.f69512f);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        this.f69513g.writeToParcel(parcel, i);
        aq7.m26760r(this.f69514h, parcel);
        parcel.writeString(this.f69515i);
        bul.m30548E(this.f69516t, parcel);
        parcel.writeInt(this.f69500X ? 1 : 0);
        parcel.writeInt(this.f69502Y ? 1 : 0);
        parcel.writeString(this.f69504Z.name());
        parcel.writeInt(this.f69488L0 ? 1 : 0);
        Iterator itM42468l = fr0.m42468l(parcel, this.f69489M0);
        while (itM42468l.hasNext()) {
            parcel.writeValue(itM42468l.next());
        }
        parcel.writeString(this.f69490N0);
        Iterator itM91403l2 = xl81.m91403l(parcel, this.f69491O0);
        while (itM91403l2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itM91403l2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeStringList((List) entry2.getValue());
        }
        parcel.writeString(AbstractC0000a.m26y(this.f69507a1));
    }

    public /* synthetic */ fh0(String str, String str2, String str3, String str4, String str5, int i, Map map, b7d0 b7d0Var, String str6, String str7, String str8, boolean z, boolean z2, Format format, boolean z3, List list, String str9, LinkedHashMap linkedHashMap, int i2) {
        this(str, str2, str3, str4, str5, i, map, b7d0Var, str6, str7, str8, z, z2, format, z3, list, str9, (i2 & 131072) != 0 ? nau.f152117a : linkedHashMap, (i2 & 262144) != 0 ? 2 : 1);
    }
}

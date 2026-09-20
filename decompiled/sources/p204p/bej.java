package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bej extends b221 implements pkw0, gkx, ks61, ikz0 {
    public static final Parcelable.Creator<bej> CREATOR = new wcj(0);

    /* JADX INFO: renamed from: X */
    public final int f26364X;

    /* JADX INFO: renamed from: Y */
    public final int f26365Y;

    /* JADX INFO: renamed from: a */
    public final String f26366a;

    /* JADX INFO: renamed from: b */
    public final String f26367b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f26368c;

    /* JADX INFO: renamed from: d */
    public final List f26369d;

    /* JADX INFO: renamed from: e */
    public final int f26370e;

    /* JADX INFO: renamed from: f */
    public final String f26371f;

    /* JADX INFO: renamed from: g */
    public final boolean f26372g;

    /* JADX INFO: renamed from: h */
    public final String f26373h;

    /* JADX INFO: renamed from: i */
    public final String f26374i;

    /* JADX INFO: renamed from: t */
    public final boolean f26375t;

    public bej(String str, String str2, ArrayList arrayList, List list, int i, String str3, boolean z, String str4, String str5, boolean z2, int i2, int i3) {
        this.f26366a = str;
        this.f26367b = str2;
        this.f26368c = arrayList;
        this.f26369d = list;
        this.f26370e = i;
        this.f26371f = str3;
        this.f26372g = z;
        this.f26373h = str4;
        this.f26374i = str5;
        this.f26375t = z2;
        this.f26364X = i2;
        this.f26365Y = i3;
    }

    @Override // p204p.gkx
    /* JADX INFO: renamed from: C0 */
    public final String mo28933C0() {
        return this.f26371f;
    }

    @Override // p204p.gkx
    /* JADX INFO: renamed from: D */
    public final int mo28934D() {
        return this.f26370e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej)) {
            return false;
        }
        bej bejVar = (bej) obj;
        return wj50.m88271j(this.f26366a, bejVar.f26366a) && wj50.m88271j(this.f26367b, bejVar.f26367b) && wj50.m88271j(this.f26368c, bejVar.f26368c) && wj50.m88271j(this.f26369d, bejVar.f26369d) && this.f26370e == bejVar.f26370e && wj50.m88271j(this.f26371f, bejVar.f26371f) && this.f26372g == bejVar.f26372g && wj50.m88271j(this.f26373h, bejVar.f26373h) && wj50.m88271j(this.f26374i, bejVar.f26374i) && this.f26375t == bejVar.f26375t && this.f26364X == bejVar.f26364X && this.f26365Y == bejVar.f26365Y;
    }

    @Override // p204p.ikz0
    /* JADX INFO: renamed from: f */
    public final boolean mo28935f() {
        return this.f26372g;
    }

    @Override // p204p.gkx
    /* JADX INFO: renamed from: g0 */
    public final List mo28936g0() {
        return this.f26368c;
    }

    @Override // p204p.b221
    public final String getUri() {
        return this.f26366a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f26365Y) + f710.m40938f(this.f26364X, s571.m77245d(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b(mt60.m62800g(this.f26370e, s571.m77244c(lq51.m59700f(this.f26368c, s571.m77243b(this.f26366a.hashCode() * 31, 31, this.f26367b), 31), 31, this.f26369d), 31), 31, this.f26371f), 31, this.f26372g), 31, this.f26373h), 31, this.f26374i), 31, this.f26375t), 31);
    }

    @Override // p204p.ks61
    /* JADX INFO: renamed from: p */
    public final List mo28937p() {
        return this.f26369d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f26366a);
        parcel.writeString(this.f26367b);
        Iterator itM42469m = fr0.m42469m(this.f26368c, parcel);
        while (itM42469m.hasNext()) {
            ((bej) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f26369d);
        parcel.writeInt(this.f26370e);
        parcel.writeString(this.f26371f);
        parcel.writeInt(this.f26372g ? 1 : 0);
        parcel.writeString(this.f26373h);
        parcel.writeString(this.f26374i);
        parcel.writeInt(this.f26375t ? 1 : 0);
        parcel.writeString(o7t0.m66399m(this.f26364X));
        int i2 = this.f26365Y;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "EXPLICIT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "OVER_19_ONLY";
        }
        parcel.writeString(str);
    }

    @Override // p204p.pkw0
    /* JADX INFO: renamed from: y1 */
    public final int mo28938y1() {
        return this.f26364X;
    }

    public /* synthetic */ bej(String str, String str2, ArrayList arrayList, ae50 ae50Var, int i, String str3, boolean z, String str4, boolean z2, int i2) {
        this(str, str2, arrayList, ae50Var, i, str3, z, str4, "", z2, i2, 1);
    }
}

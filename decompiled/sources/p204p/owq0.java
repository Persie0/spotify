package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class owq0 implements Parcelable {

    /* JADX INFO: renamed from: X */
    public final String f170759X;

    /* JADX INFO: renamed from: Y */
    public final ch90 f170760Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f170761Z;

    /* JADX INFO: renamed from: a */
    public final String f170762a;

    /* JADX INFO: renamed from: b */
    public final String f170763b;

    /* JADX INFO: renamed from: c */
    public final kcd1 f170764c;

    /* JADX INFO: renamed from: d */
    public final List f170765d;

    /* JADX INFO: renamed from: e */
    public final List f170766e;

    /* JADX INFO: renamed from: f */
    public final List f170767f;

    /* JADX INFO: renamed from: g */
    public final String f170768g;

    /* JADX INFO: renamed from: h */
    public final String f170769h;

    /* JADX INFO: renamed from: i */
    public final List f170770i;

    /* JADX INFO: renamed from: t */
    public final boolean f170771t;
    public static final nwq0 Companion = new nwq0();
    public static final Parcelable.Creator<owq0> CREATOR = new vnp0(26);

    /* JADX INFO: renamed from: L0 */
    public static final fr70[] f170758L0 = {null, null, null, q3d0.m72078I(2, lin0.f133845a1), q3d0.m72078I(2, lin0.f133847b1), q3d0.m72078I(2, lin0.f133849c1), null, null, q3d0.m72078I(2, mwq0.f147863b), null, null, null, null};

    public /* synthetic */ owq0(int i, String str, String str2, kcd1 kcd1Var, List list, List list2, List list3, String str3, String str4, List list4, boolean z, String str5, ch90 ch90Var, boolean z2) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, lwq0.f137622a.getDescriptor());
            throw null;
        }
        this.f170762a = str;
        if ((i & 2) == 0) {
            this.f170763b = null;
        } else {
            this.f170763b = str2;
        }
        if ((i & 4) == 0) {
            this.f170764c = null;
        } else {
            this.f170764c = kcd1Var;
        }
        if ((i & 8) == 0) {
            this.f170765d = null;
        } else {
            this.f170765d = list;
        }
        if ((i & 16) == 0) {
            this.f170766e = null;
        } else {
            this.f170766e = list2;
        }
        if ((i & 32) == 0) {
            this.f170767f = null;
        } else {
            this.f170767f = list3;
        }
        if ((i & 64) == 0) {
            this.f170768g = null;
        } else {
            this.f170768g = str3;
        }
        if ((i & 128) == 0) {
            this.f170769h = null;
        } else {
            this.f170769h = str4;
        }
        if ((i & 256) == 0) {
            this.f170770i = null;
        } else {
            this.f170770i = list4;
        }
        if ((i & 512) == 0) {
            this.f170771t = false;
        } else {
            this.f170771t = z;
        }
        if ((i & 1024) == 0) {
            this.f170759X = null;
        } else {
            this.f170759X = str5;
        }
        if ((i & 2048) == 0) {
            this.f170760Y = null;
        } else {
            this.f170760Y = ch90Var;
        }
        if ((i & 4096) == 0) {
            this.f170761Z = false;
        } else {
            this.f170761Z = z2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owq0)) {
            return false;
        }
        owq0 owq0Var = (owq0) obj;
        return wj50.m88271j(this.f170762a, owq0Var.f170762a) && wj50.m88271j(this.f170763b, owq0Var.f170763b) && wj50.m88271j(this.f170764c, owq0Var.f170764c) && wj50.m88271j(this.f170765d, owq0Var.f170765d) && wj50.m88271j(this.f170766e, owq0Var.f170766e) && wj50.m88271j(this.f170767f, owq0Var.f170767f) && wj50.m88271j(this.f170768g, owq0Var.f170768g) && wj50.m88271j(this.f170769h, owq0Var.f170769h) && wj50.m88271j(this.f170770i, owq0Var.f170770i) && this.f170771t == owq0Var.f170771t && wj50.m88271j(this.f170759X, owq0Var.f170759X) && wj50.m88271j(this.f170760Y, owq0Var.f170760Y) && this.f170761Z == owq0Var.f170761Z;
    }

    public final int hashCode() {
        int iHashCode = this.f170762a.hashCode() * 31;
        String str = this.f170763b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kcd1 kcd1Var = this.f170764c;
        int iHashCode3 = (iHashCode2 + (kcd1Var == null ? 0 : kcd1Var.hashCode())) * 31;
        List list = this.f170765d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f170766e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f170767f;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.f170768g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f170769h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.f170770i;
        int iM77245d = s571.m77245d((iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.f170771t);
        String str4 = this.f170759X;
        int iHashCode9 = (iM77245d + (str4 == null ? 0 : str4.hashCode())) * 31;
        ch90 ch90Var = this.f170760Y;
        return Boolean.hashCode(this.f170761Z) + ((iHashCode9 + (ch90Var != null ? ch90Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170762a);
        parcel.writeString(this.f170763b);
        kcd1 kcd1Var = this.f170764c;
        if (kcd1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kcd1Var.writeToParcel(parcel, i);
        }
        List list = this.f170765d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((gxq0) it.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.f170766e;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((mgd1) it2.next()).writeToParcel(parcel, i);
            }
        }
        List list3 = this.f170767f;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((xgy) it3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f170768g);
        parcel.writeString(this.f170769h);
        List list4 = this.f170770i;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                ((sie0) it4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.f170771t ? 1 : 0);
        parcel.writeString(this.f170759X);
        ch90 ch90Var = this.f170760Y;
        if (ch90Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ch90Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f170761Z ? 1 : 0);
    }

    public owq0(String str, String str2, kcd1 kcd1Var, List list, List list2, List list3, String str3, String str4, List list4, boolean z, String str5, ch90 ch90Var, boolean z2) {
        this.f170762a = str;
        this.f170763b = str2;
        this.f170764c = kcd1Var;
        this.f170765d = list;
        this.f170766e = list2;
        this.f170767f = list3;
        this.f170768g = str3;
        this.f170769h = str4;
        this.f170770i = list4;
        this.f170771t = z;
        this.f170759X = str5;
        this.f170760Y = ch90Var;
        this.f170761Z = z2;
    }
}

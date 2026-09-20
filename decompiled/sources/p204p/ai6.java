package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ai6 implements Parcelable {
    public static final Parcelable.Creator<ai6> CREATOR = new vp5(26);

    /* JADX INFO: renamed from: a */
    public final String f15892a;

    /* JADX INFO: renamed from: b */
    public final String f15893b;

    /* JADX INFO: renamed from: c */
    public final String f15894c;

    /* JADX INFO: renamed from: d */
    public final boolean f15895d;

    /* JADX INFO: renamed from: e */
    public final kyy f15896e;

    /* JADX INFO: renamed from: f */
    public final List f15897f;

    /* JADX INFO: renamed from: g */
    public final int f15898g;

    /* JADX INFO: renamed from: h */
    public final ii6 f15899h;

    /* JADX INFO: renamed from: i */
    public final List f15900i;

    /* JADX INFO: renamed from: t */
    public final List f15901t;

    public ai6(String str, String str2, String str3, boolean z, kyy kyyVar, List list, int i, ii6 ii6Var, List list2, List list3) {
        this.f15892a = str;
        this.f15893b = str2;
        this.f15894c = str3;
        this.f15895d = z;
        this.f15896e = kyyVar;
        this.f15897f = list;
        this.f15898g = i;
        this.f15899h = ii6Var;
        this.f15900i = list2;
        this.f15901t = list3;
    }

    /* JADX INFO: renamed from: c */
    public static ai6 m26065c(ai6 ai6Var, String str, String str2, String str3, boolean z, kyy kyyVar, List list, int i, ii6 ii6Var, List list2, List list3, int i2) {
        if ((i2 & 1) != 0) {
            str = ai6Var.f15892a;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            str2 = ai6Var.f15893b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = ai6Var.f15894c;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            z = ai6Var.f15895d;
        }
        boolean z2 = z;
        kyy kyyVar2 = (i2 & 16) != 0 ? ai6Var.f15896e : kyyVar;
        List list4 = (i2 & 32) != 0 ? ai6Var.f15897f : list;
        int i3 = (i2 & 64) != 0 ? ai6Var.f15898g : i;
        ii6 ii6Var2 = (i2 & 128) != 0 ? ai6Var.f15899h : ii6Var;
        List list5 = (i2 & 256) != 0 ? ai6Var.f15900i : list2;
        List list6 = (i2 & 512) != 0 ? ai6Var.f15901t : list3;
        ai6Var.getClass();
        return new ai6(str4, str5, str6, z2, kyyVar2, list4, i3, ii6Var2, list5, list6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai6)) {
            return false;
        }
        ai6 ai6Var = (ai6) obj;
        return wj50.m88271j(this.f15892a, ai6Var.f15892a) && wj50.m88271j(this.f15893b, ai6Var.f15893b) && wj50.m88271j(this.f15894c, ai6Var.f15894c) && this.f15895d == ai6Var.f15895d && this.f15896e == ai6Var.f15896e && wj50.m88271j(this.f15897f, ai6Var.f15897f) && this.f15898g == ai6Var.f15898g && wj50.m88271j(this.f15899h, ai6Var.f15899h) && wj50.m88271j(this.f15900i, ai6Var.f15900i) && wj50.m88271j(this.f15901t, ai6Var.f15901t);
    }

    public final int hashCode() {
        int iHashCode = this.f15892a.hashCode() * 31;
        String str = this.f15893b;
        int iM40938f = f710.m40938f(this.f15898g, s571.m77244c((this.f15896e.hashCode() + s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15894c), 31, this.f15895d)) * 31, 31, this.f15897f), 31);
        ii6 ii6Var = this.f15899h;
        return this.f15901t.hashCode() + s571.m77244c((iM40938f + (ii6Var != null ? ii6Var.hashCode() : 0)) * 31, 31, this.f15900i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f15892a);
        parcel.writeString(this.f15893b);
        parcel.writeString(this.f15894c);
        parcel.writeInt(this.f15895d ? 1 : 0);
        parcel.writeString(this.f15896e.name());
        Iterator itM42468l = fr0.m42468l(parcel, this.f15897f);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        int i2 = this.f15898g;
        if (i2 == 1) {
            str = "NOT_LOADED";
        } else if (i2 == 2) {
            str = "LOADED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "FAILED";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f15899h, i);
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f15900i);
        while (itM42468l2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l2.next(), i);
        }
        Iterator itM42468l3 = fr0.m42468l(parcel, this.f15901t);
        while (itM42468l3.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l3.next(), i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ai6(String str, kyy kyyVar, ii6 ii6Var, List list, List list2, int i) {
        String str2 = (i & 1) != 0 ? "" : str;
        kyy kyyVar2 = (i & 16) != 0 ? kyy.TOP : kyyVar;
        ii6 ii6Var2 = (i & 128) != 0 ? null : ii6Var;
        int i2 = i & 256;
        lau lauVar = lau.f131415a;
        this(str2, null, "", false, kyyVar2, lauVar, 1, ii6Var2, i2 != 0 ? lauVar : list, (i & 512) != 0 ? bk5.m29620k1(ayv.values()) : list2);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hiy0 implements oiy0 {
    public static final Parcelable.Creator<hiy0> CREATOR = new csx0(19);

    /* JADX INFO: renamed from: M0 */
    public static final hiy0 f91896M0 = new hiy0("", "", lau.f131415a, null, null, null, null, 0, null, false, null, 16376);

    /* JADX INFO: renamed from: L0 */
    public final boolean f91897L0;

    /* JADX INFO: renamed from: X */
    public final boolean f91898X;

    /* JADX INFO: renamed from: Y */
    public final Integer f91899Y;

    /* JADX INFO: renamed from: Z */
    public final ln21 f91900Z;

    /* JADX INFO: renamed from: a */
    public final String f91901a;

    /* JADX INFO: renamed from: b */
    public final String f91902b;

    /* JADX INFO: renamed from: c */
    public final List f91903c;

    /* JADX INFO: renamed from: d */
    public final List f91904d;

    /* JADX INFO: renamed from: e */
    public final SearchConfiguration f91905e;

    /* JADX INFO: renamed from: f */
    public final e20 f91906f;

    /* JADX INFO: renamed from: g */
    public final e20 f91907g;

    /* JADX INFO: renamed from: h */
    public final int f91908h;

    /* JADX INFO: renamed from: i */
    public final List f91909i;

    /* JADX INFO: renamed from: t */
    public final List f91910t;

    public hiy0(String str, String str2, List list, List list2, SearchConfiguration searchConfiguration, e20 e20Var, e20 e20Var2, int i, List list3, List list4, boolean z, Integer num, ln21 ln21Var, boolean z2) {
        this.f91901a = str;
        this.f91902b = str2;
        this.f91903c = list;
        this.f91904d = list2;
        this.f91905e = searchConfiguration;
        this.f91906f = e20Var;
        this.f91907g = e20Var2;
        this.f91908h = i;
        this.f91909i = list3;
        this.f91910t = list4;
        this.f91898X = z;
        this.f91899Y = num;
        this.f91900Z = ln21Var;
        this.f91897L0 = z2;
    }

    /* JADX INFO: renamed from: c */
    public static hiy0 m47645c(hiy0 hiy0Var, ArrayList arrayList, List list, List list2, Integer num, boolean z, int i) {
        String str = hiy0Var.f91901a;
        String str2 = hiy0Var.f91902b;
        List list3 = (i & 4) != 0 ? hiy0Var.f91903c : arrayList;
        List list4 = hiy0Var.f91904d;
        List list5 = list3;
        SearchConfiguration searchConfiguration = hiy0Var.f91905e;
        e20 e20Var = hiy0Var.f91906f;
        e20 e20Var2 = hiy0Var.f91907g;
        int i2 = hiy0Var.f91908h;
        List list6 = (i & 256) != 0 ? hiy0Var.f91909i : list;
        List list7 = (i & 512) != 0 ? hiy0Var.f91910t : list2;
        boolean z2 = hiy0Var.f91898X;
        Integer num2 = (i & 2048) != 0 ? hiy0Var.f91899Y : num;
        ln21 ln21Var = hiy0Var.f91900Z;
        boolean z3 = (i & 8192) != 0 ? hiy0Var.f91897L0 : z;
        hiy0Var.getClass();
        return new hiy0(str, str2, list5, list4, searchConfiguration, e20Var, e20Var2, i2, list6, list7, z2, num2, ln21Var, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.oiy0
    /* JADX INFO: renamed from: e0 */
    public final String mo41778e0() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f91903c) {
            if (obj instanceof jyn0) {
                arrayList.add(obj);
            }
        }
        return s571.m77246e(arrayList.size(), "ContentPicker, Signals: ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiy0)) {
            return false;
        }
        hiy0 hiy0Var = (hiy0) obj;
        return wj50.m88271j(this.f91901a, hiy0Var.f91901a) && wj50.m88271j(this.f91902b, hiy0Var.f91902b) && wj50.m88271j(this.f91903c, hiy0Var.f91903c) && wj50.m88271j(this.f91904d, hiy0Var.f91904d) && wj50.m88271j(this.f91905e, hiy0Var.f91905e) && wj50.m88271j(this.f91906f, hiy0Var.f91906f) && wj50.m88271j(this.f91907g, hiy0Var.f91907g) && this.f91908h == hiy0Var.f91908h && wj50.m88271j(this.f91909i, hiy0Var.f91909i) && wj50.m88271j(this.f91910t, hiy0Var.f91910t) && this.f91898X == hiy0Var.f91898X && wj50.m88271j(this.f91899Y, hiy0Var.f91899Y) && this.f91900Z == hiy0Var.f91900Z && this.f91897L0 == hiy0Var.f91897L0;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77244c(s571.m77243b(this.f91901a.hashCode() * 31, 31, this.f91902b), 31, this.f91903c), 31, this.f91904d);
        SearchConfiguration searchConfiguration = this.f91905e;
        int iHashCode = (iM77244c + (searchConfiguration == null ? 0 : searchConfiguration.hashCode())) * 31;
        e20 e20Var = this.f91906f;
        int iHashCode2 = (iHashCode + (e20Var == null ? 0 : e20Var.f55288a.hashCode())) * 31;
        e20 e20Var2 = this.f91907g;
        int iM77245d = s571.m77245d(s571.m77244c(s571.m77244c(mt60.m62800g(this.f91908h, (iHashCode2 + (e20Var2 == null ? 0 : e20Var2.f55288a.hashCode())) * 31, 31), 31, this.f91909i), 31, this.f91910t), 31, this.f91898X);
        Integer num = this.f91899Y;
        return Boolean.hashCode(this.f91897L0) + ((this.f91900Z.hashCode() + ((iM77245d + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f91901a);
        parcel.writeString(this.f91902b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f91903c);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f91904d);
        while (itM42468l2.hasNext()) {
            ((giy0) itM42468l2.next()).writeToParcel(parcel, i);
        }
        SearchConfiguration searchConfiguration = this.f91905e;
        if (searchConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchConfiguration.writeToParcel(parcel, i);
        }
        e20 e20Var = this.f91906f;
        if (e20Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e20Var.writeToParcel(parcel, i);
        }
        e20 e20Var2 = this.f91907g;
        if (e20Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e20Var2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f91908h);
        Iterator itM42468l3 = fr0.m42468l(parcel, this.f91909i);
        while (itM42468l3.hasNext()) {
            ((xyn0) itM42468l3.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l4 = fr0.m42468l(parcel, this.f91910t);
        while (itM42468l4.hasNext()) {
            ((xyn0) itM42468l4.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f91898X ? 1 : 0);
        Integer num = this.f91899Y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f91900Z.name());
        parcel.writeInt(this.f91897L0 ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hiy0(String str, String str2, List list, ArrayList arrayList, SearchConfiguration searchConfiguration, e20 e20Var, e20 e20Var2, int i, ArrayList arrayList2, boolean z, ln21 ln21Var, int i2) {
        int i3 = i2 & 8;
        lau lauVar = lau.f131415a;
        this(str, str2, list, i3 != 0 ? lauVar : arrayList, (i2 & 16) != 0 ? null : searchConfiguration, (i2 & 32) != 0 ? null : e20Var, (i2 & 64) != 0 ? null : e20Var2, (i2 & 128) != 0 ? 1 : i, (i2 & 256) != 0 ? lauVar : arrayList2, lauVar, (i2 & 1024) != 0 ? false : z, null, (i2 & 4096) != 0 ? ln21.f135076b : ln21Var, false);
    }
}

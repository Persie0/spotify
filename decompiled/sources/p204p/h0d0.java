package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h0d0 implements Parcelable {
    public static final Parcelable.Creator<h0d0> CREATOR = new f4c0(21);

    /* JADX INFO: renamed from: L0 */
    public final String f86231L0;

    /* JADX INFO: renamed from: X */
    public final String f86232X;

    /* JADX INFO: renamed from: Y */
    public final int f86233Y;

    /* JADX INFO: renamed from: Z */
    public final String f86234Z;

    /* JADX INFO: renamed from: a */
    public final d0d0 f86235a;

    /* JADX INFO: renamed from: b */
    public final String f86236b;

    /* JADX INFO: renamed from: c */
    public final boolean f86237c;

    /* JADX INFO: renamed from: d */
    public final boolean f86238d;

    /* JADX INFO: renamed from: e */
    public final String f86239e;

    /* JADX INFO: renamed from: f */
    public final String f86240f;

    /* JADX INFO: renamed from: g */
    public final List f86241g;

    /* JADX INFO: renamed from: h */
    public final h400 f86242h;

    /* JADX INFO: renamed from: i */
    public final boolean f86243i;

    /* JADX INFO: renamed from: t */
    public final boolean f86244t;

    public h0d0(d0d0 d0d0Var, String str, boolean z, boolean z2, String str2, String str3, ArrayList arrayList, h400 h400Var, boolean z3, boolean z4, String str4, int i, String str5, String str6) {
        this.f86235a = d0d0Var;
        this.f86236b = str;
        this.f86237c = z;
        this.f86238d = z2;
        this.f86239e = str2;
        this.f86240f = str3;
        this.f86241g = arrayList;
        this.f86242h = h400Var;
        this.f86243i = z3;
        this.f86244t = z4;
        this.f86232X = str4;
        this.f86233Y = i;
        this.f86234Z = str5;
        this.f86231L0 = str6;
    }

    /* JADX INFO: renamed from: c */
    public final d0d0 m46339c() {
        return this.f86235a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0d0)) {
            return false;
        }
        h0d0 h0d0Var = (h0d0) obj;
        return wj50.m88271j(this.f86235a, h0d0Var.f86235a) && wj50.m88271j(this.f86236b, h0d0Var.f86236b) && this.f86237c == h0d0Var.f86237c && this.f86238d == h0d0Var.f86238d && wj50.m88271j(this.f86239e, h0d0Var.f86239e) && wj50.m88271j(this.f86240f, h0d0Var.f86240f) && wj50.m88271j(this.f86241g, h0d0Var.f86241g) && wj50.m88271j(this.f86242h, h0d0Var.f86242h) && this.f86243i == h0d0Var.f86243i && this.f86244t == h0d0Var.f86244t && wj50.m88271j(this.f86232X, h0d0Var.f86232X) && this.f86233Y == h0d0Var.f86233Y && wj50.m88271j(this.f86234Z, h0d0Var.f86234Z) && wj50.m88271j(this.f86231L0, h0d0Var.f86231L0);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f86235a.hashCode() * 31, 31, this.f86236b), 31, this.f86237c), 31, this.f86238d);
        String str = this.f86239e;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86240f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f86241g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        h400 h400Var = this.f86242h;
        int iM77245d2 = s571.m77245d(s571.m77245d((iHashCode3 + (h400Var == null ? 0 : h400Var.hashCode())) * 31, 31, this.f86243i), 31, this.f86244t);
        String str3 = this.f86232X;
        int iM62800g = mt60.m62800g(this.f86233Y, (iM77245d2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f86234Z;
        int iHashCode4 = (iM62800g + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f86231L0;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f86235a, i);
        parcel.writeString(this.f86236b);
        parcel.writeInt(this.f86237c ? 1 : 0);
        parcel.writeInt(this.f86238d ? 1 : 0);
        parcel.writeString(this.f86239e);
        parcel.writeString(this.f86240f);
        parcel.writeStringList(this.f86241g);
        parcel.writeParcelable(this.f86242h, i);
        parcel.writeInt(this.f86243i ? 1 : 0);
        parcel.writeInt(this.f86244t ? 1 : 0);
        parcel.writeString(this.f86232X);
        parcel.writeInt(this.f86233Y);
        parcel.writeString(this.f86234Z);
        parcel.writeString(this.f86231L0);
    }
}

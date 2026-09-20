package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ao41 extends co41 {
    public static final Parcelable.Creator<ao41> CREATOR = new tj41(4);

    /* JADX INFO: renamed from: X */
    public final List f17563X;

    /* JADX INFO: renamed from: Y */
    public final int f17564Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f17565Z;

    /* JADX INFO: renamed from: a */
    public final int f17566a;

    /* JADX INFO: renamed from: b */
    public final xr01 f17567b;

    /* JADX INFO: renamed from: c */
    public final ck01 f17568c;

    /* JADX INFO: renamed from: d */
    public final lu01 f17569d;

    /* JADX INFO: renamed from: e */
    public final z0r f17570e;

    /* JADX INFO: renamed from: f */
    public final String f17571f;

    /* JADX INFO: renamed from: g */
    public final String f17572g;

    /* JADX INFO: renamed from: h */
    public final String f17573h;

    /* JADX INFO: renamed from: i */
    public final int f17574i;

    /* JADX INFO: renamed from: t */
    public final icr0 f17575t;

    public ao41(int i, xr01 xr01Var, ck01 ck01Var, lu01 lu01Var, z0r z0rVar, String str, String str2, String str3, int i2, icr0 icr0Var, List list, int i3, boolean z) {
        this.f17566a = i;
        this.f17567b = xr01Var;
        this.f17568c = ck01Var;
        this.f17569d = lu01Var;
        this.f17570e = z0rVar;
        this.f17571f = str;
        this.f17572g = str2;
        this.f17573h = str3;
        this.f17574i = i2;
        this.f17575t = icr0Var;
        this.f17563X = list;
        this.f17564Y = i3;
        this.f17565Z = z;
    }

    /* JADX INFO: renamed from: k */
    public static ao41 m26563k(ao41 ao41Var, int i, z0r z0rVar, String str, String str2, String str3, int i2, icr0 icr0Var, ArrayList arrayList, int i3, boolean z, int i4) {
        int i5 = (i4 & 1) != 0 ? ao41Var.f17566a : i;
        xr01 xr01Var = ao41Var.f17567b;
        ck01 ck01Var = ao41Var.f17568c;
        lu01 lu01Var = ao41Var.f17569d;
        z0r z0rVar2 = (i4 & 16) != 0 ? ao41Var.f17570e : z0rVar;
        String str4 = (i4 & 32) != 0 ? ao41Var.f17571f : str;
        String str5 = (i4 & 64) != 0 ? ao41Var.f17572g : str2;
        String str6 = (i4 & 128) != 0 ? ao41Var.f17573h : str3;
        int i6 = (i4 & 256) != 0 ? ao41Var.f17574i : i2;
        icr0 icr0Var2 = (i4 & 512) != 0 ? ao41Var.f17575t : icr0Var;
        List list = (i4 & 1024) != 0 ? ao41Var.f17563X : arrayList;
        int i7 = (i4 & 2048) != 0 ? ao41Var.f17564Y : i3;
        boolean z2 = (i4 & 4096) != 0 ? ao41Var.f17565Z : z;
        ao41Var.getClass();
        return new ao41(i5, xr01Var, ck01Var, lu01Var, z0rVar2, str4, str5, str6, i6, icr0Var2, list, i7, z2);
    }

    @Override // p204p.co41
    /* JADX INFO: renamed from: c */
    public final ck01 mo26564c() {
        return this.f17568c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao41)) {
            return false;
        }
        ao41 ao41Var = (ao41) obj;
        return this.f17566a == ao41Var.f17566a && wj50.m88271j(this.f17567b, ao41Var.f17567b) && wj50.m88271j(this.f17568c, ao41Var.f17568c) && wj50.m88271j(this.f17569d, ao41Var.f17569d) && wj50.m88271j(this.f17570e, ao41Var.f17570e) && wj50.m88271j(this.f17571f, ao41Var.f17571f) && wj50.m88271j(this.f17572g, ao41Var.f17572g) && wj50.m88271j(this.f17573h, ao41Var.f17573h) && this.f17574i == ao41Var.f17574i && wj50.m88271j(this.f17575t, ao41Var.f17575t) && wj50.m88271j(this.f17563X, ao41Var.f17563X) && this.f17564Y == ao41Var.f17564Y && this.f17565Z == ao41Var.f17565Z;
    }

    @Override // p204p.co41
    /* JADX INFO: renamed from: g */
    public final xr01 mo26565g() {
        return this.f17567b;
    }

    @Override // p204p.co41
    /* JADX INFO: renamed from: h */
    public final int mo26566h() {
        return this.f17566a;
    }

    public final int hashCode() {
        int iHashCode = (this.f17569d.hashCode() + ((this.f17568c.hashCode() + ((this.f17567b.f265192a.hashCode() + (edb.m38547C(this.f17566a) * 31)) * 31)) * 31)) * 31;
        z0r z0rVar = this.f17570e;
        return Boolean.hashCode(this.f17565Z) + mt60.m62800g(this.f17564Y, s571.m77244c((this.f17575t.hashCode() + mt60.m62800g(this.f17574i, s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (z0rVar == null ? 0 : z0rVar.hashCode())) * 31, 31, this.f17571f), 31, this.f17572g), 31, this.f17573h), 31)) * 31, 31, this.f17563X), 31);
    }

    @Override // p204p.co41
    /* JADX INFO: renamed from: j */
    public final lu01 mo26567j() {
        return this.f17569d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(stz0.m79362p(this.f17566a));
        parcel.writeParcelable(this.f17567b, i);
        parcel.writeParcelable(this.f17568c, i);
        parcel.writeParcelable(this.f17569d, i);
        parcel.writeString(this.f17571f);
        parcel.writeString(this.f17572g);
        parcel.writeString(this.f17573h);
        parcel.writeInt(this.f17574i);
        parcel.writeParcelable(this.f17575t, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f17563X);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeInt(this.f17564Y);
        parcel.writeInt(this.f17565Z ? 1 : 0);
    }

    public /* synthetic */ ao41(int i, xr01 xr01Var, ck01 ck01Var, lu01 lu01Var, String str, String str2, String str3, int i2, icr0 icr0Var, ArrayList arrayList, int i3, boolean z, int i4) {
        this(i, xr01Var, ck01Var, lu01Var, (z0r) null, str, str2, str3, i2, icr0Var, arrayList, i3, (i4 & 4096) != 0 ? false : z);
    }
}

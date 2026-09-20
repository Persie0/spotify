package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xj41 implements Parcelable {
    public static final Parcelable.Creator<xj41> CREATOR = new tj41(0);

    /* JADX INFO: renamed from: a */
    public final String f262038a;

    /* JADX INFO: renamed from: b */
    public final String f262039b;

    /* JADX INFO: renamed from: c */
    public final String f262040c;

    /* JADX INFO: renamed from: d */
    public final boolean f262041d;

    /* JADX INFO: renamed from: e */
    public final boolean f262042e;

    /* JADX INFO: renamed from: f */
    public final boolean f262043f;

    /* JADX INFO: renamed from: g */
    public final boolean f262044g;

    /* JADX INFO: renamed from: h */
    public final boolean f262045h;

    /* JADX INFO: renamed from: i */
    public final wj41 f262046i;

    /* JADX INFO: renamed from: t */
    public final di20 f262047t;

    public xj41(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, wj41 wj41Var, di20 di20Var) {
        this.f262038a = str;
        this.f262039b = str2;
        this.f262040c = str3;
        this.f262041d = z;
        this.f262042e = z2;
        this.f262043f = z3;
        this.f262044g = z4;
        this.f262045h = z5;
        this.f262046i = wj41Var;
        this.f262047t = di20Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj41)) {
            return false;
        }
        xj41 xj41Var = (xj41) obj;
        return wj50.m88271j(this.f262038a, xj41Var.f262038a) && wj50.m88271j(this.f262039b, xj41Var.f262039b) && wj50.m88271j(this.f262040c, xj41Var.f262040c) && this.f262041d == xj41Var.f262041d && this.f262042e == xj41Var.f262042e && this.f262043f == xj41Var.f262043f && this.f262044g == xj41Var.f262044g && this.f262045h == xj41Var.f262045h && wj50.m88271j(this.f262046i, xj41Var.f262046i) && this.f262047t == xj41Var.f262047t;
    }

    public final int hashCode() {
        return this.f262047t.hashCode() + ((this.f262046i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f262038a.hashCode() * 31, 31, this.f262039b), 31, this.f262040c), 31, this.f262041d), 31, this.f262042e), 31, this.f262043f), 31, this.f262044g), 31, this.f262045h)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f262038a);
        parcel.writeString(this.f262039b);
        parcel.writeString(this.f262040c);
        parcel.writeInt(this.f262041d ? 1 : 0);
        parcel.writeInt(this.f262042e ? 1 : 0);
        parcel.writeInt(this.f262043f ? 1 : 0);
        parcel.writeInt(this.f262044g ? 1 : 0);
        parcel.writeInt(this.f262045h ? 1 : 0);
        parcel.writeParcelable(this.f262046i, i);
        parcel.writeString(this.f262047t.name());
    }
}

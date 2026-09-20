package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sc90 implements Parcelable {
    public static final Parcelable.Creator<sc90> CREATOR = new ra90(7);

    /* JADX INFO: renamed from: a */
    public final String f207662a;

    /* JADX INFO: renamed from: b */
    public final String f207663b;

    /* JADX INFO: renamed from: c */
    public final String f207664c;

    /* JADX INFO: renamed from: d */
    public final boolean f207665d;

    /* JADX INFO: renamed from: e */
    public final long f207666e;

    /* JADX INFO: renamed from: f */
    public final boolean f207667f;

    /* JADX INFO: renamed from: g */
    public final boolean f207668g;

    /* JADX INFO: renamed from: h */
    public final String f207669h;

    public sc90(String str, String str2, String str3, boolean z, long j, boolean z2, boolean z3, String str4) {
        this.f207662a = str;
        this.f207663b = str2;
        this.f207664c = str3;
        this.f207665d = z;
        this.f207666e = j;
        this.f207667f = z2;
        this.f207668g = z3;
        this.f207669h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc90)) {
            return false;
        }
        sc90 sc90Var = (sc90) obj;
        return wj50.m88271j(this.f207662a, sc90Var.f207662a) && wj50.m88271j(this.f207663b, sc90Var.f207663b) && wj50.m88271j(this.f207664c, sc90Var.f207664c) && this.f207665d == sc90Var.f207665d && this.f207666e == sc90Var.f207666e && this.f207667f == sc90Var.f207667f && this.f207668g == sc90Var.f207668g && wj50.m88271j(this.f207669h, sc90Var.f207669h);
    }

    public final int hashCode() {
        int iHashCode = this.f207662a.hashCode() * 31;
        String str = this.f207663b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f207664c;
        int iM77245d = s571.m77245d(s571.m77245d(dq60.m36605e(s571.m77245d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f207665d), this.f207666e, 31), 31, this.f207667f), 31, this.f207668g);
        String str3 = this.f207669h;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207662a);
        parcel.writeString(this.f207663b);
        parcel.writeString(this.f207664c);
        parcel.writeInt(this.f207665d ? 1 : 0);
        parcel.writeLong(this.f207666e);
        parcel.writeInt(this.f207667f ? 1 : 0);
        parcel.writeInt(this.f207668g ? 1 : 0);
        parcel.writeString(this.f207669h);
    }
}

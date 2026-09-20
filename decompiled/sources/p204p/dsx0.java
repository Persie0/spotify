package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dsx0 implements jsx0 {
    public static final Parcelable.Creator<dsx0> CREATOR = new csx0(0);

    /* JADX INFO: renamed from: a */
    public final int f52667a;

    /* JADX INFO: renamed from: b */
    public final String f52668b;

    /* JADX INFO: renamed from: c */
    public final String f52669c;

    /* JADX INFO: renamed from: d */
    public final String f52670d;

    /* JADX INFO: renamed from: e */
    public final String f52671e;

    /* JADX INFO: renamed from: f */
    public final Double f52672f;

    public dsx0(int i, String str, String str2, String str3, String str4, Double d) {
        this.f52667a = i;
        this.f52668b = str;
        this.f52669c = str2;
        this.f52670d = str3;
        this.f52671e = str4;
        this.f52672f = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsx0)) {
            return false;
        }
        dsx0 dsx0Var = (dsx0) obj;
        return this.f52667a == dsx0Var.f52667a && wj50.m88271j(this.f52668b, dsx0Var.f52668b) && wj50.m88271j(this.f52669c, dsx0Var.f52669c) && wj50.m88271j(this.f52670d, dsx0Var.f52670d) && wj50.m88271j(this.f52671e, dsx0Var.f52671e) && wj50.m88271j(this.f52672f, dsx0Var.f52672f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f52667a) * 31, 31, this.f52668b), 31, this.f52669c), 31, this.f52670d);
        String str = this.f52671e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f52672f;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52667a);
        parcel.writeString(this.f52668b);
        parcel.writeString(this.f52669c);
        parcel.writeString(this.f52670d);
        parcel.writeString(this.f52671e);
        Double d = this.f52672f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }
}

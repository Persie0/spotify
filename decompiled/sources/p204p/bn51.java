package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bn51 implements gn51 {
    public static final Parcelable.Creator<bn51> CREATOR = new nc51(16);

    /* JADX INFO: renamed from: a */
    public final String f28702a;

    /* JADX INFO: renamed from: b */
    public final String f28703b;

    /* JADX INFO: renamed from: c */
    public final String f28704c;

    /* JADX INFO: renamed from: d */
    public final String f28705d;

    /* JADX INFO: renamed from: e */
    public final String f28706e;

    /* JADX INFO: renamed from: f */
    public final xm51 f28707f;

    public bn51(String str, String str2, String str3, String str4, String str5, xm51 xm51Var) {
        this.f28702a = str;
        this.f28703b = str2;
        this.f28704c = str3;
        this.f28705d = str4;
        this.f28706e = str5;
        this.f28707f = xm51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn51)) {
            return false;
        }
        bn51 bn51Var = (bn51) obj;
        return wj50.m88271j(this.f28702a, bn51Var.f28702a) && wj50.m88271j(this.f28703b, bn51Var.f28703b) && wj50.m88271j(this.f28704c, bn51Var.f28704c) && wj50.m88271j(this.f28705d, bn51Var.f28705d) && wj50.m88271j(this.f28706e, bn51Var.f28706e) && wj50.m88271j(this.f28707f, bn51Var.f28707f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f28702a.hashCode() * 31, 31, this.f28703b);
        String str = this.f28704c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28705d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28706e;
        return this.f28707f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28702a);
        parcel.writeString(this.f28703b);
        parcel.writeString(this.f28704c);
        parcel.writeString(this.f28705d);
        parcel.writeString(this.f28706e);
        this.f28707f.writeToParcel(parcel, i);
    }
}

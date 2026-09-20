package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class abs implements Parcelable {
    public static final Parcelable.Creator<abs> CREATOR = new f9s(2);

    /* JADX INFO: renamed from: a */
    public final String f14174a;

    /* JADX INFO: renamed from: b */
    public final String f14175b;

    /* JADX INFO: renamed from: c */
    public final String f14176c;

    public abs(String str, String str2, String str3) {
        this.f14174a = str;
        this.f14175b = str2;
        this.f14176c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abs)) {
            return false;
        }
        abs absVar = (abs) obj;
        return wj50.m88271j(this.f14174a, absVar.f14174a) && wj50.m88271j(this.f14175b, absVar.f14175b) && wj50.m88271j(this.f14176c, absVar.f14176c);
    }

    public final int hashCode() {
        String str = this.f14174a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14175b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14176c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14174a);
        parcel.writeString(this.f14175b);
        parcel.writeString(this.f14176c);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ebj implements ibj {
    public static final Parcelable.Creator<ebj> CREATOR = new f2i(24);

    /* JADX INFO: renamed from: a */
    public final String f57946a;

    /* JADX INFO: renamed from: b */
    public final String f57947b;

    /* JADX INFO: renamed from: c */
    public final String f57948c;

    public ebj(String str, String str2, String str3) {
        this.f57946a = str;
        this.f57947b = str2;
        this.f57948c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebj)) {
            return false;
        }
        ebj ebjVar = (ebj) obj;
        return wj50.m88271j(this.f57946a, ebjVar.f57946a) && wj50.m88271j(this.f57947b, ebjVar.f57947b) && wj50.m88271j(this.f57948c, ebjVar.f57948c);
    }

    public final int hashCode() {
        int iHashCode = this.f57946a.hashCode() * 31;
        String str = this.f57947b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57948c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57946a);
        parcel.writeString(this.f57947b);
        parcel.writeString(this.f57948c);
    }
}

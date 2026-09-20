package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class uzk implements Parcelable {
    public static final Parcelable.Creator<uzk> CREATOR = new n6f1(11);

    /* JADX INFO: renamed from: a */
    public final String f235600a;

    /* JADX INFO: renamed from: b */
    public final String f235601b;

    /* JADX INFO: renamed from: c */
    public final String f235602c;

    /* JADX INFO: renamed from: d */
    public final String f235603d;

    public uzk(String str, String str2, String str3, String str4) {
        this.f235600a = str;
        this.f235601b = str2;
        this.f235602c = str3;
        this.f235603d = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m84311c(int i) {
        String str;
        String str2;
        String str3;
        if (i == 4 && (str3 = this.f235603d) != null && str3.length() != 0) {
            return str3;
        }
        if ((i != 3 && i != 4) || (str = this.f235602c) == null || str.length() == 0) {
            return (i != 2 || (str2 = this.f235601b) == null || str2.length() == 0) ? this.f235600a : str2;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzk)) {
            return false;
        }
        uzk uzkVar = (uzk) obj;
        return wj50.m88271j(this.f235600a, uzkVar.f235600a) && wj50.m88271j(this.f235601b, uzkVar.f235601b) && wj50.m88271j(this.f235602c, uzkVar.f235602c) && wj50.m88271j(this.f235603d, uzkVar.f235603d);
    }

    public final int hashCode() {
        int iHashCode = this.f235600a.hashCode() * 31;
        String str = this.f235601b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f235602c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f235603d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f235600a);
        parcel.writeString(this.f235601b);
        parcel.writeString(this.f235602c);
        parcel.writeString(this.f235603d);
    }

    public /* synthetic */ uzk() {
        this("", null, null, null);
    }
}

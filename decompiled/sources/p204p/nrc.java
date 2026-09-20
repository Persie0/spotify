package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class nrc implements Parcelable {
    public static final Parcelable.Creator<nrc> CREATOR = new a5c(25);

    /* JADX INFO: renamed from: a */
    public final String f157491a;

    /* JADX INFO: renamed from: b */
    public final String f157492b;

    /* JADX INFO: renamed from: c */
    public final String f157493c;

    public nrc(String str, String str2, String str3) {
        this.f157491a = str;
        this.f157492b = str2;
        this.f157493c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m65471c() {
        return this.f157492b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrc)) {
            return false;
        }
        nrc nrcVar = (nrc) obj;
        return wj50.m88271j(this.f157491a, nrcVar.f157491a) && wj50.m88271j(this.f157492b, nrcVar.f157492b) && wj50.m88271j(this.f157493c, nrcVar.f157493c);
    }

    public final String getEntityUri() {
        return this.f157491a;
    }

    public final int hashCode() {
        int iHashCode = this.f157491a.hashCode() * 31;
        String str = this.f157492b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f157493c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157491a);
        parcel.writeString(this.f157492b);
        parcel.writeString(this.f157493c);
    }
}

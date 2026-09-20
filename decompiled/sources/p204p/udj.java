package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class udj implements vdj {
    public static final Parcelable.Creator<udj> CREATOR = new wcj(19);

    /* JADX INFO: renamed from: a */
    public final String f229257a;

    /* JADX INFO: renamed from: b */
    public final String f229258b;

    /* JADX INFO: renamed from: c */
    public final String f229259c;

    public udj(String str, String str2, String str3) {
        this.f229257a = str;
        this.f229258b = str2;
        this.f229259c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udj)) {
            return false;
        }
        udj udjVar = (udj) obj;
        return wj50.m88271j(this.f229257a, udjVar.f229257a) && wj50.m88271j(this.f229258b, udjVar.f229258b) && wj50.m88271j(this.f229259c, udjVar.f229259c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f229257a.hashCode() * 31, 31, this.f229258b);
        String str = this.f229259c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f229257a);
        parcel.writeString(this.f229258b);
        parcel.writeString(this.f229259c);
    }

    public /* synthetic */ udj(String str, String str2) {
        this(str, str2, null);
    }
}

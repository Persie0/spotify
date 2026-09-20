package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fcl implements gcl {
    public static final Parcelable.Creator<fcl> CREATOR = new z4l(13);

    /* JADX INFO: renamed from: a */
    public final String f68137a;

    /* JADX INFO: renamed from: b */
    public final String f68138b;

    public fcl(String str, String str2) {
        this.f68137a = str;
        this.f68138b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcl)) {
            return false;
        }
        fcl fclVar = (fcl) obj;
        return wj50.m88271j(this.f68137a, fclVar.f68137a) && wj50.m88271j(this.f68138b, fclVar.f68138b);
    }

    public final int hashCode() {
        String str = this.f68137a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f68138b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68137a);
        parcel.writeString(this.f68138b);
    }
}

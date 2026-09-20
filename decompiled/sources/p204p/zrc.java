package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zrc implements Parcelable {
    public static final Parcelable.Creator<zrc> CREATOR = new a5c(26);

    /* JADX INFO: renamed from: a */
    public final String f285607a;

    /* JADX INFO: renamed from: b */
    public final String f285608b;

    public zrc(String str, String str2) {
        this.f285607a = str;
        this.f285608b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrc)) {
            return false;
        }
        zrc zrcVar = (zrc) obj;
        return wj50.m88271j(this.f285607a, zrcVar.f285607a) && wj50.m88271j(this.f285608b, zrcVar.f285608b);
    }

    public final int hashCode() {
        int iHashCode = this.f285607a.hashCode() * 31;
        String str = this.f285608b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285607a);
        parcel.writeString(this.f285608b);
    }
}

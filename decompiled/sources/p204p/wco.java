package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wco implements Parcelable {
    public static final Parcelable.Creator<wco> CREATOR = new pkl(24);

    /* JADX INFO: renamed from: a */
    public final String f250079a;

    /* JADX INFO: renamed from: b */
    public final String f250080b;

    public wco(String str, String str2) {
        this.f250079a = str;
        this.f250080b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wco)) {
            return false;
        }
        wco wcoVar = (wco) obj;
        return wj50.m88271j(this.f250079a, wcoVar.f250079a) && wj50.m88271j(this.f250080b, wcoVar.f250080b);
    }

    public final int hashCode() {
        int iHashCode = this.f250079a.hashCode() * 31;
        String str = this.f250080b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250079a);
        parcel.writeString(this.f250080b);
    }
}

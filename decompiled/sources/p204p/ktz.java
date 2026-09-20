package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ktz implements Parcelable {
    public static final Parcelable.Creator<ktz> CREATOR = new ygz(15);

    /* JADX INFO: renamed from: a */
    public final String f126408a;

    /* JADX INFO: renamed from: b */
    public final String f126409b;

    public ktz(String str, String str2) {
        this.f126408a = str;
        this.f126409b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktz)) {
            return false;
        }
        ktz ktzVar = (ktz) obj;
        return wj50.m88271j(this.f126408a, ktzVar.f126408a) && wj50.m88271j(this.f126409b, ktzVar.f126409b);
    }

    public final int hashCode() {
        int iHashCode = this.f126408a.hashCode() * 31;
        String str = this.f126409b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126408a);
        parcel.writeString(this.f126409b);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l52 implements o52 {

    /* JADX INFO: renamed from: a */
    public static final l52 f129800a = new l52();
    public static final Parcelable.Creator<l52> CREATOR = new zt1(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l52);
    }

    public final int hashCode() {
        return 314623728;
    }

    public final String toString() {
        return "ParentalConsent";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

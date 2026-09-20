package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class j92 extends k92 {

    /* JADX INFO: renamed from: b */
    public static final j92 f110078b = new j92("https://age-assurance.spotify.com/collect/start");
    public static final Parcelable.Creator<j92> CREATOR = new zt1(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j92);
    }

    public final int hashCode() {
        return -143828148;
    }

    public final String toString() {
        return "Collect";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

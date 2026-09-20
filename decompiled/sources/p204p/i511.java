package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class i511 extends l511 {

    /* JADX INFO: renamed from: b */
    public static final i511 f98740b = new i511("header_action");
    public static final Parcelable.Creator<i511> CREATOR = new u111(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i511);
    }

    public final int hashCode() {
        return 916525835;
    }

    public final String toString() {
        return "HeaderAction";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

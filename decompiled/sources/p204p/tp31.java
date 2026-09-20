package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tp31 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final tp31 f222422a = new tp31();
    public static final Parcelable.Creator<tp31> CREATOR = new ln31(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tp31);
    }

    public final int hashCode() {
        return 1842196779;
    }

    public final String toString() {
        return "SongDnaUnavailablePageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

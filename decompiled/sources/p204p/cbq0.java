package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cbq0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final cbq0 f36184a = new cbq0();
    public static final Parcelable.Creator<cbq0> CREATOR = new vnp0(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cbq0);
    }

    public final int hashCode() {
        return 1470971362;
    }

    public final String toString() {
        return "PostDownloadBottomSheetPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class o151 implements p151 {

    /* JADX INFO: renamed from: a */
    public static final o151 f160620a = new o151();
    public static final Parcelable.Creator<o151> CREATOR = new q051(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o151);
    }

    public final int hashCode() {
        return -1922509737;
    }

    public final String toString() {
        return "ShareList";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

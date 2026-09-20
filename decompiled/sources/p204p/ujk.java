package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ujk implements xjk {

    /* JADX INFO: renamed from: a */
    public static final ujk f231048a = new ujk();
    public static final Parcelable.Creator<ujk> CREATOR = new kck(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ujk);
    }

    public final int hashCode() {
        return -256724791;
    }

    public final String toString() {
        return "Left";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

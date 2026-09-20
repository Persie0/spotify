package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wmc1 implements hnc1 {

    /* JADX INFO: renamed from: a */
    public static final wmc1 f252778a = new wmc1();
    public static final Parcelable.Creator<wmc1> CREATOR = new nlc1(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wmc1);
    }

    public final int hashCode() {
        return 1899112133;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

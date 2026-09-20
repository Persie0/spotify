package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wjk implements xjk {

    /* JADX INFO: renamed from: a */
    public static final wjk f251980a = new wjk();
    public static final Parcelable.Creator<wjk> CREATOR = new kck(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wjk);
    }

    public final int hashCode() {
        return 510568853;
    }

    public final String toString() {
        return "Pending";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

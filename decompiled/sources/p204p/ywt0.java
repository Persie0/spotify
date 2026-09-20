package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ywt0 implements zwt0 {

    /* JADX INFO: renamed from: a */
    public static final ywt0 f277051a = new ywt0();
    public static final Parcelable.Creator<ywt0> CREATOR = new vit0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ywt0);
    }

    public final int hashCode() {
        return -1671086064;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

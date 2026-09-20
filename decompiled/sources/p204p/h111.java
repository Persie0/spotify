package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class h111 extends l111 {

    /* JADX INFO: renamed from: a */
    public static final h111 f86404a = new h111();
    public static final Parcelable.Creator<h111> CREATOR = new bv01(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h111);
    }

    public final int hashCode() {
        return 1838264687;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

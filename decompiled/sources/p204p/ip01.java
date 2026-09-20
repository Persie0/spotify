package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ip01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final ip01 f104325d = new ip01(9, "facebook-messenger");
    public static final Parcelable.Creator<ip01> CREATOR = new vj01(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ip01);
    }

    public final int hashCode() {
        return -1562455853;
    }

    public final String toString() {
        return "FacebookMessenger";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

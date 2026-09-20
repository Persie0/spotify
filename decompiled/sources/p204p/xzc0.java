package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xzc0 implements d0d0 {

    /* JADX INFO: renamed from: a */
    public static final xzc0 f267580a = new xzc0();
    public static final Parcelable.Creator<xzc0> CREATOR = new f4c0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xzc0);
    }

    public final int hashCode() {
        return 818920157;
    }

    public final String toString() {
        return "NPVMartiniChat";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

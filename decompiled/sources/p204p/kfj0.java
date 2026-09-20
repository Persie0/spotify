package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kfj0 implements s6m0 {

    /* JADX INFO: renamed from: a */
    public static final kfj0 f122177a = new kfj0();
    public static final Parcelable.Creator<kfj0> CREATOR = new rri0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kfj0);
    }

    public final int hashCode() {
        return 1557728670;
    }

    public final String toString() {
        return "Nested";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

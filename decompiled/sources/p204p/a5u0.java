package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a5u0 implements f5u0 {

    /* JADX INFO: renamed from: a */
    public static final a5u0 f12598a = new a5u0();
    public static final Parcelable.Creator<a5u0> CREATOR = new vit0(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a5u0);
    }

    public final int hashCode() {
        return -1910283680;
    }

    public final String toString() {
        return "AllItems";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

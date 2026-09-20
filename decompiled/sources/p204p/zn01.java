package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zn01 implements bo01 {

    /* JADX INFO: renamed from: a */
    public static final zn01 f284388a = new zn01();
    public static final Parcelable.Creator<zn01> CREATOR = new vj01(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zn01);
    }

    public final int hashCode() {
        return -998509620;
    }

    public final String toString() {
        return "NotShareable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

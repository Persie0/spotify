package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ep01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final ep01 f61529d = new ep01(16, "copy-link");
    public static final Parcelable.Creator<ep01> CREATOR = new vj01(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ep01);
    }

    public final int hashCode() {
        return 753296489;
    }

    public final String toString() {
        return "CopyLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

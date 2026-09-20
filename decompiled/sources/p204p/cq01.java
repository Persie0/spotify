package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cq01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final cq01 f40697d = new cq01(2, "whatsapp");
    public static final Parcelable.Creator<cq01> CREATOR = new sp01(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cq01);
    }

    public final int hashCode() {
        return -1100694292;
    }

    public final String toString() {
        return "Whatsapp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

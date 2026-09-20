package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class vp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final vp01 f243563d = new vp01(12, "sms");
    public static final Parcelable.Creator<vp01> CREATOR = new sp01(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vp01);
    }

    public final int hashCode() {
        return -1987364417;
    }

    public final String toString() {
        return "Sms";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

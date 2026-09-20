package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class np01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final np01 f156838d = new np01(4, "instagram-stories");
    public static final Parcelable.Creator<np01> CREATOR = new vj01(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof np01);
    }

    public final int hashCode() {
        return 184130971;
    }

    public final String toString() {
        return "InstagramStories";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

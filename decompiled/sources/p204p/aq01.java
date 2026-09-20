package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class aq01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final aq01 f18050d = new aq01(14, "tiktok-messages");
    public static final Parcelable.Creator<aq01> CREATOR = new sp01(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aq01);
    }

    public final int hashCode() {
        return 463004736;
    }

    public final String toString() {
        return "TiktokMessages";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

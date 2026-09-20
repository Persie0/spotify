package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class dh91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final dh91 f49023d = new dh91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_PICK_TRACK);
    public static final Parcelable.Creator<dh91> CREATOR = new f891(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dh91);
    }

    public final int hashCode() {
        return -780062268;
    }

    public final String toString() {
        return "PickTrack";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class hh91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final hh91 f91309d = new hh91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_NEXT);
    public static final Parcelable.Creator<hh91> CREATOR = new f891(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hh91);
    }

    public final int hashCode() {
        return -1551249002;
    }

    public final String toString() {
        return "SkipLimit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

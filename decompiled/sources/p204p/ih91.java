package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ih91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final ih91 f102214d = new ih91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_PREV);
    public static final Parcelable.Creator<ih91> CREATOR = new f891(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ih91);
    }

    public final int hashCode() {
        return -1849253060;
    }

    public final String toString() {
        return "SkipPrevious";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

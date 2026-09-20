package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gh91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final gh91 f79859d = new gh91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_UNSHUFFLE);
    public static final Parcelable.Creator<gh91> CREATOR = new f891(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gh91);
    }

    public final int hashCode() {
        return 620513683;
    }

    public final String toString() {
        return "Shuffle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

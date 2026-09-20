package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class fh91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final fh91 f69614d = new fh91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SCRUB);
    public static final Parcelable.Creator<fh91> CREATOR = new f891(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fh91);
    }

    public final int hashCode() {
        return 519994677;
    }

    public final String toString() {
        return "Seekbar";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

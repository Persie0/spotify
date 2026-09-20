package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eh91 extends jh91 {

    /* JADX INFO: renamed from: d */
    public static final eh91 f59520d = new eh91(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_QUEUE_REORDER);
    public static final Parcelable.Creator<eh91> CREATOR = new f891(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eh91);
    }

    public final int hashCode() {
        return 1339377744;
    }

    public final String toString() {
        return "QueueReorder";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

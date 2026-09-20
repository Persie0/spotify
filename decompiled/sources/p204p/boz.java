package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class boz extends goz {

    /* JADX INFO: renamed from: d */
    public static final boz f29279d = new boz(gn80.FMA_UPSELL_QUEUE_REORDER);
    public static final Parcelable.Creator<boz> CREATOR = new ygz(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof boz);
    }

    public final int hashCode() {
        return -2121301967;
    }

    public final String toString() {
        return "QueueReorder";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

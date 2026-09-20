package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class anb0 implements cnb0 {

    /* JADX INFO: renamed from: a */
    public static final anb0 f17354a = new anb0();
    public static final Parcelable.Creator<anb0> CREATOR = new rib0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class eyy0 extends gyy0 {

    /* JADX INFO: renamed from: a */
    public static final eyy0 f64228a = new eyy0();
    public static final Parcelable.Creator<eyy0> CREATOR = new lpy0(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

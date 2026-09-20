package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class bnb0 implements cnb0 {

    /* JADX INFO: renamed from: a */
    public static final bnb0 f28779a = new bnb0();
    public static final Parcelable.Creator<bnb0> CREATOR = new rib0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

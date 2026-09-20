package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class rob0 implements sob0 {

    /* JADX INFO: renamed from: a */
    public static final rob0 f201217a = new rob0();
    public static final Parcelable.Creator<rob0> CREATOR = new rib0(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

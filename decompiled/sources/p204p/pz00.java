package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class pz00 extends wz00 {

    /* JADX INFO: renamed from: a */
    public static final pz00 f183564a = new pz00();
    public static final Parcelable.Creator<pz00> CREATOR = new k700(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

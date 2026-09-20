package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class bub0 extends fub0 {

    /* JADX INFO: renamed from: a */
    public static final bub0 f31075a = new bub0();
    public static final Parcelable.Creator<bub0> CREATOR = new apb0(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

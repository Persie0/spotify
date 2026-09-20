package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class k01 extends n01 {

    /* JADX INFO: renamed from: a */
    public static final k01 f117834a = new k01();
    public static final Parcelable.Creator<k01> CREATOR = new zz0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class l01 extends n01 {

    /* JADX INFO: renamed from: a */
    public static final l01 f128251a = new l01();
    public static final Parcelable.Creator<l01> CREATOR = new zz0(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

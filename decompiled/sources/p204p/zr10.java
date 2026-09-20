package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zr10 extends bs10 {

    /* JADX INFO: renamed from: a */
    public static final zr10 f285520a = new zr10();
    public static final Parcelable.Creator<zr10> CREATOR = new km10(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kzm0 implements lzm0 {

    /* JADX INFO: renamed from: a */
    public static final kzm0 f128164a = new kzm0();
    public static final Parcelable.Creator<kzm0> CREATOR = new pum0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

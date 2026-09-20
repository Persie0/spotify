package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xw20 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final xw20 f266560a = new xw20();
    public static final Parcelable.Creator<xw20> CREATOR = new t320(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

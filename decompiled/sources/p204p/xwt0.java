package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xwt0 implements zwt0 {

    /* JADX INFO: renamed from: a */
    public static final xwt0 f266744a = new xwt0();
    public static final Parcelable.Creator<xwt0> CREATOR = new vit0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

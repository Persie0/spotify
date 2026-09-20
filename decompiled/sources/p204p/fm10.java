package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fm10 implements hm10 {

    /* JADX INFO: renamed from: a */
    public static final fm10 f70921a = new fm10();
    public static final Parcelable.Creator<fm10> CREATOR = new qz00(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yxw0 extends byw0 {

    /* JADX INFO: renamed from: a */
    public static final yxw0 f277334a = new yxw0();
    public static final Parcelable.Creator<yxw0> CREATOR = new xxw0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

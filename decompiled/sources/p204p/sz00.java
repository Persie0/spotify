package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sz00 extends wz00 {

    /* JADX INFO: renamed from: a */
    public static final sz00 f215356a = new sz00();
    public static final Parcelable.Creator<sz00> CREATOR = new qz00(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

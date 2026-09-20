package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wwt0 implements zwt0 {

    /* JADX INFO: renamed from: a */
    public static final wwt0 f255836a = new wwt0();
    public static final Parcelable.Creator<wwt0> CREATOR = new vit0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

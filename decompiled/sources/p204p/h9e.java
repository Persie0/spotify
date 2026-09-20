package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class h9e implements i9e {

    /* JADX INFO: renamed from: a */
    public static final h9e f88927a = new h9e();
    public static final Parcelable.Creator<h9e> CREATOR = new n6e(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class o9e implements dae {

    /* JADX INFO: renamed from: a */
    public static final o9e f163006a = new o9e();
    public static final Parcelable.Creator<o9e> CREATOR = new n6e(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

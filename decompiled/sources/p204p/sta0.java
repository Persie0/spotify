package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sta0 implements xta0 {

    /* JADX INFO: renamed from: a */
    public static final sta0 f213877a = new sta0();
    public static final Parcelable.Creator<sta0> CREATOR = new ama0(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

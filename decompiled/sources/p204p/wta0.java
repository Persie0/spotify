package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wta0 implements xta0 {

    /* JADX INFO: renamed from: a */
    public static final wta0 f254901a = new wta0();
    public static final Parcelable.Creator<wta0> CREATOR = new ama0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

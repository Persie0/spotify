package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vta0 implements xta0 {

    /* JADX INFO: renamed from: a */
    public static final vta0 f244594a = new vta0();
    public static final Parcelable.Creator<vta0> CREATOR = new ama0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
